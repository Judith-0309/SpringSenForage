package sn.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.entities.Client;

@Repository
public interface IClientDao extends JpaRepository<Client, Integer>{
	

}
