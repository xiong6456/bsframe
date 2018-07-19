package com.zero.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysOrgDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOrgDeptExample() {
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

        public Criteria andFdMajorIdIsNull() {
            addCriterion("fd_major_id is null");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdIsNotNull() {
            addCriterion("fd_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdEqualTo(String value) {
            addCriterion("fd_major_id =", value, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdNotEqualTo(String value) {
            addCriterion("fd_major_id <>", value, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdGreaterThan(String value) {
            addCriterion("fd_major_id >", value, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("fd_major_id >=", value, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdLessThan(String value) {
            addCriterion("fd_major_id <", value, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdLessThanOrEqualTo(String value) {
            addCriterion("fd_major_id <=", value, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdLike(String value) {
            addCriterion("fd_major_id like", value, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdNotLike(String value) {
            addCriterion("fd_major_id not like", value, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdIn(List<String> values) {
            addCriterion("fd_major_id in", values, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdNotIn(List<String> values) {
            addCriterion("fd_major_id not in", values, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdBetween(String value1, String value2) {
            addCriterion("fd_major_id between", value1, value2, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMajorIdNotBetween(String value1, String value2) {
            addCriterion("fd_major_id not between", value1, value2, "fdMajorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdIsNull() {
            addCriterion("fd_minor_id is null");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdIsNotNull() {
            addCriterion("fd_minor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdEqualTo(String value) {
            addCriterion("fd_minor_id =", value, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdNotEqualTo(String value) {
            addCriterion("fd_minor_id <>", value, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdGreaterThan(String value) {
            addCriterion("fd_minor_id >", value, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdGreaterThanOrEqualTo(String value) {
            addCriterion("fd_minor_id >=", value, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdLessThan(String value) {
            addCriterion("fd_minor_id <", value, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdLessThanOrEqualTo(String value) {
            addCriterion("fd_minor_id <=", value, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdLike(String value) {
            addCriterion("fd_minor_id like", value, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdNotLike(String value) {
            addCriterion("fd_minor_id not like", value, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdIn(List<String> values) {
            addCriterion("fd_minor_id in", values, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdNotIn(List<String> values) {
            addCriterion("fd_minor_id not in", values, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdBetween(String value1, String value2) {
            addCriterion("fd_minor_id between", value1, value2, "fdMinorId");
            return (Criteria) this;
        }

        public Criteria andFdMinorIdNotBetween(String value1, String value2) {
            addCriterion("fd_minor_id not between", value1, value2, "fdMinorId");
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

        public Criteria andFdChildCountEqualTo(String value) {
            addCriterion("fd_child_count =", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountNotEqualTo(String value) {
            addCriterion("fd_child_count <>", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountGreaterThan(String value) {
            addCriterion("fd_child_count >", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountGreaterThanOrEqualTo(String value) {
            addCriterion("fd_child_count >=", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountLessThan(String value) {
            addCriterion("fd_child_count <", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountLessThanOrEqualTo(String value) {
            addCriterion("fd_child_count <=", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountLike(String value) {
            addCriterion("fd_child_count like", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountNotLike(String value) {
            addCriterion("fd_child_count not like", value, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountIn(List<String> values) {
            addCriterion("fd_child_count in", values, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountNotIn(List<String> values) {
            addCriterion("fd_child_count not in", values, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountBetween(String value1, String value2) {
            addCriterion("fd_child_count between", value1, value2, "fdChildCount");
            return (Criteria) this;
        }

        public Criteria andFdChildCountNotBetween(String value1, String value2) {
            addCriterion("fd_child_count not between", value1, value2, "fdChildCount");
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

        public Criteria andFdBak1IsNull() {
            addCriterion("fd_bak_1 is null");
            return (Criteria) this;
        }

        public Criteria andFdBak1IsNotNull() {
            addCriterion("fd_bak_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFdBak1EqualTo(String value) {
            addCriterion("fd_bak_1 =", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1NotEqualTo(String value) {
            addCriterion("fd_bak_1 <>", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1GreaterThan(String value) {
            addCriterion("fd_bak_1 >", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1GreaterThanOrEqualTo(String value) {
            addCriterion("fd_bak_1 >=", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1LessThan(String value) {
            addCriterion("fd_bak_1 <", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1LessThanOrEqualTo(String value) {
            addCriterion("fd_bak_1 <=", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1Like(String value) {
            addCriterion("fd_bak_1 like", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1NotLike(String value) {
            addCriterion("fd_bak_1 not like", value, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1In(List<String> values) {
            addCriterion("fd_bak_1 in", values, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1NotIn(List<String> values) {
            addCriterion("fd_bak_1 not in", values, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1Between(String value1, String value2) {
            addCriterion("fd_bak_1 between", value1, value2, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak1NotBetween(String value1, String value2) {
            addCriterion("fd_bak_1 not between", value1, value2, "fdBak1");
            return (Criteria) this;
        }

        public Criteria andFdBak2IsNull() {
            addCriterion("fd_bak_2 is null");
            return (Criteria) this;
        }

        public Criteria andFdBak2IsNotNull() {
            addCriterion("fd_bak_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFdBak2EqualTo(String value) {
            addCriterion("fd_bak_2 =", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2NotEqualTo(String value) {
            addCriterion("fd_bak_2 <>", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2GreaterThan(String value) {
            addCriterion("fd_bak_2 >", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2GreaterThanOrEqualTo(String value) {
            addCriterion("fd_bak_2 >=", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2LessThan(String value) {
            addCriterion("fd_bak_2 <", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2LessThanOrEqualTo(String value) {
            addCriterion("fd_bak_2 <=", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2Like(String value) {
            addCriterion("fd_bak_2 like", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2NotLike(String value) {
            addCriterion("fd_bak_2 not like", value, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2In(List<String> values) {
            addCriterion("fd_bak_2 in", values, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2NotIn(List<String> values) {
            addCriterion("fd_bak_2 not in", values, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2Between(String value1, String value2) {
            addCriterion("fd_bak_2 between", value1, value2, "fdBak2");
            return (Criteria) this;
        }

        public Criteria andFdBak2NotBetween(String value1, String value2) {
            addCriterion("fd_bak_2 not between", value1, value2, "fdBak2");
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