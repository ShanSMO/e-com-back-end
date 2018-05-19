package ServiceImpl;

import Entities.Model;
import Repositories.ModelRepository;
import ServiceResponses.ServiceResponse;
import Services.ModelService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:17 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class ModelServiceImpl implements ModelService{

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Autowired
    ModelRepository modelRepository;


    @Override
    public ServiceResponse create(Model model) {
        return null;
    }

    @Override
    public ServiceResponse update(Model model) {
        return null;
    }

    @Override
    public ServiceResponse loadAll() {
        return null;
    }

    @Override
    public ServiceResponse loadAllForBrand(Model model) {
        return null;
    }

    @Override
    public ServiceResponse remove(Model model) {
        return null;
    }

    @Override
    public ServiceResponse changeStatus(Model model) {
        return null;
    }
}
