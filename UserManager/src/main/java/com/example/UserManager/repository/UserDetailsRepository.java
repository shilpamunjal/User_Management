package com.example.UserManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserManager.Model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer>{

	public boolean existsByEmail(String email);
}
