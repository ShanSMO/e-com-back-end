package Services;

import Entities.PhotoCopy;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  6/9/2018
 * Created Time -  12:52 PM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface ReportService {

    List<PhotoCopy> photocopySalesList();
}
