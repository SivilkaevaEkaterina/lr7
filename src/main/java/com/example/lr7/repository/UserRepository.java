package com.example.lr7.repsository;

import com.example.lr7.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail (String email);
}
