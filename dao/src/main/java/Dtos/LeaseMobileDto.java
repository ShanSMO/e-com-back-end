package Dtos;

import Enums.DeductionType;

import java.util.Date;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/24/2018
 * Created Time -  3:39 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class LeaseMobileDto {

    private long id;
    private Date date;
    private CategoryDto category;
    private MobilePhoneDto mobilePhone;
    private CustomerDto customerDto;
    private GuaranteesDto guaranteesDto1;
    private GuaranteesDto guaranteesDto2;
    private double downPayment;
    private double remainBalance;
    private DeductionType deductionType;
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

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public MobilePhoneDto getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(MobilePhoneDto mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    public GuaranteesDto getGuaranteesDto1() {
        return guaranteesDto1;
    }

    public void setGuaranteesDto1(GuaranteesDto guaranteesDto1) {
        this.guaranteesDto1 = guaranteesDto1;
    }

    public GuaranteesDto getGuaranteesDto2() {
        return guaranteesDto2;
    }

    public void setGuaranteesDto2(GuaranteesDto guaranteesDto2) {
        this.guaranteesDto2 = guaranteesDto2;
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
