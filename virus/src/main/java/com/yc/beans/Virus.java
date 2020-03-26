package com.yc.beans;

import java.util.Date;

public class Virus {
    private Integer id;

    @Override
    public String toString() {
        return "Virus{" +
                "id=" + id +
                ", college='" + college + '\'' +
                ", myclass='" + myclass + '\'' +
                ", startdate=" + startdate +
                ", username='" + username + '\'' +
                ", tel=" + tel +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", areas='" + areas + '\'' +
                ", ischinesestudent=" + ischinesestudent +
                ", iswuhanstudent=" + iswuhanstudent +
                ", ishubeistudent=" + ishubeistudent +
                ", is14contact=" + is14contact +
                ", isinwuhan=" + isinwuhan +
                ", isinhubei=" + isinhubei +
                ", istodayformother=" + istodayformother +
                ", islikevirus=" + islikevirus +
                ", isconfirmvirus=" + isconfirmvirus +
                '}';
    }

    private String college;

    private String myclass;

    private Date startdate;

    private String username;

    private Long tel;

    private String province;

    private String city;

    private String areas;

    private Boolean ischinesestudent;

    private Boolean iswuhanstudent;

    private Boolean ishubeistudent;

    private Boolean is14contact;

    private Boolean isinwuhan;

    private Boolean isinhubei;

    private Boolean istodayformother;

    private Boolean islikevirus;

    private Boolean isconfirmvirus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getMyclass() {
        return myclass;
    }

    public void setMyclass(String myclass) {
        this.myclass = myclass == null ? null : myclass.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas == null ? null : areas.trim();
    }

    public Boolean getIschinesestudent() {
        return ischinesestudent;
    }

    public void setIschinesestudent(Boolean ischinesestudent) {
        this.ischinesestudent = ischinesestudent;
    }

    public Boolean getIswuhanstudent() {
        return iswuhanstudent;
    }

    public void setIswuhanstudent(Boolean iswuhanstudent) {
        this.iswuhanstudent = iswuhanstudent;
    }

    public Boolean getIshubeistudent() {
        return ishubeistudent;
    }

    public void setIshubeistudent(Boolean ishubeistudent) {
        this.ishubeistudent = ishubeistudent;
    }

    public Boolean getIs14contact() {
        return is14contact;
    }

    public void setIs14contact(Boolean is14contact) {
        this.is14contact = is14contact;
    }

    public Boolean getIsinwuhan() {
        return isinwuhan;
    }

    public void setIsinwuhan(Boolean isinwuhan) {
        this.isinwuhan = isinwuhan;
    }

    public Boolean getIsinhubei() {
        return isinhubei;
    }

    public void setIsinhubei(Boolean isinhubei) {
        this.isinhubei = isinhubei;
    }

    public Boolean getIstodayformother() {
        return istodayformother;
    }

    public void setIstodayformother(Boolean istodayformother) {
        this.istodayformother = istodayformother;
    }

    public Boolean getIslikevirus() {
        return islikevirus;
    }

    public void setIslikevirus(Boolean islikevirus) {
        this.islikevirus = islikevirus;
    }

    public Boolean getIsconfirmvirus() {
        return isconfirmvirus;
    }

    public void setIsconfirmvirus(Boolean isconfirmvirus) {
        this.isconfirmvirus = isconfirmvirus;
    }
}