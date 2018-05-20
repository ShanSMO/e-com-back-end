package ServiceImpl;

import Dtos.BrandDto;
import Entities.Brand;
import Repositories.BrandRepository;
import ServiceResponses.ServiceResponse;
import Services.BrandService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:14 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Autowired
    BrandRepository brandRepository;

    @Override
    public ServiceResponse create(BrandDto brandDto) {
        return null;
    }

    @Override
    public ServiceResponse update(BrandDto brandDto) {
        return null;
    }

    @Override
    public ServiceResponse loadAll() {
        ServiceResponse serviceResponse = new ServiceResponse();
        serviceResponse.setObjects(brandRepository.findAll());
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadById(BrandDto brandDto) {
        return null;
    }

    @Override
    public ServiceResponse remove(BrandDto brandDto) {
        return null;
    }

    @Override
    public ServiceResponse changeStatus(BrandDto brandDto) {
        return null;
    }
}
