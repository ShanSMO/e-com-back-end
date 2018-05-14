package ServiceImpl;

import Entities.Supplier;
import Repositories.SupplierRepository;
import Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/1/2018
 * Created Time -  6:23 PM
 * Project Name - core
 * Package Name - ServiceImpl
 */

@Service
public class SupplierServiceImpl implements SupplierService{


    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public void createSupplier(Supplier supplier) {
        supplierRepository.saveAndFlush(supplier);
    }

}
