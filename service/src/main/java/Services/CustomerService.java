package Services;

import Dtos.CustomerDto;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/31/2018
 * Created Time -  8:44 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface CustomerService {

    ServiceResponse create(CustomerDto customerDto);
}
