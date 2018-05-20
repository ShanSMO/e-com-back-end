package ServiceImpl;

import Dtos.ModelDto;
import Entities.Model;
import Repositories.ModelRepository;
import ServiceResponses.ServiceResponse;
import Services.ModelService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public ServiceResponse create(ModelDto modelDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            modelRepository.saveAndFlush(dozerBeanMapper.map(modelDto, Model.class));
            serviceResponse.setStatus(true);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse update(ModelDto modelDto) {
        return null;
    }

    @Override
    public ServiceResponse loadAll() {
        ServiceResponse serviceResponse = new ServiceResponse();
        serviceResponse.setStatus(true);
        serviceResponse.setObjects(modelRepository.findAll());
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAllForBrand(ModelDto modelDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        List<Model> modelList =  modelRepository.findByBrand_Id(modelDto.getBrandDto().getId());
        serviceResponse.setObjects(modelList);
        return serviceResponse;
    }

    @Override
    public ServiceResponse remove(ModelDto modelDto) {
        return null;
    }

    @Override
    public ServiceResponse changeStatus(ModelDto modelDto) {
        return null;
    }
}
