package ServiceImpl;

import Repositories.PageSizeRepository;
import ServiceResponses.ServiceResponse;
import Services.PageSizeService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/20/2018
 * Created Time -  10:33 AM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */
@Service
public class PageSizeServiceImpl implements PageSizeService{

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Autowired
    PageSizeRepository pageSizeRepository;

    @Override
    public ServiceResponse loadAll() {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setStatus(true);
            serviceResponse.setObjects(pageSizeRepository.findAll());
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }
}
