package com.yc.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VirusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VirusExample() {
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

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andMyclassIsNull() {
            addCriterion("myclass is null");
            return (Criteria) this;
        }

        public Criteria andMyclassIsNotNull() {
            addCriterion("myclass is not null");
            return (Criteria) this;
        }

        public Criteria andMyclassEqualTo(String value) {
            addCriterion("myclass =", value, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassNotEqualTo(String value) {
            addCriterion("myclass <>", value, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassGreaterThan(String value) {
            addCriterion("myclass >", value, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassGreaterThanOrEqualTo(String value) {
            addCriterion("myclass >=", value, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassLessThan(String value) {
            addCriterion("myclass <", value, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassLessThanOrEqualTo(String value) {
            addCriterion("myclass <=", value, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassLike(String value) {
            addCriterion("myclass like", value, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassNotLike(String value) {
            addCriterion("myclass not like", value, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassIn(List<String> values) {
            addCriterion("myclass in", values, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassNotIn(List<String> values) {
            addCriterion("myclass not in", values, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassBetween(String value1, String value2) {
            addCriterion("myclass between", value1, value2, "myclass");
            return (Criteria) this;
        }

        public Criteria andMyclassNotBetween(String value1, String value2) {
            addCriterion("myclass not between", value1, value2, "myclass");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(Long value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(Long value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(Long value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(Long value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(Long value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(Long value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<Long> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<Long> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(Long value1, Long value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(Long value1, Long value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreasIsNull() {
            addCriterion("areas is null");
            return (Criteria) this;
        }

        public Criteria andAreasIsNotNull() {
            addCriterion("areas is not null");
            return (Criteria) this;
        }

        public Criteria andAreasEqualTo(String value) {
            addCriterion("areas =", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotEqualTo(String value) {
            addCriterion("areas <>", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThan(String value) {
            addCriterion("areas >", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThanOrEqualTo(String value) {
            addCriterion("areas >=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThan(String value) {
            addCriterion("areas <", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThanOrEqualTo(String value) {
            addCriterion("areas <=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLike(String value) {
            addCriterion("areas like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotLike(String value) {
            addCriterion("areas not like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasIn(List<String> values) {
            addCriterion("areas in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotIn(List<String> values) {
            addCriterion("areas not in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasBetween(String value1, String value2) {
            addCriterion("areas between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotBetween(String value1, String value2) {
            addCriterion("areas not between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentIsNull() {
            addCriterion("ischinesestudent is null");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentIsNotNull() {
            addCriterion("ischinesestudent is not null");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentEqualTo(Boolean value) {
            addCriterion("ischinesestudent =", value, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentNotEqualTo(Boolean value) {
            addCriterion("ischinesestudent <>", value, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentGreaterThan(Boolean value) {
            addCriterion("ischinesestudent >", value, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ischinesestudent >=", value, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentLessThan(Boolean value) {
            addCriterion("ischinesestudent <", value, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentLessThanOrEqualTo(Boolean value) {
            addCriterion("ischinesestudent <=", value, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentIn(List<Boolean> values) {
            addCriterion("ischinesestudent in", values, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentNotIn(List<Boolean> values) {
            addCriterion("ischinesestudent not in", values, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentBetween(Boolean value1, Boolean value2) {
            addCriterion("ischinesestudent between", value1, value2, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIschinesestudentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ischinesestudent not between", value1, value2, "ischinesestudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentIsNull() {
            addCriterion("iswuhanstudent is null");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentIsNotNull() {
            addCriterion("iswuhanstudent is not null");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentEqualTo(Boolean value) {
            addCriterion("iswuhanstudent =", value, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentNotEqualTo(Boolean value) {
            addCriterion("iswuhanstudent <>", value, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentGreaterThan(Boolean value) {
            addCriterion("iswuhanstudent >", value, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iswuhanstudent >=", value, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentLessThan(Boolean value) {
            addCriterion("iswuhanstudent <", value, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentLessThanOrEqualTo(Boolean value) {
            addCriterion("iswuhanstudent <=", value, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentIn(List<Boolean> values) {
            addCriterion("iswuhanstudent in", values, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentNotIn(List<Boolean> values) {
            addCriterion("iswuhanstudent not in", values, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentBetween(Boolean value1, Boolean value2) {
            addCriterion("iswuhanstudent between", value1, value2, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIswuhanstudentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iswuhanstudent not between", value1, value2, "iswuhanstudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentIsNull() {
            addCriterion("ishubeistudent is null");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentIsNotNull() {
            addCriterion("ishubeistudent is not null");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentEqualTo(Boolean value) {
            addCriterion("ishubeistudent =", value, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentNotEqualTo(Boolean value) {
            addCriterion("ishubeistudent <>", value, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentGreaterThan(Boolean value) {
            addCriterion("ishubeistudent >", value, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ishubeistudent >=", value, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentLessThan(Boolean value) {
            addCriterion("ishubeistudent <", value, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentLessThanOrEqualTo(Boolean value) {
            addCriterion("ishubeistudent <=", value, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentIn(List<Boolean> values) {
            addCriterion("ishubeistudent in", values, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentNotIn(List<Boolean> values) {
            addCriterion("ishubeistudent not in", values, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentBetween(Boolean value1, Boolean value2) {
            addCriterion("ishubeistudent between", value1, value2, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIshubeistudentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ishubeistudent not between", value1, value2, "ishubeistudent");
            return (Criteria) this;
        }

        public Criteria andIs14contactIsNull() {
            addCriterion("is14contact is null");
            return (Criteria) this;
        }

        public Criteria andIs14contactIsNotNull() {
            addCriterion("is14contact is not null");
            return (Criteria) this;
        }

        public Criteria andIs14contactEqualTo(Boolean value) {
            addCriterion("is14contact =", value, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactNotEqualTo(Boolean value) {
            addCriterion("is14contact <>", value, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactGreaterThan(Boolean value) {
            addCriterion("is14contact >", value, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is14contact >=", value, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactLessThan(Boolean value) {
            addCriterion("is14contact <", value, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactLessThanOrEqualTo(Boolean value) {
            addCriterion("is14contact <=", value, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactIn(List<Boolean> values) {
            addCriterion("is14contact in", values, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactNotIn(List<Boolean> values) {
            addCriterion("is14contact not in", values, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactBetween(Boolean value1, Boolean value2) {
            addCriterion("is14contact between", value1, value2, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIs14contactNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is14contact not between", value1, value2, "is14contact");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanIsNull() {
            addCriterion("isinwuhan is null");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanIsNotNull() {
            addCriterion("isinwuhan is not null");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanEqualTo(Boolean value) {
            addCriterion("isinwuhan =", value, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanNotEqualTo(Boolean value) {
            addCriterion("isinwuhan <>", value, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanGreaterThan(Boolean value) {
            addCriterion("isinwuhan >", value, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isinwuhan >=", value, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanLessThan(Boolean value) {
            addCriterion("isinwuhan <", value, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanLessThanOrEqualTo(Boolean value) {
            addCriterion("isinwuhan <=", value, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanIn(List<Boolean> values) {
            addCriterion("isinwuhan in", values, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanNotIn(List<Boolean> values) {
            addCriterion("isinwuhan not in", values, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanBetween(Boolean value1, Boolean value2) {
            addCriterion("isinwuhan between", value1, value2, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinwuhanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isinwuhan not between", value1, value2, "isinwuhan");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiIsNull() {
            addCriterion("isinhubei is null");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiIsNotNull() {
            addCriterion("isinhubei is not null");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiEqualTo(Boolean value) {
            addCriterion("isinhubei =", value, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiNotEqualTo(Boolean value) {
            addCriterion("isinhubei <>", value, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiGreaterThan(Boolean value) {
            addCriterion("isinhubei >", value, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isinhubei >=", value, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiLessThan(Boolean value) {
            addCriterion("isinhubei <", value, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiLessThanOrEqualTo(Boolean value) {
            addCriterion("isinhubei <=", value, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiIn(List<Boolean> values) {
            addCriterion("isinhubei in", values, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiNotIn(List<Boolean> values) {
            addCriterion("isinhubei not in", values, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiBetween(Boolean value1, Boolean value2) {
            addCriterion("isinhubei between", value1, value2, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIsinhubeiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isinhubei not between", value1, value2, "isinhubei");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherIsNull() {
            addCriterion("istodayformother is null");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherIsNotNull() {
            addCriterion("istodayformother is not null");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherEqualTo(Boolean value) {
            addCriterion("istodayformother =", value, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherNotEqualTo(Boolean value) {
            addCriterion("istodayformother <>", value, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherGreaterThan(Boolean value) {
            addCriterion("istodayformother >", value, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherGreaterThanOrEqualTo(Boolean value) {
            addCriterion("istodayformother >=", value, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherLessThan(Boolean value) {
            addCriterion("istodayformother <", value, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherLessThanOrEqualTo(Boolean value) {
            addCriterion("istodayformother <=", value, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherIn(List<Boolean> values) {
            addCriterion("istodayformother in", values, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherNotIn(List<Boolean> values) {
            addCriterion("istodayformother not in", values, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherBetween(Boolean value1, Boolean value2) {
            addCriterion("istodayformother between", value1, value2, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIstodayformotherNotBetween(Boolean value1, Boolean value2) {
            addCriterion("istodayformother not between", value1, value2, "istodayformother");
            return (Criteria) this;
        }

        public Criteria andIslikevirusIsNull() {
            addCriterion("islikevirus is null");
            return (Criteria) this;
        }

        public Criteria andIslikevirusIsNotNull() {
            addCriterion("islikevirus is not null");
            return (Criteria) this;
        }

        public Criteria andIslikevirusEqualTo(Boolean value) {
            addCriterion("islikevirus =", value, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusNotEqualTo(Boolean value) {
            addCriterion("islikevirus <>", value, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusGreaterThan(Boolean value) {
            addCriterion("islikevirus >", value, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("islikevirus >=", value, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusLessThan(Boolean value) {
            addCriterion("islikevirus <", value, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusLessThanOrEqualTo(Boolean value) {
            addCriterion("islikevirus <=", value, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusIn(List<Boolean> values) {
            addCriterion("islikevirus in", values, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusNotIn(List<Boolean> values) {
            addCriterion("islikevirus not in", values, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusBetween(Boolean value1, Boolean value2) {
            addCriterion("islikevirus between", value1, value2, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIslikevirusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("islikevirus not between", value1, value2, "islikevirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusIsNull() {
            addCriterion("isconfirmvirus is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusIsNotNull() {
            addCriterion("isconfirmvirus is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusEqualTo(Boolean value) {
            addCriterion("isconfirmvirus =", value, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusNotEqualTo(Boolean value) {
            addCriterion("isconfirmvirus <>", value, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusGreaterThan(Boolean value) {
            addCriterion("isconfirmvirus >", value, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isconfirmvirus >=", value, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusLessThan(Boolean value) {
            addCriterion("isconfirmvirus <", value, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusLessThanOrEqualTo(Boolean value) {
            addCriterion("isconfirmvirus <=", value, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusIn(List<Boolean> values) {
            addCriterion("isconfirmvirus in", values, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusNotIn(List<Boolean> values) {
            addCriterion("isconfirmvirus not in", values, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusBetween(Boolean value1, Boolean value2) {
            addCriterion("isconfirmvirus between", value1, value2, "isconfirmvirus");
            return (Criteria) this;
        }

        public Criteria andIsconfirmvirusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isconfirmvirus not between", value1, value2, "isconfirmvirus");
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