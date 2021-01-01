package com.fastcode.abce36.application.core.authorization.permission;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import com.fastcode.abce36.application.core.authorization.permission.dto.*;
import com.fastcode.abce36.domain.core.authorization.permission.IPermissionRepository;
import com.fastcode.abce36.domain.core.authorization.permission.QPermissionEntity;
import com.fastcode.abce36.domain.core.authorization.permission.PermissionEntity;
import com.fastcode.abce36.commons.search.*;
import com.fastcode.abce36.commons.logging.LoggingHelper;
import com.querydsl.core.BooleanBuilder;

import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page; 
import org.springframework.data.domain.Pageable; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.lang3.StringUtils;

@Service("permissionAppService")
@RequiredArgsConstructor
public class PermissionAppService implements IPermissionAppService {

	@Qualifier("permissionRepository")
	@NonNull protected final IPermissionRepository _permissionRepository;

	@Qualifier("IPermissionMapperImpl")
	@NonNull protected final IPermissionMapper mapper;

	@NonNull protected final LoggingHelper logHelper;

    @Transactional(propagation = Propagation.REQUIRED)
	public CreatePermissionOutput create(CreatePermissionInput input) {

		PermissionEntity permission = mapper.createPermissionInputToPermissionEntity(input);

		PermissionEntity createdPermission = _permissionRepository.save(permission);
		return mapper.permissionEntityToCreatePermissionOutput(createdPermission);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public UpdatePermissionOutput update(Long permissionId, UpdatePermissionInput input) {

		PermissionEntity permission = mapper.updatePermissionInputToPermissionEntity(input);
		
		PermissionEntity updatedPermission = _permissionRepository.save(permission);
		return mapper.permissionEntityToUpdatePermissionOutput(updatedPermission);
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Long permissionId) {

		PermissionEntity existing = _permissionRepository.findById(permissionId).orElse(null); 
	 	_permissionRepository.delete(existing);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public FindPermissionByIdOutput findById(Long permissionId) {

		PermissionEntity foundPermission = _permissionRepository.findById(permissionId).orElse(null);
		if (foundPermission == null)  
			return null; 
 	   

 	    return mapper.permissionEntityToFindPermissionByIdOutput(foundPermission);
	}
	
 	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public FindPermissionByNameOutput findByPermissionName(String permissionName) {

		PermissionEntity foundPermission = _permissionRepository.findByPermissionName(permissionName);
		if (foundPermission == null) {
			return null;
		}

		return mapper.permissionEntityToFindPermissionByNameOutput(foundPermission);
	}
	
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<FindPermissionByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception  {

		Page<PermissionEntity> foundPermission = _permissionRepository.findAll(search(search), pageable);
		List<PermissionEntity> permissionList = foundPermission.getContent();
		Iterator<PermissionEntity> permissionIterator = permissionList.iterator(); 
		List<FindPermissionByIdOutput> output = new ArrayList<>();

		while (permissionIterator.hasNext()) {
		PermissionEntity permission = permissionIterator.next();
 	    output.add(mapper.permissionEntityToFindPermissionByIdOutput(permission));
		}
		return output;
	}
	
	protected BooleanBuilder search(SearchCriteria search) throws Exception {

		QPermissionEntity permission= QPermissionEntity.permissionEntity;
		if(search != null) {
			Map<String,SearchFields> map = new HashMap<>();
			for(SearchFields fieldDetails: search.getFields())
			{
				map.put(fieldDetails.getFieldName(),fieldDetails);
			}
			List<String> keysList = new ArrayList<String>(map.keySet());
			checkProperties(keysList);
			return searchKeyValuePair(permission, map,search.getJoinColumns());
		}
		return null;
	}
	
	protected void checkProperties(List<String> list) throws Exception  {
		for (int i = 0; i < list.size(); i++) {
			if(!(
				list.get(i).replace("%20","").trim().equals("displayName") ||
				list.get(i).replace("%20","").trim().equals("id") ||
				list.get(i).replace("%20","").trim().equals("name")
			)) 
			{
			 throw new Exception("Wrong URL Format: Property " + list.get(i) + " not found!" );
			}
		}
	}
	
	protected BooleanBuilder searchKeyValuePair(QPermissionEntity permission, Map<String,SearchFields> map,Map<String,String> joinColumns) {
		BooleanBuilder builder = new BooleanBuilder();
        
		for (Map.Entry<String, SearchFields> details : map.entrySet()) {
            if(details.getKey().replace("%20","").trim().equals("displayName")) {
				if(details.getValue().getOperator().equals("contains"))
					builder.and(permission.displayName.likeIgnoreCase("%"+ details.getValue().getSearchValue() + "%"));
				else if(details.getValue().getOperator().equals("equals"))
					builder.and(permission.displayName.eq(details.getValue().getSearchValue()));
				else if(details.getValue().getOperator().equals("notEqual"))
					builder.and(permission.displayName.ne(details.getValue().getSearchValue()));
			}
			if(details.getKey().replace("%20","").trim().equals("id")) {
				if(details.getValue().getOperator().equals("equals") && StringUtils.isNumeric(details.getValue().getSearchValue()))
					builder.and(permission.id.eq(Long.valueOf(details.getValue().getSearchValue())));
				else if(details.getValue().getOperator().equals("notEqual") && StringUtils.isNumeric(details.getValue().getSearchValue()))
					builder.and(permission.id.ne(Long.valueOf(details.getValue().getSearchValue())));
				else if(details.getValue().getOperator().equals("range"))
				{
				   if(StringUtils.isNumeric(details.getValue().getStartingValue()) && StringUtils.isNumeric(details.getValue().getEndingValue()))
                	   builder.and(permission.id.between(Long.valueOf(details.getValue().getStartingValue()), Long.valueOf(details.getValue().getEndingValue())));
                   else if(StringUtils.isNumeric(details.getValue().getStartingValue()))
                	   builder.and(permission.id.goe(Long.valueOf(details.getValue().getStartingValue())));
                   else if(StringUtils.isNumeric(details.getValue().getEndingValue()))
                	   builder.and(permission.id.loe(Long.valueOf(details.getValue().getEndingValue())));
				}
			}
            if(details.getKey().replace("%20","").trim().equals("name")) {
				if(details.getValue().getOperator().equals("contains"))
					builder.and(permission.name.likeIgnoreCase("%"+ details.getValue().getSearchValue() + "%"));
				else if(details.getValue().getOperator().equals("equals"))
					builder.and(permission.name.eq(details.getValue().getSearchValue()));
				else if(details.getValue().getOperator().equals("notEqual"))
					builder.and(permission.name.ne(details.getValue().getSearchValue()));
			}
	    
		}
		
		return builder;
	}
	

	
	public Map<String,String> parseRolepermissionsJoinColumn(String keysString) {
		
		Map<String,String> joinColumnMap = new HashMap<String,String>();
		joinColumnMap.put("permissionId", keysString);
		  
		return joinColumnMap;
	}
	
	public Map<String,String> parseUserpermissionsJoinColumn(String keysString) {
		
		Map<String,String> joinColumnMap = new HashMap<String,String>();
		joinColumnMap.put("permissionId", keysString);
		  
		return joinColumnMap;
	}
}



