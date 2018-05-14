package Entities;

import javax.persistence.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/24/2018
 * Created Time -  10:24 PM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "TBL_VEHICLE")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vh_id")
    private int id;

    @Column(name = "vh_reg_number")
    private String regNumber;

    @Column(name = "vh_modal")
    private String modal;

    @Column(name = "vh_reg_date")
    private String regDate;

    @ManyToOne
    @JoinColumn(name = "com_id",nullable = false)
    private Company company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
