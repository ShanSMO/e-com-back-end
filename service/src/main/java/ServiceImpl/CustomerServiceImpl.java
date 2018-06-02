package ServiceImpl;

import Dtos.CustomerDto;
import Entities.Customer;
import Repositories.CustomerRepository;
import ServiceResponses.ServiceResponse;
import Services.CustomerService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/31/2018
 * Created Time -  8:45 PM
 * Project Name - e-com-back-end
 * Package Name - ServiceImpl
 */

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public ServiceResponse create(CustomerDto customerDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setStatus(true);
            customerRepository.saveAndFlush(dozerBeanMapper.map(customerDto, Customer.class , "CUSTOMER_MAP"));
        } catch (Exception ex) {
            serviceResponse.setStatus(false);
            System.out.println(ex.getMessage());
        }
        return serviceResponse;
    }
}
