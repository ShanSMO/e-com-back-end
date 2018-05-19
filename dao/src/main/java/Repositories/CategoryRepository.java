package Repositories;

import Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  9:24 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
