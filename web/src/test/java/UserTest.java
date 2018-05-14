import Configuration.RootConfiguration;
import Entities.User;
import WebService.UserRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/18/2018
 * Created Time -  11:30 AM
 * Project Name - core
 * Package Name - PACKAGE_NAME
 */
@ContextConfiguration(classes = {RootConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {


    @Test
    public void createUser(){
        User user = new User();


        UserRestController userRest = new UserRestController();
        userRest.createUser(user);
    }
}
