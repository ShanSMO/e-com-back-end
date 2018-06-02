package Services;

import Dtos.LeaseMobileDto;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/31/2018
 * Created Time -  10:11 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface LeaseService {

    ServiceResponse leaseMobile(LeaseMobileDto leaseMobileDto);
}
