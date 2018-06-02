package Repositories;

import Entities.MobilePhone;
import Enums.AvailableStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:02 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */

@Repository
public interface MobilePhoneRepository extends JpaRepository<MobilePhone, Long>{

    MobilePhone findMobilePhoneByBarcode(String barcode);
    List<MobilePhone> findMobilePhoneByAvailableStatus(AvailableStatus status);
    int countAllByAvailableStatus(AvailableStatus availableStatus);

    @Modifying
    @Query("update MobilePhone set availableStatus= :status where id= :id")
    void updateStatus(@Param(value = "status") AvailableStatus status, @Param(value = "id") long id);
}
