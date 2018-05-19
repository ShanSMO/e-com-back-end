package Dtos;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  10:05 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class MobilePhoneDto {

    private long id;
    private BrandDto brandDto;
    private ModelDto modelDto;
    private String imei;
    private double buyingPrice;
    private double sellingPrice;
    private double profitMargin;
    private double discount;
    private CategoryDto categoryDto;

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
}
