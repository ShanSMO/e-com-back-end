package Repositories;

import Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/25/2018
 * Created Time -  11:00 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
