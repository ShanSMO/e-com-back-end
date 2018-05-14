package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/24/2018
 * Created Time -  10:07 PM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "TBL_COMPANY" , uniqueConstraints = @UniqueConstraint(columnNames = {"com_email"}))
public class Company implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "com_id")
    private int id;

    @Column(name = "com_name")
    private String companyName;

    @Column(name="mobile_number")
    private Long mobileNumber;

    @Column(name="fixed_number")
    private Long fixedNumber;

    @Column(name="postal_code")
    private Long postalCode;

    @Column(name = "com_email")
    private String email;

    @Column(name = "com_logo")
    private String logo;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "logitiude")
    private double longitude;

    @Transient
    private Image logoFile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private BusinessOwner owner;

    @Column(name = "com_vehicle_id")
    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY)
    private List<Vehicle> vehicles;

    @Column(name = "com_supplier_id")
    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY)
    private List<Supplier> suppliers;

    @ManyToMany(mappedBy = "companies",fetch = FetchType.LAZY)
    private Set<Agent> agents = new HashSet<>();

    @Column(name = "com_device_id")
    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY)
    private List<Device> device;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BusinessOwner getOwner() {
        return owner;
    }

    public void setOwner(BusinessOwner owner) {
        this.owner = owner;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Device> getDevice() {
        return device;
    }

    public void setDevice(List<Device> device) {
        this.device = device;
    }

    public Set<Agent> getAgents() {
        return agents;
    }

    public void setAgents(Set<Agent> agents) {
        this.agents = agents;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getFixedNumber() {
        return fixedNumber;
    }

    public void setFixedNumber(Long fixedNumber) {
        this.fixedNumber = fixedNumber;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public Image getLogoFile() {
        return logoFile;
    }

    public void setLogoFile(Image logoFile) {
        this.logoFile = logoFile;
    }
}
