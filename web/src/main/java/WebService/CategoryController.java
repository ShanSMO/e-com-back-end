package WebService;

import Dtos.CategoryDto;
import ServiceResponses.ServiceResponse;
import Services.CategoryService;
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
@RequestMapping(value = "category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "load-all", method = RequestMethod.POST)
    public ServiceResponse loadAll() {
        return categoryService.loadAllCategories();
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ServiceResponse createCategory(@RequestBody CategoryDto categoryDto) {
        return categoryService.createCategory(categoryDto);
    }
}
