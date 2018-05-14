package Repositories;

import Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/14/2018
 * Created Time -  6:53 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);
}
