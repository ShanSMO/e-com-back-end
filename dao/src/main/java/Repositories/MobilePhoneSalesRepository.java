package Repositories;

import Entities.SalesMobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/25/2018
 * Created Time -  10:35 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */
public interface MobilePhoneSalesRepository extends JpaRepository<SalesMobilePhone, Long> {

    @Query("select count(*), smp.brand , sum(smp.sellingPrice) from SalesMobilePhone as smp where smp.date between :startDate and :endDate group by smp.brand")
    List<?> loadCountGroup(@Param(value = "startDate")Date startDate, @Param(value = "endDate")Date endDate);
}
