package WebService;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  6/4/2018
 * Created Time -  5:52 AM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */

import ServiceResponses.ServiceResponse;
import Services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "report")
@CrossOrigin("*")
public class ReportController {

    @Autowired
    ReportService reportSetvice;

    @RequestMapping(value = "mobile-sales", method = RequestMethod.POST)
    public ServiceResponse mobileSalesReport() {
        return null;
    }

    @RequestMapping(value = "photo-copy", method = RequestMethod.POST)
    public ServiceResponse photocopySalesReport() {
        return null;
    }

    @RequestMapping(value = "accessories", method = RequestMethod.POST)
    public ServiceResponse accossories() {
        return null;
    }

    @RequestMapping(value = "recharge-cards", method = RequestMethod.POST)
    public ServiceResponse rechargeCards() {
        return null;
    }
}
