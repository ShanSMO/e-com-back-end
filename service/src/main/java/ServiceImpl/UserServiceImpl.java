package ServiceImpl;

import Dtos.UserDto;
import Entities.User;
import Repositories.UserRepository;
import ServiceResponses.ServiceResponse;
import Services.UserService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/14/2018
 * Created Time -  6:51 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public void createUser(UserDto userDto) {

    }

    @Override
    public ServiceResponse userLogin(UserDto userDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        User user = userRepository.findByUserName(userDto.getUserName());
        if (user != null) {
            if (user.getPassword().equals(userDto.getPassword())) {
                serviceResponse.setStatus(true);
            } else {
                serviceResponse.setStatus(false);
            }
        } else {
            serviceResponse.setStatus(false);
        }

        return serviceResponse;
    }
}
