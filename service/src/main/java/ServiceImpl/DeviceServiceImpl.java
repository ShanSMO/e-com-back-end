package ServiceImpl;

import Dtos.DeviceDto;
import Entities.Device;
import Repositories.DeviceRepository;
import ServiceResponses.ServiceResponse;
import Services.DeviceService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/17/2018
 * Created Time -  8:15 PM
 * Project Name - core
 * Package Name - ServiceImpl
 */

@Service
public class DeviceServiceImpl implements DeviceService{


    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public ServiceResponse addDevice(DeviceDto deviceDto) {
        Device device = dozerBeanMapper.map(deviceDto,Device.class);
        deviceRepository.saveAndFlush(device);
        ServiceResponse ServiceResponse = new ServiceResponse();
        ServiceResponse.setStatus(true);
        ServiceResponse.setObject(deviceDto);
        return ServiceResponse;
    }

}
