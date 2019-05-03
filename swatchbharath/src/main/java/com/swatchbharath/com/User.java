package com.swatchbharath.com;

public class User {
    private String name;
    private String email;
    private String mobile;
    private int id;
    private int couponPoints;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return int return the couponPoints
     */
    public int getCouponPoints() {
        return couponPoints;
    }

    /**
     * @param couponPoints the couponPoints to set
     */
    public void setCouponPoints(int couponPoints) {
        this.couponPoints = couponPoints;
    }

    public void addCouponPoints(int couponPoints) {
        this.couponPoints += couponPoints;
    }

    public void deductCouponPoints(int couponPoints) {
        this.couponPoints -= couponPoints;
    }

}
