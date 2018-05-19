package Dtos;

import Entities.PageSize;
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
    private double unitPirce;
    private PrintingSides printingSide = PrintingSides.SINGLE_SIDE;
    private PrintingMedium printingMedium = PrintingMedium.BLACK_AND_WHITE;
    private CategoryDto categoryDto;

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

    public double getUnitPirce() {
        return unitPirce;
    }

    public void setUnitPirce(double unitPirce) {
        this.unitPirce = unitPirce;
    }

    public PrintingSides getPrintingSide() {
        return printingSide;
    }

    public void setPrintingSide(PrintingSides printingSide) {
        this.printingSide = printingSide;
    }

    public PrintingMedium getPrintingMedium() {
        return printingMedium;
    }

    public void setPrintingMedium(PrintingMedium printingMedium) {
        this.printingMedium = printingMedium;
    }

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }
}
