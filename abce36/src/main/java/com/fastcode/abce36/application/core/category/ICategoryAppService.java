package com.fastcode.abce36.application.core.category;

import org.springframework.data.domain.Pageable;
import com.fastcode.abce36.application.core.category.dto.*;
import com.fastcode.abce36.commons.search.SearchCriteria;

import java.util.*;

public interface ICategoryAppService {
	
	//CRUD Operations
	
	CreateCategoryOutput create(CreateCategoryInput category);

    void delete(Integer id);

    UpdateCategoryOutput update(Integer id, UpdateCategoryInput input);

    FindCategoryByIdOutput findById(Integer id);

    List<FindCategoryByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
    //Join Column Parsers

	Map<String,String> parseFilmCategorysJoinColumn(String keysString);
}

