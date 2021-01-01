package com.fastcode.abce36.application.core.rental;

import org.springframework.data.domain.Pageable;
import com.fastcode.abce36.application.core.rental.dto.*;
import com.fastcode.abce36.commons.search.SearchCriteria;

import java.util.*;

public interface IRentalAppService {
	
	//CRUD Operations
	
	CreateRentalOutput create(CreateRentalInput rental);

    void delete(Integer id);

    UpdateRentalOutput update(Integer id, UpdateRentalInput input);

    FindRentalByIdOutput findById(Integer id);

    List<FindRentalByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
	//Relationship Operations
	//Relationship Operations
    
    GetCustomerOutput getCustomer(Integer rentalid);
    
    GetInventoryOutput getInventory(Integer rentalid);
    
    GetStaffOutput getStaff(Integer rentalid);
    
    //Join Column Parsers

	Map<String,String> parsePaymentsJoinColumn(String keysString);
}

