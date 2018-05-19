package Repositories;

import Entities.MobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:02 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */

@Repository
public interface MobilePhoneRepository extends JpaRepository<MobilePhone, Long>{
}
