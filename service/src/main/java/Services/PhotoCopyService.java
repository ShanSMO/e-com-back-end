package Services;

import Dtos.PhotoCopyDto;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/20/2018
 * Created Time -  8:04 AM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface PhotoCopyService {

    ServiceResponse create(PhotoCopyDto photoCopyDto);
    ServiceResponse loadAll();
}
