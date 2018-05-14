package Services;

import Dtos.UserDto;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/14/2018
 * Created Time -  6:50 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface UserService {

    void createUser(UserDto userDto);
    ServiceResponse userLogin (UserDto userDto);
}
