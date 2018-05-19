package ServiceImpl;

import Dtos.MobilePhoneDto;
import Repositories.MobilePhoneRepository;
import ServiceResponses.ServiceResponse;
import Services.MobilePhoneService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:10 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */
@Service
public class MobilePhoneServiceImpl implements MobilePhoneService{

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Autowired
    MobilePhoneRepository mobilePhoneRepository;


    @Override
    public ServiceResponse create(MobilePhoneDto mobilePhoneDto) {
        return null;
    }

    @Override
    public ServiceResponse update(MobilePhoneDto mobilePhoneDto) {
        return null;
    }

    @Override
    public ServiceResponse loadById(MobilePhoneDto mobilePhoneDto) {
        return null;
    }

    @Override
    public ServiceResponse loadAll() {
        return null;
    }

    @Override
    public ServiceResponse changeStatus() {
        return null;
    }

    @Override
    public ServiceResponse remove(MobilePhoneDto mobilePhoneDto) {
        return null;
    }
}
