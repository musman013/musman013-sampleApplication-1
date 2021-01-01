package com.fastcode.abce36.application.core.actor;

import org.mapstruct.Mapper;
import com.fastcode.abce36.application.core.actor.dto.*;
import com.fastcode.abce36.domain.core.actor.ActorEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IActorMapper {

   ActorEntity createActorInputToActorEntity(CreateActorInput actorDto);
   
   
   CreateActorOutput actorEntityToCreateActorOutput(ActorEntity entity);
   
    ActorEntity updateActorInputToActorEntity(UpdateActorInput actorDto);
    
   	UpdateActorOutput actorEntityToUpdateActorOutput(ActorEntity entity);

   	FindActorByIdOutput actorEntityToFindActorByIdOutput(ActorEntity entity);


}

