package Services;

import Dtos.DeviceDto;
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
public interface DeviceService {

    public ServiceResponse addDevice(DeviceDto deviceDto);
}
