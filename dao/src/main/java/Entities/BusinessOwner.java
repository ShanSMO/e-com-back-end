package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/28/2018
 * Created Time -  9:36 PM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_business_owner",uniqueConstraints = @UniqueConstraint(columnNames = {"user_id"}))
public class BusinessOwner implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "lasst_name")
    private String lastName;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "nic_number")
    private String nicNumber;

    @Column(name = "mobile_number")
    private long mobileNumber;

    @Column(name = "fixed_number")
    private long fixedNumber;

    @Column(name = "company_id")
    @OneToMany(mappedBy = "owner")
    private List<Company> company;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;

    public List<Company> getCompany() {
        return company;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
