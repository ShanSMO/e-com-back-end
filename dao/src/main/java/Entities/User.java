package Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/14/2018
 * Created Time -  6:21 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_user")
@JsonIgnoreProperties({"sellings","salesMobilePhones"})
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Selling> sellings;

    @OneToMany(mappedBy = "user")
    private Set<SalesMobilePhone> salesMobilePhones;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Set<Selling> getSellings() {
        return sellings;
    }

    public void setSellings(Set<Selling> sellings) {
        this.sellings = sellings;
    }

    public Set<SalesMobilePhone> getSalesMobilePhones() {
        return salesMobilePhones;
    }

    public void setSalesMobilePhones(Set<SalesMobilePhone> salesMobilePhones) {
        this.salesMobilePhones = salesMobilePhones;
    }
}
