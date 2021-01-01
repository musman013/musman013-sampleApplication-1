package com.fastcode.abce36.application.core.inventory;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.abce36.domain.core.film.FilmEntity;
import com.fastcode.abce36.application.core.inventory.dto.*;
import com.fastcode.abce36.domain.core.inventory.InventoryEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IInventoryMapper {

   InventoryEntity createInventoryInputToInventoryEntity(CreateInventoryInput inventoryDto);
   
   
   @Mappings({ 
   @Mapping(source = "entity.film.filmId", target = "filmId"),                   
   @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   }) 
   CreateInventoryOutput inventoryEntityToCreateInventoryOutput(InventoryEntity entity);
   
    InventoryEntity updateInventoryInputToInventoryEntity(UpdateInventoryInput inventoryDto);
    
    @Mappings({ 
    @Mapping(source = "entity.film.filmId", target = "filmId"),                   
    @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   	}) 
   	UpdateInventoryOutput inventoryEntityToUpdateInventoryOutput(InventoryEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.film.filmId", target = "filmId"),                   
   	@Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   	}) 
   	FindInventoryByIdOutput inventoryEntityToFindInventoryByIdOutput(InventoryEntity entity);


   @Mappings({
   @Mapping(source = "film.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundInventory.inventoryId", target = "inventoryInventoryId"),
   })
   GetFilmOutput filmEntityToGetFilmOutput(FilmEntity film, InventoryEntity foundInventory);
   
}

