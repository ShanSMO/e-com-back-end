package Dtos;

import Entities.PageSize;
import Enums.PrintType;
import Enums.PrintingMedium;
import Enums.PrintingSides;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  7:46 AM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class PhotoCopyDto {

    private long id;
    private PageSize pageSize;
    private CategoryDto categoryDto;
    private PrintType printType;
    private double singleSideColorPrice;
    private double singleSideBlackPrice;
    private double doubleSideColorPrice;
    private double doubleSideBlackPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PageSize getPageSize() {
        return pageSize;
    }

    public void setPageSize(PageSize pageSize) {
        this.pageSize = pageSize;
    }

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public PrintType getPrintType() {
        return printType;
    }

    public void setPrintType(PrintType printType) {
        this.printType = printType;
    }

    public double getSingleSideColorPrice() {
        return singleSideColorPrice;
    }

    public void setSingleSideColorPrice(double singleSideColorPrice) {
        this.singleSideColorPrice = singleSideColorPrice;
    }

    public double getSingleSideBlackPrice() {
        return singleSideBlackPrice;
    }

    public void setSingleSideBlackPrice(double singleSideBlackPrice) {
        this.singleSideBlackPrice = singleSideBlackPrice;
    }

    public double getDoubleSideColorPrice() {
        return doubleSideColorPrice;
    }

    public void setDoubleSideColorPrice(double doubleSideColorPrice) {
        this.doubleSideColorPrice = doubleSideColorPrice;
    }

    public double getDoubleSideBlackPrice() {
        return doubleSideBlackPrice;
    }

    public void setDoubleSideBlackPrice(double doubleSideBlackPrice) {
        this.doubleSideBlackPrice = doubleSideBlackPrice;
    }
}
