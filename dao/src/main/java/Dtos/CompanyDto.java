package Dtos;

import Entities.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  12:16 PM
 * Project Name - core
 * Package Name - Dtos
 */

public class CompanyDto {

    private int id;
    private String companyName;
    private Long contactNumber;
    private String email;
    private User user;
    private List<Vehicle> vehicles;
    private List<Supplier> suppliers;
    private Set<Agent> agents = new HashSet<>();
    private List<Device> device;
    private String logo;
    private Image logoFile;

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

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Set<Agent> getAgents() {
        return agents;
    }

    public void setAgents(Set<Agent> agents) {
        this.agents = agents;
    }

    public List<Device> getDevice() {
        return device;
    }

    public void setDevice(List<Device> device) {
        this.device = device;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Image getLogoFile() {
        return logoFile;
    }

    public void setLogoFile(Image logoFile) {
        this.logoFile = logoFile;
    }
}
