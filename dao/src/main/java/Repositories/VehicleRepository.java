package Repositories;

import Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  12:21 AM
 * Project Name - core
 * Package Name - Repositories
 */
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
