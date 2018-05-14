package Services;

import Dtos.CompanyDto;
import Entities.Company;
import ServiceResponses.ServiceResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  1:14 PM
 * Project Name - core
 * Package Name - Services
 */

@Transactional
public interface CompanyService {

    public ServiceResponse createCompany(CompanyDto company);
    public boolean updateCompany(Company company);
    public List<CompanyDto> loadAllCompanies();
    public CompanyDto loadCompanyById(int companyId);
    public List<CompanyDto> loadCompanyByUser(int userId);
}
