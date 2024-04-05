package com.sharma.explore.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sharma.explore.model.User;

public interface UserRepository  extends JpaRepository<User, Long> {
	User findByEmail(String email);
}