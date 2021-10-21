package br.com.joaovjc.rpg_site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.joaovjc.rpg_site.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	
	@Query("SELECT i FROM Item i JOIN i.user u WHERE u.username = :username")
	List<Item> findAllByUsername(@Param("username")String username);
	
	
}
