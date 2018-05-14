package Services;

import Dtos.UserDto;
import Entities.BusinessOwner;
import Entities.User;
import ServiceResponses.ServiceResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/18/2018
 * Created Time -  11:23 AM
 * Project Name - core
 * Package Name - Services
 */

@Transactional
public interface UserService {

    ServiceResponse createUser(User user);
    ServiceResponse loadAllUsers(Pageable pageable);
    User loadUserByEmail(User user);
    UserDto loadUserById(User user);
    boolean updateUser(User user);
    ServiceResponse userLogin(User user);
    ServiceResponse userForgotPassword(User user);
    ServiceResponse userVerify(User user);


}
