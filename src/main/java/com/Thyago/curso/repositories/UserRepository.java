package com.Thyago.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Thyago.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
