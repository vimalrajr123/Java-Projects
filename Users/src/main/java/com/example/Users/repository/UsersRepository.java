package com.example.Users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Users.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

}
