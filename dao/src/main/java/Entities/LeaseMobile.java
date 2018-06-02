package Entities;

import Enums.DeductionType;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/24/2018
 * Created Time -  12:17 AM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_lease")
public class LeaseMobile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mobile_id")
    private MobilePhone mobilePhone;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "guarantee_1")
    private Guarantees guarantee1;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "guarantee_2")
    private Guarantees guarantee2;

    @Column(name = "down_payment")
    private double downPayment;

    @Column(name = "remain_balance")
    private double remainBalance;

    @Column(name = "deduction_type")
    @Enumerated
    private DeductionType deductionType;

    @Column(name = "interest_rate")
    private double interestRate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Guarantees getGuarantee1() {
        return guarantee1;
    }

    public void setGuarantee1(Guarantees guarantee1) {
        this.guarantee1 = guarantee1;
    }

    public Guarantees getGuarantee2() {
        return guarantee2;
    }

    public void setGuarantee2(Guarantees guarantee2) {
        this.guarantee2 = guarantee2;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getRemainBalance() {
        return remainBalance;
    }

    public void setRemainBalance(double remainBalance) {
        this.remainBalance = remainBalance;
    }

    public DeductionType getDeductionType() {
        return deductionType;
    }

    public void setDeductionType(DeductionType deductionType) {
        this.deductionType = deductionType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
