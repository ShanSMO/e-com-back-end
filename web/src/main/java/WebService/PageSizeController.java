package WebService;

import ServiceResponses.ServiceResponse;
import Services.PageSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/20/2018
 * Created Time -  10:32 AM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */
@RestController
@RequestMapping(value = "page-size")
@CrossOrigin("*")
public class PageSizeController {

    @Autowired
    PageSizeService pageSizeService;

    @RequestMapping(value = "load-all",  method = RequestMethod.GET)
    public ServiceResponse loadAll() {
        return pageSizeService.loadAll();
    }
}
