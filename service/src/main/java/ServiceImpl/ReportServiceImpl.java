package ServiceImpl;

import Repositories.MobilePhoneSalesRepository;
import Repositories.PhotoCopySalesRepository;
import Services.ReportService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  6/9/2018
 * Created Time -  12:52 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    PhotoCopySalesRepository photoCopySalesRepository;

    @Autowired
    MobilePhoneSalesRepository mobilePhoneSalesRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;


}
