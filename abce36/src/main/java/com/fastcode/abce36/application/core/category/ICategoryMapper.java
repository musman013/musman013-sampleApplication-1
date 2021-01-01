package com.fastcode.abce36.application.core.category;

import org.mapstruct.Mapper;
import com.fastcode.abce36.application.core.category.dto.*;
import com.fastcode.abce36.domain.core.category.CategoryEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ICategoryMapper {

   CategoryEntity createCategoryInputToCategoryEntity(CreateCategoryInput categoryDto);
   
   
   CreateCategoryOutput categoryEntityToCreateCategoryOutput(CategoryEntity entity);
   
    CategoryEntity updateCategoryInputToCategoryEntity(UpdateCategoryInput categoryDto);
    
   	UpdateCategoryOutput categoryEntityToUpdateCategoryOutput(CategoryEntity entity);

   	FindCategoryByIdOutput categoryEntityToFindCategoryByIdOutput(CategoryEntity entity);


}

