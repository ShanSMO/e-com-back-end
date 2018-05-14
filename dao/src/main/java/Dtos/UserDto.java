package Dtos;

import Entities.BusinessOwner;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  12:15 PM
 * Project Name - core
 * Package Name - Dtos
 */

public class UserDto {

    private int id;
    private String userName;
    private String password;
    private String userType;
    private long phoneNumber;
    private String verification;
    private BusinessOwner owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public BusinessOwner getOwner() {
        return owner;
    }

    public void setOwner(BusinessOwner owner) {
        this.owner = owner;
    }
}
