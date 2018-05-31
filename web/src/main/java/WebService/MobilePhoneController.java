package WebService;

import Dtos.MobilePhoneDto;
import Entities.MobilePhone;
import ServiceResponses.ServiceResponse;
import Services.MobilePhoneService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  10:17 PM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "mobile-phone")
@CrossOrigin("*")
public class MobilePhoneController {

    @Autowired
    MobilePhoneService mobilePhoneService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ServiceResponse create(@RequestBody MobilePhoneDto mobilePhoneDto) {
        return mobilePhoneService.create(mobilePhoneDto);
    }

    @RequestMapping(value = "load-all-group", method = RequestMethod.POST)
    public ServiceResponse loadAllAsGroups() {
        return mobilePhoneService.loadAllAsGroups();
    }

    @RequestMapping(value = "load-all", method = RequestMethod.GET)
    public ServiceResponse loadAll() {
        return mobilePhoneService.loadAll();
    }

    @RequestMapping(value = "load-all-available", method = RequestMethod.GET)
    public ServiceResponse loadAllAvailable() {
        return mobilePhoneService.loadAllInStock();
    }

    @RequestMapping(value = "load-by-barcode")
    public ServiceResponse loadByBarcode(@RequestBody MobilePhoneDto mobilePhoneDto) {
        return mobilePhoneService.loadByBarcode(mobilePhoneDto);
    }
}
