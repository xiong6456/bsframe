package com.zero.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysRolePermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRolePermissionExample() {
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
            addCriterion("fd_id is null");
            return (Criteria) this;
        }

        public Criteria andFdIdIsNotNull() {
            addCriterion("fd_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdIdEqualTo(String value) {
            addCriterion("fd_id =", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotEqualTo(String value) {
            addCriterion("fd_id <>", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdGreaterThan(String value) {
            addCriterion("fd_id >", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdGreaterThanOrEqualTo(String value) {
            addCriterion("fd_id >=", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLessThan(String value) {
            addCriterion("fd_id <", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLessThanOrEqualTo(String value) {
            addCriterion("fd_id <=", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLike(String value) {
            addCriterion("fd_id like", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotLike(String value) {
            addCriterion("fd_id not like", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdIn(List<String> values) {
            addCriterion("fd_id in", values, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotIn(List<String> values) {
            addCriterion("fd_id not in", values, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdBetween(String value1, String value2) {
            addCriterion("fd_id between", value1, value2, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotBetween(String value1, String value2) {
            addCriterion("fd_id not between", value1, value2, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdIsNull() {
            addCriterion("fd_role_id is null");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdIsNotNull() {
            addCriterion("fd_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdEqualTo(String value) {
            addCriterion("fd_role_id =", value, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdNotEqualTo(String value) {
            addCriterion("fd_role_id <>", value, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdGreaterThan(String value) {
            addCriterion("fd_role_id >", value, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("fd_role_id >=", value, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdLessThan(String value) {
            addCriterion("fd_role_id <", value, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdLessThanOrEqualTo(String value) {
            addCriterion("fd_role_id <=", value, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdLike(String value) {
            addCriterion("fd_role_id like", value, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdNotLike(String value) {
            addCriterion("fd_role_id not like", value, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdIn(List<String> values) {
            addCriterion("fd_role_id in", values, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdNotIn(List<String> values) {
            addCriterion("fd_role_id not in", values, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdBetween(String value1, String value2) {
            addCriterion("fd_role_id between", value1, value2, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdRoleIdNotBetween(String value1, String value2) {
            addCriterion("fd_role_id not between", value1, value2, "fdRoleId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdIsNull() {
            addCriterion("fd_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdIsNotNull() {
            addCriterion("fd_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdEqualTo(String value) {
            addCriterion("fd_permission_id =", value, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdNotEqualTo(String value) {
            addCriterion("fd_permission_id <>", value, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdGreaterThan(String value) {
            addCriterion("fd_permission_id >", value, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("fd_permission_id >=", value, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdLessThan(String value) {
            addCriterion("fd_permission_id <", value, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("fd_permission_id <=", value, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdLike(String value) {
            addCriterion("fd_permission_id like", value, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdNotLike(String value) {
            addCriterion("fd_permission_id not like", value, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdIn(List<String> values) {
            addCriterion("fd_permission_id in", values, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdNotIn(List<String> values) {
            addCriterion("fd_permission_id not in", values, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdBetween(String value1, String value2) {
            addCriterion("fd_permission_id between", value1, value2, "fdPermissionId");
            return (Criteria) this;
        }

        public Criteria andFdPermissionIdNotBetween(String value1, String value2) {
            addCriterion("fd_permission_id not between", value1, value2, "fdPermissionId");
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