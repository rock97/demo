package ctas.test.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HardwareDevelopmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HardwareDevelopmentExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNull() {
            addCriterion("apply_no is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(String value) {
            addCriterion("apply_no =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(String value) {
            addCriterion("apply_no <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(String value) {
            addCriterion("apply_no >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("apply_no >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(String value) {
            addCriterion("apply_no <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(String value) {
            addCriterion("apply_no <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLike(String value) {
            addCriterion("apply_no like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotLike(String value) {
            addCriterion("apply_no not like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<String> values) {
            addCriterion("apply_no in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<String> values) {
            addCriterion("apply_no not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(String value1, String value2) {
            addCriterion("apply_no between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(String value1, String value2) {
            addCriterion("apply_no not between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("apply_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("apply_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("apply_type =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("apply_type <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("apply_type >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("apply_type <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_type <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("apply_type like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("apply_type not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("apply_type in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("apply_type not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("apply_type between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("apply_type not between", value1, value2, "applyType");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyIsNull() {
            addCriterion("legal_person_company is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyIsNotNull() {
            addCriterion("legal_person_company is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyEqualTo(String value) {
            addCriterion("legal_person_company =", value, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyNotEqualTo(String value) {
            addCriterion("legal_person_company <>", value, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyGreaterThan(String value) {
            addCriterion("legal_person_company >", value, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_company >=", value, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyLessThan(String value) {
            addCriterion("legal_person_company <", value, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyLessThanOrEqualTo(String value) {
            addCriterion("legal_person_company <=", value, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyLike(String value) {
            addCriterion("legal_person_company like", value, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyNotLike(String value) {
            addCriterion("legal_person_company not like", value, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyIn(List<String> values) {
            addCriterion("legal_person_company in", values, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyNotIn(List<String> values) {
            addCriterion("legal_person_company not in", values, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyBetween(String value1, String value2) {
            addCriterion("legal_person_company between", value1, value2, "legalPersonCompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCompanyNotBetween(String value1, String value2) {
            addCriterion("legal_person_company not between", value1, value2, "legalPersonCompany");
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

        public Criteria andProductNoChangeIsNull() {
            addCriterion("product_no_change is null");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeIsNotNull() {
            addCriterion("product_no_change is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeEqualTo(String value) {
            addCriterion("product_no_change =", value, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeNotEqualTo(String value) {
            addCriterion("product_no_change <>", value, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeGreaterThan(String value) {
            addCriterion("product_no_change >", value, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeGreaterThanOrEqualTo(String value) {
            addCriterion("product_no_change >=", value, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeLessThan(String value) {
            addCriterion("product_no_change <", value, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeLessThanOrEqualTo(String value) {
            addCriterion("product_no_change <=", value, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeLike(String value) {
            addCriterion("product_no_change like", value, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeNotLike(String value) {
            addCriterion("product_no_change not like", value, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeIn(List<String> values) {
            addCriterion("product_no_change in", values, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeNotIn(List<String> values) {
            addCriterion("product_no_change not in", values, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeBetween(String value1, String value2) {
            addCriterion("product_no_change between", value1, value2, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeNotBetween(String value1, String value2) {
            addCriterion("product_no_change not between", value1, value2, "productNoChange");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterIsNull() {
            addCriterion("product_no_change_after is null");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterIsNotNull() {
            addCriterion("product_no_change_after is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterEqualTo(String value) {
            addCriterion("product_no_change_after =", value, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterNotEqualTo(String value) {
            addCriterion("product_no_change_after <>", value, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterGreaterThan(String value) {
            addCriterion("product_no_change_after >", value, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterGreaterThanOrEqualTo(String value) {
            addCriterion("product_no_change_after >=", value, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterLessThan(String value) {
            addCriterion("product_no_change_after <", value, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterLessThanOrEqualTo(String value) {
            addCriterion("product_no_change_after <=", value, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterLike(String value) {
            addCriterion("product_no_change_after like", value, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterNotLike(String value) {
            addCriterion("product_no_change_after not like", value, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterIn(List<String> values) {
            addCriterion("product_no_change_after in", values, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterNotIn(List<String> values) {
            addCriterion("product_no_change_after not in", values, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterBetween(String value1, String value2) {
            addCriterion("product_no_change_after between", value1, value2, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductNoChangeAfterNotBetween(String value1, String value2) {
            addCriterion("product_no_change_after not between", value1, value2, "productNoChangeAfter");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeIsNull() {
            addCriterion("product_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeIsNotNull() {
            addCriterion("product_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("product_arrive_time =", value, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("product_arrive_time <>", value, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("product_arrive_time >", value, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("product_arrive_time >=", value, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeLessThan(Date value) {
            addCriterionForJDBCDate("product_arrive_time <", value, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("product_arrive_time <=", value, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("product_arrive_time in", values, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("product_arrive_time not in", values, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("product_arrive_time between", value1, value2, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductArriveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("product_arrive_time not between", value1, value2, "productArriveTime");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNull() {
            addCriterion("product_number is null");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNotNull() {
            addCriterion("product_number is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumberEqualTo(Integer value) {
            addCriterion("product_number =", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotEqualTo(Integer value) {
            addCriterion("product_number <>", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThan(Integer value) {
            addCriterion("product_number >", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_number >=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThan(Integer value) {
            addCriterion("product_number <", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThanOrEqualTo(Integer value) {
            addCriterion("product_number <=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIn(List<Integer> values) {
            addCriterion("product_number in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotIn(List<Integer> values) {
            addCriterion("product_number not in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberBetween(Integer value1, Integer value2) {
            addCriterion("product_number between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("product_number not between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeIsNull() {
            addCriterion("product_change_type is null");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeIsNotNull() {
            addCriterion("product_change_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeEqualTo(String value) {
            addCriterion("product_change_type =", value, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeNotEqualTo(String value) {
            addCriterion("product_change_type <>", value, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeGreaterThan(String value) {
            addCriterion("product_change_type >", value, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_change_type >=", value, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeLessThan(String value) {
            addCriterion("product_change_type <", value, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("product_change_type <=", value, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeLike(String value) {
            addCriterion("product_change_type like", value, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeNotLike(String value) {
            addCriterion("product_change_type not like", value, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeIn(List<String> values) {
            addCriterion("product_change_type in", values, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeNotIn(List<String> values) {
            addCriterion("product_change_type not in", values, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeBetween(String value1, String value2) {
            addCriterion("product_change_type between", value1, value2, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andProductChangeTypeNotBetween(String value1, String value2) {
            addCriterion("product_change_type not between", value1, value2, "productChangeType");
            return (Criteria) this;
        }

        public Criteria andImportTypeIsNull() {
            addCriterion("import_type is null");
            return (Criteria) this;
        }

        public Criteria andImportTypeIsNotNull() {
            addCriterion("import_type is not null");
            return (Criteria) this;
        }

        public Criteria andImportTypeEqualTo(String value) {
            addCriterion("import_type =", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeNotEqualTo(String value) {
            addCriterion("import_type <>", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeGreaterThan(String value) {
            addCriterion("import_type >", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("import_type >=", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeLessThan(String value) {
            addCriterion("import_type <", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeLessThanOrEqualTo(String value) {
            addCriterion("import_type <=", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeLike(String value) {
            addCriterion("import_type like", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeNotLike(String value) {
            addCriterion("import_type not like", value, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeIn(List<String> values) {
            addCriterion("import_type in", values, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeNotIn(List<String> values) {
            addCriterion("import_type not in", values, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeBetween(String value1, String value2) {
            addCriterion("import_type between", value1, value2, "importType");
            return (Criteria) this;
        }

        public Criteria andImportTypeNotBetween(String value1, String value2) {
            addCriterion("import_type not between", value1, value2, "importType");
            return (Criteria) this;
        }

        public Criteria andImportDescribeIsNull() {
            addCriterion("import_describe is null");
            return (Criteria) this;
        }

        public Criteria andImportDescribeIsNotNull() {
            addCriterion("import_describe is not null");
            return (Criteria) this;
        }

        public Criteria andImportDescribeEqualTo(String value) {
            addCriterion("import_describe =", value, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeNotEqualTo(String value) {
            addCriterion("import_describe <>", value, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeGreaterThan(String value) {
            addCriterion("import_describe >", value, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("import_describe >=", value, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeLessThan(String value) {
            addCriterion("import_describe <", value, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeLessThanOrEqualTo(String value) {
            addCriterion("import_describe <=", value, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeLike(String value) {
            addCriterion("import_describe like", value, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeNotLike(String value) {
            addCriterion("import_describe not like", value, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeIn(List<String> values) {
            addCriterion("import_describe in", values, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeNotIn(List<String> values) {
            addCriterion("import_describe not in", values, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeBetween(String value1, String value2) {
            addCriterion("import_describe between", value1, value2, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andImportDescribeNotBetween(String value1, String value2) {
            addCriterion("import_describe not between", value1, value2, "importDescribe");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateIsNull() {
            addCriterion("timing_import_date is null");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateIsNotNull() {
            addCriterion("timing_import_date is not null");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateEqualTo(Date value) {
            addCriterionForJDBCDate("timing_import_date =", value, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("timing_import_date <>", value, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateGreaterThan(Date value) {
            addCriterionForJDBCDate("timing_import_date >", value, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("timing_import_date >=", value, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateLessThan(Date value) {
            addCriterionForJDBCDate("timing_import_date <", value, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("timing_import_date <=", value, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateIn(List<Date> values) {
            addCriterionForJDBCDate("timing_import_date in", values, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("timing_import_date not in", values, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("timing_import_date between", value1, value2, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andTimingImportDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("timing_import_date not between", value1, value2, "timingImportDate");
            return (Criteria) this;
        }

        public Criteria andCostAffectIsNull() {
            addCriterion("cost_affect is null");
            return (Criteria) this;
        }

        public Criteria andCostAffectIsNotNull() {
            addCriterion("cost_affect is not null");
            return (Criteria) this;
        }

        public Criteria andCostAffectEqualTo(String value) {
            addCriterion("cost_affect =", value, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectNotEqualTo(String value) {
            addCriterion("cost_affect <>", value, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectGreaterThan(String value) {
            addCriterion("cost_affect >", value, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectGreaterThanOrEqualTo(String value) {
            addCriterion("cost_affect >=", value, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectLessThan(String value) {
            addCriterion("cost_affect <", value, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectLessThanOrEqualTo(String value) {
            addCriterion("cost_affect <=", value, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectLike(String value) {
            addCriterion("cost_affect like", value, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectNotLike(String value) {
            addCriterion("cost_affect not like", value, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectIn(List<String> values) {
            addCriterion("cost_affect in", values, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectNotIn(List<String> values) {
            addCriterion("cost_affect not in", values, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectBetween(String value1, String value2) {
            addCriterion("cost_affect between", value1, value2, "costAffect");
            return (Criteria) this;
        }

        public Criteria andCostAffectNotBetween(String value1, String value2) {
            addCriterion("cost_affect not between", value1, value2, "costAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectIsNull() {
            addCriterion("deadline_affect is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectIsNotNull() {
            addCriterion("deadline_affect is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectEqualTo(String value) {
            addCriterion("deadline_affect =", value, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectNotEqualTo(String value) {
            addCriterion("deadline_affect <>", value, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectGreaterThan(String value) {
            addCriterion("deadline_affect >", value, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectGreaterThanOrEqualTo(String value) {
            addCriterion("deadline_affect >=", value, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectLessThan(String value) {
            addCriterion("deadline_affect <", value, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectLessThanOrEqualTo(String value) {
            addCriterion("deadline_affect <=", value, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectLike(String value) {
            addCriterion("deadline_affect like", value, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectNotLike(String value) {
            addCriterion("deadline_affect not like", value, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectIn(List<String> values) {
            addCriterion("deadline_affect in", values, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectNotIn(List<String> values) {
            addCriterion("deadline_affect not in", values, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectBetween(String value1, String value2) {
            addCriterion("deadline_affect between", value1, value2, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andDeadlineAffectNotBetween(String value1, String value2) {
            addCriterion("deadline_affect not between", value1, value2, "deadlineAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectIsNull() {
            addCriterion("project_affect is null");
            return (Criteria) this;
        }

        public Criteria andProjectAffectIsNotNull() {
            addCriterion("project_affect is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAffectEqualTo(String value) {
            addCriterion("project_affect =", value, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectNotEqualTo(String value) {
            addCriterion("project_affect <>", value, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectGreaterThan(String value) {
            addCriterion("project_affect >", value, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectGreaterThanOrEqualTo(String value) {
            addCriterion("project_affect >=", value, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectLessThan(String value) {
            addCriterion("project_affect <", value, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectLessThanOrEqualTo(String value) {
            addCriterion("project_affect <=", value, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectLike(String value) {
            addCriterion("project_affect like", value, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectNotLike(String value) {
            addCriterion("project_affect not like", value, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectIn(List<String> values) {
            addCriterion("project_affect in", values, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectNotIn(List<String> values) {
            addCriterion("project_affect not in", values, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectBetween(String value1, String value2) {
            addCriterion("project_affect between", value1, value2, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andProjectAffectNotBetween(String value1, String value2) {
            addCriterion("project_affect not between", value1, value2, "projectAffect");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeIsNull() {
            addCriterion("detailed_requirement_describe is null");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeIsNotNull() {
            addCriterion("detailed_requirement_describe is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeEqualTo(String value) {
            addCriterion("detailed_requirement_describe =", value, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeNotEqualTo(String value) {
            addCriterion("detailed_requirement_describe <>", value, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeGreaterThan(String value) {
            addCriterion("detailed_requirement_describe >", value, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_requirement_describe >=", value, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeLessThan(String value) {
            addCriterion("detailed_requirement_describe <", value, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeLessThanOrEqualTo(String value) {
            addCriterion("detailed_requirement_describe <=", value, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeLike(String value) {
            addCriterion("detailed_requirement_describe like", value, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeNotLike(String value) {
            addCriterion("detailed_requirement_describe not like", value, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeIn(List<String> values) {
            addCriterion("detailed_requirement_describe in", values, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeNotIn(List<String> values) {
            addCriterion("detailed_requirement_describe not in", values, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeBetween(String value1, String value2) {
            addCriterion("detailed_requirement_describe between", value1, value2, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailedRequirementDescribeNotBetween(String value1, String value2) {
            addCriterion("detailed_requirement_describe not between", value1, value2, "detailedRequirementDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIsNull() {
            addCriterion("change_reason is null");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIsNotNull() {
            addCriterion("change_reason is not null");
            return (Criteria) this;
        }

        public Criteria andChangeReasonEqualTo(String value) {
            addCriterion("change_reason =", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotEqualTo(String value) {
            addCriterion("change_reason <>", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonGreaterThan(String value) {
            addCriterion("change_reason >", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("change_reason >=", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLessThan(String value) {
            addCriterion("change_reason <", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLessThanOrEqualTo(String value) {
            addCriterion("change_reason <=", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLike(String value) {
            addCriterion("change_reason like", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotLike(String value) {
            addCriterion("change_reason not like", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIn(List<String> values) {
            addCriterion("change_reason in", values, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotIn(List<String> values) {
            addCriterion("change_reason not in", values, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonBetween(String value1, String value2) {
            addCriterion("change_reason between", value1, value2, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotBetween(String value1, String value2) {
            addCriterion("change_reason not between", value1, value2, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("change_type is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("change_type =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("change_type <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("change_type >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("change_type >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("change_type <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("change_type <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("change_type like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("change_type not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("change_type in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("change_type not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("change_type between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("change_type not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeIsNull() {
            addCriterion("change_type_other_describe is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeIsNotNull() {
            addCriterion("change_type_other_describe is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeEqualTo(String value) {
            addCriterion("change_type_other_describe =", value, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeNotEqualTo(String value) {
            addCriterion("change_type_other_describe <>", value, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeGreaterThan(String value) {
            addCriterion("change_type_other_describe >", value, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("change_type_other_describe >=", value, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeLessThan(String value) {
            addCriterion("change_type_other_describe <", value, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeLessThanOrEqualTo(String value) {
            addCriterion("change_type_other_describe <=", value, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeLike(String value) {
            addCriterion("change_type_other_describe like", value, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeNotLike(String value) {
            addCriterion("change_type_other_describe not like", value, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeIn(List<String> values) {
            addCriterion("change_type_other_describe in", values, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeNotIn(List<String> values) {
            addCriterion("change_type_other_describe not in", values, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeBetween(String value1, String value2) {
            addCriterion("change_type_other_describe between", value1, value2, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeTypeOtherDescribeNotBetween(String value1, String value2) {
            addCriterion("change_type_other_describe not between", value1, value2, "changeTypeOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewIsNull() {
            addCriterion("change_purview is null");
            return (Criteria) this;
        }

        public Criteria andChangePurviewIsNotNull() {
            addCriterion("change_purview is not null");
            return (Criteria) this;
        }

        public Criteria andChangePurviewEqualTo(String value) {
            addCriterion("change_purview =", value, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewNotEqualTo(String value) {
            addCriterion("change_purview <>", value, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewGreaterThan(String value) {
            addCriterion("change_purview >", value, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewGreaterThanOrEqualTo(String value) {
            addCriterion("change_purview >=", value, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewLessThan(String value) {
            addCriterion("change_purview <", value, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewLessThanOrEqualTo(String value) {
            addCriterion("change_purview <=", value, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewLike(String value) {
            addCriterion("change_purview like", value, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewNotLike(String value) {
            addCriterion("change_purview not like", value, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewIn(List<String> values) {
            addCriterion("change_purview in", values, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewNotIn(List<String> values) {
            addCriterion("change_purview not in", values, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewBetween(String value1, String value2) {
            addCriterion("change_purview between", value1, value2, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewNotBetween(String value1, String value2) {
            addCriterion("change_purview not between", value1, value2, "changePurview");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeIsNull() {
            addCriterion("change_purview_other_describe is null");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeIsNotNull() {
            addCriterion("change_purview_other_describe is not null");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeEqualTo(String value) {
            addCriterion("change_purview_other_describe =", value, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeNotEqualTo(String value) {
            addCriterion("change_purview_other_describe <>", value, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeGreaterThan(String value) {
            addCriterion("change_purview_other_describe >", value, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("change_purview_other_describe >=", value, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeLessThan(String value) {
            addCriterion("change_purview_other_describe <", value, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeLessThanOrEqualTo(String value) {
            addCriterion("change_purview_other_describe <=", value, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeLike(String value) {
            addCriterion("change_purview_other_describe like", value, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeNotLike(String value) {
            addCriterion("change_purview_other_describe not like", value, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeIn(List<String> values) {
            addCriterion("change_purview_other_describe in", values, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeNotIn(List<String> values) {
            addCriterion("change_purview_other_describe not in", values, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeBetween(String value1, String value2) {
            addCriterion("change_purview_other_describe between", value1, value2, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangePurviewOtherDescribeNotBetween(String value1, String value2) {
            addCriterion("change_purview_other_describe not between", value1, value2, "changePurviewOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentIsNull() {
            addCriterion("involve_department is null");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentIsNotNull() {
            addCriterion("involve_department is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentEqualTo(String value) {
            addCriterion("involve_department =", value, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentNotEqualTo(String value) {
            addCriterion("involve_department <>", value, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentGreaterThan(String value) {
            addCriterion("involve_department >", value, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("involve_department >=", value, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentLessThan(String value) {
            addCriterion("involve_department <", value, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentLessThanOrEqualTo(String value) {
            addCriterion("involve_department <=", value, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentLike(String value) {
            addCriterion("involve_department like", value, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentNotLike(String value) {
            addCriterion("involve_department not like", value, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentIn(List<String> values) {
            addCriterion("involve_department in", values, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentNotIn(List<String> values) {
            addCriterion("involve_department not in", values, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentBetween(String value1, String value2) {
            addCriterion("involve_department between", value1, value2, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentNotBetween(String value1, String value2) {
            addCriterion("involve_department not between", value1, value2, "involveDepartment");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeIsNull() {
            addCriterion("involve_department_other_describe is null");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeIsNotNull() {
            addCriterion("involve_department_other_describe is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeEqualTo(String value) {
            addCriterion("involve_department_other_describe =", value, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeNotEqualTo(String value) {
            addCriterion("involve_department_other_describe <>", value, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeGreaterThan(String value) {
            addCriterion("involve_department_other_describe >", value, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("involve_department_other_describe >=", value, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeLessThan(String value) {
            addCriterion("involve_department_other_describe <", value, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeLessThanOrEqualTo(String value) {
            addCriterion("involve_department_other_describe <=", value, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeLike(String value) {
            addCriterion("involve_department_other_describe like", value, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeNotLike(String value) {
            addCriterion("involve_department_other_describe not like", value, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeIn(List<String> values) {
            addCriterion("involve_department_other_describe in", values, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeNotIn(List<String> values) {
            addCriterion("involve_department_other_describe not in", values, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeBetween(String value1, String value2) {
            addCriterion("involve_department_other_describe between", value1, value2, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andInvolveDepartmentOtherDescribeNotBetween(String value1, String value2) {
            addCriterion("involve_department_other_describe not between", value1, value2, "involveDepartmentOtherDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeIsNull() {
            addCriterion("change_describe is null");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeIsNotNull() {
            addCriterion("change_describe is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeEqualTo(String value) {
            addCriterion("change_describe =", value, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeNotEqualTo(String value) {
            addCriterion("change_describe <>", value, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeGreaterThan(String value) {
            addCriterion("change_describe >", value, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("change_describe >=", value, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeLessThan(String value) {
            addCriterion("change_describe <", value, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeLessThanOrEqualTo(String value) {
            addCriterion("change_describe <=", value, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeLike(String value) {
            addCriterion("change_describe like", value, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeNotLike(String value) {
            addCriterion("change_describe not like", value, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeIn(List<String> values) {
            addCriterion("change_describe in", values, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeNotIn(List<String> values) {
            addCriterion("change_describe not in", values, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeBetween(String value1, String value2) {
            addCriterion("change_describe between", value1, value2, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeNotBetween(String value1, String value2) {
            addCriterion("change_describe not between", value1, value2, "changeDescribe");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterIsNull() {
            addCriterion("change_describe_after is null");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterIsNotNull() {
            addCriterion("change_describe_after is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterEqualTo(String value) {
            addCriterion("change_describe_after =", value, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterNotEqualTo(String value) {
            addCriterion("change_describe_after <>", value, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterGreaterThan(String value) {
            addCriterion("change_describe_after >", value, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterGreaterThanOrEqualTo(String value) {
            addCriterion("change_describe_after >=", value, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterLessThan(String value) {
            addCriterion("change_describe_after <", value, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterLessThanOrEqualTo(String value) {
            addCriterion("change_describe_after <=", value, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterLike(String value) {
            addCriterion("change_describe_after like", value, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterNotLike(String value) {
            addCriterion("change_describe_after not like", value, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterIn(List<String> values) {
            addCriterion("change_describe_after in", values, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterNotIn(List<String> values) {
            addCriterion("change_describe_after not in", values, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterBetween(String value1, String value2) {
            addCriterion("change_describe_after between", value1, value2, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andChangeDescribeAfterNotBetween(String value1, String value2) {
            addCriterion("change_describe_after not between", value1, value2, "changeDescribeAfter");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNull() {
            addCriterion("commit_time is null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNotNull() {
            addCriterion("commit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeEqualTo(Date value) {
            addCriterionForJDBCDate("commit_time =", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("commit_time <>", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("commit_time >", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commit_time >=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThan(Date value) {
            addCriterionForJDBCDate("commit_time <", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commit_time <=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIn(List<Date> values) {
            addCriterionForJDBCDate("commit_time in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("commit_time not in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commit_time between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commit_time not between", value1, value2, "commitTime");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisIsNull() {
            addCriterion("create_user_mis is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisIsNotNull() {
            addCriterion("create_user_mis is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisEqualTo(String value) {
            addCriterion("create_user_mis =", value, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisNotEqualTo(String value) {
            addCriterion("create_user_mis <>", value, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisGreaterThan(String value) {
            addCriterion("create_user_mis >", value, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_mis >=", value, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisLessThan(String value) {
            addCriterion("create_user_mis <", value, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisLessThanOrEqualTo(String value) {
            addCriterion("create_user_mis <=", value, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisLike(String value) {
            addCriterion("create_user_mis like", value, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisNotLike(String value) {
            addCriterion("create_user_mis not like", value, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisIn(List<String> values) {
            addCriterion("create_user_mis in", values, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisNotIn(List<String> values) {
            addCriterion("create_user_mis not in", values, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisBetween(String value1, String value2) {
            addCriterion("create_user_mis between", value1, value2, "createUserMis");
            return (Criteria) this;
        }

        public Criteria andCreateUserMisNotBetween(String value1, String value2) {
            addCriterion("create_user_mis not between", value1, value2, "createUserMis");
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
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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