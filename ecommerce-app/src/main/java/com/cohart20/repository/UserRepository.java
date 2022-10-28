package com.cohart20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cohart20.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User,String>{


	
 
}
