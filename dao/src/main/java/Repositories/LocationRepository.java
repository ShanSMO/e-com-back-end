package Repositories;

import Entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/21/2018
 * Created Time -  1:36 PM
 * Project Name - core
 * Package Name - Repositories
 */
public interface LocationRepository extends JpaRepository<Location,Integer> {
}
