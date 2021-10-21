package br.com.joaovjc.rpg_site.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.joaovjc.rpg_site.model.Item;
import br.com.joaovjc.rpg_site.repository.ItemRepository;

@Controller
public class PersonagemInvetarioController {
	
	@Autowired
	private ItemRepository repository;
	
	@RequestMapping("interfacePlayer")
	public String interfacePlayer(Model model, Principal pri) {
		List<Item> itens = repository.findAllByUsername(pri.getName());
		model.addAttribute("itens", itens);
		return "interfacePlayer";
	}
	
	
}
