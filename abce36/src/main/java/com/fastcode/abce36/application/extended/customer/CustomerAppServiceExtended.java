package com.fastcode.abce36.application.extended.customer;

import org.springframework.stereotype.Service;
import com.fastcode.abce36.application.core.customer.CustomerAppService;

import com.fastcode.abce36.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.abce36.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.abce36.commons.logging.LoggingHelper;

@Service("customerAppServiceExtended")
public class CustomerAppServiceExtended extends CustomerAppService implements ICustomerAppServiceExtended {

	public CustomerAppServiceExtended(ICustomerRepositoryExtended customerRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,ICustomerMapperExtended mapper,LoggingHelper logHelper) {

		super(customerRepositoryExtended,
		addressRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

