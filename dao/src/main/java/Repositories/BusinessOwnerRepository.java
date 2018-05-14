package Repositories;

import Entities.BusinessOwner;
import Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/28/2018
 * Created Time -  10:23 PM
 * Project Name - core
 * Package Name - Repositories
 */
public interface BusinessOwnerRepository extends JpaRepository<BusinessOwner , Integer> {

    BusinessOwner findByUser(User user);

    @Modifying
    @Query("UPDATE BusinessOwner bo SET bo.firstName= :firstName , bo.lastName= :lastName , bo.nicNumber= :nic , " +
        "bo.mobileNumber= :mobile , bo.fixedNumber= :fixed WHERE bo.emailAddress= :emailAddress")
    void updateBusinessOwner(@Param("firstName") String firstName,
                             @Param("lastName") String lastName,
                             @Param("nic") String nic,
                             @Param("mobile") long mobile,
                             @Param("fixed") long fixed,
                             @Param("emailAddress") String emailAddress
                             );

    BusinessOwner findByEmailAddress(String emailAddress);
}
