package Entities;

import Enums.PrintType;
import Enums.PrintingMedium;
import Enums.PrintingSides;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/23/2018
 * Created Time -  6:24 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_sales_photocopy")
public class SalesPhotocopy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "type")
    private PrintType printType;

    @ManyToOne
    @JoinColumn(name = "page_size")
    private PageSize pageSize;

    @Column(name = "qty")
    private int qty;

    @Column(name = "side")
    private PrintingSides printingSides;

    @Column(name = "medium")
    private PrintingMedium printingMedium;

    @Column(name = "selling_date")
    private Date date;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "total")
    private double total;

    @Column(name = "has_discount")
    private boolean hasDiscount;

    @Column(name = "discount")
    private double discount;

    @Column(name = "bulk_id")
    private String bulkId;

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

    public PrintType getPrintType() {
        return printType;
    }

    public void setPrintType(PrintType printType) {
        this.printType = printType;
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
