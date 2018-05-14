package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/18/2018
 * Created Time -  11:12 AM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "TBL_USER", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_name","user_type"})})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "user_phone")
    private long phoneNumber;

    @Column(name = "user_verification")
    private String verification;

    @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private BusinessOwner owner;

    @OneToOne()
    @JoinColumn(name = "role_id")
    private UserRole role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public BusinessOwner getOwner() {
        return owner;
    }

    public void setOwner(BusinessOwner owner) {
        this.owner = owner;
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
