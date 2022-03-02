package com.example.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.banking.Models.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByAccountNo(String accountNo);
	
}
