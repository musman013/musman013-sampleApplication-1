package com.fastcode.abce36.application.core.authorization.role;

import org.springframework.data.domain.Pageable;
import com.fastcode.abce36.application.core.authorization.role.dto.*;
import com.fastcode.abce36.commons.search.SearchCriteria;

import java.util.*;

public interface IRoleAppService {
	
	//CRUD Operations
	
	CreateRoleOutput create(CreateRoleInput role);

    void delete(Long id);

    UpdateRoleOutput update(Long id, UpdateRoleInput input);

    FindRoleByIdOutput findById(Long id);

    List<FindRoleByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	
 	FindRoleByNameOutput findByRoleName(String roleName);
    
    //Join Column Parsers

	Map<String,String> parseRolepermissionsJoinColumn(String keysString);

	Map<String,String> parseUserrolesJoinColumn(String keysString);
}

