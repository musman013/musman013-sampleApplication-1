package com.fastcode.abce36.application.extended.store;

import org.springframework.stereotype.Service;
import com.fastcode.abce36.application.core.store.StoreAppService;

import com.fastcode.abce36.domain.extended.store.IStoreRepositoryExtended;
import com.fastcode.abce36.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.abce36.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.abce36.commons.logging.LoggingHelper;

@Service("storeAppServiceExtended")
public class StoreAppServiceExtended extends StoreAppService implements IStoreAppServiceExtended {

	public StoreAppServiceExtended(IStoreRepositoryExtended storeRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IStoreMapperExtended mapper,LoggingHelper logHelper) {

		super(storeRepositoryExtended,
		addressRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

