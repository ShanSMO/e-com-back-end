package Services;

import Entities.BusinessOwner;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/28/2018
 * Created Time -  10:20 PM
 * Project Name - core
 * Package Name - Services
 */

@Transactional
public interface BusinessOwnerService {

    public ServiceResponse createBusinessOwner(BusinessOwner businessOwner);
    public ServiceResponse loadByUserName(BusinessOwner businessOwner);
}
