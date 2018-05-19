package Repositories;

import Entities.PageSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  12:03 PM
 * Project Name - e-com-back-end
 * Package Name - Repositories
 */

@Repository
public interface PageSizeRepository extends JpaRepository<PageSize, Long> {
}
