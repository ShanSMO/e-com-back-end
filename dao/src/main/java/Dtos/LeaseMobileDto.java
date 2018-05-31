package Dtos;

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
}
