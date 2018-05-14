package WebService;

import Entities.BusinessOwner;
import Entities.User;
import ResponseObjects.ResponseObject;
import ServiceResponses.ServiceResponse;
import Services.BusinessOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/28/2018
 * Created Time -  10:18 PM
 * Project Name - core
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "business-owner")
@CrossOrigin("*")
public class BusinessOwnerRestController {

    @Autowired
    BusinessOwnerService businessOwnerService;

    @RequestMapping(value = "create",method = RequestMethod.POST)
    public ResponseObject createBusinessOwner(@RequestBody BusinessOwner businessOwner){
        ResponseObject responseObject = new ResponseObject();
        businessOwnerService.createBusinessOwner(businessOwner);
        responseObject.setMessage("OK");
        return responseObject;
    }

    @RequestMapping(value="/create-user-profile",method = RequestMethod.POST)
    @ResponseBody
    public ServiceResponse createUserProfile(@RequestBody BusinessOwner businessOwner){
        return businessOwnerService.createBusinessOwner(businessOwner);
    }

    @RequestMapping(value = "/load-by-user-name", method = RequestMethod.POST)
    @ResponseBody
    public ServiceResponse loadUserByUserName(@RequestBody BusinessOwner businessOwner){
        return businessOwnerService.loadByUserName(businessOwner);
    }
}
