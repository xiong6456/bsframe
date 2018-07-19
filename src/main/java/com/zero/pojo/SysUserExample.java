package com.zero.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFdIdIsNull() {
            addCriterion("sys_user.fd_id is null");
            return (Criteria) this;
        }

        public Criteria andFdIdIsNotNull() {
            addCriterion("sys_user.fd_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdIdEqualTo(String value) {
            addCriterion("sys_user.fd_id =", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotEqualTo(String value) {
            addCriterion("sys_user.fd_id <>", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdGreaterThan(String value) {
            addCriterion("sys_user.fd_id >", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_id >=", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLessThan(String value) {
            addCriterion("sys_user.fd_id <", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_id <=", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLike(String value) {
            addCriterion("sys_user.fd_id like", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotLike(String value) {
            addCriterion("sys_user.fd_id not like", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdIn(List<String> values) {
            addCriterion("sys_user.fd_id in", values, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotIn(List<String> values) {
            addCriterion("sys_user.fd_id not in", values, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdBetween(String value1, String value2) {
            addCriterion("sys_user.fd_id between", value1, value2, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_id not between", value1, value2, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdNameIsNull() {
            addCriterion("sys_user.fd_name is null");
            return (Criteria) this;
        }

        public Criteria andFdNameIsNotNull() {
            addCriterion("sys_user.fd_name is not null");
            return (Criteria) this;
        }

        public Criteria andFdNameEqualTo(String value) {
            addCriterion("sys_user.fd_name =", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotEqualTo(String value) {
            addCriterion("sys_user.fd_name <>", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameGreaterThan(String value) {
            addCriterion("sys_user.fd_name >", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_name >=", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLessThan(String value) {
            addCriterion("sys_user.fd_name <", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_name <=", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLike(String value) {
            addCriterion("sys_user.fd_name like", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotLike(String value) {
            addCriterion("sys_user.fd_name not like", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameIn(List<String> values) {
            addCriterion("sys_user.fd_name in", values, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotIn(List<String> values) {
            addCriterion("sys_user.fd_name not in", values, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameBetween(String value1, String value2) {
            addCriterion("sys_user.fd_name between", value1, value2, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_name not between", value1, value2, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdPhoneIsNull() {
            addCriterion("sys_user.fd_phone is null");
            return (Criteria) this;
        }

        public Criteria andFdPhoneIsNotNull() {
            addCriterion("sys_user.fd_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFdPhoneEqualTo(String value) {
            addCriterion("sys_user.fd_phone =", value, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneNotEqualTo(String value) {
            addCriterion("sys_user.fd_phone <>", value, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneGreaterThan(String value) {
            addCriterion("sys_user.fd_phone >", value, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_phone >=", value, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneLessThan(String value) {
            addCriterion("sys_user.fd_phone <", value, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_phone <=", value, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneLike(String value) {
            addCriterion("sys_user.fd_phone like", value, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneNotLike(String value) {
            addCriterion("sys_user.fd_phone not like", value, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneIn(List<String> values) {
            addCriterion("sys_user.fd_phone in", values, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneNotIn(List<String> values) {
            addCriterion("sys_user.fd_phone not in", values, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneBetween(String value1, String value2) {
            addCriterion("sys_user.fd_phone between", value1, value2, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdPhoneNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_phone not between", value1, value2, "fdPhone");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableIsNull() {
            addCriterion("sys_user.fd_is_available is null");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableIsNotNull() {
            addCriterion("sys_user.fd_is_available is not null");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableEqualTo(String value) {
            addCriterion("sys_user.fd_is_available =", value, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableNotEqualTo(String value) {
            addCriterion("sys_user.fd_is_available <>", value, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableGreaterThan(String value) {
            addCriterion("sys_user.fd_is_available >", value, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_is_available >=", value, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableLessThan(String value) {
            addCriterion("sys_user.fd_is_available <", value, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_is_available <=", value, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableLike(String value) {
            addCriterion("sys_user.fd_is_available like", value, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableNotLike(String value) {
            addCriterion("sys_user.fd_is_available not like", value, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableIn(List<String> values) {
            addCriterion("sys_user.fd_is_available in", values, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableNotIn(List<String> values) {
            addCriterion("sys_user.fd_is_available not in", values, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableBetween(String value1, String value2) {
            addCriterion("sys_user.fd_is_available between", value1, value2, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdIsAvailableNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_is_available not between", value1, value2, "fdIsAvailable");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameIsNull() {
            addCriterion("sys_user.fd_login_name is null");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameIsNotNull() {
            addCriterion("sys_user.fd_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameEqualTo(String value) {
            addCriterion("sys_user.fd_login_name =", value, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameNotEqualTo(String value) {
            addCriterion("sys_user.fd_login_name <>", value, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameGreaterThan(String value) {
            addCriterion("sys_user.fd_login_name >", value, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_login_name >=", value, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameLessThan(String value) {
            addCriterion("sys_user.fd_login_name <", value, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_login_name <=", value, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameLike(String value) {
            addCriterion("sys_user.fd_login_name like", value, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameNotLike(String value) {
            addCriterion("sys_user.fd_login_name not like", value, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameIn(List<String> values) {
            addCriterion("sys_user.fd_login_name in", values, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameNotIn(List<String> values) {
            addCriterion("sys_user.fd_login_name not in", values, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameBetween(String value1, String value2) {
            addCriterion("sys_user.fd_login_name between", value1, value2, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdLoginNameNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_login_name not between", value1, value2, "fdLoginName");
            return (Criteria) this;
        }

        public Criteria andFdPasswordIsNull() {
            addCriterion("sys_user.fd_password is null");
            return (Criteria) this;
        }

        public Criteria andFdPasswordIsNotNull() {
            addCriterion("sys_user.fd_password is not null");
            return (Criteria) this;
        }

        public Criteria andFdPasswordEqualTo(String value) {
            addCriterion("sys_user.fd_password =", value, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordNotEqualTo(String value) {
            addCriterion("sys_user.fd_password <>", value, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordGreaterThan(String value) {
            addCriterion("sys_user.fd_password >", value, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_password >=", value, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordLessThan(String value) {
            addCriterion("sys_user.fd_password <", value, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_password <=", value, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordLike(String value) {
            addCriterion("sys_user.fd_password like", value, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordNotLike(String value) {
            addCriterion("sys_user.fd_password not like", value, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordIn(List<String> values) {
            addCriterion("sys_user.fd_password in", values, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordNotIn(List<String> values) {
            addCriterion("sys_user.fd_password not in", values, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordBetween(String value1, String value2) {
            addCriterion("sys_user.fd_password between", value1, value2, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdPasswordNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_password not between", value1, value2, "fdPassword");
            return (Criteria) this;
        }

        public Criteria andFdSaltIsNull() {
            addCriterion("sys_user.fd_salt is null");
            return (Criteria) this;
        }

        public Criteria andFdSaltIsNotNull() {
            addCriterion("sys_user.fd_salt is not null");
            return (Criteria) this;
        }

        public Criteria andFdSaltEqualTo(String value) {
            addCriterion("sys_user.fd_salt =", value, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltNotEqualTo(String value) {
            addCriterion("sys_user.fd_salt <>", value, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltGreaterThan(String value) {
            addCriterion("sys_user.fd_salt >", value, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_salt >=", value, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltLessThan(String value) {
            addCriterion("sys_user.fd_salt <", value, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_salt <=", value, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltLike(String value) {
            addCriterion("sys_user.fd_salt like", value, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltNotLike(String value) {
            addCriterion("sys_user.fd_salt not like", value, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltIn(List<String> values) {
            addCriterion("sys_user.fd_salt in", values, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltNotIn(List<String> values) {
            addCriterion("sys_user.fd_salt not in", values, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltBetween(String value1, String value2) {
            addCriterion("sys_user.fd_salt between", value1, value2, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdSaltNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_salt not between", value1, value2, "fdSalt");
            return (Criteria) this;
        }

        public Criteria andFdLockedIsNull() {
            addCriterion("sys_user.fd_locked is null");
            return (Criteria) this;
        }

        public Criteria andFdLockedIsNotNull() {
            addCriterion("sys_user.fd_locked is not null");
            return (Criteria) this;
        }

        public Criteria andFdLockedEqualTo(String value) {
            addCriterion("sys_user.fd_locked =", value, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedNotEqualTo(String value) {
            addCriterion("sys_user.fd_locked <>", value, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedGreaterThan(String value) {
            addCriterion("sys_user.fd_locked >", value, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_locked >=", value, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedLessThan(String value) {
            addCriterion("sys_user.fd_locked <", value, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_locked <=", value, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedLike(String value) {
            addCriterion("sys_user.fd_locked like", value, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedNotLike(String value) {
            addCriterion("sys_user.fd_locked not like", value, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedIn(List<String> values) {
            addCriterion("sys_user.fd_locked in", values, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedNotIn(List<String> values) {
            addCriterion("sys_user.fd_locked not in", values, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedBetween(String value1, String value2) {
            addCriterion("sys_user.fd_locked between", value1, value2, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdLockedNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_locked not between", value1, value2, "fdLocked");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdIsNull() {
            addCriterion("sys_user.fd_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdIsNotNull() {
            addCriterion("sys_user.fd_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdEqualTo(String value) {
            addCriterion("sys_user.fd_dept_id =", value, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdNotEqualTo(String value) {
            addCriterion("sys_user.fd_dept_id <>", value, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdGreaterThan(String value) {
            addCriterion("sys_user.fd_dept_id >", value, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_dept_id >=", value, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdLessThan(String value) {
            addCriterion("sys_user.fd_dept_id <", value, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_dept_id <=", value, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdLike(String value) {
            addCriterion("sys_user.fd_dept_id like", value, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdNotLike(String value) {
            addCriterion("sys_user.fd_dept_id not like", value, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdIn(List<String> values) {
            addCriterion("sys_user.fd_dept_id in", values, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdNotIn(List<String> values) {
            addCriterion("sys_user.fd_dept_id not in", values, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdBetween(String value1, String value2) {
            addCriterion("sys_user.fd_dept_id between", value1, value2, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdDeptIdNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_dept_id not between", value1, value2, "fdDeptId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdIsNull() {
            addCriterion("sys_user.fd_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andFdParentIdIsNotNull() {
            addCriterion("sys_user.fd_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdParentIdEqualTo(String value) {
            addCriterion("sys_user.fd_parent_id =", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdNotEqualTo(String value) {
            addCriterion("sys_user.fd_parent_id <>", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdGreaterThan(String value) {
            addCriterion("sys_user.fd_parent_id >", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_parent_id >=", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdLessThan(String value) {
            addCriterion("sys_user.fd_parent_id <", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_parent_id <=", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdLike(String value) {
            addCriterion("sys_user.fd_parent_id like", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdNotLike(String value) {
            addCriterion("sys_user.fd_parent_id not like", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdIn(List<String> values) {
            addCriterion("sys_user.fd_parent_id in", values, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdNotIn(List<String> values) {
            addCriterion("sys_user.fd_parent_id not in", values, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdBetween(String value1, String value2) {
            addCriterion("sys_user.fd_parent_id between", value1, value2, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_parent_id not between", value1, value2, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIsNull() {
            addCriterion("sys_user.fd_type is null");
            return (Criteria) this;
        }

        public Criteria andFdTypeIsNotNull() {
            addCriterion("sys_user.fd_type is not null");
            return (Criteria) this;
        }

        public Criteria andFdTypeEqualTo(String value) {
            addCriterion("sys_user.fd_type =", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeNotEqualTo(String value) {
            addCriterion("sys_user.fd_type <>", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeGreaterThan(String value) {
            addCriterion("sys_user.fd_type >", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_type >=", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeLessThan(String value) {
            addCriterion("sys_user.fd_type <", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeLessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_type <=", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeLike(String value) {
            addCriterion("sys_user.fd_type like", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeNotLike(String value) {
            addCriterion("sys_user.fd_type not like", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeIn(List<String> values) {
            addCriterion("sys_user.fd_type in", values, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeNotIn(List<String> values) {
            addCriterion("sys_user.fd_type not in", values, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeBetween(String value1, String value2) {
            addCriterion("sys_user.fd_type between", value1, value2, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeNotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_type not between", value1, value2, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdBak1IsNull() {
            addCriterion("sys_user.fd_bak_1 is null");
            return (Criteria) this;
        }

        public Criteria andFdBak1IsNotNull() {
            addCriterion("sys_user.fd_bak_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFdBak1EqualTo(String value) {
            addCriterion("sys_user.fd_bak_1 =", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1NotEqualTo(String value) {
            addCriterion("sys_user.fd_bak_1 <>", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1GreaterThan(String value) {
            addCriterion("sys_user.fd_bak_1 >", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1GreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_bak_1 >=", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1LessThan(String value) {
            addCriterion("sys_user.fd_bak_1 <", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1LessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_bak_1 <=", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1Like(String value) {
            addCriterion("sys_user.fd_bak_1 like", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1NotLike(String value) {
            addCriterion("sys_user.fd_bak_1 not like", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1In(List<String> values) {
            addCriterion("sys_user.fd_bak_1 in", values, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1NotIn(List<String> values) {
            addCriterion("sys_user.fd_bak_1 not in", values, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1Between(String value1, String value2) {
            addCriterion("sys_user.fd_bak_1 between", value1, value2, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1NotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_bak_1 not between", value1, value2, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak2IsNull() {
            addCriterion("sys_user.fd_bak_2 is null");
            return (Criteria) this;
        }

        public Criteria andFdBak2IsNotNull() {
            addCriterion("sys_user.fd_bak_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFdBak2EqualTo(String value) {
            addCriterion("sys_user.fd_bak_2 =", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2NotEqualTo(String value) {
            addCriterion("sys_user.fd_bak_2 <>", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2GreaterThan(String value) {
            addCriterion("sys_user.fd_bak_2 >", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2GreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_bak_2 >=", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2LessThan(String value) {
            addCriterion("sys_user.fd_bak_2 <", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2LessThanOrEqualTo(String value) {
            addCriterion("sys_user.fd_bak_2 <=", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2Like(String value) {
            addCriterion("sys_user.fd_bak_2 like", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2NotLike(String value) {
            addCriterion("sys_user.fd_bak_2 not like", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2In(List<String> values) {
            addCriterion("sys_user.fd_bak_2 in", values, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2NotIn(List<String> values) {
            addCriterion("sys_user.fd_bak_2 not in", values, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2Between(String value1, String value2) {
            addCriterion("sys_user.fd_bak_2 between", value1, value2, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2NotBetween(String value1, String value2) {
            addCriterion("sys_user.fd_bak_2 not between", value1, value2, "fdBak2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
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