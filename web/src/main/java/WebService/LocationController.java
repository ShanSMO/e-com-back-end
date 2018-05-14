package WebService;

import Dtos.LocationDto;
import Entities.Location;
import ServiceResponses.ServiceResponse;
import Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/14/2018
 * Created Time -  6:53 PM
 * Project Name - core
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "location")
public class LocationController {

    @Autowired
    LocationService locationService;

    @RequestMapping(value = "/set-current-location", method = RequestMethod.POST)
    public void setCurrentLocation(@RequestBody LocationDto location) {
        locationService.setCurrentLocation(location);
    }

    @RequestMapping(value = "/get-current-location", method = RequestMethod.POST)
    @ResponseBody
    public ServiceResponse getCurrentLocation(@RequestBody LocationDto location) {
        return locationService.getCurrentLocation(location);
    }

    @RequestMapping(value = "/update-location", method = RequestMethod.POST)
    public void updateLocation(@RequestBody LocationDto location) {
        locationService.updateCurrentLocation(location);
    }


}
