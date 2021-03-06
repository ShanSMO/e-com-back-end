package WebService;

import Dtos.PhotoCopyDto;
import ServiceResponses.ServiceResponse;
import Services.PhotoCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/18/2018
 * Created Time -  10:18 PM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */
@RestController
@RequestMapping(value = "photo-copy")
@CrossOrigin("*")
public class PhotoCopyController {

    @Autowired
    PhotoCopyService photoCopyService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ServiceResponse create(@RequestBody PhotoCopyDto photoCopyDto) {
        return photoCopyService.create(photoCopyDto);
    }

    @RequestMapping(value = "load-all", method = RequestMethod.GET)
    public ServiceResponse loadSavedAll() {
        return photoCopyService.loadAll();
    }
}
