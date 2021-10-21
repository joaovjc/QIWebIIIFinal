package br.com.joaovjc.rpg_site.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//@Entity
public class Mochila{
	
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private final int pesoMax = 15;
//	@OneToMany
	private List<Item> itens;
	
	public List<Item> getItens() {return itens;}
	public void setItens(List<Item> itens) {this.itens = itens;}
	public long getId() {return id;}
	public int getPesoMax() {return pesoMax;}
	
	
}
