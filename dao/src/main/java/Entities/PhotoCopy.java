package Entities;

import Enums.PrintingMedium;
import Enums.PrintingSides;

import javax.persistence.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  7:35 PM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_photo_copy")
public class PhotoCopy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "page_size")
    private PageSize pageSize;

    @Column(name = "unit_price")
    private double unitPirce;

    @Column(name = "printing_side")
    private PrintingSides printingSide = PrintingSides.SINGLE_SIDE;

    @Column(name = "printing_medium")
    private PrintingMedium printingMedium = PrintingMedium.BLACK_AND_WHITE;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;


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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
