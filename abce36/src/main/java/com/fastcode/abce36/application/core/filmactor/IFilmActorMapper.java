package com.fastcode.abce36.application.core.filmactor;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.abce36.domain.core.actor.ActorEntity;
import com.fastcode.abce36.domain.core.film.FilmEntity;
import com.fastcode.abce36.application.core.filmactor.dto.*;
import com.fastcode.abce36.domain.core.filmactor.FilmActorEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IFilmActorMapper {

   FilmActorEntity createFilmActorInputToFilmActorEntity(CreateFilmActorInput filmactorDto);
   
   
   @Mappings({ 
   @Mapping(source = "entity.actor.actorId", target = "actorDescriptiveField"),                    
   @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   }) 
   CreateFilmActorOutput filmActorEntityToCreateFilmActorOutput(FilmActorEntity entity);
   
    FilmActorEntity updateFilmActorInputToFilmActorEntity(UpdateFilmActorInput filmActorDto);
    
    @Mappings({ 
    @Mapping(source = "entity.actor.actorId", target = "actorDescriptiveField"),                    
    @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   	}) 
   	UpdateFilmActorOutput filmActorEntityToUpdateFilmActorOutput(FilmActorEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.actor.actorId", target = "actorDescriptiveField"),                    
   	@Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   	}) 
   	FindFilmActorByIdOutput filmActorEntityToFindFilmActorByIdOutput(FilmActorEntity entity);


   @Mappings({
   @Mapping(source = "actor.actorId", target = "actorId"),                  
   @Mapping(source = "actor.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundFilmActor.actorId", target = "filmActorActorId"),
   @Mapping(source = "foundFilmActor.filmId", target = "filmActorFilmId"),
   })
   GetActorOutput actorEntityToGetActorOutput(ActorEntity actor, FilmActorEntity foundFilmActor);
   
   @Mappings({
   @Mapping(source = "film.filmId", target = "filmId"),                  
   @Mapping(source = "film.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundFilmActor.actorId", target = "filmActorActorId"),
   @Mapping(source = "foundFilmActor.filmId", target = "filmActorFilmId"),
   })
   GetFilmOutput filmEntityToGetFilmOutput(FilmEntity film, FilmActorEntity foundFilmActor);
   
}

