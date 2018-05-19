package Dtos;

import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  9:22 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class CategoryDto {

    private long id;
    private String categoryName;
    private String code;
    private Set<ProductDto> product;
    private Set<MobilePhoneDto> mobilePhoneDtos;
    private Set<PhotoCopyDto> photoCopyDtos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<ProductDto> getProduct() {
        return product;
    }

    public void setProduct(Set<ProductDto> product) {
        this.product = product;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<MobilePhoneDto> getMobilePhoneDtos() {
        return mobilePhoneDtos;
    }

    public void setMobilePhoneDtos(Set<MobilePhoneDto> mobilePhoneDtos) {
        this.mobilePhoneDtos = mobilePhoneDtos;
    }

    public Set<PhotoCopyDto> getPhotoCopyDtos() {
        return photoCopyDtos;
    }

    public void setPhotoCopyDtos(Set<PhotoCopyDto> photoCopyDtos) {
        this.photoCopyDtos = photoCopyDtos;
    }
}
