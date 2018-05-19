package Entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  7:38 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_model")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String modelId;

    @OneToMany(mappedBy = "model")
    private Set<MobilePhone> mobilePhone;

    @ManyToOne
    @JoinColumn(name = "brand")
    private Brand brand;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Set<MobilePhone> getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Set<MobilePhone> mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
