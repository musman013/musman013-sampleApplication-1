package com.fastcode.abce36.application.core.customer;

import org.springframework.data.domain.Pageable;
import com.fastcode.abce36.application.core.customer.dto.*;
import com.fastcode.abce36.commons.search.SearchCriteria;

import java.util.*;

public interface ICustomerAppService {
	
	//CRUD Operations
	
	CreateCustomerOutput create(CreateCustomerInput customer);

    void delete(Integer id);

    UpdateCustomerOutput update(Integer id, UpdateCustomerInput input);

    FindCustomerByIdOutput findById(Integer id);

    List<FindCustomerByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
    
    GetAddressOutput getAddress(Integer customerid);
    
    //Join Column Parsers

	Map<String,String> parsePaymentsJoinColumn(String keysString);

	Map<String,String> parseRentalsJoinColumn(String keysString);
}

