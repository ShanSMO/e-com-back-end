package Services;

import Entities.Brand;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:13 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface BrandService {

    ServiceResponse create(Brand brand);
    ServiceResponse update(Brand brand);
    ServiceResponse loadAll();
    ServiceResponse loadById(Brand brand);
    ServiceResponse remove(Brand brand);
    ServiceResponse changeStatus(Brand brand);
}
