package ServiceImpl;

import Dtos.PhotoCopyDto;
import Entities.PhotoCopy;
import Repositories.PhotoCopyRepository;
import ServiceResponses.ServiceResponse;
import Services.PhotoCopyService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/20/2018
 * Created Time -  8:04 AM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */
@Service
public class PhotoCopyServiceImpl implements PhotoCopyService{

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Autowired
    PhotoCopyRepository photoCopyRepository;

    @Override
    public ServiceResponse create(PhotoCopyDto photoCopyDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            photoCopyRepository.saveAndFlush(dozerBeanMapper.map(photoCopyDto, PhotoCopy.class, "PHOTO_COPY"));
            serviceResponse.setStatus(true);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAll() {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setStatus(true);
            serviceResponse.setObjects(photoCopyRepository.findAll());
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }
}
