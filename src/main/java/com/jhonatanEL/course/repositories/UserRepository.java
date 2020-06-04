package com.jhonatanEL.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonatanEL.course.entites.User;

//instancia a entidade repository e a chave que é o id, com um obeto user
//repository, que vai servir para se conectar com o banco de dados
public interface UserRepository extends JpaRepository<User, Long> {

}
