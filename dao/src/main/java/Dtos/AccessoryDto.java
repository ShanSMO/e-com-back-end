package Dtos;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/24/2018
 * Created Time -  4:38 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class AccessoryDto {

    private long id;
    private BrandDto brandDto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BrandDto getBrandDto() {
        return brandDto;
    }

    public void setBrandDto(BrandDto brandDto) {
        this.brandDto = brandDto;
    }
}
