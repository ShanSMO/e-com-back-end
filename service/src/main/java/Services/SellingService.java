package Services;

import Dtos.SalesMobilePhoneDto;
import Dtos.SalesPhotocoptDto;
import Dtos.SearchDto;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/27/2018
 * Created Time -  8:42 AM
 * Project Name - e-com-back-end
 * Package Name - Services
 */

@Transactional
public interface SellingService {

    ServiceResponse mobilePhone(SalesMobilePhoneDto salesMobilePhoneDto);
    ServiceResponse photoCopy(SalesPhotocoptDto salesPhotocoptDto);
    ServiceResponse photoCopyBulk(List<SalesPhotocoptDto> salesPhotocoptDtos);
    ServiceResponse loadMobile(SalesMobilePhoneDto salesMobilePhoneDto);
    ServiceResponse loadAllCounts(SearchDto searchDto);
    ServiceResponse loadPhotocopySummaryForDate(SearchDto searchDto);
}
