package ServiceImpl;

import Dtos.MobilePhoneDto;
import Entities.MobilePhone;
import Enums.AvailableStatus;
import Repositories.MobilePhoneRepository;
import ServiceResponses.ServiceResponse;
import Services.MobilePhoneService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:10 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */
@Service
public class MobilePhoneServiceImpl implements MobilePhoneService{

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Autowired
    MobilePhoneRepository mobilePhoneRepository;


    @Override
    public ServiceResponse create(MobilePhoneDto mobilePhoneDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            mobilePhoneRepository.saveAndFlush(dozerBeanMapper.map(mobilePhoneDto, MobilePhone.class,"MOBILE_PHONE"));
            serviceResponse.setStatus(true);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse update(MobilePhoneDto mobilePhoneDto) {
        return null;
    }

    @Override
    public ServiceResponse updateAvailability(MobilePhoneDto mobilePhoneDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            mobilePhoneRepository.save(dozerBeanMapper.map(mobilePhoneDto, MobilePhone.class, "MOBILE_PHONE"));
            serviceResponse.setStatus(true);
        }catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadById(MobilePhoneDto mobilePhoneDto) {
        return null;
    }

    @Override
    public ServiceResponse loadAll() {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setStatus(true);
            serviceResponse.setObjects(mobilePhoneRepository.findAll());
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAllInStock() {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setObjects(mobilePhoneRepository.findMobilePhoneByAvailableStatus(AvailableStatus.AVAILABLE));
            serviceResponse.setStatus(true);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAllAsGroups() {
        return null;
    }

    @Override
    public ServiceResponse changeStatus() {
        return null;
    }

    @Override
    public ServiceResponse remove(MobilePhoneDto mobilePhoneDto) {
        return null;
    }

    @Override
    public ServiceResponse loadByBarcode(MobilePhoneDto mobilePhoneDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
            try {
                MobilePhone mobilePhone = mobilePhoneRepository.findMobilePhoneByBarcode(
                        dozerBeanMapper.map(mobilePhoneDto, MobilePhone.class).getBarcode());
                MobilePhoneDto mobilePhoneByBarcode = dozerBeanMapper.map(mobilePhone, MobilePhoneDto.class,
                        "MOBILE_PHONE_REV");
                serviceResponse.setObject(mobilePhoneByBarcode);
                serviceResponse.setStatus(true);
            } catch (Exception ignored) {
                serviceResponse.setStatus(false);
            }
        return serviceResponse;
    }
}
