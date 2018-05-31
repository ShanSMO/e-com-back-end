package Configurations;

import Dtos.*;
import Entities.*;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.DozerBuilder;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOption;
import org.dozer.loader.api.FieldsMappingOptions;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.dozer.loader.api.FieldsMappingOptions.useMapId;
import static org.dozer.loader.api.TypeMappingOptions.mapId;
import static org.dozer.loader.api.TypeMappingOptions.mapNull;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  12:17 PM
 * Project Name - core
 * Package Name - Configurations
 */

@Configuration
public class DozerConfiguration{

    @Bean
    public DozerBeanMapper dozerBeanMapper(){
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.addMapping(dozerMappingBuilder());
        return dozerBeanMapper;
    }

    @Bean
    public BeanMappingBuilder dozerMappingBuilder(){
        return new BeanMappingBuilder() {
            @Override
            protected void configure() {
                mapping(Category.class, CategoryDto.class, mapId("CAT_EXCLUDE_PRODUCT"), mapNull()).exclude("product");
                mapping(Product.class, ProductDto.class, mapId("PRODUCT_EXCLUDE_CAT"), mapNull()).exclude("category");
                mapping(MobilePhoneDto.class, MobilePhone.class , mapId("MOBILE_PHONE"))
                        .fields("categoryDto","category")
                        .fields("brandDto","brand")
                        .fields("leaseMobileDto","leaseMobile")
                        .fields("SalesMobilePhoneDto","SalesMobilePhone")
                        .fields("modelDto","model" );
                mapping(MobilePhone.class, MobilePhoneDto.class , mapId("MOBILE_PHONE_REV"))
                        .fields("category","categoryDto")
                        .fields("brand","brandDto")
                        .fields("leaseMobile","leaseMobileDto")
                        .fields("SalesMobilePhone","SalesMobilePhoneDto")
                        .fields("model","modelDto" );
                mapping(PhotoCopyDto.class, PhotoCopy.class, mapId("PHOTO_COPY"))
                        .fields("categoryDto","category");
                mapping(SalesMobilePhoneDto.class,SalesMobilePhone.class, mapId("SALES_MOBILE_PHONE"))
                        .fields("userDto","user")
                        .fields("mobilePhoneDto","mobilePhone" ,useMapId("MOBILE_PHONE_REV"))
                        .fields("customerDto","customer");
                mapping(SalesPhotocoptDto.class,SalesPhotocopy.class, mapId("SALES_PHOTO_COPY"))
                        .fields("pageSizeDto","pageSize");
            }
        };
    }
}

