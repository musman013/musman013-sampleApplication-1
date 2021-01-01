package com.fastcode.abce36.domain.core.authorization.tokenverification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.time.*;


@Repository
public interface ITokenverificationRepository extends JpaRepository<TokenverificationEntity, TokenverificationId>,QuerydslPredicateExecutor<TokenverificationEntity> {

	TokenverificationEntity findByTokenAndTokenType(String token, String tokenType);
	 
	TokenverificationEntity findByUserIdAndTokenType(Long userId,String tokenType);
}

