package Dtos;


import Enums.BrandType;

import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  7:43 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class BrandDto {

    private long id;
    private String brandName;
    private Set<MobilePhoneDto> mobilePhoneDtos;
    private Set<ModelDto> modelDtos;
    private BrandType brandType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public Set<MobilePhoneDto> getMobilePhoneDtos() {
        return mobilePhoneDtos;
    }

    public void setMobilePhoneDtos(Set<MobilePhoneDto> mobilePhoneDtos) {
        this.mobilePhoneDtos = mobilePhoneDtos;
    }

    public Set<ModelDto> getModelDtos() {
        return modelDtos;
    }

    public void setModelDtos(Set<ModelDto> modelDtos) {
        this.modelDtos = modelDtos;
    }

    public BrandType getBrandType() {
        return brandType;
    }

    public void setBrandType(BrandType brandType) {
        this.brandType = brandType;
    }
}
