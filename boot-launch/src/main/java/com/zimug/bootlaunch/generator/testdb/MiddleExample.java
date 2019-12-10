package com.zimug.bootlaunch.generator.testdb;

import java.util.ArrayList;
import java.util.List;

public class MiddleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MiddleExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andMAidIsNull() {
            addCriterion("m__aid is null");
            return (Criteria) this;
        }

        public Criteria andMAidIsNotNull() {
            addCriterion("m__aid is not null");
            return (Criteria) this;
        }

        public Criteria andMAidEqualTo(Integer value) {
            addCriterion("m__aid =", value, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidNotEqualTo(Integer value) {
            addCriterion("m__aid <>", value, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidGreaterThan(Integer value) {
            addCriterion("m__aid >", value, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m__aid >=", value, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidLessThan(Integer value) {
            addCriterion("m__aid <", value, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidLessThanOrEqualTo(Integer value) {
            addCriterion("m__aid <=", value, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidIn(List<Integer> values) {
            addCriterion("m__aid in", values, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidNotIn(List<Integer> values) {
            addCriterion("m__aid not in", values, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidBetween(Integer value1, Integer value2) {
            addCriterion("m__aid between", value1, value2, "mAid");
            return (Criteria) this;
        }

        public Criteria andMAidNotBetween(Integer value1, Integer value2) {
            addCriterion("m__aid not between", value1, value2, "mAid");
            return (Criteria) this;
        }

        public Criteria andMPidIsNull() {
            addCriterion("m_pid is null");
            return (Criteria) this;
        }

        public Criteria andMPidIsNotNull() {
            addCriterion("m_pid is not null");
            return (Criteria) this;
        }

        public Criteria andMPidEqualTo(Integer value) {
            addCriterion("m_pid =", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotEqualTo(Integer value) {
            addCriterion("m_pid <>", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidGreaterThan(Integer value) {
            addCriterion("m_pid >", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_pid >=", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidLessThan(Integer value) {
            addCriterion("m_pid <", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidLessThanOrEqualTo(Integer value) {
            addCriterion("m_pid <=", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidIn(List<Integer> values) {
            addCriterion("m_pid in", values, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotIn(List<Integer> values) {
            addCriterion("m_pid not in", values, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidBetween(Integer value1, Integer value2) {
            addCriterion("m_pid between", value1, value2, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotBetween(Integer value1, Integer value2) {
            addCriterion("m_pid not between", value1, value2, "mPid");
            return (Criteria) this;
        }
    }

    /**
     */
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