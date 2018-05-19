package Services;

import Dtos.CategoryDto;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  9:25 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface CategoryService {

    ServiceResponse createCategory(CategoryDto categoryDto);
    ServiceResponse updateCategory(CategoryDto categoryDto);
    ServiceResponse disableCategory(CategoryDto categoryDto);
    ServiceResponse loadAllCategories();
}
