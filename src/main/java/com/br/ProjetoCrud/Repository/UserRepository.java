package com.br.ProjetoCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ProjetoCrud.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
