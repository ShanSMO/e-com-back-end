package WebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/14/2018
 * Created Time -  12:14 PM
 * Project Name - core
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "user-role")
public class UserRoleController {

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public void createUserRole() {

    }

    @RequestMapping(value = "/assign-role",method = RequestMethod.POST)
    public void assignUserRole() {

    }

    @RequestMapping(value = "/update-role",method = RequestMethod.POST)
    public void updateUserRole() {

    }

}
