package Configurations;

import Dtos.BusinessOwnerDto;
import Dtos.CompanyDto;
import Dtos.DeviceDto;
import Dtos.UserDto;
import Entities.BusinessOwner;
import Entities.Company;
import Entities.Device;
import Entities.User;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
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
                mapping(User.class,UserDto.class, TypeMappingOptions.oneWay(),mapId("USER_MAP"),mapNull(true))
                    .exclude("password").exclude("owner");

                mapping(Company.class, CompanyDto.class, TypeMappingOptions.oneWay(),mapId("COMPANY_MAP"),mapNull(true))
                    .exclude("user");

                mapping(Company.class, CompanyDto.class, TypeMappingOptions.oneWay(),mapId("COMPANY_MAP_NO_PASSWORD"),mapNull(true))
                    .exclude("user.password");

                mapping(Device.class,DeviceDto.class , TypeMappingOptions.oneWay(),mapId("DEVICE_EXCLUDE_COMPANY"),mapNull(true))
                    .exclude("company");

                mapping(BusinessOwner.class, BusinessOwnerDto.class , TypeMappingOptions.oneWay() , mapId("BO_MAP_NO_COMPANY") ,
                    mapNull(true))
                    .exclude("user")
                    .exclude("company");

                mapping(Device.class, DeviceDto.class , TypeMappingOptions.oneWay() , mapId("MAP_DEVICE_NO_LOCATION") ,
                    mapNull(true))
                    .exclude("locations");

            }
        };
    }
}

//.fields("company","company",useMapId("COMPANY_MAP"))
