package com.cohart20.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cohart20.entity.User;
import com.cohart20.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userrepository;

	public void adduser(String uname, String pword, String name, String lname, String email) {

		User user = new User(uname, pword, name, lname, email);

		userrepository.save(user);

	}

	public User getuser(String uname, String pword) {

		Optional<User> optional = userrepository.findById(uname);

		User user = new User();

		user = optional.get();
		return user;

	}

	public String loginuser(String uname, String pword) {

		Optional<User> optional = userrepository.findById(uname);

		User user = new User();

		if (optional.isEmpty()) {
			return "invalid";
		} else {

			user = optional.get();

			String usernm = user.getUsername();

			if (usernm.equals(uname)) {

				if (user.getPassword().equals(pword)) {

					return "valid";

				} else
					return "invalid";

			} else
				return "invalid";
		}

	}

	public List<User> getAllUsers() {

		List<User> users = userrepository.findAll();

		return users;
	}

	public void deleteUser(String username) throws Exception {

          userrepository.deleteById(username);
		
		
	}

	public User getUser(String username) throws Exception {
		
		
		
		Optional<User> optional= userrepository.findById(username);
		User user = optional.get();
		
		return user;
	}

	public void updregister(String username, String firstname, String lastname, String email) {
		System.out.println("update");
		Optional<User> optional= userrepository.findById(username);
		User user = optional.get();
		String pword = user.getPassword();
		 user = new User(username,pword,firstname,lastname,email);

		userrepository.save(user);
		
		
	}
	

}