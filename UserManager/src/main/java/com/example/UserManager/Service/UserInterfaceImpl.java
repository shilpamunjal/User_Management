package com.example.UserManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserManager.Model.UserDetails;
import com.example.UserManager.repository.UserDetailsRepository;

@Service
public class UserInterfaceImpl implements UserService{
	@Autowired
	private UserDetailsRepository userRepo;

	@Override
	public UserDetails createUser(UserDetails user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		return userRepo.existsByEmail(email);
		// TODO Auto-generated method stub
	
	}

}
