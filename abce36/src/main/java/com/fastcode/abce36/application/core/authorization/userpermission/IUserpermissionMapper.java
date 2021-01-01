package com.fastcode.abce36.application.core.authorization.userpermission;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.abce36.domain.core.authorization.permission.PermissionEntity;
import com.fastcode.abce36.domain.core.authorization.user.UserEntity;
import com.fastcode.abce36.application.core.authorization.userpermission.dto.*;
import com.fastcode.abce36.domain.core.authorization.userpermission.UserpermissionEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IUserpermissionMapper {

   UserpermissionEntity createUserpermissionInputToUserpermissionEntity(CreateUserpermissionInput userpermissionDto);
   
   @Mappings({ 
   @Mapping(source = "user.id", target = "userId"),  
   @Mapping(source = "user.userName", target = "userDescriptiveField"),
   @Mapping(source = "permission.name", target = "permissionDescriptiveField"),                   
   @Mapping(source = "permission.id", target = "permissionId")                   
   }) 
   CreateUserpermissionOutput userpermissionEntityToCreateUserpermissionOutput(UserpermissionEntity entity);
   
   
    UserpermissionEntity updateUserpermissionInputToUserpermissionEntity(UpdateUserpermissionInput userpermissionDto);
    
    @Mappings({ 
    @Mapping(source = "entity.permission.displayName", target = "permissionDescriptiveField"),                    
    @Mapping(source = "entity.user.userName", target = "userDescriptiveField"),                    
   	}) 
   	UpdateUserpermissionOutput userpermissionEntityToUpdateUserpermissionOutput(UserpermissionEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.permission.displayName", target = "permissionDescriptiveField"),                    
   	@Mapping(source = "entity.user.userName", target = "userDescriptiveField"),                    
   	}) 
   	FindUserpermissionByIdOutput userpermissionEntityToFindUserpermissionByIdOutput(UserpermissionEntity entity);


   @Mappings({
   @Mapping(source = "foundUserpermission.permissionId", target = "userpermissionPermissionId"),
   @Mapping(source = "foundUserpermission.userId", target = "userpermissionUserId"),
   })
   GetPermissionOutput permissionEntityToGetPermissionOutput(PermissionEntity permission, UserpermissionEntity foundUserpermission);
   
   @Mappings({
   @Mapping(source = "foundUserpermission.permissionId", target = "userpermissionPermissionId"),
   @Mapping(source = "foundUserpermission.userId", target = "userpermissionUserId"),
   })
   GetUserOutput userEntityToGetUserOutput(UserEntity user, UserpermissionEntity foundUserpermission);
   
}

