package Entities;

import Enums.PrintType;
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
@Table(name = "tbl_photo_copy", uniqueConstraints = {@UniqueConstraint(columnNames = {"page_size"})})
public class PhotoCopy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "page_size")
    private PageSize pageSize;

    @Column(name = "single_side_color_price")
    private double singleSideColorPrice;

    @Column(name = "single_side_black_price")
    private double singleSideBlackPrice;

    @Column(name = "double_side_color_price")
    private double doubleSideColorPrice;

    @Column(name = "double_side_black_price")
    private double doubleSideBlackPrice;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @Column(name = "type")
    @Enumerated
    private PrintType printType = PrintType.PHOTO_COPY;


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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
