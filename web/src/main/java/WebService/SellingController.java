package WebService;

import Dtos.SalesMobilePhoneDto;
import Dtos.SalesPhotocoptDto;
import Dtos.SearchDto;
import Entities.SalesMobilePhone;
import ServiceResponses.ServiceResponse;
import Services.SellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/27/2018
 * Created Time -  8:39 AM
 * Project Name - e-com-back-end
 * Package Name - WebService
 */

@RestController
@RequestMapping(value="selling")
@CrossOrigin("*")
public class SellingController {

    @Autowired
    SellingService sellingService;

    @RequestMapping(value = "mobile",method = RequestMethod.POST)
    @ResponseBody
    private ServiceResponse sellingMobilePhone(@RequestBody SalesMobilePhoneDto salesMobilePhoneDto) {
        return sellingService.mobilePhone(salesMobilePhoneDto);
    }

    @RequestMapping(value = "photo-copy",method = RequestMethod.POST)
    @ResponseBody
    private ServiceResponse sellingPhotoCopy(@RequestBody SalesPhotocoptDto salesPhotocoptDto) {
        return sellingService.photoCopy(salesPhotocoptDto);
    }

    @RequestMapping(value = "photo-copy-bulk",method = RequestMethod.POST)
    @ResponseBody
    private ServiceResponse sellingPhotoCopyBulk(@RequestBody List<SalesPhotocoptDto> salesPhotocoptDtos) {
        return sellingService.photoCopyBulk(salesPhotocoptDtos);
    }

    @RequestMapping(value = "load-mobile",method = RequestMethod.POST)
    @ResponseBody
    private ServiceResponse loadMobile(@RequestBody SalesMobilePhoneDto salesMobilePhoneDto) {
        return sellingService.loadMobile(salesMobilePhoneDto);
    }

    @RequestMapping(value = "load-all-count",method = RequestMethod.POST)
    private ServiceResponse loadAllCount(@RequestBody SearchDto searchDto) {
        return sellingService.loadAllCounts(searchDto);
    }

    @RequestMapping(value = "load-potocopy-summary", method = RequestMethod.POST)
    public ServiceResponse loadPhotocopySummaryForDate(@RequestBody SearchDto searchDto){
        return sellingService.loadPhotocopySummaryForDate(searchDto);
    }
}
