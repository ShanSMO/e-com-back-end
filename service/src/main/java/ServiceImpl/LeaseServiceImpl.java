package ServiceImpl;

import Dtos.LeaseMobileDto;
import Entities.LeaseMobile;
import Enums.AvailableStatus;
import Repositories.LeaseMobileRepository;
import Repositories.MobilePhoneRepository;
import ServiceResponses.ServiceResponse;
import Services.LeaseService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/31/2018
 * Created Time -  10:11 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class LeaseServiceImpl implements LeaseService {

    @Autowired
    LeaseMobileRepository leaseMobileRepository;

    @Autowired
    MobilePhoneRepository mobilePhoneRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public ServiceResponse leaseMobile(LeaseMobileDto leaseMobileDto) {

        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            leaseMobileRepository.saveAndFlush(dozerBeanMapper.map(leaseMobileDto, LeaseMobile.class, "LEASE_MOBILE_MAP"));
            mobilePhoneRepository.updateStatus(AvailableStatus.NOT_AVAILABLE, leaseMobileDto.getMobilePhone().getId());
            serviceResponse.setStatus(true);
        } catch (Exception ex) {
            serviceResponse.setStatus(false);
            System.out.println(ex.getMessage());
        }
        return serviceResponse;
    }
}
