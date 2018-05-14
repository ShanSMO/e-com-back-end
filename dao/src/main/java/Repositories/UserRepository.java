package Repositories;

import Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/18/2018
 * Created Time -  1:00 PM
 * Project Name - core
 * Package Name - Repositories
 */

@Transactional
public interface UserRepository extends JpaRepository<User,Integer>, PagingAndSortingRepository<User,Integer>{

    User findByUserName(String userName);
    User findByUserNameAndUserType(String userName,String userType);

    @Modifying
    @Query("UPDATE User user SET user.verification = 'VERIFIED' WHERE user.userName= :userName")
    void updateVerificationStatus(@Param("userName") String userName);
}
