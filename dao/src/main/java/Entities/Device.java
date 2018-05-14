package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  6:55 AM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "TBL_DEVICE")
public class Device implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "device_id")
    private int id;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_imei")
    private String deviceImei;

    @Column(name = "device_added_date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "com_id",nullable = false)
    private Company company;

    @ManyToMany(mappedBy = "devices", fetch = FetchType.LAZY)
    private Set<Location> locations = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }
}
