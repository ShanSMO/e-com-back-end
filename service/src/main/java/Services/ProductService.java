package Services;

import Dtos.ProductDto;
import Entities.Product;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  9:26 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional(noRollbackFor = Exception.class)
public interface ProductService {

    ServiceResponse createProduct(ProductDto productDto);
    ServiceResponse updateProduct(ProductDto productDto);
    ServiceResponse loadProduct(ProductDto productDto);
    ServiceResponse loadAllProducts();
}
