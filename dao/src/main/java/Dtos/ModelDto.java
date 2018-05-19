package Dtos;

import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  7:44 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class ModelDto {

    private long id;
    private String modelId;
    private Set<MobilePhoneDto> mobilePhoneDtos;
    private BrandDto brandDto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Set<MobilePhoneDto> getMobilePhoneDtos() {
        return mobilePhoneDtos;
    }

    public void setMobilePhoneDtos(Set<MobilePhoneDto> mobilePhoneDtos) {
        this.mobilePhoneDtos = mobilePhoneDtos;
    }

    public BrandDto getBrandDto() {
        return brandDto;
    }

    public void setBrandDto(BrandDto brandDto) {
        this.brandDto = brandDto;
    }
}
