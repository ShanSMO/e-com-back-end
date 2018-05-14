package WebService;

import Dtos.UserDto;
import Entities.BusinessOwner;
import Entities.User;
import ResponseObjects.ResponseObject;
import ServiceResponses.ServiceResponse;
import Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/18/2018
 * Created Time -  11:20 AM
 * Project Name - core
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "user")
@CrossOrigin("*")
public class UserRestController {

    @Autowired
    @Qualifier(value = "userService")
    UserService userService;

    ServiceResponse responseObject;

    @RequestMapping(value = "/create",method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ServiceResponse createUser(@RequestBody User user){
        ServiceResponse serviceResponse = userService.createUser(user);
        if(serviceResponse.getStatus()){
            String verificationCode = ((User)responseObject.getObject()).getVerification();
            // TODO send email with the verification code
        }
        return serviceResponse;
    }

    @RequestMapping(value = "/load-all",method = RequestMethod.GET)
    @ResponseBody
    public ServiceResponse loadAll(Pageable pageable){
        return userService.loadAllUsers(pageable);
    }

    @RequestMapping(value = "/update-user",method = RequestMethod.POST)
    public boolean updateUser(@RequestBody User user){
        userService.updateUser(user);
        return true;
    }

    @RequestMapping(value = "/load-user-by-id/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public ServiceResponse loadUserById(@PathVariable("userId") String userId){
        User user = new User();
        user.setId(Integer.parseInt(userId));
        UserDto user1 = userService.loadUserById(user);
        responseObject.setObject(user1);
        return responseObject;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public ServiceResponse userLogin(@RequestBody User user){
        responseObject = userService.userLogin(user);
        return responseObject;
    }

    @RequestMapping(value = "/forgot",method = RequestMethod.POST)
    @ResponseBody
    public ServiceResponse userForgotPassword(@RequestBody User user){
        responseObject = userService.userForgotPassword(user);
        return responseObject;
    }


    @RequestMapping(value = "/verify",method = RequestMethod.POST)
    @ResponseBody
    public ServiceResponse userEmailVerify(@RequestBody User user){
        responseObject = userService.userVerify(user);
        return responseObject;
    }




}
