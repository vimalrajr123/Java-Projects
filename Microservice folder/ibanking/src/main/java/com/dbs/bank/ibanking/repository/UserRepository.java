package com.dbs.bank.ibanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.bank.ibanking.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
