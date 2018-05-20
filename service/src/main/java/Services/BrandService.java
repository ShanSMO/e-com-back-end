package Services;

import Dtos.BrandDto;
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

    ServiceResponse create(BrandDto brandDto);
    ServiceResponse update(BrandDto brandDto);
    ServiceResponse loadAll();
    ServiceResponse loadById(BrandDto brandDto);
    ServiceResponse remove(BrandDto brandDto);
    ServiceResponse changeStatus(BrandDto brandDto);
}
