package Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  8:29 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_category")
@JsonIgnoreProperties({"product","mobilePhones","photoCopies","sellings","leaseMobiles"})
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "code")
    private String code;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private Set<Product> product;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private Set<MobilePhone> mobilePhones;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private Set<PhotoCopy> photoCopies;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private Set<Selling> sellings;

    @OneToMany(mappedBy = "category")
    private Set<LeaseMobile> leaseMobiles;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }

    public void setMobilePhones(Set<MobilePhone> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }

    public Set<PhotoCopy> getPhotoCopies() {
        return photoCopies;
    }

    public void setPhotoCopies(Set<PhotoCopy> photoCopies) {
        this.photoCopies = photoCopies;
    }

    public Set<Selling> getSellings() {
        return sellings;
    }

    public void setSellings(Set<Selling> sellings) {
        this.sellings = sellings;
    }

    public Set<LeaseMobile> getLeaseMobiles() {
        return leaseMobiles;
    }

    public void setLeaseMobiles(Set<LeaseMobile> leaseMobiles) {
        this.leaseMobiles = leaseMobiles;
    }
}
