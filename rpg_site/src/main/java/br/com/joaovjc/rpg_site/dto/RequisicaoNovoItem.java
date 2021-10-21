package br.com.joaovjc.rpg_site.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;

import br.com.joaovjc.rpg_site.model.Item;
import br.com.joaovjc.rpg_site.model.TipoItem;

public class RequisicaoNovoItem {
	@NotEmpty
	private String nome;
	private BigDecimal peso;
	private String descricao = null;
	@NotEmpty
	private String tipo;
	
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public BigDecimal getPeso() {return peso;}
	public void setPeso(BigDecimal peso) {this.peso = peso;}
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) {this.descricao = descricao;}
	public String getTipo() {return tipo;}
	public void setTipo(String tipo) {this.tipo = tipo;}
	public Item toItem() {
		Item item = new Item();
		item.setDescricao(this.descricao);
		item.setNome(nome);
		item.setPeso(peso);
		item.setTipoItem(TipoItem.valueOf(tipo.toUpperCase()));
		return item;
	}
	
}
