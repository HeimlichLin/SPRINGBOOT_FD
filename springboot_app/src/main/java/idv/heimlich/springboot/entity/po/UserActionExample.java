package idv.heimlich.springboot.entity.po;

import java.util.ArrayList;
import java.util.List;

public class UserActionExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserActionExample() {
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

		public Criteria andUserIdIsNull() {
			this.addCriterion("USER_ID is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			this.addCriterion("USER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			this.addCriterion("USER_ID =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			this.addCriterion("USER_ID <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			this.addCriterion("USER_ID >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			this.addCriterion("USER_ID >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			this.addCriterion("USER_ID <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			this.addCriterion("USER_ID <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			this.addCriterion("USER_ID like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			this.addCriterion("USER_ID not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			this.addCriterion("USER_ID in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			this.addCriterion("USER_ID not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			this.addCriterion("USER_ID between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			this.addCriterion("USER_ID not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andBondNoIsNull() {
			this.addCriterion("BOND_NO is null");
			return (Criteria) this;
		}

		public Criteria andBondNoIsNotNull() {
			this.addCriterion("BOND_NO is not null");
			return (Criteria) this;
		}

		public Criteria andBondNoEqualTo(String value) {
			this.addCriterion("BOND_NO =", value, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoNotEqualTo(String value) {
			this.addCriterion("BOND_NO <>", value, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoGreaterThan(String value) {
			this.addCriterion("BOND_NO >", value, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoGreaterThanOrEqualTo(String value) {
			this.addCriterion("BOND_NO >=", value, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoLessThan(String value) {
			this.addCriterion("BOND_NO <", value, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoLessThanOrEqualTo(String value) {
			this.addCriterion("BOND_NO <=", value, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoLike(String value) {
			this.addCriterion("BOND_NO like", value, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoNotLike(String value) {
			this.addCriterion("BOND_NO not like", value, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoIn(List<String> values) {
			this.addCriterion("BOND_NO in", values, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoNotIn(List<String> values) {
			this.addCriterion("BOND_NO not in", values, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoBetween(String value1, String value2) {
			this.addCriterion("BOND_NO between", value1, value2, "bondNo");
			return (Criteria) this;
		}

		public Criteria andBondNoNotBetween(String value1, String value2) {
			this.addCriterion("BOND_NO not between", value1, value2, "bondNo");
			return (Criteria) this;
		}

		public Criteria andStartdateIsNull() {
			this.addCriterion("STARTDATE is null");
			return (Criteria) this;
		}

		public Criteria andStartdateIsNotNull() {
			this.addCriterion("STARTDATE is not null");
			return (Criteria) this;
		}

		public Criteria andStartdateEqualTo(String value) {
			this.addCriterion("STARTDATE =", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateNotEqualTo(String value) {
			this.addCriterion("STARTDATE <>", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateGreaterThan(String value) {
			this.addCriterion("STARTDATE >", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateGreaterThanOrEqualTo(String value) {
			this.addCriterion("STARTDATE >=", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateLessThan(String value) {
			this.addCriterion("STARTDATE <", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateLessThanOrEqualTo(String value) {
			this.addCriterion("STARTDATE <=", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateLike(String value) {
			this.addCriterion("STARTDATE like", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateNotLike(String value) {
			this.addCriterion("STARTDATE not like", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateIn(List<String> values) {
			this.addCriterion("STARTDATE in", values, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateNotIn(List<String> values) {
			this.addCriterion("STARTDATE not in", values, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateBetween(String value1, String value2) {
			this.addCriterion("STARTDATE between", value1, value2, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateNotBetween(String value1, String value2) {
			this.addCriterion("STARTDATE not between", value1, value2, "startdate");
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

		public Criteria andStarttimeIsNull() {
			this.addCriterion("STARTTIME is null");
			return (Criteria) this;
		}

		public Criteria andStarttimeIsNotNull() {
			this.addCriterion("STARTTIME is not null");
			return (Criteria) this;
		}

		public Criteria andStarttimeEqualTo(String value) {
			this.addCriterion("STARTTIME =", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeNotEqualTo(String value) {
			this.addCriterion("STARTTIME <>", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeGreaterThan(String value) {
			this.addCriterion("STARTTIME >", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
			this.addCriterion("STARTTIME >=", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeLessThan(String value) {
			this.addCriterion("STARTTIME <", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeLessThanOrEqualTo(String value) {
			this.addCriterion("STARTTIME <=", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeLike(String value) {
			this.addCriterion("STARTTIME like", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeNotLike(String value) {
			this.addCriterion("STARTTIME not like", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeIn(List<String> values) {
			this.addCriterion("STARTTIME in", values, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeNotIn(List<String> values) {
			this.addCriterion("STARTTIME not in", values, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeBetween(String value1, String value2) {
			this.addCriterion("STARTTIME between", value1, value2, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeNotBetween(String value1, String value2) {
			this.addCriterion("STARTTIME not between", value1, value2, "starttime");
			return (Criteria) this;
		}

		public Criteria andEndtimeIsNull() {
			this.addCriterion("ENDTIME is null");
			return (Criteria) this;
		}

		public Criteria andEndtimeIsNotNull() {
			this.addCriterion("ENDTIME is not null");
			return (Criteria) this;
		}

		public Criteria andEndtimeEqualTo(String value) {
			this.addCriterion("ENDTIME =", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotEqualTo(String value) {
			this.addCriterion("ENDTIME <>", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeGreaterThan(String value) {
			this.addCriterion("ENDTIME >", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
			this.addCriterion("ENDTIME >=", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeLessThan(String value) {
			this.addCriterion("ENDTIME <", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeLessThanOrEqualTo(String value) {
			this.addCriterion("ENDTIME <=", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeLike(String value) {
			this.addCriterion("ENDTIME like", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotLike(String value) {
			this.addCriterion("ENDTIME not like", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeIn(List<String> values) {
			this.addCriterion("ENDTIME in", values, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotIn(List<String> values) {
			this.addCriterion("ENDTIME not in", values, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeBetween(String value1, String value2) {
			this.addCriterion("ENDTIME between", value1, value2, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotBetween(String value1, String value2) {
			this.addCriterion("ENDTIME not between", value1, value2, "endtime");
			return (Criteria) this;
		}

		public Criteria andIpIsNull() {
			this.addCriterion("IP is null");
			return (Criteria) this;
		}

		public Criteria andIpIsNotNull() {
			this.addCriterion("IP is not null");
			return (Criteria) this;
		}

		public Criteria andIpEqualTo(String value) {
			this.addCriterion("IP =", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotEqualTo(String value) {
			this.addCriterion("IP <>", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThan(String value) {
			this.addCriterion("IP >", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThanOrEqualTo(String value) {
			this.addCriterion("IP >=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThan(String value) {
			this.addCriterion("IP <", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThanOrEqualTo(String value) {
			this.addCriterion("IP <=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLike(String value) {
			this.addCriterion("IP like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotLike(String value) {
			this.addCriterion("IP not like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpIn(List<String> values) {
			this.addCriterion("IP in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotIn(List<String> values) {
			this.addCriterion("IP not in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpBetween(String value1, String value2) {
			this.addCriterion("IP between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotBetween(String value1, String value2) {
			this.addCriterion("IP not between", value1, value2, "ip");
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

		public Criteria andAttributeIsNull() {
			this.addCriterion("ATTRIBUTE is null");
			return (Criteria) this;
		}

		public Criteria andAttributeIsNotNull() {
			this.addCriterion("ATTRIBUTE is not null");
			return (Criteria) this;
		}

		public Criteria andAttributeEqualTo(String value) {
			this.addCriterion("ATTRIBUTE =", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeNotEqualTo(String value) {
			this.addCriterion("ATTRIBUTE <>", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeGreaterThan(String value) {
			this.addCriterion("ATTRIBUTE >", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeGreaterThanOrEqualTo(String value) {
			this.addCriterion("ATTRIBUTE >=", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeLessThan(String value) {
			this.addCriterion("ATTRIBUTE <", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeLessThanOrEqualTo(String value) {
			this.addCriterion("ATTRIBUTE <=", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeLike(String value) {
			this.addCriterion("ATTRIBUTE like", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeNotLike(String value) {
			this.addCriterion("ATTRIBUTE not like", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeIn(List<String> values) {
			this.addCriterion("ATTRIBUTE in", values, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeNotIn(List<String> values) {
			this.addCriterion("ATTRIBUTE not in", values, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeBetween(String value1, String value2) {
			this.addCriterion("ATTRIBUTE between", value1, value2, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeNotBetween(String value1, String value2) {
			this.addCriterion("ATTRIBUTE not between", value1, value2, "attribute");
			return (Criteria) this;
		}

		public Criteria andDeclnoIsNull() {
			this.addCriterion("DECLNO is null");
			return (Criteria) this;
		}

		public Criteria andDeclnoIsNotNull() {
			this.addCriterion("DECLNO is not null");
			return (Criteria) this;
		}

		public Criteria andDeclnoEqualTo(String value) {
			this.addCriterion("DECLNO =", value, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoNotEqualTo(String value) {
			this.addCriterion("DECLNO <>", value, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoGreaterThan(String value) {
			this.addCriterion("DECLNO >", value, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoGreaterThanOrEqualTo(String value) {
			this.addCriterion("DECLNO >=", value, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoLessThan(String value) {
			this.addCriterion("DECLNO <", value, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoLessThanOrEqualTo(String value) {
			this.addCriterion("DECLNO <=", value, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoLike(String value) {
			this.addCriterion("DECLNO like", value, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoNotLike(String value) {
			this.addCriterion("DECLNO not like", value, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoIn(List<String> values) {
			this.addCriterion("DECLNO in", values, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoNotIn(List<String> values) {
			this.addCriterion("DECLNO not in", values, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoBetween(String value1, String value2) {
			this.addCriterion("DECLNO between", value1, value2, "declno");
			return (Criteria) this;
		}

		public Criteria andDeclnoNotBetween(String value1, String value2) {
			this.addCriterion("DECLNO not between", value1, value2, "declno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoIsNull() {
			this.addCriterion("REFBILLNO is null");
			return (Criteria) this;
		}

		public Criteria andRefbillnoIsNotNull() {
			this.addCriterion("REFBILLNO is not null");
			return (Criteria) this;
		}

		public Criteria andRefbillnoEqualTo(String value) {
			this.addCriterion("REFBILLNO =", value, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoNotEqualTo(String value) {
			this.addCriterion("REFBILLNO <>", value, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoGreaterThan(String value) {
			this.addCriterion("REFBILLNO >", value, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoGreaterThanOrEqualTo(String value) {
			this.addCriterion("REFBILLNO >=", value, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoLessThan(String value) {
			this.addCriterion("REFBILLNO <", value, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoLessThanOrEqualTo(String value) {
			this.addCriterion("REFBILLNO <=", value, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoLike(String value) {
			this.addCriterion("REFBILLNO like", value, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoNotLike(String value) {
			this.addCriterion("REFBILLNO not like", value, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoIn(List<String> values) {
			this.addCriterion("REFBILLNO in", values, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoNotIn(List<String> values) {
			this.addCriterion("REFBILLNO not in", values, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoBetween(String value1, String value2) {
			this.addCriterion("REFBILLNO between", value1, value2, "refbillno");
			return (Criteria) this;
		}

		public Criteria andRefbillnoNotBetween(String value1, String value2) {
			this.addCriterion("REFBILLNO not between", value1, value2, "refbillno");
			return (Criteria) this;
		}

		public Criteria andMessageIsNull() {
			this.addCriterion("MESSAGE is null");
			return (Criteria) this;
		}

		public Criteria andMessageIsNotNull() {
			this.addCriterion("MESSAGE is not null");
			return (Criteria) this;
		}

		public Criteria andMessageEqualTo(String value) {
			this.addCriterion("MESSAGE =", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageNotEqualTo(String value) {
			this.addCriterion("MESSAGE <>", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageGreaterThan(String value) {
			this.addCriterion("MESSAGE >", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageGreaterThanOrEqualTo(String value) {
			this.addCriterion("MESSAGE >=", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageLessThan(String value) {
			this.addCriterion("MESSAGE <", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageLessThanOrEqualTo(String value) {
			this.addCriterion("MESSAGE <=", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageLike(String value) {
			this.addCriterion("MESSAGE like", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageNotLike(String value) {
			this.addCriterion("MESSAGE not like", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageIn(List<String> values) {
			this.addCriterion("MESSAGE in", values, "message");
			return (Criteria) this;
		}

		public Criteria andMessageNotIn(List<String> values) {
			this.addCriterion("MESSAGE not in", values, "message");
			return (Criteria) this;
		}

		public Criteria andMessageBetween(String value1, String value2) {
			this.addCriterion("MESSAGE between", value1, value2, "message");
			return (Criteria) this;
		}

		public Criteria andMessageNotBetween(String value1, String value2) {
			this.addCriterion("MESSAGE not between", value1, value2, "message");
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
