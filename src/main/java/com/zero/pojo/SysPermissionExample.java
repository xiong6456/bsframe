package com.zero.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPermissionExample() {
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

        public Criteria andFdTypeIsNull() {
            addCriterion("fd_type is null");
            return (Criteria) this;
        }

        public Criteria andFdTypeIsNotNull() {
            addCriterion("fd_type is not null");
            return (Criteria) this;
        }

        public Criteria andFdTypeEqualTo(String value) {
            addCriterion("fd_type =", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeNotEqualTo(String value) {
            addCriterion("fd_type <>", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeGreaterThan(String value) {
            addCriterion("fd_type >", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fd_type >=", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeLessThan(String value) {
            addCriterion("fd_type <", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeLessThanOrEqualTo(String value) {
            addCriterion("fd_type <=", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeLike(String value) {
            addCriterion("fd_type like", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeNotLike(String value) {
            addCriterion("fd_type not like", value, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeIn(List<String> values) {
            addCriterion("fd_type in", values, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeNotIn(List<String> values) {
            addCriterion("fd_type not in", values, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeBetween(String value1, String value2) {
            addCriterion("fd_type between", value1, value2, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdTypeNotBetween(String value1, String value2) {
            addCriterion("fd_type not between", value1, value2, "fdType");
            return (Criteria) this;
        }

        public Criteria andFdUrlIsNull() {
            addCriterion("fd_url is null");
            return (Criteria) this;
        }

        public Criteria andFdUrlIsNotNull() {
            addCriterion("fd_url is not null");
            return (Criteria) this;
        }

        public Criteria andFdUrlEqualTo(String value) {
            addCriterion("fd_url =", value, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlNotEqualTo(String value) {
            addCriterion("fd_url <>", value, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlGreaterThan(String value) {
            addCriterion("fd_url >", value, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fd_url >=", value, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlLessThan(String value) {
            addCriterion("fd_url <", value, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlLessThanOrEqualTo(String value) {
            addCriterion("fd_url <=", value, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlLike(String value) {
            addCriterion("fd_url like", value, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlNotLike(String value) {
            addCriterion("fd_url not like", value, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlIn(List<String> values) {
            addCriterion("fd_url in", values, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlNotIn(List<String> values) {
            addCriterion("fd_url not in", values, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlBetween(String value1, String value2) {
            addCriterion("fd_url between", value1, value2, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdUrlNotBetween(String value1, String value2) {
            addCriterion("fd_url not between", value1, value2, "fdUrl");
            return (Criteria) this;
        }

        public Criteria andFdPercodeIsNull() {
            addCriterion("fd_percode is null");
            return (Criteria) this;
        }

        public Criteria andFdPercodeIsNotNull() {
            addCriterion("fd_percode is not null");
            return (Criteria) this;
        }

        public Criteria andFdPercodeEqualTo(String value) {
            addCriterion("fd_percode =", value, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeNotEqualTo(String value) {
            addCriterion("fd_percode <>", value, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeGreaterThan(String value) {
            addCriterion("fd_percode >", value, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeGreaterThanOrEqualTo(String value) {
            addCriterion("fd_percode >=", value, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeLessThan(String value) {
            addCriterion("fd_percode <", value, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeLessThanOrEqualTo(String value) {
            addCriterion("fd_percode <=", value, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeLike(String value) {
            addCriterion("fd_percode like", value, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeNotLike(String value) {
            addCriterion("fd_percode not like", value, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeIn(List<String> values) {
            addCriterion("fd_percode in", values, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeNotIn(List<String> values) {
            addCriterion("fd_percode not in", values, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeBetween(String value1, String value2) {
            addCriterion("fd_percode between", value1, value2, "fdPercode");
            return (Criteria) this;
        }

        public Criteria andFdPercodeNotBetween(String value1, String value2) {
            addCriterion("fd_percode not between", value1, value2, "fdPercode");
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

        public Criteria andFdParentIdsIsNull() {
            addCriterion("fd_parent_ids is null");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsIsNotNull() {
            addCriterion("fd_parent_ids is not null");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsEqualTo(String value) {
            addCriterion("fd_parent_ids =", value, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsNotEqualTo(String value) {
            addCriterion("fd_parent_ids <>", value, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsGreaterThan(String value) {
            addCriterion("fd_parent_ids >", value, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("fd_parent_ids >=", value, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsLessThan(String value) {
            addCriterion("fd_parent_ids <", value, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsLessThanOrEqualTo(String value) {
            addCriterion("fd_parent_ids <=", value, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsLike(String value) {
            addCriterion("fd_parent_ids like", value, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsNotLike(String value) {
            addCriterion("fd_parent_ids not like", value, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsIn(List<String> values) {
            addCriterion("fd_parent_ids in", values, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsNotIn(List<String> values) {
            addCriterion("fd_parent_ids not in", values, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsBetween(String value1, String value2) {
            addCriterion("fd_parent_ids between", value1, value2, "fdParentIds");
            return (Criteria) this;
        }

        public Criteria andFdParentIdsNotBetween(String value1, String value2) {
            addCriterion("fd_parent_ids not between", value1, value2, "fdParentIds");
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