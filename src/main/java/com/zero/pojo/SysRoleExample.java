package com.zero.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andFdCodeIsNull() {
            addCriterion("fd_code is null");
            return (Criteria) this;
        }

        public Criteria andFdCodeIsNotNull() {
            addCriterion("fd_code is not null");
            return (Criteria) this;
        }

        public Criteria andFdCodeEqualTo(String value) {
            addCriterion("fd_code =", value, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeNotEqualTo(String value) {
            addCriterion("fd_code <>", value, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeGreaterThan(String value) {
            addCriterion("fd_code >", value, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fd_code >=", value, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeLessThan(String value) {
            addCriterion("fd_code <", value, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeLessThanOrEqualTo(String value) {
            addCriterion("fd_code <=", value, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeLike(String value) {
            addCriterion("fd_code like", value, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeNotLike(String value) {
            addCriterion("fd_code not like", value, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeIn(List<String> values) {
            addCriterion("fd_code in", values, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeNotIn(List<String> values) {
            addCriterion("fd_code not in", values, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeBetween(String value1, String value2) {
            addCriterion("fd_code between", value1, value2, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdCodeNotBetween(String value1, String value2) {
            addCriterion("fd_code not between", value1, value2, "fdCode");
            return (Criteria) this;
        }

        public Criteria andFdNameIsNull() {
            addCriterion("fd_name is null");
            return (Criteria) this;
        }

        public Criteria andFdNameIsNotNull() {
            addCriterion("fd_name is not null");
            return (Criteria) this;
        }

        public Criteria andFdNameEqualTo(String value) {
            addCriterion("fd_name =", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotEqualTo(String value) {
            addCriterion("fd_name <>", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameGreaterThan(String value) {
            addCriterion("fd_name >", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameGreaterThanOrEqualTo(String value) {
            addCriterion("fd_name >=", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLessThan(String value) {
            addCriterion("fd_name <", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLessThanOrEqualTo(String value) {
            addCriterion("fd_name <=", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLike(String value) {
            addCriterion("fd_name like", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotLike(String value) {
            addCriterion("fd_name not like", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameIn(List<String> values) {
            addCriterion("fd_name in", values, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotIn(List<String> values) {
            addCriterion("fd_name not in", values, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameBetween(String value1, String value2) {
            addCriterion("fd_name between", value1, value2, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotBetween(String value1, String value2) {
            addCriterion("fd_name not between", value1, value2, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionIsNull() {
            addCriterion("fd_description is null");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionIsNotNull() {
            addCriterion("fd_description is not null");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionEqualTo(String value) {
            addCriterion("fd_description =", value, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionNotEqualTo(String value) {
            addCriterion("fd_description <>", value, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionGreaterThan(String value) {
            addCriterion("fd_description >", value, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("fd_description >=", value, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionLessThan(String value) {
            addCriterion("fd_description <", value, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionLessThanOrEqualTo(String value) {
            addCriterion("fd_description <=", value, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionLike(String value) {
            addCriterion("fd_description like", value, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionNotLike(String value) {
            addCriterion("fd_description not like", value, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionIn(List<String> values) {
            addCriterion("fd_description in", values, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionNotIn(List<String> values) {
            addCriterion("fd_description not in", values, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionBetween(String value1, String value2) {
            addCriterion("fd_description between", value1, value2, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdDescriptionNotBetween(String value1, String value2) {
            addCriterion("fd_description not between", value1, value2, "fdDescription");
            return (Criteria) this;
        }

        public Criteria andFdAvailableIsNull() {
            addCriterion("fd_available is null");
            return (Criteria) this;
        }

        public Criteria andFdAvailableIsNotNull() {
            addCriterion("fd_available is not null");
            return (Criteria) this;
        }

        public Criteria andFdAvailableEqualTo(String value) {
            addCriterion("fd_available =", value, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableNotEqualTo(String value) {
            addCriterion("fd_available <>", value, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableGreaterThan(String value) {
            addCriterion("fd_available >", value, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("fd_available >=", value, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableLessThan(String value) {
            addCriterion("fd_available <", value, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableLessThanOrEqualTo(String value) {
            addCriterion("fd_available <=", value, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableLike(String value) {
            addCriterion("fd_available like", value, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableNotLike(String value) {
            addCriterion("fd_available not like", value, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableIn(List<String> values) {
            addCriterion("fd_available in", values, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableNotIn(List<String> values) {
            addCriterion("fd_available not in", values, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableBetween(String value1, String value2) {
            addCriterion("fd_available between", value1, value2, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdAvailableNotBetween(String value1, String value2) {
            addCriterion("fd_available not between", value1, value2, "fdAvailable");
            return (Criteria) this;
        }

        public Criteria andFdOrderIsNull() {
            addCriterion("fd_order is null");
            return (Criteria) this;
        }

        public Criteria andFdOrderIsNotNull() {
            addCriterion("fd_order is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrderEqualTo(Integer value) {
            addCriterion("fd_order =", value, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderNotEqualTo(Integer value) {
            addCriterion("fd_order <>", value, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderGreaterThan(Integer value) {
            addCriterion("fd_order >", value, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("fd_order >=", value, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderLessThan(Integer value) {
            addCriterion("fd_order <", value, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderLessThanOrEqualTo(Integer value) {
            addCriterion("fd_order <=", value, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderIn(List<Integer> values) {
            addCriterion("fd_order in", values, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderNotIn(List<Integer> values) {
            addCriterion("fd_order not in", values, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderBetween(Integer value1, Integer value2) {
            addCriterion("fd_order between", value1, value2, "fdOrder");
            return (Criteria) this;
        }

        public Criteria andFdOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("fd_order not between", value1, value2, "fdOrder");
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