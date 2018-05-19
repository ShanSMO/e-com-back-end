package WebService;

import Dtos.ProductDto;
import ServiceResponses.ServiceResponse;
import Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  9:25 PM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "load-all", method = RequestMethod.POST)
    public ServiceResponse loadAllProducts() {
        return productService.loadAllProducts();
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ServiceResponse createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }
}
