package Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/20/2018
 * Created Time -  10:43 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_selling")
public class Selling {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @Column(name = "estimated_selling_price")
    private double estimatedSellingPrice;

    @Column(name = "discount")
    private double discount;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getEstimatedSellingPrice() {
        return estimatedSellingPrice;
    }

    public void setEstimatedSellingPrice(double estimatedSellingPrice) {
        this.estimatedSellingPrice = estimatedSellingPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
