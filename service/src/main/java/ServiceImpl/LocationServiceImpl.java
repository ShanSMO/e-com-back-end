package ServiceImpl;

import Dtos.LocationDto;
import Entities.Location;
import Repositories.LocationRepository;
import ServiceResponses.ServiceResponse;
import Services.LocationService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/21/2018
 * Created Time -  1:28 PM
 * Project Name - core
 * Package Name - ServiceImpl
 */

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public void setCurrentLocation(LocationDto location) {
        locationRepository.saveAndFlush(dozerBeanMapper.map(location, Location.class));
    }

    @Override
    public ServiceResponse getCurrentLocation(LocationDto location) {
        ServiceResponse serviceResponse = new ServiceResponse();
        serviceResponse.setObject(dozerBeanMapper.map(locationRepository.findOne(location.getId()), Location.class));
        return serviceResponse;
    }

    @Override
    public void updateCurrentLocation(LocationDto location) {

    }
}
