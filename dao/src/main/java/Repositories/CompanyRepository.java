package Repositories;

import Entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/24/2018
 * Created Time -  11:24 PM
 * Project Name - core
 * Package Name - Repositories
 */
public interface CompanyRepository extends JpaRepository<Company,Integer>  {

    @Transactional
    @Modifying
    @Query("UPDATE Company c SET c.companyName = :#{#company.companyName} WHERE c.id = :#{#company.id}")
    void updateCompany(@Param("company") Company company);

}
