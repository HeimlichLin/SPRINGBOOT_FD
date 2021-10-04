package idv.heimlich.springboot.entity.po;

import java.util.ArrayList;
import java.util.List;

public class UserLogExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserLogExample() {
		this.oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return this.orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return this.distinct;
	}

	public List<Criteria> getOredCriteria() {
		return this.oredCriteria;
	}

	public void or(Criteria criteria) {
		this.oredCriteria.add(criteria);
	}

	public Criteria or() {
		final Criteria criteria = this.createCriteriaInternal();
		this.oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		final Criteria criteria = this.createCriteriaInternal();
		if (this.oredCriteria.size() == 0) {
			this.oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		final Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		this.oredCriteria.clear();
		this.orderByClause = null;
		this.distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			this.criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andBondnoIsNull() {
			this.addCriterion("BONDNO is null");
			return (Criteria) this;
		}

		public Criteria andBondnoIsNotNull() {
			this.addCriterion("BONDNO is not null");
			return (Criteria) this;
		}

		public Criteria andBondnoEqualTo(String value) {
			this.addCriterion("BONDNO =", value, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoNotEqualTo(String value) {
			this.addCriterion("BONDNO <>", value, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoGreaterThan(String value) {
			this.addCriterion("BONDNO >", value, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoGreaterThanOrEqualTo(String value) {
			this.addCriterion("BONDNO >=", value, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoLessThan(String value) {
			this.addCriterion("BONDNO <", value, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoLessThanOrEqualTo(String value) {
			this.addCriterion("BONDNO <=", value, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoLike(String value) {
			this.addCriterion("BONDNO like", value, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoNotLike(String value) {
			this.addCriterion("BONDNO not like", value, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoIn(List<String> values) {
			this.addCriterion("BONDNO in", values, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoNotIn(List<String> values) {
			this.addCriterion("BONDNO not in", values, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoBetween(String value1, String value2) {
			this.addCriterion("BONDNO between", value1, value2, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondnoNotBetween(String value1, String value2) {
			this.addCriterion("BONDNO not between", value1, value2, "bondno");
			return (Criteria) this;
		}

		public Criteria andBondbanIsNull() {
			this.addCriterion("BONDBAN is null");
			return (Criteria) this;
		}

		public Criteria andBondbanIsNotNull() {
			this.addCriterion("BONDBAN is not null");
			return (Criteria) this;
		}

		public Criteria andBondbanEqualTo(String value) {
			this.addCriterion("BONDBAN =", value, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanNotEqualTo(String value) {
			this.addCriterion("BONDBAN <>", value, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanGreaterThan(String value) {
			this.addCriterion("BONDBAN >", value, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanGreaterThanOrEqualTo(String value) {
			this.addCriterion("BONDBAN >=", value, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanLessThan(String value) {
			this.addCriterion("BONDBAN <", value, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanLessThanOrEqualTo(String value) {
			this.addCriterion("BONDBAN <=", value, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanLike(String value) {
			this.addCriterion("BONDBAN like", value, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanNotLike(String value) {
			this.addCriterion("BONDBAN not like", value, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanIn(List<String> values) {
			this.addCriterion("BONDBAN in", values, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanNotIn(List<String> values) {
			this.addCriterion("BONDBAN not in", values, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanBetween(String value1, String value2) {
			this.addCriterion("BONDBAN between", value1, value2, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondbanNotBetween(String value1, String value2) {
			this.addCriterion("BONDBAN not between", value1, value2, "bondban");
			return (Criteria) this;
		}

		public Criteria andBondnameIsNull() {
			this.addCriterion("BONDNAME is null");
			return (Criteria) this;
		}

		public Criteria andBondnameIsNotNull() {
			this.addCriterion("BONDNAME is not null");
			return (Criteria) this;
		}

		public Criteria andBondnameEqualTo(String value) {
			this.addCriterion("BONDNAME =", value, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameNotEqualTo(String value) {
			this.addCriterion("BONDNAME <>", value, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameGreaterThan(String value) {
			this.addCriterion("BONDNAME >", value, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameGreaterThanOrEqualTo(String value) {
			this.addCriterion("BONDNAME >=", value, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameLessThan(String value) {
			this.addCriterion("BONDNAME <", value, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameLessThanOrEqualTo(String value) {
			this.addCriterion("BONDNAME <=", value, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameLike(String value) {
			this.addCriterion("BONDNAME like", value, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameNotLike(String value) {
			this.addCriterion("BONDNAME not like", value, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameIn(List<String> values) {
			this.addCriterion("BONDNAME in", values, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameNotIn(List<String> values) {
			this.addCriterion("BONDNAME not in", values, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameBetween(String value1, String value2) {
			this.addCriterion("BONDNAME between", value1, value2, "bondname");
			return (Criteria) this;
		}

		public Criteria andBondnameNotBetween(String value1, String value2) {
			this.addCriterion("BONDNAME not between", value1, value2, "bondname");
			return (Criteria) this;
		}

		public Criteria andSpecialstIsNull() {
			this.addCriterion("SPECIALST is null");
			return (Criteria) this;
		}

		public Criteria andSpecialstIsNotNull() {
			this.addCriterion("SPECIALST is not null");
			return (Criteria) this;
		}

		public Criteria andSpecialstEqualTo(String value) {
			this.addCriterion("SPECIALST =", value, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstNotEqualTo(String value) {
			this.addCriterion("SPECIALST <>", value, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstGreaterThan(String value) {
			this.addCriterion("SPECIALST >", value, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstGreaterThanOrEqualTo(String value) {
			this.addCriterion("SPECIALST >=", value, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstLessThan(String value) {
			this.addCriterion("SPECIALST <", value, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstLessThanOrEqualTo(String value) {
			this.addCriterion("SPECIALST <=", value, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstLike(String value) {
			this.addCriterion("SPECIALST like", value, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstNotLike(String value) {
			this.addCriterion("SPECIALST not like", value, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstIn(List<String> values) {
			this.addCriterion("SPECIALST in", values, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstNotIn(List<String> values) {
			this.addCriterion("SPECIALST not in", values, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstBetween(String value1, String value2) {
			this.addCriterion("SPECIALST between", value1, value2, "specialst");
			return (Criteria) this;
		}

		public Criteria andSpecialstNotBetween(String value1, String value2) {
			this.addCriterion("SPECIALST not between", value1, value2, "specialst");
			return (Criteria) this;
		}

		public Criteria andBondidIsNull() {
			this.addCriterion("BONDID is null");
			return (Criteria) this;
		}

		public Criteria andBondidIsNotNull() {
			this.addCriterion("BONDID is not null");
			return (Criteria) this;
		}

		public Criteria andBondidEqualTo(String value) {
			this.addCriterion("BONDID =", value, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidNotEqualTo(String value) {
			this.addCriterion("BONDID <>", value, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidGreaterThan(String value) {
			this.addCriterion("BONDID >", value, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidGreaterThanOrEqualTo(String value) {
			this.addCriterion("BONDID >=", value, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidLessThan(String value) {
			this.addCriterion("BONDID <", value, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidLessThanOrEqualTo(String value) {
			this.addCriterion("BONDID <=", value, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidLike(String value) {
			this.addCriterion("BONDID like", value, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidNotLike(String value) {
			this.addCriterion("BONDID not like", value, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidIn(List<String> values) {
			this.addCriterion("BONDID in", values, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidNotIn(List<String> values) {
			this.addCriterion("BONDID not in", values, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidBetween(String value1, String value2) {
			this.addCriterion("BONDID between", value1, value2, "bondid");
			return (Criteria) this;
		}

		public Criteria andBondidNotBetween(String value1, String value2) {
			this.addCriterion("BONDID not between", value1, value2, "bondid");
			return (Criteria) this;
		}

		public Criteria andAuthorityIsNull() {
			this.addCriterion("AUTHORITY is null");
			return (Criteria) this;
		}

		public Criteria andAuthorityIsNotNull() {
			this.addCriterion("AUTHORITY is not null");
			return (Criteria) this;
		}

		public Criteria andAuthorityEqualTo(String value) {
			this.addCriterion("AUTHORITY =", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityNotEqualTo(String value) {
			this.addCriterion("AUTHORITY <>", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityGreaterThan(String value) {
			this.addCriterion("AUTHORITY >", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityGreaterThanOrEqualTo(String value) {
			this.addCriterion("AUTHORITY >=", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityLessThan(String value) {
			this.addCriterion("AUTHORITY <", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityLessThanOrEqualTo(String value) {
			this.addCriterion("AUTHORITY <=", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityLike(String value) {
			this.addCriterion("AUTHORITY like", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityNotLike(String value) {
			this.addCriterion("AUTHORITY not like", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityIn(List<String> values) {
			this.addCriterion("AUTHORITY in", values, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityNotIn(List<String> values) {
			this.addCriterion("AUTHORITY not in", values, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityBetween(String value1, String value2) {
			this.addCriterion("AUTHORITY between", value1, value2, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityNotBetween(String value1, String value2) {
			this.addCriterion("AUTHORITY not between", value1, value2, "authority");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeIsNull() {
			this.addCriterion("CUSTOMSOFFICE is null");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeIsNotNull() {
			this.addCriterion("CUSTOMSOFFICE is not null");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeEqualTo(String value) {
			this.addCriterion("CUSTOMSOFFICE =", value, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeNotEqualTo(String value) {
			this.addCriterion("CUSTOMSOFFICE <>", value, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeGreaterThan(String value) {
			this.addCriterion("CUSTOMSOFFICE >", value, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeGreaterThanOrEqualTo(String value) {
			this.addCriterion("CUSTOMSOFFICE >=", value, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeLessThan(String value) {
			this.addCriterion("CUSTOMSOFFICE <", value, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeLessThanOrEqualTo(String value) {
			this.addCriterion("CUSTOMSOFFICE <=", value, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeLike(String value) {
			this.addCriterion("CUSTOMSOFFICE like", value, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeNotLike(String value) {
			this.addCriterion("CUSTOMSOFFICE not like", value, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeIn(List<String> values) {
			this.addCriterion("CUSTOMSOFFICE in", values, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeNotIn(List<String> values) {
			this.addCriterion("CUSTOMSOFFICE not in", values, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeBetween(String value1, String value2) {
			this.addCriterion("CUSTOMSOFFICE between", value1, value2, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andCustomsofficeNotBetween(String value1, String value2) {
			this.addCriterion("CUSTOMSOFFICE not between", value1, value2, "customsoffice");
			return (Criteria) this;
		}

		public Criteria andLogintimeIsNull() {
			this.addCriterion("LOGINTIME is null");
			return (Criteria) this;
		}

		public Criteria andLogintimeIsNotNull() {
			this.addCriterion("LOGINTIME is not null");
			return (Criteria) this;
		}

		public Criteria andLogintimeEqualTo(String value) {
			this.addCriterion("LOGINTIME =", value, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeNotEqualTo(String value) {
			this.addCriterion("LOGINTIME <>", value, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeGreaterThan(String value) {
			this.addCriterion("LOGINTIME >", value, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeGreaterThanOrEqualTo(String value) {
			this.addCriterion("LOGINTIME >=", value, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeLessThan(String value) {
			this.addCriterion("LOGINTIME <", value, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeLessThanOrEqualTo(String value) {
			this.addCriterion("LOGINTIME <=", value, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeLike(String value) {
			this.addCriterion("LOGINTIME like", value, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeNotLike(String value) {
			this.addCriterion("LOGINTIME not like", value, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeIn(List<String> values) {
			this.addCriterion("LOGINTIME in", values, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeNotIn(List<String> values) {
			this.addCriterion("LOGINTIME not in", values, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeBetween(String value1, String value2) {
			this.addCriterion("LOGINTIME between", value1, value2, "logintime");
			return (Criteria) this;
		}

		public Criteria andLogintimeNotBetween(String value1, String value2) {
			this.addCriterion("LOGINTIME not between", value1, value2, "logintime");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private final String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private final String typeHandler;

		public String getCondition() {
			return this.condition;
		}

		public Object getValue() {
			return this.value;
		}

		public Object getSecondValue() {
			return this.secondValue;
		}

		public boolean isNoValue() {
			return this.noValue;
		}

		public boolean isSingleValue() {
			return this.singleValue;
		}

		public boolean isBetweenValue() {
			return this.betweenValue;
		}

		public boolean isListValue() {
			return this.listValue;
		}

		public String getTypeHandler() {
			return this.typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

}
