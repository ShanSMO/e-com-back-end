package WebService;

import Dtos.CompanyDto;
import Entities.Company;
import ResponseObjects.ResponseObject;
import ServiceResponses.ServiceResponse;
import Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  12:23 AM
 * Project Name - core
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "company")
@CrossOrigin("*")
public class CompanyRestController {

    @Autowired
    CompanyService companyService;

    ResponseObject responseObject;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public ResponseObject createCompany(@RequestBody CompanyDto company){

        // TODO getBase64 file and save it at specific predefined location
        responseObject = ResponseObject.class.cast(companyService.createCompany(company));
        return responseObject;
    }

    @RequestMapping(value = "/update-company",method = RequestMethod.POST)
    @ResponseBody
    public ResponseObject updateCompany(@RequestBody Company company){
        ResponseObject responseObject = new ResponseObject();
        if(companyService.updateCompany(company)){
            responseObject.setStatus(true);
            responseObject.setMessage("Successfully Updated");
        }
        else{
            responseObject.setStatus(false);
            responseObject.setMessage("Company Not Found");
        }
        return responseObject;
    }

    @RequestMapping(value = "/loadAll",method = RequestMethod.GET)
    @ResponseBody
    public ResponseObject loadAllCompanies(){
        ResponseObject responseObject = new ResponseObject();

        List<CompanyDto> companyList = companyService.loadAllCompanies();
        if(companyList.size() < 0){
            responseObject.setMessage("No Comapnies Found");
        }

        responseObject.setObjects(companyList);
        return responseObject;
    }

    @RequestMapping(value = "/loadById/{companyId}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseObject loadCompanyById(@PathVariable(name = "companyId") int companyId){
        ResponseObject responseObject = new ResponseObject();

        CompanyDto company = companyService.loadCompanyById(companyId);
        responseObject.setObject(company);
        return responseObject;
    }

    @RequestMapping(value = "/loadByUser/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseObject loadCompaniesForUser(@PathVariable(name = "userId") int userId){
        ResponseObject responseObject = new ResponseObject();

        List<CompanyDto> companyList = companyService.loadCompanyByUser(userId);
        responseObject.setObjects(companyList);
        return responseObject;
    }


}
