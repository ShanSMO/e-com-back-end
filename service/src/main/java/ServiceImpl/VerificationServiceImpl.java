package ServiceImpl;

import Services.VerificationService;
import org.junit.Test;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/4/2018
 * Created Time -  7:40 PM
 * Project Name - core
 * Package Name - ServiceImpl
 */

@Service
public class VerificationServiceImpl implements VerificationService {

    @Override
    public String generateVerificationCode() {
        Long currentTimeInMillis = System.currentTimeMillis();
        String currentTimeInString = Long.toString(currentTimeInMillis);
        String tdString = currentTimeInString.substring(currentTimeInString.length() - 6 , currentTimeInString.length());
        return tdString;
    }
}
