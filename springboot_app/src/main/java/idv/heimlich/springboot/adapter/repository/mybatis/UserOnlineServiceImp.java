package idv.heimlich.springboot.adapter.repository.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Primary;

import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.repository.UserOnlineService;
import idv.heimlich.springboot.entity.repository.UserinfRepository;
import idv.heimlich.springboot.usecase.onlineuser.fetch.FetchOnLineUserResultDTO;
import idv.heimlich.springboot.usecase.onlineuser.fetch.IFetchOnLineUserResult;
import idv.heimlich.springboot.usecase.utils.DateUtlis;
import lombok.extern.slf4j.Slf4j;

@Primary
@Slf4j
public class UserOnlineServiceImp implements UserOnlineService {

	private final UserinfRepository repository;

	private static Map<String, Date> onLineMap = new ConcurrentHashMap<>();

	private final Timer timer = new Timer();

	public UserOnlineServiceImp(UserinfRepository repository) {
		super();
		this.repository = repository;
		this.timer.schedule(new TimerTask() {
			@Override
			public void run() {
				UserOnlineServiceImp.this.clear();

			}
		}, 60 * 5 * 1000, 60 * 5 * 1000);
	}

	private void clear() {
		onLineMap.clear();
	}

	/**
	 *
	 */
	@Override
	public List<IFetchOnLineUserResult> getCurrentUsers() {
		final List<String> asList = new ArrayList<>(onLineMap.keySet());
		return asList.stream().map(id -> {
			final Userinf userinf = this.repository.findById(id);
			return new FetchOnLineUserResultDTO(userinf, (asList.indexOf(id) + 1) + "", DateUtlis.getText());
		}).collect(Collectors.toList());
	}

	@Override
	public void addUser(String userId) {
		onLineMap.put(userId, new Date());

	}

	@Override
	public void removeUser(String userId) {
		onLineMap.remove(userId);
	}

}
