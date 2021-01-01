package com.fastcode.abce36.application.core.rental;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.abce36.domain.core.customer.CustomerEntity;
import com.fastcode.abce36.domain.core.inventory.InventoryEntity;
import com.fastcode.abce36.domain.core.staff.StaffEntity;
import com.fastcode.abce36.application.core.rental.dto.*;
import com.fastcode.abce36.domain.core.rental.RentalEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IRentalMapper {

   RentalEntity createRentalInputToRentalEntity(CreateRentalInput rentalDto);
   
   
   @Mappings({ 
   @Mapping(source = "entity.customer.customerId", target = "customerId"),                   
   @Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),                    
   @Mapping(source = "entity.inventory.inventoryId", target = "inventoryId"),                   
   @Mapping(source = "entity.inventory.inventoryId", target = "inventoryDescriptiveField"),                    
   @Mapping(source = "entity.staff.staffId", target = "staffId"),                   
   @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   }) 
   CreateRentalOutput rentalEntityToCreateRentalOutput(RentalEntity entity);
   
    RentalEntity updateRentalInputToRentalEntity(UpdateRentalInput rentalDto);
    
    @Mappings({ 
    @Mapping(source = "entity.customer.customerId", target = "customerId"),                   
    @Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),                    
    @Mapping(source = "entity.inventory.inventoryId", target = "inventoryId"),                   
    @Mapping(source = "entity.inventory.inventoryId", target = "inventoryDescriptiveField"),                    
    @Mapping(source = "entity.staff.staffId", target = "staffId"),                   
    @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   	}) 
   	UpdateRentalOutput rentalEntityToUpdateRentalOutput(RentalEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.customer.customerId", target = "customerId"),                   
   	@Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),                    
   	@Mapping(source = "entity.inventory.inventoryId", target = "inventoryId"),                   
   	@Mapping(source = "entity.inventory.inventoryId", target = "inventoryDescriptiveField"),                    
   	@Mapping(source = "entity.staff.staffId", target = "staffId"),                   
   	@Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   	}) 
   	FindRentalByIdOutput rentalEntityToFindRentalByIdOutput(RentalEntity entity);


   @Mappings({
   @Mapping(source = "inventory.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundRental.rentalId", target = "rentalRentalId"),
   })
   GetInventoryOutput inventoryEntityToGetInventoryOutput(InventoryEntity inventory, RentalEntity foundRental);
   
   @Mappings({
   @Mapping(source = "customer.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundRental.rentalId", target = "rentalRentalId"),
   })
   GetCustomerOutput customerEntityToGetCustomerOutput(CustomerEntity customer, RentalEntity foundRental);
   
   @Mappings({
   @Mapping(source = "staff.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundRental.rentalId", target = "rentalRentalId"),
   })
   GetStaffOutput staffEntityToGetStaffOutput(StaffEntity staff, RentalEntity foundRental);
   
}

