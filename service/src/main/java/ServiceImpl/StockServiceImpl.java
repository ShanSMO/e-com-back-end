package ServiceImpl;

import Enums.AvailableStatus;
import Repositories.MobilePhoneRepository;
import ServiceResponses.ServiceResponse;
import Services.StockService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/29/2018
 * Created Time -  8:06 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Autowired
    MobilePhoneRepository mobilePhoneRepository;

    @Override
    public ServiceResponse loadAvailableMobileInStock() {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setStatus(true);
            serviceResponse.setObjects(mobilePhoneRepository.findMobilePhoneByAvailableStatus(AvailableStatus.AVAILABLE));
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAvailableMobileInStockCount() {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setStatus(true);
            HashMap<String, Integer> availableCount = new HashMap<>();
            availableCount.put("count", mobilePhoneRepository.countAllByAvailableStatus(AvailableStatus.AVAILABLE));
            serviceResponse.setObject(availableCount);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAvailablePhonePartsInStock() {
        return null;
    }

    @Override
    public ServiceResponse loadAvailableAccessoriesInStock() {
        return null;
    }
}
