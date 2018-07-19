package com.zero.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
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

        public Criteria andFdParentIdIsNull() {
            addCriterion("fd_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andFdParentIdIsNotNull() {
            addCriterion("fd_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdParentIdEqualTo(String value) {
            addCriterion("fd_parent_id =", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdNotEqualTo(String value) {
            addCriterion("fd_parent_id <>", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdGreaterThan(String value) {
            addCriterion("fd_parent_id >", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("fd_parent_id >=", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdLessThan(String value) {
            addCriterion("fd_parent_id <", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdLessThanOrEqualTo(String value) {
            addCriterion("fd_parent_id <=", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdLike(String value) {
            addCriterion("fd_parent_id like", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdNotLike(String value) {
            addCriterion("fd_parent_id not like", value, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdIn(List<String> values) {
            addCriterion("fd_parent_id in", values, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdNotIn(List<String> values) {
            addCriterion("fd_parent_id not in", values, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdBetween(String value1, String value2) {
            addCriterion("fd_parent_id between", value1, value2, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdParentIdNotBetween(String value1, String value2) {
            addCriterion("fd_parent_id not between", value1, value2, "fdParentId");
            return (Criteria) this;
        }

        public Criteria andFdChildCountIsNull() {
            addCriterion("fd_child_count is null");
            return (Criteria) this;
        }

        public Criteria andFdChildCountIsNotNull() {
            addCriterion("fd_child_count is not null");
            return (Criteria) this;
        }

        public Criteria andFdChildCountEqualTo(Long value) {
            addCriterion("fd_child_count =", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountNotEqualTo(Long value) {
            addCriterion("fd_child_count <>", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountGreaterThan(Long value) {
            addCriterion("fd_child_count >", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountGreaterThanOrEqualTo(Long value) {
            addCriterion("fd_child_count >=", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountLessThan(Long value) {
            addCriterion("fd_child_count <", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountLessThanOrEqualTo(Long value) {
            addCriterion("fd_child_count <=", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountIn(List<Long> values) {
            addCriterion("fd_child_count in", values, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountNotIn(List<Long> values) {
            addCriterion("fd_child_count not in", values, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountBetween(Long value1, Long value2) {
            addCriterion("fd_child_count between", value1, value2, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountNotBetween(Long value1, Long value2) {
            addCriterion("fd_child_count not between", value1, value2, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptIsNull() {
            addCriterion("fd_run_script is null");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptIsNotNull() {
            addCriterion("fd_run_script is not null");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptEqualTo(String value) {
            addCriterion("fd_run_script =", value, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptNotEqualTo(String value) {
            addCriterion("fd_run_script <>", value, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptGreaterThan(String value) {
            addCriterion("fd_run_script >", value, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptGreaterThanOrEqualTo(String value) {
            addCriterion("fd_run_script >=", value, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptLessThan(String value) {
            addCriterion("fd_run_script <", value, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptLessThanOrEqualTo(String value) {
            addCriterion("fd_run_script <=", value, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptLike(String value) {
            addCriterion("fd_run_script like", value, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptNotLike(String value) {
            addCriterion("fd_run_script not like", value, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptIn(List<String> values) {
            addCriterion("fd_run_script in", values, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptNotIn(List<String> values) {
            addCriterion("fd_run_script not in", values, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptBetween(String value1, String value2) {
            addCriterion("fd_run_script between", value1, value2, "fdRunScript");
            return (Criteria) this;
        }

        public Criteria andFdRunScriptNotBetween(String value1, String value2) {
            addCriterion("fd_run_script not between", value1, value2, "fdRunScript");
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
        
        public Criteria andFdTermIsNull() {
            addCriterion("fd_term is null");
            return (Criteria) this;
        }

        public Criteria andFdTermIsNotNull() {
            addCriterion("fd_term is not null");
            return (Criteria) this;
        }

        public Criteria andFdTermEqualTo(String value) {
            addCriterion("fd_term =", value, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermNotEqualTo(String value) {
            addCriterion("fd_term <>", value, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermGreaterThan(String value) {
            addCriterion("fd_term >", value, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermGreaterThanOrEqualTo(String value) {
            addCriterion("fd_term >=", value, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermLessThan(String value) {
            addCriterion("fd_term <", value, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermLessThanOrEqualTo(String value) {
            addCriterion("fd_term <=", value, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermLike(String value) {
            addCriterion("fd_term like", value, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermNotLike(String value) {
            addCriterion("fd_term not like", value, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermIn(List<String> values) {
            addCriterion("fd_term in", values, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermNotIn(List<String> values) {
            addCriterion("fd_term not in", values, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermBetween(String value1, String value2) {
            addCriterion("fd_term between", value1, value2, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdTermNotBetween(String value1, String value2) {
            addCriterion("fd_term not between", value1, value2, "fdTerm");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeIsNull() {
            addCriterion("fd_due_time is null");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeIsNotNull() {
            addCriterion("fd_due_time is not null");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeEqualTo(String value) {
            addCriterion("fd_due_time =", value, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeNotEqualTo(String value) {
            addCriterion("fd_due_time <>", value, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeGreaterThan(String value) {
            addCriterion("fd_due_time >", value, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeGreaterThanOrEqualTo(String value) {
            addCriterion("fd_due_time >=", value, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeLessThan(String value) {
            addCriterion("fd_due_time <", value, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeLessThanOrEqualTo(String value) {
            addCriterion("fd_due_time <=", value, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeLike(String value) {
            addCriterion("fd_due_time like", value, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeNotLike(String value) {
            addCriterion("fd_due_time not like", value, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeIn(List<String> values) {
            addCriterion("fd_due_time in", values, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeNotIn(List<String> values) {
            addCriterion("fd_due_time not in", values, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeBetween(String value1, String value2) {
            addCriterion("fd_due_time between", value1, value2, "fdDueTime");
            return (Criteria) this;
        }

        public Criteria andFdDueTimeNotBetween(String value1, String value2) {
            addCriterion("fd_due_time not between", value1, value2, "fdDueTime");
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