package ServiceImpl;

import Dtos.BusinessOwnerDto;
import Entities.BusinessOwner;
import Entities.User;
import Repositories.BusinessOwnerRepository;
import Repositories.UserRepository;
import ServiceResponses.ServiceResponse;
import Services.BusinessOwnerService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/28/2018
 * Created Time -  10:21 PM
 * Project Name - core
 * Package Name - ServiceImpl
 */

@Service
public class BusinessOwnerServiceImpl implements BusinessOwnerService {

    @Autowired
    BusinessOwnerRepository businessOwnerRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;


    @Override
    public ServiceResponse createBusinessOwner(BusinessOwner businessOwner) {
        ServiceResponse serviceResponse = new ServiceResponse();
        User user = userRepository.findByUserName(businessOwner.getEmailAddress());

        if(user != null){
            businessOwner.setUser(user);
            if(businessOwnerRepository.findByUser(user) == null){
                try{
                    businessOwnerRepository.saveAndFlush(businessOwner);
                    serviceResponse.setStatus(true);
                    serviceResponse.setMessage(" Details Saved ");
                }
                catch (Exception e){
                    serviceResponse.setStatus(false);
                }
            }
            else{
                    businessOwnerRepository.updateBusinessOwner(businessOwner.getFirstName(),
                    businessOwner.getLastName(), businessOwner.getNicNumber() ,businessOwner.getMobileNumber(),
                    businessOwner.getFixedNumber(),businessOwner.getEmailAddress());
                    serviceResponse.setStatus(true);
                    serviceResponse.setMessage(" Details updated ");
            }
        }
        else {
            serviceResponse.setStatus(false);
            serviceResponse.setMessage("User Not Found ");
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadByUserName(BusinessOwner businessOwner) {
        ServiceResponse ServiceResponse = new ServiceResponse();
        BusinessOwner loadedBusinessOwner = businessOwnerRepository.findByEmailAddress(businessOwner.getEmailAddress());
        if(loadedBusinessOwner != null){
            ServiceResponse.setStatus(true);
            ServiceResponse.setObject(dozerBeanMapper.map(loadedBusinessOwner, BusinessOwnerDto.class, "BO_MAP_NO_COMPANY"));
        }
        else {
            ServiceResponse.setStatus(false);
            ServiceResponse.setObject(null);
        }
        return ServiceResponse;
    }
}
