package Services;

import Dtos.LocationDto;
import Entities.Location;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  1:14 PM
 * Project Name - core
 * Package Name - Services
 */

@Transactional
public interface LocationService {

    void setCurrentLocation(LocationDto location);
    ServiceResponse getCurrentLocation(LocationDto location);
    void updateCurrentLocation(LocationDto location);
}
