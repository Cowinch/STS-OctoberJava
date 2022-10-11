package com.cole.loginreg.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.cole.loginreg.models.LoginUser;
import com.cole.loginreg.models.User;
import com.cole.loginreg.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	
	public User getUser(String email) {
		Optional<User> potentialUser=userRepo.findByEmail(email);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}
	
	public User registerUser(User newUser) {
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		return userRepo.save(newUser);
	}
	
	public User login(LoginUser loginUser, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		User existingUser=getUser(loginUser.getEmail());
		if(existingUser==null) {
			result.rejectValue("email","unknown","Unknown Email");
			return null;
		}
		if(!BCrypt.checkpw(loginUser.getPassword(), existingUser.getPassword())) {
		    result.rejectValue("password", "Matches", "Invalid Password!");
		    return null;
		}
		return existingUser;
	}

	public User findById(Long id) {
		Optional<User> potentialUser=userRepo.findById(id);
		if(potentialUser.isPresent()) {
    		return potentialUser.get();
    	}
		return null;
	}

}
