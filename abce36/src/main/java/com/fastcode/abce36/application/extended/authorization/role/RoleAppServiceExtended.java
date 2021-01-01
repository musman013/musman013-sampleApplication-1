package com.fastcode.abce36.application.extended.authorization.role;

import org.springframework.stereotype.Service;
import com.fastcode.abce36.application.core.authorization.role.RoleAppService;

import com.fastcode.abce36.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.abce36.commons.logging.LoggingHelper;

@Service("roleAppServiceExtended")
public class RoleAppServiceExtended extends RoleAppService implements IRoleAppServiceExtended {

	public RoleAppServiceExtended(IRoleRepositoryExtended roleRepositoryExtended,
				IRoleMapperExtended mapper,LoggingHelper logHelper) {

		super(roleRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

