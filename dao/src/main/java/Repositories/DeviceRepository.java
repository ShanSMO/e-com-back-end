package Repositories;

import Entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/17/2018
 * Created Time -  8:19 PM
 * Project Name - core
 * Package Name - Repositories
 */

@Repository
public interface DeviceRepository extends JpaRepository<Device,Integer> {

}
