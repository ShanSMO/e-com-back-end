package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/24/2018
 * Created Time -  10:36 PM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "TBL_SUPPLIER")
public class Supplier implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sup_id")
    private int id;

    @Column(name = "sup_first_name")
    private String firstName;

    @Column(name = "sup_last_name")
    private String lastName;

    @Column(name = "sup_email")
    private String email;

    @Column(name = "sup_contact")
    private long contactNumber;

    @ManyToOne
    @JoinColumn(name = "com_id",nullable = false)
    private Company company;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
