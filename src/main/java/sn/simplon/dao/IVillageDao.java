package sn.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.entities.Village;



@Repository
public interface IVillageDao extends JpaRepository<Village, Integer> {

}
