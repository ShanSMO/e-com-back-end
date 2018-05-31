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
    private String firstName;
    private String lastName;
    private AddressDto addressDto;
    private List<LeaseMobileDto> leaseMobileDtos ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
