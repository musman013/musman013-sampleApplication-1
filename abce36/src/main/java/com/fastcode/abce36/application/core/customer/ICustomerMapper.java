package com.fastcode.abce36.application.core.customer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.abce36.domain.core.address.AddressEntity;
import com.fastcode.abce36.application.core.customer.dto.*;
import com.fastcode.abce36.domain.core.customer.CustomerEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {

   CustomerEntity createCustomerInputToCustomerEntity(CreateCustomerInput customerDto);
   
   
   @Mappings({ 
   @Mapping(source = "entity.address.addressId", target = "addressId"),                   
   @Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
   }) 
   CreateCustomerOutput customerEntityToCreateCustomerOutput(CustomerEntity entity);
   
    CustomerEntity updateCustomerInputToCustomerEntity(UpdateCustomerInput customerDto);
    
    @Mappings({ 
    @Mapping(source = "entity.address.addressId", target = "addressId"),                   
    @Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
   	}) 
   	UpdateCustomerOutput customerEntityToUpdateCustomerOutput(CustomerEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.address.addressId", target = "addressId"),                   
   	@Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
   	}) 
   	FindCustomerByIdOutput customerEntityToFindCustomerByIdOutput(CustomerEntity entity);


   @Mappings({
   @Mapping(source = "address.address", target = "address"),                  
   @Mapping(source = "address.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundCustomer.customerId", target = "customerCustomerId"),
   })
   GetAddressOutput addressEntityToGetAddressOutput(AddressEntity address, CustomerEntity foundCustomer);
   
}

