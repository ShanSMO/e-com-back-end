package Configurations;

import Dtos.CategoryDto;
import Dtos.ProductDto;
import Entities.Category;
import Entities.Product;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.DozerBuilder;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

            }
        };
    }
}

//.fields("company","company",useMapId("COMPANY_MAP"))
