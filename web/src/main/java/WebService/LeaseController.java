package WebService;

import Dtos.LeaseMobileDto;
import ServiceResponses.ServiceResponse;
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

    @RequestMapping(value = "phone", method = RequestMethod.POST)
    public ServiceResponse leaseMobile(@RequestBody LeaseMobileDto leaseMobileDto) {
        return null;
    }
}
