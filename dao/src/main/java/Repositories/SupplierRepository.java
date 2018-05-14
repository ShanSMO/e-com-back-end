package Repositories;

import Entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  12:20 AM
 * Project Name - core
 * Package Name - Repositories
 */
public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
