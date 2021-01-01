package com.fastcode.abce36.security;

import com.fastcode.abce36.domain.core.authorization.user.UserEntity;
import com.fastcode.abce36.domain.core.authorization.user.IUserRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {


	@Qualifier("userRepository")
	@NonNull private final IUserRepository usersRepository;

	@NonNull private final SecurityUtils securityUtils;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    UserEntity applicationUser = usersRepository.findByUserName(username);

	if (applicationUser == null) {
		throw new UsernameNotFoundException(username);
	}

	List<String> permissions = securityUtils.getAllPermissionsFromUserAndRole(applicationUser);
	String[] groupsArray = new String[permissions.size()];
   	List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(permissions.toArray(groupsArray));

    return new User(applicationUser.getUserName(), applicationUser.getPassword(), authorities); // User class implements UserDetails Interface
	}


}

