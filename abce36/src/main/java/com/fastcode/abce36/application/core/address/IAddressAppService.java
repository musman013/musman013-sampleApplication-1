package com.fastcode.abce36.application.core.address;

import org.springframework.data.domain.Pageable;
import com.fastcode.abce36.application.core.address.dto.*;
import com.fastcode.abce36.commons.search.SearchCriteria;

import java.util.*;

public interface IAddressAppService {
	
	//CRUD Operations
	
	CreateAddressOutput create(CreateAddressInput address);

    void delete(Integer id);

    UpdateAddressOutput update(Integer id, UpdateAddressInput input);

    FindAddressByIdOutput findById(Integer id);

    List<FindAddressByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
    
    GetCityOutput getCity(Integer addressid);
    
    //Join Column Parsers

	Map<String,String> parseCustomersJoinColumn(String keysString);

	Map<String,String> parseStaffsJoinColumn(String keysString);

	Map<String,String> parseStoresJoinColumn(String keysString);
}

