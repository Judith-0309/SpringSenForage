package sn.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.entities.User;



@Repository
public interface IRoles extends JpaRepository<User, Integer>{

}
