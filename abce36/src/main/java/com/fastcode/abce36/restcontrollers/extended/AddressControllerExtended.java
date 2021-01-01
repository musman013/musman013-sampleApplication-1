package com.fastcode.abce36.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abce36.restcontrollers.core.AddressController;
import com.fastcode.abce36.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.abce36.application.extended.city.ICityAppServiceExtended;
import com.fastcode.abce36.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.abce36.application.extended.staff.IStaffAppServiceExtended;
import com.fastcode.abce36.application.extended.store.IStoreAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abce36.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/address/extended")
public class AddressControllerExtended extends AddressController {

		public AddressControllerExtended(IAddressAppServiceExtended addressAppServiceExtended, ICityAppServiceExtended cityAppServiceExtended, ICustomerAppServiceExtended customerAppServiceExtended, IStaffAppServiceExtended staffAppServiceExtended, IStoreAppServiceExtended storeAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		addressAppServiceExtended,
    	cityAppServiceExtended,
    	customerAppServiceExtended,
    	staffAppServiceExtended,
    	storeAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

