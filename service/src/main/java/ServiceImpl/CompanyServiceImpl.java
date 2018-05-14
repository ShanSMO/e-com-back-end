package ServiceImpl;

import Dtos.CompanyDto;
import Entities.Company;
import Repositories.CompanyRepository;
import ServiceResponses.ServiceResponse;
import Services.CompanyService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/26/2018
 * Created Time -  10:58 PM
 * Project Name - core
 * Package Name - ServiceImpl
 */

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    DozerBeanMapper dozerBeanMapper;


    @Override
    @Transactional
    public ServiceResponse createCompany(CompanyDto companyDto) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try{
            Company company = dozerBeanMapper.map(companyDto, Company.class);
            companyRepository.saveAndFlush(company);
            serviceResponse.setStatus(true);
        }
        catch (Exception e){
            serviceResponse.setStatus(false);
        }

        return serviceResponse;
    }

    @Override
    public boolean updateCompany(Company company) {

        if(companyRepository.findOne(company.getId()) != null){
            companyRepository.updateCompany(company);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public List<CompanyDto> loadAllCompanies() {
        List<Company> companyList = companyRepository.findAll();
        List<CompanyDto> ConvertedCompanyList = new ArrayList<>();

        for(Company company:companyList){
            ConvertedCompanyList.add(dozerBeanMapper.map(company , CompanyDto.class , "COMPANY_MAP")) ;
        }

        return ConvertedCompanyList;
    }

    @Override
    public CompanyDto loadCompanyById(int companyId) {
        return null;
    }

    @Override
    public List<CompanyDto> loadCompanyByUser(int userId) {
        return null;
    }
}
