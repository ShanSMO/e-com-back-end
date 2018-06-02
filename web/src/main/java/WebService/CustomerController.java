package WebService;

import Dtos.CustomerDto;
import ServiceResponses.ServiceResponse;
import Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/31/2018
 * Created Time -  8:43 PM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ServiceResponse createCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.create(customerDto);
    }
}
