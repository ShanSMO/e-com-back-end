package Dtos;

import Entities.Address;
import Entities.Company;
import Entities.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/25/2018
 * Created Time -  8:46 AM
 * Project Name - core
 * Package Name - Dtos
 */

public class BusinessOwnerDto implements Serializable{

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String nicNumber;
    private long mobileNumber;
    private long fixedNumber;
    private List<Company> company;
    private User user;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getFixedNumber() {
        return fixedNumber;
    }

    public void setFixedNumber(long fixedNumber) {
        this.fixedNumber = fixedNumber;
    }

    public List<Company> getCompany() {
        return company;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
