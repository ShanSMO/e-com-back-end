package WebService;

import Entities.Supplier;
import ResponseObjects.ResponseObject;
import Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  12:22 AM
 * Project Name - core
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "supplier")
public class SupplierRestController {

    @Autowired
    SupplierService supplierService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseObject createSupplier(@RequestBody Supplier supplier){
        ResponseObject responseObject = new ResponseObject();
        supplierService.createSupplier(supplier);
        return responseObject;
    }
}
