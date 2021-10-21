package br.com.joaovjc.rpg_site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joaovjc.rpg_site.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	
	
}
