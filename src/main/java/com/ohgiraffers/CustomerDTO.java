package com.ohgiraffers;

public class CustomerDTO {

    private String mentorName ;
    private String mentorPhone ;
    private String mentyName ;
    private String mentyPhone;
    private int customerCode;
    private int companyCategoryCode;
    private char config ;

    public CustomerDTO() {
    }

    public CustomerDTO(String mentorName, String mentorPhone, String mentyName, String mentyPhone, int customerCode, int companyCategoryCode, char config) {
        this.mentorName = mentorName;
        this.mentorPhone = mentorPhone;
        this.mentyName = mentyName;
        this.mentyPhone = mentyPhone;
        this.customerCode = customerCode;
        this.companyCategoryCode = companyCategoryCode;
        this.config = config;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorPhone() {
        return mentorPhone;
    }

    public void setMentorPhone(String mentorPhone) {
        this.mentorPhone = mentorPhone;
    }

    public String getMentyName() {
        return mentyName;
    }

    public void setMentyName(String mentyName) {
        this.mentyName = mentyName;
    }

    public String getMentyPhone() {
        return mentyPhone;
    }

    public void setMentyPhone(String mentyPhone) {
        this.mentyPhone = mentyPhone;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public int getCompanyCategoryCode() {
        return companyCategoryCode;
    }

    public void setCompanyCategoryCode(int companyCategoryCode) {
        this.companyCategoryCode = companyCategoryCode;
    }

    public char getConfig() {
        return config;
    }

    public void setConfig(char config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "mentorName='" + mentorName + '\'' +
                ", mentorPhone='" + mentorPhone + '\'' +
                ", mentyName='" + mentyName + '\'' +
                ", mentyPhone='" + mentyPhone + '\'' +
                ", customerCode=" + customerCode +
                ", companyCategoryCode=" + companyCategoryCode +
                ", config=" + config +
                '}';
    }
}
