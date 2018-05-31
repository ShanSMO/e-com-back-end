package Dtos;

import java.util.Date;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/25/2018
 * Created Time -  10:40 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class SalesMobilePhoneDto {

    private long id;
    private MobilePhoneDto mobilePhoneDto;
    private CustomerDto customerDto;
    private double sellingPrice;
    private double discount;
    private Date date;
    private UserDto userDto;
    private String brand;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MobilePhoneDto getMobilePhoneDto() {
        return mobilePhoneDto;
    }

    public void setMobilePhoneDto(MobilePhoneDto mobilePhoneDto) {
        this.mobilePhoneDto = mobilePhoneDto;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
