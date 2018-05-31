package ServiceImpl;

import Dtos.SalesMobilePhoneDto;
import Dtos.SalesPhotocoptDto;
import Dtos.SearchDto;
import Entities.*;
import Enums.AvailableStatus;
import Repositories.MobilePhoneRepository;
import Repositories.MobilePhoneSalesRepository;
import Repositories.PhotoCopySalesRepository;
import ServiceResponses.ServiceResponse;
import Services.SellingService;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/27/2018
 * Created Time -  8:43 AM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class SellingServiceImpl implements SellingService{

    @Autowired
    MobilePhoneSalesRepository mobilePhoneSalesRepository;

    @Autowired
    PhotoCopySalesRepository photoCopySalesRepository;

    @Autowired
    MobilePhoneRepository mobilePhoneRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public ServiceResponse mobilePhone(SalesMobilePhoneDto salesMobilePhoneDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            mobilePhoneSalesRepository.saveAndFlush(dozerBeanMapper.map(salesMobilePhoneDto, SalesMobilePhone.class ,
                    "SALES_MOBILE_PHONE"));

            MobilePhone mobilePhone = dozerBeanMapper.map(salesMobilePhoneDto, SalesMobilePhone.class ,
                    "SALES_MOBILE_PHONE").getMobilePhone();
            mobilePhone.setAvailableStatus(AvailableStatus.NOT_AVAILABLE);
            mobilePhoneRepository.save(mobilePhone);
            serviceResponse.setStatus(true);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse photoCopy(SalesPhotocoptDto salesPhotocoptDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            photoCopySalesRepository.saveAndFlush(dozerBeanMapper.map(salesPhotocoptDto, SalesPhotocopy.class,
                    "SALES_PHOTO_COPY"));
            serviceResponse.setStatus(true);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse photoCopyBulk(List<SalesPhotocoptDto> salesPhotocoptDtos) {
        ServiceResponse serviceResponse = new ServiceResponse();
        String bulkId = "PC-".concat(Long.toString(new Date().getTime()));
        try{
            for (SalesPhotocoptDto salesPhotocoptDto: salesPhotocoptDtos){
                salesPhotocoptDto.setBulkId(bulkId);
                photoCopySalesRepository.saveAndFlush(dozerBeanMapper.map(salesPhotocoptDto, SalesPhotocopy.class,
                        "SALES_PHOTO_COPY"));
            }
            serviceResponse.setStatus(true);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadMobile(SalesMobilePhoneDto salesMobilePhoneDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setStatus(true);
            serviceResponse.setObjects(mobilePhoneSalesRepository.findAll());
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }

        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAllCounts(SearchDto searchDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            HashMap<String, Object> resultObject = new HashMap<>();
            resultObject.put("MOBILE", mobilePhoneSalesRepository.loadCountGroup(searchDto.getStartDate(), searchDto.getEndDate()));
            resultObject.put("PHOTO_COPY_GROUP", photoCopySalesRepository.countGroup(searchDto.getStartDate(), searchDto.getEndDate()));
            serviceResponse.setStatus(true);
            serviceResponse.setObject(resultObject);
        } catch (Exception  ignored){
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadPhotocopySummaryForDate(SearchDto searchDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try{
            serviceResponse.setStatus(true);
            serviceResponse.setObjects(photoCopySalesRepository.countGroup(searchDto.getStartDate(), searchDto.getEndDate()));
        }catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }
}
