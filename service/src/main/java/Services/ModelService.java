package Services;

import Entities.Model;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:16 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface ModelService {

    ServiceResponse create(Model model);
    ServiceResponse update(Model model);
    ServiceResponse loadAll();
    ServiceResponse loadAllForBrand(Model model);
    ServiceResponse remove(Model model);
    ServiceResponse changeStatus(Model model);
}
