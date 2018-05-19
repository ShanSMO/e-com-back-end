package Entities;

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
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String brandName;

    @OneToMany(mappedBy = "brand")
    private Set<MobilePhone> mobilePhone;

    @OneToMany(mappedBy = "brand")
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

    public Set<MobilePhone> getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Set<MobilePhone> mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }
}
