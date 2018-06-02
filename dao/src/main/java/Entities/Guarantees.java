package Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/31/2018
 * Created Time -  9:55 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */
@Entity
@Table(name = "tbl_guarantee")
@JsonIgnoreProperties({"guarantee1", "guarantee2"})
public class Guarantees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "nic")
    private String nic;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;

    @OneToOne(mappedBy = "guarantee1")
    private LeaseMobile leaseMobile;

    @OneToOne(mappedBy = "guarantee2")
    private LeaseMobile leaseMobile2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LeaseMobile getLeaseMobile() {
        return leaseMobile;
    }

    public void setLeaseMobile(LeaseMobile leaseMobile) {
        this.leaseMobile = leaseMobile;
    }

    public LeaseMobile getLeaseMobile2() {
        return leaseMobile2;
    }

    public void setLeaseMobile2(LeaseMobile leaseMobile2) {
        this.leaseMobile2 = leaseMobile2;
    }
}
