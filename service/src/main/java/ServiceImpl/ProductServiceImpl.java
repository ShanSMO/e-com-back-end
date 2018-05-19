package ServiceImpl;

import Dtos.ProductDto;
import Entities.Product;
import Repositories.ProductRepository;
import ServiceResponses.ServiceResponse;
import Services.ProductService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  9:26 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;


    @Override
    public ServiceResponse createProduct(ProductDto productDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try{
            productRepository.saveAndFlush(dozerBeanMapper.map(productDto, Product.class));
            serviceResponse.setStatus(true);
            serviceResponse.setMessage("Success");
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
            serviceResponse.setMessage("Error");
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse updateProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public ServiceResponse loadProduct(ProductDto productDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setStatus(true);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse loadAllProducts() {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            List<Product> products = productRepository.findAll();
            List<ProductDto> productDtos = new ArrayList<>();
            for (Product product: products) {
                productDtos.add(dozerBeanMapper.map(product, ProductDto.class, "PRODUCT_EXCLUDE_CAT"));
            }
            serviceResponse.setStatus(true);
            serviceResponse.setObjects(productDtos);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }
}
