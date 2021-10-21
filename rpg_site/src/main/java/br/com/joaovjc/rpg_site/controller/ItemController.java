package br.com.joaovjc.rpg_site.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.joaovjc.rpg_site.dto.RequisicaoNovoItem;
import br.com.joaovjc.rpg_site.model.Item;
import br.com.joaovjc.rpg_site.model.User;
import br.com.joaovjc.rpg_site.repository.ItemRepository;
import br.com.joaovjc.rpg_site.repository.UserRepository;

@Controller
public class ItemController {
	
	@Autowired
	private ItemRepository repository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("formNovoItem")
	public String formNovoItem(RequisicaoNovoItem requisicao) {
		return "/formNovoItem";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoItem requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "/formNovoItem";
		}
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.findByUsername(username);
		
		Item item = requisicao.toItem();
		item.setUser(user);
		repository.save(item);
		
		return "redirect:/interfacePlayer";
	}
}
