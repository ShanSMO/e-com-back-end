package Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/24/2018
 * Created Time -  12:17 AM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_lease")
public class LeaseMobile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mobile_id")
    private MobilePhone mobilePhone;

    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
