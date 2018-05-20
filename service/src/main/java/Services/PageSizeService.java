package Services;

import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/20/2018
 * Created Time -  10:33 AM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface PageSizeService {

    ServiceResponse loadAll();
}
