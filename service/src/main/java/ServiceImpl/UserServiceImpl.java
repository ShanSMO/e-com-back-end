package ServiceImpl;

import Dtos.UserDto;
import Entities.BusinessOwner;
import Entities.User;
import Repositories.UserRepository;
import ServiceResponses.ServiceResponse;
import Services.UserService;
import Services.VerificationService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/18/2018
 * Created Time -  11:24 AM
 * Project Name - core
 * Package Name - ServiceImpl
 */

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Autowired
    private VerificationService verificationService;

    public ServiceResponse createUser(User user) {
        ServiceResponse serviceResponse = new ServiceResponse();

        if(userRepository.findByUserNameAndUserType(user.getUserName(),user.getUserType()) != null){
            serviceResponse.setMessage("User Already Exists ");
            serviceResponse.setStatus(false);
        }
        else{
            user.setVerification(verificationService.generateVerificationCode());
            userRepository.saveAndFlush(user);
            serviceResponse.setMessage(" Successfully created ");
            serviceResponse.setStatus(true);
            serviceResponse.setObject(user);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAllUsers(Pageable pageable) {
        ServiceResponse serviceResponse = new ServiceResponse();
        Page<User> userList = userRepository.findAll(pageable);
        List<UserDto> convertedList = new ArrayList<>();

        if(userList != null && userList.getTotalPages() > 0){
            for(User user : userList){
                convertedList.add(dozerBeanMapper.map(user, UserDto.class,"USER_MAP"));
            }
        }
        serviceResponse.setObjects(convertedList);
        serviceResponse.setRecordCount((int) userRepository.count());

        return serviceResponse;
    }

    @Override
    public User loadUserByEmail(User user) {
        return null;
    }

    @Override
    public UserDto loadUserById(User user) {
        User user1 = userRepository.findOne(user.getId());
        return dozerBeanMapper.map(user1,UserDto.class,"USER_MAP");
    }

    @Override
    public boolean updateUser(User user) {
        userRepository.save(user);
        return false;
    }

    @Override
    public ServiceResponse userLogin(User user) {

        ServiceResponse responseObject = new ServiceResponse();

        User loadedUser = userRepository.findByUserName(user.getUserName());

        if((loadedUser != null) && (loadedUser.getUserType().equals(user.getUserType()))){
            if(loadedUser.getPassword().equals(user.getPassword())){
                responseObject.setStatus(true);
                user.setPassword(null);
                responseObject.setObject(user);
                responseObject.setMessage("Login Success !");
            }
            else {
                responseObject.setStatus(false);
                responseObject.setMessage("Invalid Login Credentials !");
            }
        }
        else{
            responseObject.setStatus(false);
            responseObject.setMessage("User not found !");
        }

        return responseObject;
    }

    @Override
    public ServiceResponse userForgotPassword(User user) {

        // TODO generate a password reset token and save
        return null;
    }

    @Override
    public ServiceResponse userVerify(User user) {
        ServiceResponse serviceResponse = new ServiceResponse();
        if(user.getUserName() != null){
            User loadedUser = userRepository.findByUserName(user.getUserName());
            if(user.getVerification().equals(loadedUser.getVerification())){
                userRepository.updateVerificationStatus(user.getUserName());
                serviceResponse.setStatus(true);
                serviceResponse.setMessage("User Verification success");
            }
            else{
                serviceResponse.setStatus(false);
                serviceResponse.setMessage("User Verification Failed");
            }
        }
        else{
            serviceResponse.setStatus(false);
            serviceResponse.setMessage("User Not found");
        }
        return serviceResponse;
    }

}
