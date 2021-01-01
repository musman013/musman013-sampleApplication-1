package com.fastcode.abce36.application.core.authorization.userpermission;

import com.fastcode.abce36.domain.core.authorization.userpermission.UserpermissionId;
import org.springframework.data.domain.Pageable;
import com.fastcode.abce36.application.core.authorization.userpermission.dto.*;
import com.fastcode.abce36.commons.search.SearchCriteria;

import java.util.*;

public interface IUserpermissionAppService {
	
	//CRUD Operations
	
	CreateUserpermissionOutput create(CreateUserpermissionInput userpermission);

    void delete(UserpermissionId userpermissionId);

    UpdateUserpermissionOutput update(UserpermissionId userpermissionId, UpdateUserpermissionInput input);

    FindUserpermissionByIdOutput findById(UserpermissionId userpermissionId);

    List<FindUserpermissionByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
	//Relationship Operations
    
    GetPermissionOutput getPermission(UserpermissionId userpermissionId);
    
    GetUserOutput getUser(UserpermissionId userpermissionId);
    
    //Join Column Parsers
    
	UserpermissionId parseUserpermissionKey(String keysString);
}

