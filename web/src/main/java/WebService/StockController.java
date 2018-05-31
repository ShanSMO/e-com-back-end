package WebService;

import ServiceResponses.ServiceResponse;
import Services.MobilePhoneService;
import Services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/29/2018
 * Created Time -  8:01 PM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "stock")
@CrossOrigin("*")
public class StockController {

    @Autowired
    StockService stockService;

    @RequestMapping(value = "in-stock-mobile", method = RequestMethod.POST)
    public ServiceResponse loadAvailableMobileInStock() {
        return stockService.loadAvailableMobileInStock();
    }

    @RequestMapping(value = "get-in-stock-mobile-count", method = RequestMethod.POST)
    public ServiceResponse loadAvailableMobileInStockCount() {
        return stockService.loadAvailableMobileInStockCount();
    }

    @RequestMapping(value = "in-stock-parts", method = RequestMethod.POST)
    public ServiceResponse loadAvailablePhonePartsInStock() {
        return stockService.loadAvailablePhonePartsInStock();
    }

    @RequestMapping(value = "in-stock-accessories", method = RequestMethod.POST)
    public ServiceResponse loadAvailableAccessoriesInStock() {
        return stockService.loadAvailableAccessoriesInStock();
    }
}
