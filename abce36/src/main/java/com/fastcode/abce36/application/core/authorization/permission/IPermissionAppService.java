package com.fastcode.abce36.application.core.authorization.permission;

import org.springframework.data.domain.Pageable;
import com.fastcode.abce36.application.core.authorization.permission.dto.*;
import com.fastcode.abce36.commons.search.SearchCriteria;

import java.util.*;

public interface IPermissionAppService {
	
	//CRUD Operations
	
	CreatePermissionOutput create(CreatePermissionInput permission);

    void delete(Long id);

    UpdatePermissionOutput update(Long id, UpdatePermissionInput input);

    FindPermissionByIdOutput findById(Long id);

    List<FindPermissionByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	
 	FindPermissionByNameOutput findByPermissionName(String permissionName);
    
    //Join Column Parsers

	Map<String,String> parseRolepermissionsJoinColumn(String keysString);

	Map<String,String> parseUserpermissionsJoinColumn(String keysString);
}

