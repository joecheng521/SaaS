package com.qjc.entry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoIsNull() {
            addCriterion("base_order_no is null");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoIsNotNull() {
            addCriterion("base_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoEqualTo(String value) {
            addCriterion("base_order_no =", value, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoNotEqualTo(String value) {
            addCriterion("base_order_no <>", value, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoGreaterThan(String value) {
            addCriterion("base_order_no >", value, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("base_order_no >=", value, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoLessThan(String value) {
            addCriterion("base_order_no <", value, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoLessThanOrEqualTo(String value) {
            addCriterion("base_order_no <=", value, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoLike(String value) {
            addCriterion("base_order_no like", value, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoNotLike(String value) {
            addCriterion("base_order_no not like", value, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoIn(List<String> values) {
            addCriterion("base_order_no in", values, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoNotIn(List<String> values) {
            addCriterion("base_order_no not in", values, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoBetween(String value1, String value2) {
            addCriterion("base_order_no between", value1, value2, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andBaseOrderNoNotBetween(String value1, String value2) {
            addCriterion("base_order_no not between", value1, value2, "baseOrderNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdIsNull() {
            addCriterion("merchant_order_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdIsNotNull() {
            addCriterion("merchant_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdEqualTo(String value) {
            addCriterion("merchant_order_id =", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdNotEqualTo(String value) {
            addCriterion("merchant_order_id <>", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdGreaterThan(String value) {
            addCriterion("merchant_order_id >", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_order_id >=", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdLessThan(String value) {
            addCriterion("merchant_order_id <", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_order_id <=", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdLike(String value) {
            addCriterion("merchant_order_id like", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdNotLike(String value) {
            addCriterion("merchant_order_id not like", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdIn(List<String> values) {
            addCriterion("merchant_order_id in", values, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdNotIn(List<String> values) {
            addCriterion("merchant_order_id not in", values, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdBetween(String value1, String value2) {
            addCriterion("merchant_order_id between", value1, value2, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdNotBetween(String value1, String value2) {
            addCriterion("merchant_order_id not between", value1, value2, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsIsNull() {
            addCriterion("repayment_periods is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsIsNotNull() {
            addCriterion("repayment_periods is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsEqualTo(Integer value) {
            addCriterion("repayment_periods =", value, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsNotEqualTo(Integer value) {
            addCriterion("repayment_periods <>", value, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsGreaterThan(Integer value) {
            addCriterion("repayment_periods >", value, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_periods >=", value, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsLessThan(Integer value) {
            addCriterion("repayment_periods <", value, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_periods <=", value, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsIn(List<Integer> values) {
            addCriterion("repayment_periods in", values, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsNotIn(List<Integer> values) {
            addCriterion("repayment_periods not in", values, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsBetween(Integer value1, Integer value2) {
            addCriterion("repayment_periods between", value1, value2, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodsNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_periods not between", value1, value2, "repaymentPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNull() {
            addCriterion("repayment_type is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNotNull() {
            addCriterion("repayment_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeEqualTo(String value) {
            addCriterion("repayment_type =", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotEqualTo(String value) {
            addCriterion("repayment_type <>", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThan(String value) {
            addCriterion("repayment_type >", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_type >=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThan(String value) {
            addCriterion("repayment_type <", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("repayment_type <=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLike(String value) {
            addCriterion("repayment_type like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotLike(String value) {
            addCriterion("repayment_type not like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIn(List<String> values) {
            addCriterion("repayment_type in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotIn(List<String> values) {
            addCriterion("repayment_type not in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeBetween(String value1, String value2) {
            addCriterion("repayment_type between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotBetween(String value1, String value2) {
            addCriterion("repayment_type not between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andCapitalNoIsNull() {
            addCriterion("capital_no is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNoIsNotNull() {
            addCriterion("capital_no is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNoEqualTo(String value) {
            addCriterion("capital_no =", value, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoNotEqualTo(String value) {
            addCriterion("capital_no <>", value, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoGreaterThan(String value) {
            addCriterion("capital_no >", value, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoGreaterThanOrEqualTo(String value) {
            addCriterion("capital_no >=", value, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoLessThan(String value) {
            addCriterion("capital_no <", value, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoLessThanOrEqualTo(String value) {
            addCriterion("capital_no <=", value, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoLike(String value) {
            addCriterion("capital_no like", value, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoNotLike(String value) {
            addCriterion("capital_no not like", value, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoIn(List<String> values) {
            addCriterion("capital_no in", values, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoNotIn(List<String> values) {
            addCriterion("capital_no not in", values, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoBetween(String value1, String value2) {
            addCriterion("capital_no between", value1, value2, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andCapitalNoNotBetween(String value1, String value2) {
            addCriterion("capital_no not between", value1, value2, "capitalNo");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameIsNull() {
            addCriterion("merchant_full_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameIsNotNull() {
            addCriterion("merchant_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameEqualTo(String value) {
            addCriterion("merchant_full_name =", value, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameNotEqualTo(String value) {
            addCriterion("merchant_full_name <>", value, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameGreaterThan(String value) {
            addCriterion("merchant_full_name >", value, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_full_name >=", value, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameLessThan(String value) {
            addCriterion("merchant_full_name <", value, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_full_name <=", value, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameLike(String value) {
            addCriterion("merchant_full_name like", value, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameNotLike(String value) {
            addCriterion("merchant_full_name not like", value, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameIn(List<String> values) {
            addCriterion("merchant_full_name in", values, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameNotIn(List<String> values) {
            addCriterion("merchant_full_name not in", values, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameBetween(String value1, String value2) {
            addCriterion("merchant_full_name between", value1, value2, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andMerchantFullNameNotBetween(String value1, String value2) {
            addCriterion("merchant_full_name not between", value1, value2, "merchantFullName");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("store_id like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("store_id not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeIsNull() {
            addCriterion("allies_code is null");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeIsNotNull() {
            addCriterion("allies_code is not null");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeEqualTo(String value) {
            addCriterion("allies_code =", value, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeNotEqualTo(String value) {
            addCriterion("allies_code <>", value, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeGreaterThan(String value) {
            addCriterion("allies_code >", value, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("allies_code >=", value, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeLessThan(String value) {
            addCriterion("allies_code <", value, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeLessThanOrEqualTo(String value) {
            addCriterion("allies_code <=", value, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeLike(String value) {
            addCriterion("allies_code like", value, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeNotLike(String value) {
            addCriterion("allies_code not like", value, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeIn(List<String> values) {
            addCriterion("allies_code in", values, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeNotIn(List<String> values) {
            addCriterion("allies_code not in", values, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeBetween(String value1, String value2) {
            addCriterion("allies_code between", value1, value2, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andAlliesCodeNotBetween(String value1, String value2) {
            addCriterion("allies_code not between", value1, value2, "alliesCode");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andRepoAmountIsNull() {
            addCriterion("repo_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepoAmountIsNotNull() {
            addCriterion("repo_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepoAmountEqualTo(Integer value) {
            addCriterion("repo_amount =", value, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountNotEqualTo(Integer value) {
            addCriterion("repo_amount <>", value, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountGreaterThan(Integer value) {
            addCriterion("repo_amount >", value, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("repo_amount >=", value, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountLessThan(Integer value) {
            addCriterion("repo_amount <", value, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountLessThanOrEqualTo(Integer value) {
            addCriterion("repo_amount <=", value, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountIn(List<Integer> values) {
            addCriterion("repo_amount in", values, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountNotIn(List<Integer> values) {
            addCriterion("repo_amount not in", values, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountBetween(Integer value1, Integer value2) {
            addCriterion("repo_amount between", value1, value2, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andRepoAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("repo_amount not between", value1, value2, "repoAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountIsNull() {
            addCriterion("returned_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountIsNotNull() {
            addCriterion("returned_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountEqualTo(Integer value) {
            addCriterion("returned_amount =", value, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountNotEqualTo(Integer value) {
            addCriterion("returned_amount <>", value, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountGreaterThan(Integer value) {
            addCriterion("returned_amount >", value, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("returned_amount >=", value, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountLessThan(Integer value) {
            addCriterion("returned_amount <", value, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("returned_amount <=", value, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountIn(List<Integer> values) {
            addCriterion("returned_amount in", values, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountNotIn(List<Integer> values) {
            addCriterion("returned_amount not in", values, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountBetween(Integer value1, Integer value2) {
            addCriterion("returned_amount between", value1, value2, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andReturnedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("returned_amount not between", value1, value2, "returnedAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountIsNull() {
            addCriterion("surplus_amount is null");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountIsNotNull() {
            addCriterion("surplus_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountEqualTo(Integer value) {
            addCriterion("surplus_amount =", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountNotEqualTo(Integer value) {
            addCriterion("surplus_amount <>", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountGreaterThan(Integer value) {
            addCriterion("surplus_amount >", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_amount >=", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountLessThan(Integer value) {
            addCriterion("surplus_amount <", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_amount <=", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountIn(List<Integer> values) {
            addCriterion("surplus_amount in", values, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountNotIn(List<Integer> values) {
            addCriterion("surplus_amount not in", values, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountBetween(Integer value1, Integer value2) {
            addCriterion("surplus_amount between", value1, value2, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_amount not between", value1, value2, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNull() {
            addCriterion("is_confirm is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNotNull() {
            addCriterion("is_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmEqualTo(String value) {
            addCriterion("is_confirm =", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotEqualTo(String value) {
            addCriterion("is_confirm <>", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThan(String value) {
            addCriterion("is_confirm >", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("is_confirm >=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThan(String value) {
            addCriterion("is_confirm <", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThanOrEqualTo(String value) {
            addCriterion("is_confirm <=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLike(String value) {
            addCriterion("is_confirm like", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotLike(String value) {
            addCriterion("is_confirm not like", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIn(List<String> values) {
            addCriterion("is_confirm in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotIn(List<String> values) {
            addCriterion("is_confirm not in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmBetween(String value1, String value2) {
            addCriterion("is_confirm between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotBetween(String value1, String value2) {
            addCriterion("is_confirm not between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqIsNull() {
            addCriterion("cz_patch_mq is null");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqIsNotNull() {
            addCriterion("cz_patch_mq is not null");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqEqualTo(String value) {
            addCriterion("cz_patch_mq =", value, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqNotEqualTo(String value) {
            addCriterion("cz_patch_mq <>", value, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqGreaterThan(String value) {
            addCriterion("cz_patch_mq >", value, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqGreaterThanOrEqualTo(String value) {
            addCriterion("cz_patch_mq >=", value, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqLessThan(String value) {
            addCriterion("cz_patch_mq <", value, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqLessThanOrEqualTo(String value) {
            addCriterion("cz_patch_mq <=", value, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqLike(String value) {
            addCriterion("cz_patch_mq like", value, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqNotLike(String value) {
            addCriterion("cz_patch_mq not like", value, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqIn(List<String> values) {
            addCriterion("cz_patch_mq in", values, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqNotIn(List<String> values) {
            addCriterion("cz_patch_mq not in", values, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqBetween(String value1, String value2) {
            addCriterion("cz_patch_mq between", value1, value2, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzPatchMqNotBetween(String value1, String value2) {
            addCriterion("cz_patch_mq not between", value1, value2, "czPatchMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqIsNull() {
            addCriterion("cz_result_mq is null");
            return (Criteria) this;
        }

        public Criteria andCzResultMqIsNotNull() {
            addCriterion("cz_result_mq is not null");
            return (Criteria) this;
        }

        public Criteria andCzResultMqEqualTo(String value) {
            addCriterion("cz_result_mq =", value, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqNotEqualTo(String value) {
            addCriterion("cz_result_mq <>", value, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqGreaterThan(String value) {
            addCriterion("cz_result_mq >", value, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqGreaterThanOrEqualTo(String value) {
            addCriterion("cz_result_mq >=", value, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqLessThan(String value) {
            addCriterion("cz_result_mq <", value, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqLessThanOrEqualTo(String value) {
            addCriterion("cz_result_mq <=", value, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqLike(String value) {
            addCriterion("cz_result_mq like", value, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqNotLike(String value) {
            addCriterion("cz_result_mq not like", value, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqIn(List<String> values) {
            addCriterion("cz_result_mq in", values, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqNotIn(List<String> values) {
            addCriterion("cz_result_mq not in", values, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqBetween(String value1, String value2) {
            addCriterion("cz_result_mq between", value1, value2, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andCzResultMqNotBetween(String value1, String value2) {
            addCriterion("cz_result_mq not between", value1, value2, "czResultMq");
            return (Criteria) this;
        }

        public Criteria andAprIsNull() {
            addCriterion("apr is null");
            return (Criteria) this;
        }

        public Criteria andAprIsNotNull() {
            addCriterion("apr is not null");
            return (Criteria) this;
        }

        public Criteria andAprEqualTo(String value) {
            addCriterion("apr =", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotEqualTo(String value) {
            addCriterion("apr <>", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThan(String value) {
            addCriterion("apr >", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThanOrEqualTo(String value) {
            addCriterion("apr >=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThan(String value) {
            addCriterion("apr <", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThanOrEqualTo(String value) {
            addCriterion("apr <=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLike(String value) {
            addCriterion("apr like", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotLike(String value) {
            addCriterion("apr not like", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprIn(List<String> values) {
            addCriterion("apr in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotIn(List<String> values) {
            addCriterion("apr not in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprBetween(String value1, String value2) {
            addCriterion("apr between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotBetween(String value1, String value2) {
            addCriterion("apr not between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andPAprIsNull() {
            addCriterion("p_apr is null");
            return (Criteria) this;
        }

        public Criteria andPAprIsNotNull() {
            addCriterion("p_apr is not null");
            return (Criteria) this;
        }

        public Criteria andPAprEqualTo(String value) {
            addCriterion("p_apr =", value, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprNotEqualTo(String value) {
            addCriterion("p_apr <>", value, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprGreaterThan(String value) {
            addCriterion("p_apr >", value, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprGreaterThanOrEqualTo(String value) {
            addCriterion("p_apr >=", value, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprLessThan(String value) {
            addCriterion("p_apr <", value, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprLessThanOrEqualTo(String value) {
            addCriterion("p_apr <=", value, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprLike(String value) {
            addCriterion("p_apr like", value, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprNotLike(String value) {
            addCriterion("p_apr not like", value, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprIn(List<String> values) {
            addCriterion("p_apr in", values, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprNotIn(List<String> values) {
            addCriterion("p_apr not in", values, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprBetween(String value1, String value2) {
            addCriterion("p_apr between", value1, value2, "pApr");
            return (Criteria) this;
        }

        public Criteria andPAprNotBetween(String value1, String value2) {
            addCriterion("p_apr not between", value1, value2, "pApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprIsNull() {
            addCriterion("p_loan_fee_apr is null");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprIsNotNull() {
            addCriterion("p_loan_fee_apr is not null");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprEqualTo(String value) {
            addCriterion("p_loan_fee_apr =", value, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprNotEqualTo(String value) {
            addCriterion("p_loan_fee_apr <>", value, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprGreaterThan(String value) {
            addCriterion("p_loan_fee_apr >", value, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprGreaterThanOrEqualTo(String value) {
            addCriterion("p_loan_fee_apr >=", value, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprLessThan(String value) {
            addCriterion("p_loan_fee_apr <", value, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprLessThanOrEqualTo(String value) {
            addCriterion("p_loan_fee_apr <=", value, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprLike(String value) {
            addCriterion("p_loan_fee_apr like", value, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprNotLike(String value) {
            addCriterion("p_loan_fee_apr not like", value, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprIn(List<String> values) {
            addCriterion("p_loan_fee_apr in", values, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprNotIn(List<String> values) {
            addCriterion("p_loan_fee_apr not in", values, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprBetween(String value1, String value2) {
            addCriterion("p_loan_fee_apr between", value1, value2, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprNotBetween(String value1, String value2) {
            addCriterion("p_loan_fee_apr not between", value1, value2, "pLoanFeeApr");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeIsNull() {
            addCriterion("p_loan_fee is null");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeIsNotNull() {
            addCriterion("p_loan_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeEqualTo(Integer value) {
            addCriterion("p_loan_fee =", value, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeNotEqualTo(Integer value) {
            addCriterion("p_loan_fee <>", value, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeGreaterThan(Integer value) {
            addCriterion("p_loan_fee >", value, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_loan_fee >=", value, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeLessThan(Integer value) {
            addCriterion("p_loan_fee <", value, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeLessThanOrEqualTo(Integer value) {
            addCriterion("p_loan_fee <=", value, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeIn(List<Integer> values) {
            addCriterion("p_loan_fee in", values, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeNotIn(List<Integer> values) {
            addCriterion("p_loan_fee not in", values, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeBetween(Integer value1, Integer value2) {
            addCriterion("p_loan_fee between", value1, value2, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("p_loan_fee not between", value1, value2, "pLoanFee");
            return (Criteria) this;
        }

        public Criteria andPAprAmtIsNull() {
            addCriterion("p_apr_amt is null");
            return (Criteria) this;
        }

        public Criteria andPAprAmtIsNotNull() {
            addCriterion("p_apr_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPAprAmtEqualTo(BigDecimal value) {
            addCriterion("p_apr_amt =", value, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtNotEqualTo(BigDecimal value) {
            addCriterion("p_apr_amt <>", value, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtGreaterThan(BigDecimal value) {
            addCriterion("p_apr_amt >", value, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_apr_amt >=", value, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtLessThan(BigDecimal value) {
            addCriterion("p_apr_amt <", value, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_apr_amt <=", value, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtIn(List<BigDecimal> values) {
            addCriterion("p_apr_amt in", values, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtNotIn(List<BigDecimal> values) {
            addCriterion("p_apr_amt not in", values, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_apr_amt between", value1, value2, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPAprAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_apr_amt not between", value1, value2, "pAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtIsNull() {
            addCriterion("p_loan_fee_apr_amt is null");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtIsNotNull() {
            addCriterion("p_loan_fee_apr_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtEqualTo(BigDecimal value) {
            addCriterion("p_loan_fee_apr_amt =", value, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtNotEqualTo(BigDecimal value) {
            addCriterion("p_loan_fee_apr_amt <>", value, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtGreaterThan(BigDecimal value) {
            addCriterion("p_loan_fee_apr_amt >", value, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_loan_fee_apr_amt >=", value, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtLessThan(BigDecimal value) {
            addCriterion("p_loan_fee_apr_amt <", value, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_loan_fee_apr_amt <=", value, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtIn(List<BigDecimal> values) {
            addCriterion("p_loan_fee_apr_amt in", values, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtNotIn(List<BigDecimal> values) {
            addCriterion("p_loan_fee_apr_amt not in", values, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_loan_fee_apr_amt between", value1, value2, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andPLoanFeeAprAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_loan_fee_apr_amt not between", value1, value2, "pLoanFeeAprAmt");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeIsNull() {
            addCriterion("c_approved_date_time is null");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeIsNotNull() {
            addCriterion("c_approved_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeEqualTo(Date value) {
            addCriterion("c_approved_date_time =", value, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeNotEqualTo(Date value) {
            addCriterion("c_approved_date_time <>", value, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeGreaterThan(Date value) {
            addCriterion("c_approved_date_time >", value, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_approved_date_time >=", value, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeLessThan(Date value) {
            addCriterion("c_approved_date_time <", value, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_approved_date_time <=", value, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeIn(List<Date> values) {
            addCriterion("c_approved_date_time in", values, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeNotIn(List<Date> values) {
            addCriterion("c_approved_date_time not in", values, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeBetween(Date value1, Date value2) {
            addCriterion("c_approved_date_time between", value1, value2, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andCApprovedDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_approved_date_time not between", value1, value2, "cApprovedDateTime");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeIsNull() {
            addCriterion("audited_datetime is null");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeIsNotNull() {
            addCriterion("audited_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeEqualTo(Date value) {
            addCriterion("audited_datetime =", value, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeNotEqualTo(Date value) {
            addCriterion("audited_datetime <>", value, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeGreaterThan(Date value) {
            addCriterion("audited_datetime >", value, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audited_datetime >=", value, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeLessThan(Date value) {
            addCriterion("audited_datetime <", value, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("audited_datetime <=", value, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeIn(List<Date> values) {
            addCriterion("audited_datetime in", values, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeNotIn(List<Date> values) {
            addCriterion("audited_datetime not in", values, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeBetween(Date value1, Date value2) {
            addCriterion("audited_datetime between", value1, value2, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("audited_datetime not between", value1, value2, "auditedDatetime");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountIsNull() {
            addCriterion("confirm_amount is null");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountIsNotNull() {
            addCriterion("confirm_amount is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountEqualTo(Integer value) {
            addCriterion("confirm_amount =", value, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountNotEqualTo(Integer value) {
            addCriterion("confirm_amount <>", value, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountGreaterThan(Integer value) {
            addCriterion("confirm_amount >", value, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_amount >=", value, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountLessThan(Integer value) {
            addCriterion("confirm_amount <", value, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_amount <=", value, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountIn(List<Integer> values) {
            addCriterion("confirm_amount in", values, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountNotIn(List<Integer> values) {
            addCriterion("confirm_amount not in", values, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountBetween(Integer value1, Integer value2) {
            addCriterion("confirm_amount between", value1, value2, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andConfirmAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_amount not between", value1, value2, "confirmAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountIsNull() {
            addCriterion("audit_amount is null");
            return (Criteria) this;
        }

        public Criteria andAuditAmountIsNotNull() {
            addCriterion("audit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAuditAmountEqualTo(Integer value) {
            addCriterion("audit_amount =", value, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountNotEqualTo(Integer value) {
            addCriterion("audit_amount <>", value, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountGreaterThan(Integer value) {
            addCriterion("audit_amount >", value, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_amount >=", value, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountLessThan(Integer value) {
            addCriterion("audit_amount <", value, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountLessThanOrEqualTo(Integer value) {
            addCriterion("audit_amount <=", value, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountIn(List<Integer> values) {
            addCriterion("audit_amount in", values, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountNotIn(List<Integer> values) {
            addCriterion("audit_amount not in", values, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountBetween(Integer value1, Integer value2) {
            addCriterion("audit_amount between", value1, value2, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andAuditAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_amount not between", value1, value2, "auditAmount");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeIsNull() {
            addCriterion("pay_expire_datatime is null");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeIsNotNull() {
            addCriterion("pay_expire_datatime is not null");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeEqualTo(Date value) {
            addCriterion("pay_expire_datatime =", value, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeNotEqualTo(Date value) {
            addCriterion("pay_expire_datatime <>", value, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeGreaterThan(Date value) {
            addCriterion("pay_expire_datatime >", value, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_expire_datatime >=", value, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeLessThan(Date value) {
            addCriterion("pay_expire_datatime <", value, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_expire_datatime <=", value, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeIn(List<Date> values) {
            addCriterion("pay_expire_datatime in", values, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeNotIn(List<Date> values) {
            addCriterion("pay_expire_datatime not in", values, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeBetween(Date value1, Date value2) {
            addCriterion("pay_expire_datatime between", value1, value2, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andPayExpireDatatimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_expire_datatime not between", value1, value2, "payExpireDatatime");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("project_type like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("project_type not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andApplySourceIsNull() {
            addCriterion("apply_source is null");
            return (Criteria) this;
        }

        public Criteria andApplySourceIsNotNull() {
            addCriterion("apply_source is not null");
            return (Criteria) this;
        }

        public Criteria andApplySourceEqualTo(String value) {
            addCriterion("apply_source =", value, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceNotEqualTo(String value) {
            addCriterion("apply_source <>", value, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceGreaterThan(String value) {
            addCriterion("apply_source >", value, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceGreaterThanOrEqualTo(String value) {
            addCriterion("apply_source >=", value, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceLessThan(String value) {
            addCriterion("apply_source <", value, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceLessThanOrEqualTo(String value) {
            addCriterion("apply_source <=", value, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceLike(String value) {
            addCriterion("apply_source like", value, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceNotLike(String value) {
            addCriterion("apply_source not like", value, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceIn(List<String> values) {
            addCriterion("apply_source in", values, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceNotIn(List<String> values) {
            addCriterion("apply_source not in", values, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceBetween(String value1, String value2) {
            addCriterion("apply_source between", value1, value2, "applySource");
            return (Criteria) this;
        }

        public Criteria andApplySourceNotBetween(String value1, String value2) {
            addCriterion("apply_source not between", value1, value2, "applySource");
            return (Criteria) this;
        }

        public Criteria andActivityNoIsNull() {
            addCriterion("activity_no is null");
            return (Criteria) this;
        }

        public Criteria andActivityNoIsNotNull() {
            addCriterion("activity_no is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNoEqualTo(String value) {
            addCriterion("activity_no =", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoNotEqualTo(String value) {
            addCriterion("activity_no <>", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoGreaterThan(String value) {
            addCriterion("activity_no >", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoGreaterThanOrEqualTo(String value) {
            addCriterion("activity_no >=", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoLessThan(String value) {
            addCriterion("activity_no <", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoLessThanOrEqualTo(String value) {
            addCriterion("activity_no <=", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoLike(String value) {
            addCriterion("activity_no like", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoNotLike(String value) {
            addCriterion("activity_no not like", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoIn(List<String> values) {
            addCriterion("activity_no in", values, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoNotIn(List<String> values) {
            addCriterion("activity_no not in", values, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoBetween(String value1, String value2) {
            addCriterion("activity_no between", value1, value2, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoNotBetween(String value1, String value2) {
            addCriterion("activity_no not between", value1, value2, "activityNo");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeIsNull() {
            addCriterion("cz_patch_time is null");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeIsNotNull() {
            addCriterion("cz_patch_time is not null");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeEqualTo(Date value) {
            addCriterion("cz_patch_time =", value, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeNotEqualTo(Date value) {
            addCriterion("cz_patch_time <>", value, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeGreaterThan(Date value) {
            addCriterion("cz_patch_time >", value, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cz_patch_time >=", value, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeLessThan(Date value) {
            addCriterion("cz_patch_time <", value, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("cz_patch_time <=", value, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeIn(List<Date> values) {
            addCriterion("cz_patch_time in", values, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeNotIn(List<Date> values) {
            addCriterion("cz_patch_time not in", values, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeBetween(Date value1, Date value2) {
            addCriterion("cz_patch_time between", value1, value2, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andCzPatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("cz_patch_time not between", value1, value2, "czPatchTime");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNull() {
            addCriterion("expired_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNotNull() {
            addCriterion("expired_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateEqualTo(Date value) {
            addCriterionForJDBCDate("expired_date =", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expired_date <>", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expired_date >", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expired_date >=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThan(Date value) {
            addCriterionForJDBCDate("expired_date <", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expired_date <=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIn(List<Date> values) {
            addCriterionForJDBCDate("expired_date in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expired_date not in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expired_date between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expired_date not between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateIsNull() {
            addCriterion("start_rent_date is null");
            return (Criteria) this;
        }

        public Criteria andStartRentDateIsNotNull() {
            addCriterion("start_rent_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartRentDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_rent_date =", value, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_rent_date <>", value, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_rent_date >", value, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_rent_date >=", value, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateLessThan(Date value) {
            addCriterionForJDBCDate("start_rent_date <", value, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_rent_date <=", value, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_rent_date in", values, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_rent_date not in", values, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_rent_date between", value1, value2, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andStartRentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_rent_date not between", value1, value2, "startRentDate");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdIsNull() {
            addCriterion("real_loan_id is null");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdIsNotNull() {
            addCriterion("real_loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdEqualTo(String value) {
            addCriterion("real_loan_id =", value, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdNotEqualTo(String value) {
            addCriterion("real_loan_id <>", value, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdGreaterThan(String value) {
            addCriterion("real_loan_id >", value, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("real_loan_id >=", value, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdLessThan(String value) {
            addCriterion("real_loan_id <", value, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdLessThanOrEqualTo(String value) {
            addCriterion("real_loan_id <=", value, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdLike(String value) {
            addCriterion("real_loan_id like", value, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdNotLike(String value) {
            addCriterion("real_loan_id not like", value, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdIn(List<String> values) {
            addCriterion("real_loan_id in", values, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdNotIn(List<String> values) {
            addCriterion("real_loan_id not in", values, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdBetween(String value1, String value2) {
            addCriterion("real_loan_id between", value1, value2, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andRealLoanIdNotBetween(String value1, String value2) {
            addCriterion("real_loan_id not between", value1, value2, "realLoanId");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("update_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("update_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("update_name =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("update_name <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("update_name >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_name >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("update_name <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("update_name <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("update_name like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("update_name not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("update_name in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("update_name not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("update_name between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("update_name not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlIsNull() {
            addCriterion("merchant_head_url is null");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlIsNotNull() {
            addCriterion("merchant_head_url is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlEqualTo(String value) {
            addCriterion("merchant_head_url =", value, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlNotEqualTo(String value) {
            addCriterion("merchant_head_url <>", value, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlGreaterThan(String value) {
            addCriterion("merchant_head_url >", value, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_head_url >=", value, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlLessThan(String value) {
            addCriterion("merchant_head_url <", value, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlLessThanOrEqualTo(String value) {
            addCriterion("merchant_head_url <=", value, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlLike(String value) {
            addCriterion("merchant_head_url like", value, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlNotLike(String value) {
            addCriterion("merchant_head_url not like", value, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlIn(List<String> values) {
            addCriterion("merchant_head_url in", values, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlNotIn(List<String> values) {
            addCriterion("merchant_head_url not in", values, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlBetween(String value1, String value2) {
            addCriterion("merchant_head_url between", value1, value2, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantHeadUrlNotBetween(String value1, String value2) {
            addCriterion("merchant_head_url not between", value1, value2, "merchantHeadUrl");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeIsNull() {
            addCriterion("is_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeIsNotNull() {
            addCriterion("is_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeEqualTo(Date value) {
            addCriterion("is_confirm_time =", value, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeNotEqualTo(Date value) {
            addCriterion("is_confirm_time <>", value, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeGreaterThan(Date value) {
            addCriterion("is_confirm_time >", value, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("is_confirm_time >=", value, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeLessThan(Date value) {
            addCriterion("is_confirm_time <", value, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("is_confirm_time <=", value, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeIn(List<Date> values) {
            addCriterion("is_confirm_time in", values, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeNotIn(List<Date> values) {
            addCriterion("is_confirm_time not in", values, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("is_confirm_time between", value1, value2, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("is_confirm_time not between", value1, value2, "isConfirmTime");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderIsNull() {
            addCriterion("is_show_order is null");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderIsNotNull() {
            addCriterion("is_show_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderEqualTo(String value) {
            addCriterion("is_show_order =", value, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderNotEqualTo(String value) {
            addCriterion("is_show_order <>", value, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderGreaterThan(String value) {
            addCriterion("is_show_order >", value, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_show_order >=", value, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderLessThan(String value) {
            addCriterion("is_show_order <", value, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderLessThanOrEqualTo(String value) {
            addCriterion("is_show_order <=", value, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderLike(String value) {
            addCriterion("is_show_order like", value, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderNotLike(String value) {
            addCriterion("is_show_order not like", value, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderIn(List<String> values) {
            addCriterion("is_show_order in", values, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderNotIn(List<String> values) {
            addCriterion("is_show_order not in", values, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderBetween(String value1, String value2) {
            addCriterion("is_show_order between", value1, value2, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andIsShowOrderNotBetween(String value1, String value2) {
            addCriterion("is_show_order not between", value1, value2, "isShowOrder");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtIsNull() {
            addCriterion("over_flow_amt is null");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtIsNotNull() {
            addCriterion("over_flow_amt is not null");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtEqualTo(Integer value) {
            addCriterion("over_flow_amt =", value, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtNotEqualTo(Integer value) {
            addCriterion("over_flow_amt <>", value, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtGreaterThan(Integer value) {
            addCriterion("over_flow_amt >", value, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("over_flow_amt >=", value, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtLessThan(Integer value) {
            addCriterion("over_flow_amt <", value, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtLessThanOrEqualTo(Integer value) {
            addCriterion("over_flow_amt <=", value, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtIn(List<Integer> values) {
            addCriterion("over_flow_amt in", values, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtNotIn(List<Integer> values) {
            addCriterion("over_flow_amt not in", values, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtBetween(Integer value1, Integer value2) {
            addCriterion("over_flow_amt between", value1, value2, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andOverFlowAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("over_flow_amt not between", value1, value2, "overFlowAmt");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeIsNull() {
            addCriterion("buyback_type is null");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeIsNotNull() {
            addCriterion("buyback_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeEqualTo(String value) {
            addCriterion("buyback_type =", value, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeNotEqualTo(String value) {
            addCriterion("buyback_type <>", value, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeGreaterThan(String value) {
            addCriterion("buyback_type >", value, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("buyback_type >=", value, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeLessThan(String value) {
            addCriterion("buyback_type <", value, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeLessThanOrEqualTo(String value) {
            addCriterion("buyback_type <=", value, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeLike(String value) {
            addCriterion("buyback_type like", value, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeNotLike(String value) {
            addCriterion("buyback_type not like", value, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeIn(List<String> values) {
            addCriterion("buyback_type in", values, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeNotIn(List<String> values) {
            addCriterion("buyback_type not in", values, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeBetween(String value1, String value2) {
            addCriterion("buyback_type between", value1, value2, "buybackType");
            return (Criteria) this;
        }

        public Criteria andBuybackTypeNotBetween(String value1, String value2) {
            addCriterion("buyback_type not between", value1, value2, "buybackType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeIsNull() {
            addCriterion("merchant_industry_type is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeIsNotNull() {
            addCriterion("merchant_industry_type is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeEqualTo(String value) {
            addCriterion("merchant_industry_type =", value, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeNotEqualTo(String value) {
            addCriterion("merchant_industry_type <>", value, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeGreaterThan(String value) {
            addCriterion("merchant_industry_type >", value, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_industry_type >=", value, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeLessThan(String value) {
            addCriterion("merchant_industry_type <", value, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeLessThanOrEqualTo(String value) {
            addCriterion("merchant_industry_type <=", value, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeLike(String value) {
            addCriterion("merchant_industry_type like", value, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeNotLike(String value) {
            addCriterion("merchant_industry_type not like", value, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeIn(List<String> values) {
            addCriterion("merchant_industry_type in", values, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeNotIn(List<String> values) {
            addCriterion("merchant_industry_type not in", values, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeBetween(String value1, String value2) {
            addCriterion("merchant_industry_type between", value1, value2, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantIndustryTypeNotBetween(String value1, String value2) {
            addCriterion("merchant_industry_type not between", value1, value2, "merchantIndustryType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeIsNull() {
            addCriterion("merchant_cl_type is null");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeIsNotNull() {
            addCriterion("merchant_cl_type is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeEqualTo(String value) {
            addCriterion("merchant_cl_type =", value, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeNotEqualTo(String value) {
            addCriterion("merchant_cl_type <>", value, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeGreaterThan(String value) {
            addCriterion("merchant_cl_type >", value, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_cl_type >=", value, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeLessThan(String value) {
            addCriterion("merchant_cl_type <", value, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeLessThanOrEqualTo(String value) {
            addCriterion("merchant_cl_type <=", value, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeLike(String value) {
            addCriterion("merchant_cl_type like", value, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeNotLike(String value) {
            addCriterion("merchant_cl_type not like", value, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeIn(List<String> values) {
            addCriterion("merchant_cl_type in", values, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeNotIn(List<String> values) {
            addCriterion("merchant_cl_type not in", values, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeBetween(String value1, String value2) {
            addCriterion("merchant_cl_type between", value1, value2, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andMerchantClTypeNotBetween(String value1, String value2) {
            addCriterion("merchant_cl_type not between", value1, value2, "merchantClType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueIsNull() {
            addCriterion("penalty_cash_due is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueIsNotNull() {
            addCriterion("penalty_cash_due is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueEqualTo(Integer value) {
            addCriterion("penalty_cash_due =", value, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueNotEqualTo(Integer value) {
            addCriterion("penalty_cash_due <>", value, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueGreaterThan(Integer value) {
            addCriterion("penalty_cash_due >", value, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueGreaterThanOrEqualTo(Integer value) {
            addCriterion("penalty_cash_due >=", value, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueLessThan(Integer value) {
            addCriterion("penalty_cash_due <", value, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueLessThanOrEqualTo(Integer value) {
            addCriterion("penalty_cash_due <=", value, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueIn(List<Integer> values) {
            addCriterion("penalty_cash_due in", values, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueNotIn(List<Integer> values) {
            addCriterion("penalty_cash_due not in", values, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueBetween(Integer value1, Integer value2) {
            addCriterion("penalty_cash_due between", value1, value2, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDueNotBetween(Integer value1, Integer value2) {
            addCriterion("penalty_cash_due not between", value1, value2, "penaltyCashDue");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedIsNull() {
            addCriterion("penalty_cash_discharged is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedIsNotNull() {
            addCriterion("penalty_cash_discharged is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedEqualTo(Integer value) {
            addCriterion("penalty_cash_discharged =", value, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedNotEqualTo(Integer value) {
            addCriterion("penalty_cash_discharged <>", value, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedGreaterThan(Integer value) {
            addCriterion("penalty_cash_discharged >", value, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedGreaterThanOrEqualTo(Integer value) {
            addCriterion("penalty_cash_discharged >=", value, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedLessThan(Integer value) {
            addCriterion("penalty_cash_discharged <", value, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedLessThanOrEqualTo(Integer value) {
            addCriterion("penalty_cash_discharged <=", value, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedIn(List<Integer> values) {
            addCriterion("penalty_cash_discharged in", values, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedNotIn(List<Integer> values) {
            addCriterion("penalty_cash_discharged not in", values, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedBetween(Integer value1, Integer value2) {
            addCriterion("penalty_cash_discharged between", value1, value2, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashDischargedNotBetween(Integer value1, Integer value2) {
            addCriterion("penalty_cash_discharged not between", value1, value2, "penaltyCashDischarged");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidIsNull() {
            addCriterion("penalty_cash_paid is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidIsNotNull() {
            addCriterion("penalty_cash_paid is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidEqualTo(Integer value) {
            addCriterion("penalty_cash_paid =", value, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidNotEqualTo(Integer value) {
            addCriterion("penalty_cash_paid <>", value, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidGreaterThan(Integer value) {
            addCriterion("penalty_cash_paid >", value, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("penalty_cash_paid >=", value, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidLessThan(Integer value) {
            addCriterion("penalty_cash_paid <", value, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidLessThanOrEqualTo(Integer value) {
            addCriterion("penalty_cash_paid <=", value, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidIn(List<Integer> values) {
            addCriterion("penalty_cash_paid in", values, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidNotIn(List<Integer> values) {
            addCriterion("penalty_cash_paid not in", values, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidBetween(Integer value1, Integer value2) {
            addCriterion("penalty_cash_paid between", value1, value2, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyCashPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("penalty_cash_paid not between", value1, value2, "penaltyCashPaid");
            return (Criteria) this;
        }

        public Criteria andLateChargDueIsNull() {
            addCriterion("late_charg_due is null");
            return (Criteria) this;
        }

        public Criteria andLateChargDueIsNotNull() {
            addCriterion("late_charg_due is not null");
            return (Criteria) this;
        }

        public Criteria andLateChargDueEqualTo(Integer value) {
            addCriterion("late_charg_due =", value, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueNotEqualTo(Integer value) {
            addCriterion("late_charg_due <>", value, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueGreaterThan(Integer value) {
            addCriterion("late_charg_due >", value, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueGreaterThanOrEqualTo(Integer value) {
            addCriterion("late_charg_due >=", value, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueLessThan(Integer value) {
            addCriterion("late_charg_due <", value, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueLessThanOrEqualTo(Integer value) {
            addCriterion("late_charg_due <=", value, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueIn(List<Integer> values) {
            addCriterion("late_charg_due in", values, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueNotIn(List<Integer> values) {
            addCriterion("late_charg_due not in", values, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueBetween(Integer value1, Integer value2) {
            addCriterion("late_charg_due between", value1, value2, "lateChargDue");
            return (Criteria) this;
        }

        public Criteria andLateChargDueNotBetween(Integer value1, Integer value2) {
            addCriterion("late_charg_due not between", value1, value2, "lateChargDue");
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