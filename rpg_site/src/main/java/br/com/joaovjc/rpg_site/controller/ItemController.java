package br.com.joaovjc.rpg_site.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.joaovjc.rpg_site.dto.RequisicaoNovoItem;
import br.com.joaovjc.rpg_site.model.Item;
import br.com.joaovjc.rpg_site.repository.ItemRepository;

@Controller
public class ItemController {
	
	@Autowired
	private ItemRepository repository;
	
	@GetMapping("formNovoItem")
	public String formNovoItem(RequisicaoNovoItem requisicao) {
		return "/formNovoItem";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoItem requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "/formNovoItem";
		}
		
		Item item = requisicao.toItem();
		repository.save(item);
		
		return "redirect:/interfacePlayer";
	}
}
