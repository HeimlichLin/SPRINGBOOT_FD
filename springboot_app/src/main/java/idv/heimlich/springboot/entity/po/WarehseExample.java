package idv.heimlich.springboot.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehseExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public WarehseExample() {
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

		public Criteria andPostcodeIsNull() {
			this.addCriterion("POSTCODE is null");
			return (Criteria) this;
		}

		public Criteria andPostcodeIsNotNull() {
			this.addCriterion("POSTCODE is not null");
			return (Criteria) this;
		}

		public Criteria andPostcodeEqualTo(String value) {
			this.addCriterion("POSTCODE =", value, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeNotEqualTo(String value) {
			this.addCriterion("POSTCODE <>", value, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeGreaterThan(String value) {
			this.addCriterion("POSTCODE >", value, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
			this.addCriterion("POSTCODE >=", value, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeLessThan(String value) {
			this.addCriterion("POSTCODE <", value, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeLessThanOrEqualTo(String value) {
			this.addCriterion("POSTCODE <=", value, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeLike(String value) {
			this.addCriterion("POSTCODE like", value, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeNotLike(String value) {
			this.addCriterion("POSTCODE not like", value, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeIn(List<String> values) {
			this.addCriterion("POSTCODE in", values, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeNotIn(List<String> values) {
			this.addCriterion("POSTCODE not in", values, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeBetween(String value1, String value2) {
			this.addCriterion("POSTCODE between", value1, value2, "postcode");
			return (Criteria) this;
		}

		public Criteria andPostcodeNotBetween(String value1, String value2) {
			this.addCriterion("POSTCODE not between", value1, value2, "postcode");
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

		public Criteria andBondaddIsNull() {
			this.addCriterion("BONDADD is null");
			return (Criteria) this;
		}

		public Criteria andBondaddIsNotNull() {
			this.addCriterion("BONDADD is not null");
			return (Criteria) this;
		}

		public Criteria andBondaddEqualTo(String value) {
			this.addCriterion("BONDADD =", value, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddNotEqualTo(String value) {
			this.addCriterion("BONDADD <>", value, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddGreaterThan(String value) {
			this.addCriterion("BONDADD >", value, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddGreaterThanOrEqualTo(String value) {
			this.addCriterion("BONDADD >=", value, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddLessThan(String value) {
			this.addCriterion("BONDADD <", value, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddLessThanOrEqualTo(String value) {
			this.addCriterion("BONDADD <=", value, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddLike(String value) {
			this.addCriterion("BONDADD like", value, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddNotLike(String value) {
			this.addCriterion("BONDADD not like", value, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddIn(List<String> values) {
			this.addCriterion("BONDADD in", values, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddNotIn(List<String> values) {
			this.addCriterion("BONDADD not in", values, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddBetween(String value1, String value2) {
			this.addCriterion("BONDADD between", value1, value2, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondaddNotBetween(String value1, String value2) {
			this.addCriterion("BONDADD not between", value1, value2, "bondadd");
			return (Criteria) this;
		}

		public Criteria andBondpwIsNull() {
			this.addCriterion("BONDPW is null");
			return (Criteria) this;
		}

		public Criteria andBondpwIsNotNull() {
			this.addCriterion("BONDPW is not null");
			return (Criteria) this;
		}

		public Criteria andBondpwEqualTo(String value) {
			this.addCriterion("BONDPW =", value, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwNotEqualTo(String value) {
			this.addCriterion("BONDPW <>", value, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwGreaterThan(String value) {
			this.addCriterion("BONDPW >", value, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwGreaterThanOrEqualTo(String value) {
			this.addCriterion("BONDPW >=", value, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwLessThan(String value) {
			this.addCriterion("BONDPW <", value, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwLessThanOrEqualTo(String value) {
			this.addCriterion("BONDPW <=", value, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwLike(String value) {
			this.addCriterion("BONDPW like", value, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwNotLike(String value) {
			this.addCriterion("BONDPW not like", value, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwIn(List<String> values) {
			this.addCriterion("BONDPW in", values, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwNotIn(List<String> values) {
			this.addCriterion("BONDPW not in", values, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwBetween(String value1, String value2) {
			this.addCriterion("BONDPW between", value1, value2, "bondpw");
			return (Criteria) this;
		}

		public Criteria andBondpwNotBetween(String value1, String value2) {
			this.addCriterion("BONDPW not between", value1, value2, "bondpw");
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

		public Criteria andRcvidIsNull() {
			this.addCriterion("RCVID is null");
			return (Criteria) this;
		}

		public Criteria andRcvidIsNotNull() {
			this.addCriterion("RCVID is not null");
			return (Criteria) this;
		}

		public Criteria andRcvidEqualTo(String value) {
			this.addCriterion("RCVID =", value, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidNotEqualTo(String value) {
			this.addCriterion("RCVID <>", value, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidGreaterThan(String value) {
			this.addCriterion("RCVID >", value, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidGreaterThanOrEqualTo(String value) {
			this.addCriterion("RCVID >=", value, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidLessThan(String value) {
			this.addCriterion("RCVID <", value, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidLessThanOrEqualTo(String value) {
			this.addCriterion("RCVID <=", value, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidLike(String value) {
			this.addCriterion("RCVID like", value, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidNotLike(String value) {
			this.addCriterion("RCVID not like", value, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidIn(List<String> values) {
			this.addCriterion("RCVID in", values, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidNotIn(List<String> values) {
			this.addCriterion("RCVID not in", values, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidBetween(String value1, String value2) {
			this.addCriterion("RCVID between", value1, value2, "rcvid");
			return (Criteria) this;
		}

		public Criteria andRcvidNotBetween(String value1, String value2) {
			this.addCriterion("RCVID not between", value1, value2, "rcvid");
			return (Criteria) this;
		}

		public Criteria andSepidIsNull() {
			this.addCriterion("SEPID is null");
			return (Criteria) this;
		}

		public Criteria andSepidIsNotNull() {
			this.addCriterion("SEPID is not null");
			return (Criteria) this;
		}

		public Criteria andSepidEqualTo(String value) {
			this.addCriterion("SEPID =", value, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidNotEqualTo(String value) {
			this.addCriterion("SEPID <>", value, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidGreaterThan(String value) {
			this.addCriterion("SEPID >", value, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidGreaterThanOrEqualTo(String value) {
			this.addCriterion("SEPID >=", value, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidLessThan(String value) {
			this.addCriterion("SEPID <", value, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidLessThanOrEqualTo(String value) {
			this.addCriterion("SEPID <=", value, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidLike(String value) {
			this.addCriterion("SEPID like", value, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidNotLike(String value) {
			this.addCriterion("SEPID not like", value, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidIn(List<String> values) {
			this.addCriterion("SEPID in", values, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidNotIn(List<String> values) {
			this.addCriterion("SEPID not in", values, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidBetween(String value1, String value2) {
			this.addCriterion("SEPID between", value1, value2, "sepid");
			return (Criteria) this;
		}

		public Criteria andSepidNotBetween(String value1, String value2) {
			this.addCriterion("SEPID not between", value1, value2, "sepid");
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

		public Criteria andRecvFlagIsNull() {
			this.addCriterion("RECV_FLAG is null");
			return (Criteria) this;
		}

		public Criteria andRecvFlagIsNotNull() {
			this.addCriterion("RECV_FLAG is not null");
			return (Criteria) this;
		}

		public Criteria andRecvFlagEqualTo(String value) {
			this.addCriterion("RECV_FLAG =", value, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagNotEqualTo(String value) {
			this.addCriterion("RECV_FLAG <>", value, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagGreaterThan(String value) {
			this.addCriterion("RECV_FLAG >", value, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagGreaterThanOrEqualTo(String value) {
			this.addCriterion("RECV_FLAG >=", value, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagLessThan(String value) {
			this.addCriterion("RECV_FLAG <", value, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagLessThanOrEqualTo(String value) {
			this.addCriterion("RECV_FLAG <=", value, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagLike(String value) {
			this.addCriterion("RECV_FLAG like", value, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagNotLike(String value) {
			this.addCriterion("RECV_FLAG not like", value, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagIn(List<String> values) {
			this.addCriterion("RECV_FLAG in", values, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagNotIn(List<String> values) {
			this.addCriterion("RECV_FLAG not in", values, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagBetween(String value1, String value2) {
			this.addCriterion("RECV_FLAG between", value1, value2, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andRecvFlagNotBetween(String value1, String value2) {
			this.addCriterion("RECV_FLAG not between", value1, value2, "recvFlag");
			return (Criteria) this;
		}

		public Criteria andBondtypeIsNull() {
			this.addCriterion("BONDTYPE is null");
			return (Criteria) this;
		}

		public Criteria andBondtypeIsNotNull() {
			this.addCriterion("BONDTYPE is not null");
			return (Criteria) this;
		}

		public Criteria andBondtypeEqualTo(String value) {
			this.addCriterion("BONDTYPE =", value, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeNotEqualTo(String value) {
			this.addCriterion("BONDTYPE <>", value, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeGreaterThan(String value) {
			this.addCriterion("BONDTYPE >", value, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeGreaterThanOrEqualTo(String value) {
			this.addCriterion("BONDTYPE >=", value, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeLessThan(String value) {
			this.addCriterion("BONDTYPE <", value, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeLessThanOrEqualTo(String value) {
			this.addCriterion("BONDTYPE <=", value, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeLike(String value) {
			this.addCriterion("BONDTYPE like", value, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeNotLike(String value) {
			this.addCriterion("BONDTYPE not like", value, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeIn(List<String> values) {
			this.addCriterion("BONDTYPE in", values, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeNotIn(List<String> values) {
			this.addCriterion("BONDTYPE not in", values, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeBetween(String value1, String value2) {
			this.addCriterion("BONDTYPE between", value1, value2, "bondtype");
			return (Criteria) this;
		}

		public Criteria andBondtypeNotBetween(String value1, String value2) {
			this.addCriterion("BONDTYPE not between", value1, value2, "bondtype");
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

		public Criteria andActivedateEqualTo(Date value) {
			this.addCriterion("ACTIVEDATE =", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateNotEqualTo(Date value) {
			this.addCriterion("ACTIVEDATE <>", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateGreaterThan(Date value) {
			this.addCriterion("ACTIVEDATE >", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateGreaterThanOrEqualTo(Date value) {
			this.addCriterion("ACTIVEDATE >=", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateLessThan(Date value) {
			this.addCriterion("ACTIVEDATE <", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateLessThanOrEqualTo(Date value) {
			this.addCriterion("ACTIVEDATE <=", value, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateIn(List<Date> values) {
			this.addCriterion("ACTIVEDATE in", values, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateNotIn(List<Date> values) {
			this.addCriterion("ACTIVEDATE not in", values, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateBetween(Date value1, Date value2) {
			this.addCriterion("ACTIVEDATE between", value1, value2, "activedate");
			return (Criteria) this;
		}

		public Criteria andActivedateNotBetween(Date value1, Date value2) {
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

		public Criteria andEnddateEqualTo(Date value) {
			this.addCriterion("ENDDATE =", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotEqualTo(Date value) {
			this.addCriterion("ENDDATE <>", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateGreaterThan(Date value) {
			this.addCriterion("ENDDATE >", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
			this.addCriterion("ENDDATE >=", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateLessThan(Date value) {
			this.addCriterion("ENDDATE <", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateLessThanOrEqualTo(Date value) {
			this.addCriterion("ENDDATE <=", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateIn(List<Date> values) {
			this.addCriterion("ENDDATE in", values, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotIn(List<Date> values) {
			this.addCriterion("ENDDATE not in", values, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateBetween(Date value1, Date value2) {
			this.addCriterion("ENDDATE between", value1, value2, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotBetween(Date value1, Date value2) {
			this.addCriterion("ENDDATE not between", value1, value2, "enddate");
			return (Criteria) this;
		}

		public Criteria andChargedateIsNull() {
			this.addCriterion("CHARGEDATE is null");
			return (Criteria) this;
		}

		public Criteria andChargedateIsNotNull() {
			this.addCriterion("CHARGEDATE is not null");
			return (Criteria) this;
		}

		public Criteria andChargedateEqualTo(Date value) {
			this.addCriterion("CHARGEDATE =", value, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateNotEqualTo(Date value) {
			this.addCriterion("CHARGEDATE <>", value, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateGreaterThan(Date value) {
			this.addCriterion("CHARGEDATE >", value, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateGreaterThanOrEqualTo(Date value) {
			this.addCriterion("CHARGEDATE >=", value, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateLessThan(Date value) {
			this.addCriterion("CHARGEDATE <", value, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateLessThanOrEqualTo(Date value) {
			this.addCriterion("CHARGEDATE <=", value, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateIn(List<Date> values) {
			this.addCriterion("CHARGEDATE in", values, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateNotIn(List<Date> values) {
			this.addCriterion("CHARGEDATE not in", values, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateBetween(Date value1, Date value2) {
			this.addCriterion("CHARGEDATE between", value1, value2, "chargedate");
			return (Criteria) this;
		}

		public Criteria andChargedateNotBetween(Date value1, Date value2) {
			this.addCriterion("CHARGEDATE not between", value1, value2, "chargedate");
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

		public Criteria andFaxIsNull() {
			this.addCriterion("FAX is null");
			return (Criteria) this;
		}

		public Criteria andFaxIsNotNull() {
			this.addCriterion("FAX is not null");
			return (Criteria) this;
		}

		public Criteria andFaxEqualTo(String value) {
			this.addCriterion("FAX =", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotEqualTo(String value) {
			this.addCriterion("FAX <>", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxGreaterThan(String value) {
			this.addCriterion("FAX >", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxGreaterThanOrEqualTo(String value) {
			this.addCriterion("FAX >=", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLessThan(String value) {
			this.addCriterion("FAX <", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLessThanOrEqualTo(String value) {
			this.addCriterion("FAX <=", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLike(String value) {
			this.addCriterion("FAX like", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotLike(String value) {
			this.addCriterion("FAX not like", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxIn(List<String> values) {
			this.addCriterion("FAX in", values, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotIn(List<String> values) {
			this.addCriterion("FAX not in", values, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxBetween(String value1, String value2) {
			this.addCriterion("FAX between", value1, value2, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotBetween(String value1, String value2) {
			this.addCriterion("FAX not between", value1, value2, "fax");
			return (Criteria) this;
		}

		public Criteria andCofficerIsNull() {
			this.addCriterion("COFFICER is null");
			return (Criteria) this;
		}

		public Criteria andCofficerIsNotNull() {
			this.addCriterion("COFFICER is not null");
			return (Criteria) this;
		}

		public Criteria andCofficerEqualTo(String value) {
			this.addCriterion("COFFICER =", value, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerNotEqualTo(String value) {
			this.addCriterion("COFFICER <>", value, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerGreaterThan(String value) {
			this.addCriterion("COFFICER >", value, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerGreaterThanOrEqualTo(String value) {
			this.addCriterion("COFFICER >=", value, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerLessThan(String value) {
			this.addCriterion("COFFICER <", value, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerLessThanOrEqualTo(String value) {
			this.addCriterion("COFFICER <=", value, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerLike(String value) {
			this.addCriterion("COFFICER like", value, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerNotLike(String value) {
			this.addCriterion("COFFICER not like", value, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerIn(List<String> values) {
			this.addCriterion("COFFICER in", values, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerNotIn(List<String> values) {
			this.addCriterion("COFFICER not in", values, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerBetween(String value1, String value2) {
			this.addCriterion("COFFICER between", value1, value2, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCofficerNotBetween(String value1, String value2) {
			this.addCriterion("COFFICER not between", value1, value2, "cofficer");
			return (Criteria) this;
		}

		public Criteria andCustomFlagIsNull() {
			this.addCriterion("CUSTOM_FLAG is null");
			return (Criteria) this;
		}

		public Criteria andCustomFlagIsNotNull() {
			this.addCriterion("CUSTOM_FLAG is not null");
			return (Criteria) this;
		}

		public Criteria andCustomFlagEqualTo(String value) {
			this.addCriterion("CUSTOM_FLAG =", value, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagNotEqualTo(String value) {
			this.addCriterion("CUSTOM_FLAG <>", value, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagGreaterThan(String value) {
			this.addCriterion("CUSTOM_FLAG >", value, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagGreaterThanOrEqualTo(String value) {
			this.addCriterion("CUSTOM_FLAG >=", value, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagLessThan(String value) {
			this.addCriterion("CUSTOM_FLAG <", value, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagLessThanOrEqualTo(String value) {
			this.addCriterion("CUSTOM_FLAG <=", value, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagLike(String value) {
			this.addCriterion("CUSTOM_FLAG like", value, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagNotLike(String value) {
			this.addCriterion("CUSTOM_FLAG not like", value, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagIn(List<String> values) {
			this.addCriterion("CUSTOM_FLAG in", values, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagNotIn(List<String> values) {
			this.addCriterion("CUSTOM_FLAG not in", values, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagBetween(String value1, String value2) {
			this.addCriterion("CUSTOM_FLAG between", value1, value2, "customFlag");
			return (Criteria) this;
		}

		public Criteria andCustomFlagNotBetween(String value1, String value2) {
			this.addCriterion("CUSTOM_FLAG not between", value1, value2, "customFlag");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmIsNull() {
			this.addCriterion("AUTOCONFIRM is null");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmIsNotNull() {
			this.addCriterion("AUTOCONFIRM is not null");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmEqualTo(String value) {
			this.addCriterion("AUTOCONFIRM =", value, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmNotEqualTo(String value) {
			this.addCriterion("AUTOCONFIRM <>", value, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmGreaterThan(String value) {
			this.addCriterion("AUTOCONFIRM >", value, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmGreaterThanOrEqualTo(String value) {
			this.addCriterion("AUTOCONFIRM >=", value, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmLessThan(String value) {
			this.addCriterion("AUTOCONFIRM <", value, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmLessThanOrEqualTo(String value) {
			this.addCriterion("AUTOCONFIRM <=", value, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmLike(String value) {
			this.addCriterion("AUTOCONFIRM like", value, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmNotLike(String value) {
			this.addCriterion("AUTOCONFIRM not like", value, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmIn(List<String> values) {
			this.addCriterion("AUTOCONFIRM in", values, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmNotIn(List<String> values) {
			this.addCriterion("AUTOCONFIRM not in", values, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmBetween(String value1, String value2) {
			this.addCriterion("AUTOCONFIRM between", value1, value2, "autoconfirm");
			return (Criteria) this;
		}

		public Criteria andAutoconfirmNotBetween(String value1, String value2) {
			this.addCriterion("AUTOCONFIRM not between", value1, value2, "autoconfirm");
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