package Repositories;

import Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/16/2018
 * Created Time -  9:24 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
