package WebService;

import Dtos.BrandDto;
import ServiceResponses.ServiceResponse;
import Services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:26 PM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */
@RestController
@RequestMapping(value = "brand")
@CrossOrigin("*")
public class BrandController {

    @Autowired
    BrandService brandService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ServiceResponse create(@RequestBody BrandDto brandDto) {
        return brandService.create(brandDto);
    }

    @RequestMapping(value = "load-all", method = RequestMethod.GET)
    public ServiceResponse loadAll() {
        return brandService.loadAll();
    }
}
