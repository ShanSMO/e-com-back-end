package Services;

import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/29/2018
 * Created Time -  8:06 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface StockService {

    ServiceResponse loadAvailableMobileInStock();
    ServiceResponse loadAvailableMobileInStockCount();
    ServiceResponse loadAvailablePhonePartsInStock();
    ServiceResponse loadAvailableAccessoriesInStock();
}
