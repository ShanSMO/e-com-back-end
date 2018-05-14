package WebService;

import Dtos.DeviceDto;
import ResponseObjects.ResponseObject;
import ServiceResponses.ServiceResponse;
import Services.DeviceService;
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
@RequestMapping(value = "device")
public class DeviceController {

    ResponseObject responseObject;

    @Autowired
    DeviceService deviceService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public ServiceResponse addDevice(@RequestBody DeviceDto deviceDto) {
        return deviceService.addDevice(deviceDto);
    }
}
