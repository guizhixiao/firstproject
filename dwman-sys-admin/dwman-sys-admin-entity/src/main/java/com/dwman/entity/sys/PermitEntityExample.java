package com.dwman.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermitEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermitEntityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPermitNoIsNull() {
            addCriterion("PERMIT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPermitNoIsNotNull() {
            addCriterion("PERMIT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPermitNoEqualTo(String value) {
            addCriterion("PERMIT_NO =", value, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoNotEqualTo(String value) {
            addCriterion("PERMIT_NO <>", value, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoGreaterThan(String value) {
            addCriterion("PERMIT_NO >", value, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoGreaterThanOrEqualTo(String value) {
            addCriterion("PERMIT_NO >=", value, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoLessThan(String value) {
            addCriterion("PERMIT_NO <", value, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoLessThanOrEqualTo(String value) {
            addCriterion("PERMIT_NO <=", value, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoLike(String value) {
            addCriterion("PERMIT_NO like", value, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoNotLike(String value) {
            addCriterion("PERMIT_NO not like", value, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoIn(List<String> values) {
            addCriterion("PERMIT_NO in", values, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoNotIn(List<String> values) {
            addCriterion("PERMIT_NO not in", values, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoBetween(String value1, String value2) {
            addCriterion("PERMIT_NO between", value1, value2, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNoNotBetween(String value1, String value2) {
            addCriterion("PERMIT_NO not between", value1, value2, "permitNo");
            return (Criteria) this;
        }

        public Criteria andPermitNameIsNull() {
            addCriterion("PERMIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPermitNameIsNotNull() {
            addCriterion("PERMIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermitNameEqualTo(String value) {
            addCriterion("PERMIT_NAME =", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotEqualTo(String value) {
            addCriterion("PERMIT_NAME <>", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameGreaterThan(String value) {
            addCriterion("PERMIT_NAME >", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERMIT_NAME >=", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLessThan(String value) {
            addCriterion("PERMIT_NAME <", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLessThanOrEqualTo(String value) {
            addCriterion("PERMIT_NAME <=", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLike(String value) {
            addCriterion("PERMIT_NAME like", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotLike(String value) {
            addCriterion("PERMIT_NAME not like", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameIn(List<String> values) {
            addCriterion("PERMIT_NAME in", values, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotIn(List<String> values) {
            addCriterion("PERMIT_NAME not in", values, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameBetween(String value1, String value2) {
            addCriterion("PERMIT_NAME between", value1, value2, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotBetween(String value1, String value2) {
            addCriterion("PERMIT_NAME not between", value1, value2, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitAliasIsNull() {
            addCriterion("PERMIT_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andPermitAliasIsNotNull() {
            addCriterion("PERMIT_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andPermitAliasEqualTo(String value) {
            addCriterion("PERMIT_ALIAS =", value, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasNotEqualTo(String value) {
            addCriterion("PERMIT_ALIAS <>", value, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasGreaterThan(String value) {
            addCriterion("PERMIT_ALIAS >", value, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasGreaterThanOrEqualTo(String value) {
            addCriterion("PERMIT_ALIAS >=", value, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasLessThan(String value) {
            addCriterion("PERMIT_ALIAS <", value, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasLessThanOrEqualTo(String value) {
            addCriterion("PERMIT_ALIAS <=", value, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasLike(String value) {
            addCriterion("PERMIT_ALIAS like", value, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasNotLike(String value) {
            addCriterion("PERMIT_ALIAS not like", value, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasIn(List<String> values) {
            addCriterion("PERMIT_ALIAS in", values, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasNotIn(List<String> values) {
            addCriterion("PERMIT_ALIAS not in", values, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasBetween(String value1, String value2) {
            addCriterion("PERMIT_ALIAS between", value1, value2, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitAliasNotBetween(String value1, String value2) {
            addCriterion("PERMIT_ALIAS not between", value1, value2, "permitAlias");
            return (Criteria) this;
        }

        public Criteria andPermitCodeIsNull() {
            addCriterion("PERMIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPermitCodeIsNotNull() {
            addCriterion("PERMIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPermitCodeEqualTo(String value) {
            addCriterion("PERMIT_CODE =", value, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeNotEqualTo(String value) {
            addCriterion("PERMIT_CODE <>", value, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeGreaterThan(String value) {
            addCriterion("PERMIT_CODE >", value, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PERMIT_CODE >=", value, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeLessThan(String value) {
            addCriterion("PERMIT_CODE <", value, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeLessThanOrEqualTo(String value) {
            addCriterion("PERMIT_CODE <=", value, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeLike(String value) {
            addCriterion("PERMIT_CODE like", value, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeNotLike(String value) {
            addCriterion("PERMIT_CODE not like", value, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeIn(List<String> values) {
            addCriterion("PERMIT_CODE in", values, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeNotIn(List<String> values) {
            addCriterion("PERMIT_CODE not in", values, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeBetween(String value1, String value2) {
            addCriterion("PERMIT_CODE between", value1, value2, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitCodeNotBetween(String value1, String value2) {
            addCriterion("PERMIT_CODE not between", value1, value2, "permitCode");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionIsNull() {
            addCriterion("PERMIT_INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionIsNotNull() {
            addCriterion("PERMIT_INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionEqualTo(String value) {
            addCriterion("PERMIT_INTRODUCTION =", value, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionNotEqualTo(String value) {
            addCriterion("PERMIT_INTRODUCTION <>", value, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionGreaterThan(String value) {
            addCriterion("PERMIT_INTRODUCTION >", value, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("PERMIT_INTRODUCTION >=", value, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionLessThan(String value) {
            addCriterion("PERMIT_INTRODUCTION <", value, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionLessThanOrEqualTo(String value) {
            addCriterion("PERMIT_INTRODUCTION <=", value, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionLike(String value) {
            addCriterion("PERMIT_INTRODUCTION like", value, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionNotLike(String value) {
            addCriterion("PERMIT_INTRODUCTION not like", value, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionIn(List<String> values) {
            addCriterion("PERMIT_INTRODUCTION in", values, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionNotIn(List<String> values) {
            addCriterion("PERMIT_INTRODUCTION not in", values, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionBetween(String value1, String value2) {
            addCriterion("PERMIT_INTRODUCTION between", value1, value2, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andPermitIntroductionNotBetween(String value1, String value2) {
            addCriterion("PERMIT_INTRODUCTION not between", value1, value2, "permitIntroduction");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNull() {
            addCriterion("USE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNotNull() {
            addCriterion("USE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUseFlagEqualTo(Integer value) {
            addCriterion("USE_FLAG =", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotEqualTo(Integer value) {
            addCriterion("USE_FLAG <>", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThan(Integer value) {
            addCriterion("USE_FLAG >", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("USE_FLAG >=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThan(Integer value) {
            addCriterion("USE_FLAG <", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThanOrEqualTo(Integer value) {
            addCriterion("USE_FLAG <=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagIn(List<Integer> values) {
            addCriterion("USE_FLAG in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotIn(List<Integer> values) {
            addCriterion("USE_FLAG not in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagBetween(Integer value1, Integer value2) {
            addCriterion("USE_FLAG between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("USE_FLAG not between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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