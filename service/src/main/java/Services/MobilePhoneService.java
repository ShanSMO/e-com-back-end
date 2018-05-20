package Services;

import Dtos.MobilePhoneDto;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:09 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface MobilePhoneService {

    ServiceResponse create(MobilePhoneDto mobilePhoneDto);
    ServiceResponse update(MobilePhoneDto mobilePhoneDto);
    ServiceResponse loadById(MobilePhoneDto mobilePhoneDto);
    ServiceResponse loadAll();
    ServiceResponse loadAllAsGroups();
    ServiceResponse changeStatus();
    ServiceResponse remove(MobilePhoneDto mobilePhoneDto);
}
