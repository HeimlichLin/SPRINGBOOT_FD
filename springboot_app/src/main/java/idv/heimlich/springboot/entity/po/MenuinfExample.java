package idv.heimlich.springboot.entity.po;

import java.util.ArrayList;
import java.util.List;

public class MenuinfExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public MenuinfExample() {
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

		public Criteria andMenuidIsNull() {
			this.addCriterion("MENUID is null");
			return (Criteria) this;
		}

		public Criteria andMenuidIsNotNull() {
			this.addCriterion("MENUID is not null");
			return (Criteria) this;
		}

		public Criteria andMenuidEqualTo(String value) {
			this.addCriterion("MENUID =", value, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidNotEqualTo(String value) {
			this.addCriterion("MENUID <>", value, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidGreaterThan(String value) {
			this.addCriterion("MENUID >", value, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidGreaterThanOrEqualTo(String value) {
			this.addCriterion("MENUID >=", value, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidLessThan(String value) {
			this.addCriterion("MENUID <", value, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidLessThanOrEqualTo(String value) {
			this.addCriterion("MENUID <=", value, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidLike(String value) {
			this.addCriterion("MENUID like", value, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidNotLike(String value) {
			this.addCriterion("MENUID not like", value, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidIn(List<String> values) {
			this.addCriterion("MENUID in", values, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidNotIn(List<String> values) {
			this.addCriterion("MENUID not in", values, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidBetween(String value1, String value2) {
			this.addCriterion("MENUID between", value1, value2, "menuid");
			return (Criteria) this;
		}

		public Criteria andMenuidNotBetween(String value1, String value2) {
			this.addCriterion("MENUID not between", value1, value2, "menuid");
			return (Criteria) this;
		}

		public Criteria andRootidIsNull() {
			this.addCriterion("ROOTID is null");
			return (Criteria) this;
		}

		public Criteria andRootidIsNotNull() {
			this.addCriterion("ROOTID is not null");
			return (Criteria) this;
		}

		public Criteria andRootidEqualTo(String value) {
			this.addCriterion("ROOTID =", value, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidNotEqualTo(String value) {
			this.addCriterion("ROOTID <>", value, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidGreaterThan(String value) {
			this.addCriterion("ROOTID >", value, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidGreaterThanOrEqualTo(String value) {
			this.addCriterion("ROOTID >=", value, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidLessThan(String value) {
			this.addCriterion("ROOTID <", value, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidLessThanOrEqualTo(String value) {
			this.addCriterion("ROOTID <=", value, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidLike(String value) {
			this.addCriterion("ROOTID like", value, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidNotLike(String value) {
			this.addCriterion("ROOTID not like", value, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidIn(List<String> values) {
			this.addCriterion("ROOTID in", values, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidNotIn(List<String> values) {
			this.addCriterion("ROOTID not in", values, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidBetween(String value1, String value2) {
			this.addCriterion("ROOTID between", value1, value2, "rootid");
			return (Criteria) this;
		}

		public Criteria andRootidNotBetween(String value1, String value2) {
			this.addCriterion("ROOTID not between", value1, value2, "rootid");
			return (Criteria) this;
		}

		public Criteria andMenunameIsNull() {
			this.addCriterion("MENUNAME is null");
			return (Criteria) this;
		}

		public Criteria andMenunameIsNotNull() {
			this.addCriterion("MENUNAME is not null");
			return (Criteria) this;
		}

		public Criteria andMenunameEqualTo(String value) {
			this.addCriterion("MENUNAME =", value, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameNotEqualTo(String value) {
			this.addCriterion("MENUNAME <>", value, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameGreaterThan(String value) {
			this.addCriterion("MENUNAME >", value, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameGreaterThanOrEqualTo(String value) {
			this.addCriterion("MENUNAME >=", value, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameLessThan(String value) {
			this.addCriterion("MENUNAME <", value, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameLessThanOrEqualTo(String value) {
			this.addCriterion("MENUNAME <=", value, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameLike(String value) {
			this.addCriterion("MENUNAME like", value, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameNotLike(String value) {
			this.addCriterion("MENUNAME not like", value, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameIn(List<String> values) {
			this.addCriterion("MENUNAME in", values, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameNotIn(List<String> values) {
			this.addCriterion("MENUNAME not in", values, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameBetween(String value1, String value2) {
			this.addCriterion("MENUNAME between", value1, value2, "menuname");
			return (Criteria) this;
		}

		public Criteria andMenunameNotBetween(String value1, String value2) {
			this.addCriterion("MENUNAME not between", value1, value2, "menuname");
			return (Criteria) this;
		}

		public Criteria andUrlIsNull() {
			this.addCriterion("URL is null");
			return (Criteria) this;
		}

		public Criteria andUrlIsNotNull() {
			this.addCriterion("URL is not null");
			return (Criteria) this;
		}

		public Criteria andUrlEqualTo(String value) {
			this.addCriterion("URL =", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			this.addCriterion("URL <>", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThan(String value) {
			this.addCriterion("URL >", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThanOrEqualTo(String value) {
			this.addCriterion("URL >=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThan(String value) {
			this.addCriterion("URL <", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThanOrEqualTo(String value) {
			this.addCriterion("URL <=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLike(String value) {
			this.addCriterion("URL like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotLike(String value) {
			this.addCriterion("URL not like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlIn(List<String> values) {
			this.addCriterion("URL in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotIn(List<String> values) {
			this.addCriterion("URL not in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlBetween(String value1, String value2) {
			this.addCriterion("URL between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotBetween(String value1, String value2) {
			this.addCriterion("URL not between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andIsHideIsNull() {
			this.addCriterion("IS_HIDE is null");
			return (Criteria) this;
		}

		public Criteria andIsHideIsNotNull() {
			this.addCriterion("IS_HIDE is not null");
			return (Criteria) this;
		}

		public Criteria andIsHideEqualTo(String value) {
			this.addCriterion("IS_HIDE =", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideNotEqualTo(String value) {
			this.addCriterion("IS_HIDE <>", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideGreaterThan(String value) {
			this.addCriterion("IS_HIDE >", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideGreaterThanOrEqualTo(String value) {
			this.addCriterion("IS_HIDE >=", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideLessThan(String value) {
			this.addCriterion("IS_HIDE <", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideLessThanOrEqualTo(String value) {
			this.addCriterion("IS_HIDE <=", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideLike(String value) {
			this.addCriterion("IS_HIDE like", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideNotLike(String value) {
			this.addCriterion("IS_HIDE not like", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideIn(List<String> values) {
			this.addCriterion("IS_HIDE in", values, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideNotIn(List<String> values) {
			this.addCriterion("IS_HIDE not in", values, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideBetween(String value1, String value2) {
			this.addCriterion("IS_HIDE between", value1, value2, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideNotBetween(String value1, String value2) {
			this.addCriterion("IS_HIDE not between", value1, value2, "isHide");
			return (Criteria) this;
		}

		public Criteria andMenuSortIsNull() {
			this.addCriterion("MENU_SORT is null");
			return (Criteria) this;
		}

		public Criteria andMenuSortIsNotNull() {
			this.addCriterion("MENU_SORT is not null");
			return (Criteria) this;
		}

		public Criteria andMenuSortEqualTo(String value) {
			this.addCriterion("MENU_SORT =", value, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortNotEqualTo(String value) {
			this.addCriterion("MENU_SORT <>", value, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortGreaterThan(String value) {
			this.addCriterion("MENU_SORT >", value, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortGreaterThanOrEqualTo(String value) {
			this.addCriterion("MENU_SORT >=", value, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortLessThan(String value) {
			this.addCriterion("MENU_SORT <", value, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortLessThanOrEqualTo(String value) {
			this.addCriterion("MENU_SORT <=", value, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortLike(String value) {
			this.addCriterion("MENU_SORT like", value, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortNotLike(String value) {
			this.addCriterion("MENU_SORT not like", value, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortIn(List<String> values) {
			this.addCriterion("MENU_SORT in", values, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortNotIn(List<String> values) {
			this.addCriterion("MENU_SORT not in", values, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortBetween(String value1, String value2) {
			this.addCriterion("MENU_SORT between", value1, value2, "menuSort");
			return (Criteria) this;
		}

		public Criteria andMenuSortNotBetween(String value1, String value2) {
			this.addCriterion("MENU_SORT not between", value1, value2, "menuSort");
			return (Criteria) this;
		}

		public Criteria andIsCommonIsNull() {
			this.addCriterion("IS_COMMON is null");
			return (Criteria) this;
		}

		public Criteria andIsCommonIsNotNull() {
			this.addCriterion("IS_COMMON is not null");
			return (Criteria) this;
		}

		public Criteria andIsCommonEqualTo(String value) {
			this.addCriterion("IS_COMMON =", value, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonNotEqualTo(String value) {
			this.addCriterion("IS_COMMON <>", value, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonGreaterThan(String value) {
			this.addCriterion("IS_COMMON >", value, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonGreaterThanOrEqualTo(String value) {
			this.addCriterion("IS_COMMON >=", value, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonLessThan(String value) {
			this.addCriterion("IS_COMMON <", value, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonLessThanOrEqualTo(String value) {
			this.addCriterion("IS_COMMON <=", value, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonLike(String value) {
			this.addCriterion("IS_COMMON like", value, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonNotLike(String value) {
			this.addCriterion("IS_COMMON not like", value, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonIn(List<String> values) {
			this.addCriterion("IS_COMMON in", values, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonNotIn(List<String> values) {
			this.addCriterion("IS_COMMON not in", values, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonBetween(String value1, String value2) {
			this.addCriterion("IS_COMMON between", value1, value2, "isCommon");
			return (Criteria) this;
		}

		public Criteria andIsCommonNotBetween(String value1, String value2) {
			this.addCriterion("IS_COMMON not between", value1, value2, "isCommon");
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
