package ServiceImpl;

import Dtos.CategoryDto;
import Entities.Category;
import Repositories.CategoryRepository;
import ServiceResponses.ServiceResponse;
import Services.CategoryService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  9:26 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public ServiceResponse createCategory(CategoryDto categoryDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            categoryRepository.saveAndFlush(dozerBeanMapper.map(categoryDto, Category.class));
            serviceResponse.setStatus(true);
        } catch (Exception ignored){
            System.out.println("---------- ERROR - createCategory -----" + ignored.getMessage());
            serviceResponse.setStatus(false);
        }

        return serviceResponse;
    }

    @Override
    public ServiceResponse updateCategory(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public ServiceResponse disableCategory(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public ServiceResponse loadAllCategories() {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            List<Category> categories = categoryRepository.findAll();
            List<CategoryDto> categoryDtos = new ArrayList<>();
            for (Category category: categories) {
                categoryDtos.add(dozerBeanMapper.map(category, CategoryDto.class,"CAT_EXCLUDE_PRODUCT" ));
            }
            serviceResponse.setStatus(true);
            serviceResponse.setObjects(categoryDtos);
        } catch (Exception ignored) {
            serviceResponse.setStatus(false);
        }
        return serviceResponse;
    }
}
