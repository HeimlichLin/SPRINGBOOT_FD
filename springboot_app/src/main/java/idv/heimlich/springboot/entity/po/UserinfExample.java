package idv.heimlich.springboot.entity.po;

import java.util.ArrayList;
import java.util.List;

public class UserinfExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserinfExample() {
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

		public Criteria andUseridIsNull() {
			this.addCriterion("USERID is null");
			return (Criteria) this;
		}

		public Criteria andUseridIsNotNull() {
			this.addCriterion("USERID is not null");
			return (Criteria) this;
		}

		public Criteria andUseridEqualTo(String value) {
			this.addCriterion("USERID =", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotEqualTo(String value) {
			this.addCriterion("USERID <>", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThan(String value) {
			this.addCriterion("USERID >", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThanOrEqualTo(String value) {
			this.addCriterion("USERID >=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThan(String value) {
			this.addCriterion("USERID <", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThanOrEqualTo(String value) {
			this.addCriterion("USERID <=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLike(String value) {
			this.addCriterion("USERID like", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotLike(String value) {
			this.addCriterion("USERID not like", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridIn(List<String> values) {
			this.addCriterion("USERID in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotIn(List<String> values) {
			this.addCriterion("USERID not in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridBetween(String value1, String value2) {
			this.addCriterion("USERID between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotBetween(String value1, String value2) {
			this.addCriterion("USERID not between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andUserpwIsNull() {
			this.addCriterion("USERPW is null");
			return (Criteria) this;
		}

		public Criteria andUserpwIsNotNull() {
			this.addCriterion("USERPW is not null");
			return (Criteria) this;
		}

		public Criteria andUserpwEqualTo(String value) {
			this.addCriterion("USERPW =", value, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwNotEqualTo(String value) {
			this.addCriterion("USERPW <>", value, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwGreaterThan(String value) {
			this.addCriterion("USERPW >", value, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwGreaterThanOrEqualTo(String value) {
			this.addCriterion("USERPW >=", value, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwLessThan(String value) {
			this.addCriterion("USERPW <", value, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwLessThanOrEqualTo(String value) {
			this.addCriterion("USERPW <=", value, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwLike(String value) {
			this.addCriterion("USERPW like", value, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwNotLike(String value) {
			this.addCriterion("USERPW not like", value, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwIn(List<String> values) {
			this.addCriterion("USERPW in", values, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwNotIn(List<String> values) {
			this.addCriterion("USERPW not in", values, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwBetween(String value1, String value2) {
			this.addCriterion("USERPW between", value1, value2, "userpw");
			return (Criteria) this;
		}

		public Criteria andUserpwNotBetween(String value1, String value2) {
			this.addCriterion("USERPW not between", value1, value2, "userpw");
			return (Criteria) this;
		}

		public Criteria andAuthidIsNull() {
			this.addCriterion("AUTHID is null");
			return (Criteria) this;
		}

		public Criteria andAuthidIsNotNull() {
			this.addCriterion("AUTHID is not null");
			return (Criteria) this;
		}

		public Criteria andAuthidEqualTo(String value) {
			this.addCriterion("AUTHID =", value, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidNotEqualTo(String value) {
			this.addCriterion("AUTHID <>", value, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidGreaterThan(String value) {
			this.addCriterion("AUTHID >", value, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidGreaterThanOrEqualTo(String value) {
			this.addCriterion("AUTHID >=", value, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidLessThan(String value) {
			this.addCriterion("AUTHID <", value, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidLessThanOrEqualTo(String value) {
			this.addCriterion("AUTHID <=", value, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidLike(String value) {
			this.addCriterion("AUTHID like", value, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidNotLike(String value) {
			this.addCriterion("AUTHID not like", value, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidIn(List<String> values) {
			this.addCriterion("AUTHID in", values, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidNotIn(List<String> values) {
			this.addCriterion("AUTHID not in", values, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidBetween(String value1, String value2) {
			this.addCriterion("AUTHID between", value1, value2, "authid");
			return (Criteria) this;
		}

		public Criteria andAuthidNotBetween(String value1, String value2) {
			this.addCriterion("AUTHID not between", value1, value2, "authid");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			this.addCriterion("USERNAME is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			this.addCriterion("USERNAME is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			this.addCriterion("USERNAME =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			this.addCriterion("USERNAME <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			this.addCriterion("USERNAME >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			this.addCriterion("USERNAME >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			this.addCriterion("USERNAME <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			this.addCriterion("USERNAME <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			this.addCriterion("USERNAME like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			this.addCriterion("USERNAME not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			this.addCriterion("USERNAME in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			this.addCriterion("USERNAME not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			this.addCriterion("USERNAME between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			this.addCriterion("USERNAME not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUserofficeIsNull() {
			this.addCriterion("USEROFFICE is null");
			return (Criteria) this;
		}

		public Criteria andUserofficeIsNotNull() {
			this.addCriterion("USEROFFICE is not null");
			return (Criteria) this;
		}

		public Criteria andUserofficeEqualTo(String value) {
			this.addCriterion("USEROFFICE =", value, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeNotEqualTo(String value) {
			this.addCriterion("USEROFFICE <>", value, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeGreaterThan(String value) {
			this.addCriterion("USEROFFICE >", value, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeGreaterThanOrEqualTo(String value) {
			this.addCriterion("USEROFFICE >=", value, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeLessThan(String value) {
			this.addCriterion("USEROFFICE <", value, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeLessThanOrEqualTo(String value) {
			this.addCriterion("USEROFFICE <=", value, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeLike(String value) {
			this.addCriterion("USEROFFICE like", value, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeNotLike(String value) {
			this.addCriterion("USEROFFICE not like", value, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeIn(List<String> values) {
			this.addCriterion("USEROFFICE in", values, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeNotIn(List<String> values) {
			this.addCriterion("USEROFFICE not in", values, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeBetween(String value1, String value2) {
			this.addCriterion("USEROFFICE between", value1, value2, "useroffice");
			return (Criteria) this;
		}

		public Criteria andUserofficeNotBetween(String value1, String value2) {
			this.addCriterion("USEROFFICE not between", value1, value2, "useroffice");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			this.addCriterion("STATUS is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			this.addCriterion("STATUS is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			this.addCriterion("STATUS =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			this.addCriterion("STATUS <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			this.addCriterion("STATUS >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			this.addCriterion("STATUS >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			this.addCriterion("STATUS <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			this.addCriterion("STATUS <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			this.addCriterion("STATUS like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			this.addCriterion("STATUS not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			this.addCriterion("STATUS in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			this.addCriterion("STATUS not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			this.addCriterion("STATUS between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			this.addCriterion("STATUS not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andActivedateIsNull() {
			this.addCriterion("ACTIVEDATE is null");
			return (Criteria) this;
		}

		public Criteria andActivedateIsNotNull() {
			this.addCriterion("ACTIVEDATE is not null");
			return (Criteria) this;
		}

		public Criteria andActivedateEqualTo(String value) {
			this.addCriterion("ACTIVEDATE =", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateNotEqualTo(String value) {
			this.addCriterion("ACTIVEDATE <>", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateGreaterThan(String value) {
			this.addCriterion("ACTIVEDATE >", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateGreaterThanOrEqualTo(String value) {
			this.addCriterion("ACTIVEDATE >=", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateLessThan(String value) {
			this.addCriterion("ACTIVEDATE <", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateLessThanOrEqualTo(String value) {
			this.addCriterion("ACTIVEDATE <=", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateLike(String value) {
			this.addCriterion("ACTIVEDATE like", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateNotLike(String value) {
			this.addCriterion("ACTIVEDATE not like", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateIn(List<String> values) {
			this.addCriterion("ACTIVEDATE in", values, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateNotIn(List<String> values) {
			this.addCriterion("ACTIVEDATE not in", values, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateBetween(String value1, String value2) {
			this.addCriterion("ACTIVEDATE between", value1, value2, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateNotBetween(String value1, String value2) {
			this.addCriterion("ACTIVEDATE not between", value1, value2, "activedate");
			return (Criteria) this;
		}

		public Criteria andEnddateIsNull() {
			this.addCriterion("ENDDATE is null");
			return (Criteria) this;
		}

		public Criteria andEnddateIsNotNull() {
			this.addCriterion("ENDDATE is not null");
			return (Criteria) this;
		}

		public Criteria andEnddateEqualTo(String value) {
			this.addCriterion("ENDDATE =", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotEqualTo(String value) {
			this.addCriterion("ENDDATE <>", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateGreaterThan(String value) {
			this.addCriterion("ENDDATE >", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateGreaterThanOrEqualTo(String value) {
			this.addCriterion("ENDDATE >=", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateLessThan(String value) {
			this.addCriterion("ENDDATE <", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateLessThanOrEqualTo(String value) {
			this.addCriterion("ENDDATE <=", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateLike(String value) {
			this.addCriterion("ENDDATE like", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotLike(String value) {
			this.addCriterion("ENDDATE not like", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateIn(List<String> values) {
			this.addCriterion("ENDDATE in", values, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotIn(List<String> values) {
			this.addCriterion("ENDDATE not in", values, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateBetween(String value1, String value2) {
			this.addCriterion("ENDDATE between", value1, value2, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotBetween(String value1, String value2) {
			this.addCriterion("ENDDATE not between", value1, value2, "enddate");
			return (Criteria) this;
		}

		public Criteria andDepartmentIsNull() {
			this.addCriterion("DEPARTMENT is null");
			return (Criteria) this;
		}

		public Criteria andDepartmentIsNotNull() {
			this.addCriterion("DEPARTMENT is not null");
			return (Criteria) this;
		}

		public Criteria andDepartmentEqualTo(String value) {
			this.addCriterion("DEPARTMENT =", value, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentNotEqualTo(String value) {
			this.addCriterion("DEPARTMENT <>", value, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentGreaterThan(String value) {
			this.addCriterion("DEPARTMENT >", value, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
			this.addCriterion("DEPARTMENT >=", value, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentLessThan(String value) {
			this.addCriterion("DEPARTMENT <", value, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentLessThanOrEqualTo(String value) {
			this.addCriterion("DEPARTMENT <=", value, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentLike(String value) {
			this.addCriterion("DEPARTMENT like", value, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentNotLike(String value) {
			this.addCriterion("DEPARTMENT not like", value, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentIn(List<String> values) {
			this.addCriterion("DEPARTMENT in", values, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentNotIn(List<String> values) {
			this.addCriterion("DEPARTMENT not in", values, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentBetween(String value1, String value2) {
			this.addCriterion("DEPARTMENT between", value1, value2, "department");
			return (Criteria) this;
		}

		public Criteria andDepartmentNotBetween(String value1, String value2) {
			this.addCriterion("DEPARTMENT not between", value1, value2, "department");
			return (Criteria) this;
		}

		public Criteria andTelIsNull() {
			this.addCriterion("TEL is null");
			return (Criteria) this;
		}

		public Criteria andTelIsNotNull() {
			this.addCriterion("TEL is not null");
			return (Criteria) this;
		}

		public Criteria andTelEqualTo(String value) {
			this.addCriterion("TEL =", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotEqualTo(String value) {
			this.addCriterion("TEL <>", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelGreaterThan(String value) {
			this.addCriterion("TEL >", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelGreaterThanOrEqualTo(String value) {
			this.addCriterion("TEL >=", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLessThan(String value) {
			this.addCriterion("TEL <", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLessThanOrEqualTo(String value) {
			this.addCriterion("TEL <=", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLike(String value) {
			this.addCriterion("TEL like", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotLike(String value) {
			this.addCriterion("TEL not like", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelIn(List<String> values) {
			this.addCriterion("TEL in", values, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotIn(List<String> values) {
			this.addCriterion("TEL not in", values, "tel");
			return (Criteria) this;
		}

		public Criteria andTelBetween(String value1, String value2) {
			this.addCriterion("TEL between", value1, value2, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotBetween(String value1, String value2) {
			this.addCriterion("TEL not between", value1, value2, "tel");
			return (Criteria) this;
		}

		public Criteria andLastloginIsNull() {
			this.addCriterion("LASTLOGIN is null");
			return (Criteria) this;
		}

		public Criteria andLastloginIsNotNull() {
			this.addCriterion("LASTLOGIN is not null");
			return (Criteria) this;
		}

		public Criteria andLastloginEqualTo(String value) {
			this.addCriterion("LASTLOGIN =", value, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginNotEqualTo(String value) {
			this.addCriterion("LASTLOGIN <>", value, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginGreaterThan(String value) {
			this.addCriterion("LASTLOGIN >", value, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginGreaterThanOrEqualTo(String value) {
			this.addCriterion("LASTLOGIN >=", value, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginLessThan(String value) {
			this.addCriterion("LASTLOGIN <", value, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginLessThanOrEqualTo(String value) {
			this.addCriterion("LASTLOGIN <=", value, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginLike(String value) {
			this.addCriterion("LASTLOGIN like", value, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginNotLike(String value) {
			this.addCriterion("LASTLOGIN not like", value, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginIn(List<String> values) {
			this.addCriterion("LASTLOGIN in", values, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginNotIn(List<String> values) {
			this.addCriterion("LASTLOGIN not in", values, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginBetween(String value1, String value2) {
			this.addCriterion("LASTLOGIN between", value1, value2, "lastlogin");
			return (Criteria) this;
		}

		public Criteria andLastloginNotBetween(String value1, String value2) {
			this.addCriterion("LASTLOGIN not between", value1, value2, "lastlogin");
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
