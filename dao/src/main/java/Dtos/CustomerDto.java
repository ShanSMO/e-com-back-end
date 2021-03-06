package Dtos;

import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/25/2018
 * Created Time -  10:52 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class CustomerDto {

    private long id;
    private String fullName;
    private String phone;
    private AddressDto addressDto;
    private List<LeaseMobileDto> leaseMobileDtos ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public List<LeaseMobileDto> getLeaseMobileDtos() {
        return leaseMobileDtos;
    }

    public void setLeaseMobileDtos(List<LeaseMobileDto> leaseMobileDtos) {
        this.leaseMobileDtos = leaseMobileDtos;
    }
}
