package com.live.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.live.model.User;
import com.live.model.UserDetailsImpl;
import com.live.repo.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
//Connect to the repository
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//Fetch the User from the repository
		Optional<User> user = userRepository.findByUserName(username);
		user.orElseThrow(()-> new UsernameNotFoundException(username + " : not found!"));
		return user.map(UserDetailsImpl::new).get();
	}

}
