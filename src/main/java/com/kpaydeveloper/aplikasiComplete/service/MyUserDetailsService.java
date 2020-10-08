//package com.kpaydeveloper.aplikasiComplete.service;
//
//import com.kpaydeveloper.aplikasiComplete.dto.entity.User;
//import com.kpaydeveloper.aplikasiComplete.repositori.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//		User user = userRepository.findByUsername(username);
//		if(user==null) {
//			throw new UsernameNotFoundException("User not found!");
//		}
//
//		return new UserPrincipal(user);
//	}
//
//}
