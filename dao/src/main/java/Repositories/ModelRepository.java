package Repositories;

import Entities.Brand;
import Entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:03 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> , Serializable{

    List<Model> findByBrand_Id(long id);
}
