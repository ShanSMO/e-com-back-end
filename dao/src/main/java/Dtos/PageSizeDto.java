package Dtos;

import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  11:26 AM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class PageSizeDto {

    private long id;
    private String sizeValue;
    private Set<PhotoCopyDto> photoCopyDtos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSizeValue() {
        return sizeValue;
    }

    public void setSizeValue(String sizeValue) {
        this.sizeValue = sizeValue;
    }

    public Set<PhotoCopyDto> getPhotoCopyDtos() {
        return photoCopyDtos;
    }

    public void setPhotoCopyDtos(Set<PhotoCopyDto> photoCopyDtos) {
        this.photoCopyDtos = photoCopyDtos;
    }
}
