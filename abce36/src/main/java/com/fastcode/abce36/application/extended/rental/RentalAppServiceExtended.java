package com.fastcode.abce36.application.extended.rental;

import org.springframework.stereotype.Service;
import com.fastcode.abce36.application.core.rental.RentalAppService;

import com.fastcode.abce36.domain.extended.rental.IRentalRepositoryExtended;
import com.fastcode.abce36.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.abce36.domain.extended.inventory.IInventoryRepositoryExtended;
import com.fastcode.abce36.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.abce36.commons.logging.LoggingHelper;

@Service("rentalAppServiceExtended")
public class RentalAppServiceExtended extends RentalAppService implements IRentalAppServiceExtended {

	public RentalAppServiceExtended(IRentalRepositoryExtended rentalRepositoryExtended,
				ICustomerRepositoryExtended customerRepositoryExtended,IInventoryRepositoryExtended inventoryRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IRentalMapperExtended mapper,LoggingHelper logHelper) {

		super(rentalRepositoryExtended,
		customerRepositoryExtended,inventoryRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

