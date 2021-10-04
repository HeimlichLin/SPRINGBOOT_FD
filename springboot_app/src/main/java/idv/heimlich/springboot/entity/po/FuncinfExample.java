package idv.heimlich.springboot.entity.po;

import java.util.ArrayList;
import java.util.List;

public class FuncinfExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public FuncinfExample() {
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

		public Criteria andFuncidIsNull() {
			this.addCriterion("FUNCID is null");
			return (Criteria) this;
		}

		public Criteria andFuncidIsNotNull() {
			this.addCriterion("FUNCID is not null");
			return (Criteria) this;
		}

		public Criteria andFuncidEqualTo(String value) {
			this.addCriterion("FUNCID =", value, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidNotEqualTo(String value) {
			this.addCriterion("FUNCID <>", value, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidGreaterThan(String value) {
			this.addCriterion("FUNCID >", value, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidGreaterThanOrEqualTo(String value) {
			this.addCriterion("FUNCID >=", value, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidLessThan(String value) {
			this.addCriterion("FUNCID <", value, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidLessThanOrEqualTo(String value) {
			this.addCriterion("FUNCID <=", value, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidLike(String value) {
			this.addCriterion("FUNCID like", value, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidNotLike(String value) {
			this.addCriterion("FUNCID not like", value, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidIn(List<String> values) {
			this.addCriterion("FUNCID in", values, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidNotIn(List<String> values) {
			this.addCriterion("FUNCID not in", values, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidBetween(String value1, String value2) {
			this.addCriterion("FUNCID between", value1, value2, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncidNotBetween(String value1, String value2) {
			this.addCriterion("FUNCID not between", value1, value2, "funcid");
			return (Criteria) this;
		}

		public Criteria andFuncnameIsNull() {
			this.addCriterion("FUNCNAME is null");
			return (Criteria) this;
		}

		public Criteria andFuncnameIsNotNull() {
			this.addCriterion("FUNCNAME is not null");
			return (Criteria) this;
		}

		public Criteria andFuncnameEqualTo(String value) {
			this.addCriterion("FUNCNAME =", value, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameNotEqualTo(String value) {
			this.addCriterion("FUNCNAME <>", value, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameGreaterThan(String value) {
			this.addCriterion("FUNCNAME >", value, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameGreaterThanOrEqualTo(String value) {
			this.addCriterion("FUNCNAME >=", value, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameLessThan(String value) {
			this.addCriterion("FUNCNAME <", value, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameLessThanOrEqualTo(String value) {
			this.addCriterion("FUNCNAME <=", value, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameLike(String value) {
			this.addCriterion("FUNCNAME like", value, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameNotLike(String value) {
			this.addCriterion("FUNCNAME not like", value, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameIn(List<String> values) {
			this.addCriterion("FUNCNAME in", values, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameNotIn(List<String> values) {
			this.addCriterion("FUNCNAME not in", values, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameBetween(String value1, String value2) {
			this.addCriterion("FUNCNAME between", value1, value2, "funcname");
			return (Criteria) this;
		}

		public Criteria andFuncnameNotBetween(String value1, String value2) {
			this.addCriterion("FUNCNAME not between", value1, value2, "funcname");
			return (Criteria) this;
		}

		public Criteria andCodenameIsNull() {
			this.addCriterion("CODENAME is null");
			return (Criteria) this;
		}

		public Criteria andCodenameIsNotNull() {
			this.addCriterion("CODENAME is not null");
			return (Criteria) this;
		}

		public Criteria andCodenameEqualTo(String value) {
			this.addCriterion("CODENAME =", value, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameNotEqualTo(String value) {
			this.addCriterion("CODENAME <>", value, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameGreaterThan(String value) {
			this.addCriterion("CODENAME >", value, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameGreaterThanOrEqualTo(String value) {
			this.addCriterion("CODENAME >=", value, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameLessThan(String value) {
			this.addCriterion("CODENAME <", value, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameLessThanOrEqualTo(String value) {
			this.addCriterion("CODENAME <=", value, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameLike(String value) {
			this.addCriterion("CODENAME like", value, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameNotLike(String value) {
			this.addCriterion("CODENAME not like", value, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameIn(List<String> values) {
			this.addCriterion("CODENAME in", values, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameNotIn(List<String> values) {
			this.addCriterion("CODENAME not in", values, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameBetween(String value1, String value2) {
			this.addCriterion("CODENAME between", value1, value2, "codename");
			return (Criteria) this;
		}

		public Criteria andCodenameNotBetween(String value1, String value2) {
			this.addCriterion("CODENAME not between", value1, value2, "codename");
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
