package Dtos;

import Enums.AvailableStatus;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  10:05 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class MobilePhoneDto {

    private long id;
    private String barcode;
    private BrandDto brandDto;
    private ModelDto modelDto;
    private String imei;
    private double buyingPrice;
    private double sellingPrice;
    private double profitMargin;
    private double discount;
    private CategoryDto categoryDto;
    private LeaseMobileDto leaseMobileDto;
    private SalesMobilePhoneDto salesMobilePhoneDto;
    private AvailableStatus availableStatus = AvailableStatus.AVAILABLE;

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

    public ModelDto getModelDto() {
        return modelDto;
    }

    public void setModelDto(ModelDto modelDto) {
        this.modelDto = modelDto;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(double profitMargin) {
        this.profitMargin = profitMargin;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public LeaseMobileDto getLeaseMobileDto() {
        return leaseMobileDto;
    }

    public void setLeaseMobileDto(LeaseMobileDto leaseMobileDto) {
        this.leaseMobileDto = leaseMobileDto;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public SalesMobilePhoneDto getSalesMobilePhoneDto() {
        return salesMobilePhoneDto;
    }

    public void setSalesMobilePhoneDto(SalesMobilePhoneDto salesMobilePhoneDto) {
        this.salesMobilePhoneDto = salesMobilePhoneDto;
    }

    public AvailableStatus getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(AvailableStatus availableStatus) {
        this.availableStatus = availableStatus;
    }
}
