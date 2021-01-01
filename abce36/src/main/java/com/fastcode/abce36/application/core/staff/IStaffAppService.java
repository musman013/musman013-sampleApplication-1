package com.fastcode.abce36.application.core.staff;

import org.springframework.data.domain.Pageable;
import com.fastcode.abce36.application.core.staff.dto.*;
import com.fastcode.abce36.commons.search.SearchCriteria;

import java.util.*;

public interface IStaffAppService {
	
	//CRUD Operations
	
	CreateStaffOutput create(CreateStaffInput staff);

    void delete(Integer id);

    UpdateStaffOutput update(Integer id, UpdateStaffInput input);

    FindStaffByIdOutput findById(Integer id);

    List<FindStaffByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
    
    GetAddressOutput getAddress(Integer staffid);
    
    //Join Column Parsers

	Map<String,String> parsePaymentsJoinColumn(String keysString);

	Map<String,String> parseRentalsJoinColumn(String keysString);

	Map<String,String> parseStoresJoinColumn(String keysString);
}

