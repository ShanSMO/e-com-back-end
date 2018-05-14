package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/1/2018
 * Created Time -  8:23 AM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_address")
public class Address implements Serializable{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "house_no")
    private String houseNumber;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "sip_code")
    private String zipCode;

    @OneToOne(mappedBy = "address")
    private BusinessOwner owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public BusinessOwner getOwner() {
        return owner;
    }

    public void setOwner(BusinessOwner owner) {
        this.owner = owner;
    }
}
