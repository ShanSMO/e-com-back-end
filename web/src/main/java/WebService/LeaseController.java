package WebService;

import Dtos.LeaseMobileDto;
import ServiceResponses.ServiceResponse;
import Services.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/31/2018
 * Created Time -  5:51 AM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "lease")
@CrossOrigin("*")
public class LeaseController {

    @Autowired
    LeaseService leaseService;

    @RequestMapping(value = "phone", method = RequestMethod.POST)
    public ServiceResponse leaseMobile(@RequestBody LeaseMobileDto leaseMobileDto) {
        return leaseService.leaseMobile(leaseMobileDto);
    }
}
