package com.example.UserManager.Service;

import com.example.UserManager.Model.UserDetails;

public interface UserService {

	public UserDetails createUser(UserDetails user);
	
	public boolean checkEmail(String email);
}
