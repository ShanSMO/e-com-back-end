package Services;

import Dtos.ModelDto;
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

    ServiceResponse create(ModelDto modelDto);
    ServiceResponse update(ModelDto modelDto);
    ServiceResponse loadAll();
    ServiceResponse loadAllForBrand(ModelDto modelDto);
    ServiceResponse remove(ModelDto modelDto);
    ServiceResponse changeStatus(ModelDto modelDto);
}
