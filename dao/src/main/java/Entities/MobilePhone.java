package Entities;

import javax.persistence.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  7:34 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_mobile_phone")
public class MobilePhone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "brand")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "model")
    private Model model;

    @Column(name = "imei")
    private String imei;

    @Column(name = "buying_price")
    private double buyingPrice;

    @Column(name = "selling_price")
    private double sellingPrice;

    @Column(name = "profit_margin")
    private double profitMargin;

    @Column(name = "discount")
    private double discount;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(double profitMargin) {
        this.profitMargin = profitMargin;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
