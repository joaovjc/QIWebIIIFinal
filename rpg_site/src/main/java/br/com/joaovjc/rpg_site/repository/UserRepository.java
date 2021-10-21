package br.com.joaovjc.rpg_site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joaovjc.rpg_site.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	User findByUsername(String username);
	
}
