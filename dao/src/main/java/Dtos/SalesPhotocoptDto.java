package Dtos;

import Enums.PrintType;
import Enums.PrintingMedium;
import Enums.PrintingSides;

import java.util.Date;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/24/2018
 * Created Time -  4:39 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class SalesPhotocoptDto {

    private long id;
    private PrintType printType;
    private PageSizeDto pageSizeDto;
    private int qty;
    private PrintingSides printingSides;
    private PrintingMedium printingMedium;
    private Date date;
    private double unitPrice;
    private double total;
    private boolean hasDiscount;
    private double discount;
    private String bulkId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PrintType getPrintType() {
        return printType;
    }

    public void setPrintType(PrintType printType) {
        this.printType = printType;
    }

    public PageSizeDto getPageSizeDto() {
        return pageSizeDto;
    }

    public void setPageSizeDto(PageSizeDto pageSizeDto) {
        this.pageSizeDto = pageSizeDto;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public PrintingSides getPrintingSides() {
        return printingSides;
    }

    public void setPrintingSides(PrintingSides printingSides) {
        this.printingSides = printingSides;
    }

    public PrintingMedium getPrintingMedium() {
        return printingMedium;
    }

    public void setPrintingMedium(PrintingMedium printingMedium) {
        this.printingMedium = printingMedium;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }
}
