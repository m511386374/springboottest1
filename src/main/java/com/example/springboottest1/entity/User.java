package com.example.springboottest1.entity;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.dept
     *
     * @mbggenerated
     */
    private String dept;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.website
     *
     * @mbggenerated
     */
    private String website;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.id
     *
     * @return the value of User.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.id
     *
     * @param id the value for User.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.name
     *
     * @return the value of User.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.name
     *
     * @param name the value for User.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.dept
     *
     * @return the value of User.dept
     *
     * @mbggenerated
     */
    public String getDept() {
        return dept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.dept
     *
     * @param dept the value for User.dept
     *
     * @mbggenerated
     */
    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.phone
     *
     * @return the value of User.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.phone
     *
     * @param phone the value for User.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.website
     *
     * @return the value of User.website
     *
     * @mbggenerated
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.website
     *
     * @param website the value for User.website
     *
     * @mbggenerated
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }
}