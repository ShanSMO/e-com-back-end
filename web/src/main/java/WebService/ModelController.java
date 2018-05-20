package WebService;

import Dtos.ModelDto;
import ServiceResponses.ServiceResponse;
import Services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:26 PM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */
@RestController
@RequestMapping(value = "model")
@CrossOrigin("*")
public class ModelController {

    @Autowired
    ModelService modelService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ServiceResponse create(@RequestBody ModelDto modelDto) {
        return modelService.create(modelDto);
    }

    @RequestMapping(value = "load-all", method = RequestMethod.GET)
    public ServiceResponse loadAll() {
        return modelService.loadAll();
    }

    @RequestMapping(value = "load-by-brand", method = RequestMethod.POST)
    public ServiceResponse loadByBrand(@RequestBody ModelDto modelDto) {
        return modelService.loadAllForBrand(modelDto);
    }

}
