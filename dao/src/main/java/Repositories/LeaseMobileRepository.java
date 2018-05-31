package Repositories;

import Entities.LeaseMobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/25/2018
 * Created Time -  11:02 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */

@Repository
public interface LeaseMobileRepository extends JpaRepository<LeaseMobile, Long> {
}
