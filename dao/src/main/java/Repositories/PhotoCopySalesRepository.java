package Repositories;

import Entities.SalesPhotocopy;
import javafx.beans.binding.ObjectExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/25/2018
 * Created Time -  10:34 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */

@Repository
public interface PhotoCopySalesRepository extends JpaRepository<SalesPhotocopy, Long> {

    @Query("SELECT COUNT(*) ,spc.pageSize , SUM(spc.total), SUM(spc.qty) from SalesPhotocopy as spc  where spc.date between :startDate and :endDate group by spc.pageSize")
    List<?> countGroup(@Param(value = "startDate") Date startDate, @Param(value = "endDate") Date endDate);


}
