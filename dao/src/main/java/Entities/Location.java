package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
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
@Table(name = "TBL_LOCATION")
public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loc_id")
    private int id;

    @Column(name = "loc_latitude")
    private double latitude;

    @Column(name = "loc_longitude")
    private double longitude;

    @Column(name = "loc_date_time")
    private Timestamp dateTime;

    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "device_location",
        joinColumns = {@JoinColumn(name = "device_id")},
        inverseJoinColumns = {@JoinColumn(name = "location_id")})
    private Set<Device> devices = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Set<Device> getDevices() {
        return devices;
    }

    public void setDevices(Set<Device> devices) {
        this.devices = devices;
    }
}
