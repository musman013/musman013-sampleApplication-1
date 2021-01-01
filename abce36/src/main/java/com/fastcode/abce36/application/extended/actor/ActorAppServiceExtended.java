package com.fastcode.abce36.application.extended.actor;

import org.springframework.stereotype.Service;
import com.fastcode.abce36.application.core.actor.ActorAppService;

import com.fastcode.abce36.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.abce36.commons.logging.LoggingHelper;

@Service("actorAppServiceExtended")
public class ActorAppServiceExtended extends ActorAppService implements IActorAppServiceExtended {

	public ActorAppServiceExtended(IActorRepositoryExtended actorRepositoryExtended,
				IActorMapperExtended mapper,LoggingHelper logHelper) {

		super(actorRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

