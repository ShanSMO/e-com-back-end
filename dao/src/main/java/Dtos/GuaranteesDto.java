package Dtos;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/31/2018
 * Created Time -  10:00 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class GuaranteesDto {

    private long id;
    private String fullName;
    private String phone;
    private String nic;
    private AddressDto addressDto;
    private LeaseMobileDto leaseMobileDto;
    private LeaseMobileDto leaseMobile2Dto;

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

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public LeaseMobileDto getLeaseMobileDto() {
        return leaseMobileDto;
    }

    public void setLeaseMobileDto(LeaseMobileDto leaseMobileDto) {
        this.leaseMobileDto = leaseMobileDto;
    }

    public LeaseMobileDto getLeaseMobile2Dto() {
        return leaseMobile2Dto;
    }

    public void setLeaseMobile2Dto(LeaseMobileDto leaseMobile2Dto) {
        this.leaseMobile2Dto = leaseMobile2Dto;
    }
}
