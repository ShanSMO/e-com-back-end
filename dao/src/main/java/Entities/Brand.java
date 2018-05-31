package Entities;

import Enums.BrandType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  7:37 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_brand")
@JsonIgnoreProperties({"mobilePhones", "models"})
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String brandName;

    @Column(name = "type")
    @Enumerated
    private BrandType brandType;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY , cascade = CascadeType.DETACH)
    private Set<MobilePhone> mobilePhones;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private Set<Model> models;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Set<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }

    public void setMobilePhones(Set<MobilePhone> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }

    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }

    public BrandType getBrandType() {
        return brandType;
    }

    public void setBrandType(BrandType brandType) {
        this.brandType = brandType;
    }
}
