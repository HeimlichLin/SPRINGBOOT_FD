package idv.heimlich.springboot.adapter.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.type.ClassMetadata;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@PropertySources({ @PropertySource(value = { //
		"classpath:config/properties/spring-mybatis.properties", //
		"classpath:config/properties/spring-i18n.properties", //
		"classpath:config/properties/spring-security.properties"//
		}, ignoreResourceNotFound = false, encoding = "UTF-8"), @PropertySource(value = {
				"classpath:config/properties/sys.properties" }, ignoreResourceNotFound = false, encoding = "UTF-8"), })
@EnableSwagger2
@ComponentScan("idv.heimlich.springboot")
@EnableAspectJAutoProxy
@EnableScheduling
public class Application extends SpringBootServletInitializer {

	@Autowired
	SystemConf systemConf;

	public static void main(String[] args) {
		// System.setProperty("server.servlet.context-path", "/APCLMS");
		final ConfigurableApplicationContext run = new SpringApplicationBuilder(Application.class).properties(
				"spring.config.location:classpath:/,classpath:/config/,file:./,file:./config/,classpath:/config/properties/",
				"spring.config.name:sys-config"
		// , "logging.level.org.eclipse.jetty=ERROR"
		// , "logging.level.org.thymeleaf=ERROR"
		).run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		final SpringApplicationBuilder sources = application.properties(
				"spring.config.location:classpath:/,classpath:/config/,file:./,file:./config/,classpath:/config/properties/",
				"spring.config.name:sys-config"
		// , "logging.level.org.eclipse.jetty=ERROR"
		// , "logging.level.org.thymeleaf=ERROR"
		).sources(Application.class);
		return sources;
	}

	@Bean
	BeanFactoryPostProcessor beanFactoryPostProcessor(ApplicationContext beanRegistry) {
		return beanFactory -> {
			this.genericApplicationContext(
					(BeanDefinitionRegistry) ((AnnotationConfigServletWebServerApplicationContext) beanRegistry)
							.getBeanFactory());
		};
	}

	@Bean
	public ObjectMapper ObjectMapper() {
		final ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return objectMapper;
	}

	private List<String> getClassExclude() {
		final List<String> line = new ArrayList<String>();
		line.add("idv\\.heimlich\\.springboot\\.entity\\.po\\..*");
		line.add("idv\\.heimlich\\.springboot\\..*Vo.*");
		line.add("idv\\.heimlich\\.springboot\\..*DTO.*");
		line.add("idv\\.heimlich\\.springboot\\..*Codes.*");
		line.add("idv\\.heimlich\\.springboot\\..*Execpetion.*");
		line.add("idv\\.heimlich\\.springboot\\..*Entity.*");
		line.add("idv\\.heimlich\\.springboot\\..*Holder.*");
		line.add("idv\\.heimlich\\.springboot\\..*Adapter.*");
		line.add("idv\\.heimlich\\.springboot\\..*Command.*");
		line.add("idv\\.heimlich\\.springboot\\..*Event");

		if (SystemConf.IS_MEMORYCACHE) {// 使用記憶體
			line.add("idv\\.heimlich\\.springboot\\..*mybatis.*");
			line.add("idv\\.heimlich\\.springboot\\..*sql.*");
		}

		return line;
	}

	void genericApplicationContext(BeanDefinitionRegistry beanRegistry) {
		final ClassPathBeanDefinitionScanner beanDefinitionScanner = new ClassPathBeanDefinitionScanner(beanRegistry);
		beanDefinitionScanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> {
			final ClassMetadata classMetadata = metadataReader.getClassMetadata();
			final String className = classMetadata.getClassName();
			//
			final boolean anyMatch = this.getClassExclude().stream().anyMatch(exc -> className.matches(exc));
			return anyMatch ? false : true;
		});

		beanDefinitionScanner.scan("idv.heimlich.springboot");
	}

	@Configuration
	@Profile("dev")
	@PropertySource("classpath:config/properties/profile/dev/sys-config-dev.properties")
	static class Dev {
	}

	@Configuration
	@Profile("test")
	@PropertySource("classpath:config/properties/profile/formal/sys-config-formal-test.properties")
	static class Test {
	}

	@Configuration
	@Profile("ver")
	@PropertySource("classpath:config/properties/profile/formal/sys-config-formal-ver.properties")
	static class Ver {
	}

	@Configuration
	@Profile("prod")
	@PropertySource("classpath:config/properties/profile/formal/sys-config-formal-prod.properties")
	static class Prod {
	}
}
