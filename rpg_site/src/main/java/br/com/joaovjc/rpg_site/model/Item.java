package br.com.joaovjc.rpg_site.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Item {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	private BigDecimal peso;
	private String descricao;
	@Enumerated(EnumType.STRING)
	private TipoItem tipoItem;
	
	public Item(String nome, BigDecimal peso, String descricao) {
		this.nome = nome;
		this.peso = peso;
		this.descricao = descricao;
	}
	
	public Item() {}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public BigDecimal getPeso() {return peso;}
	public void setPeso(BigDecimal peso) {this.peso = peso;}
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) {this.descricao = descricao;}
	public long getId() {return id;}
	public TipoItem getTipoItem() {return tipoItem;}
	public void setTipoItem(TipoItem tipoItem) {this.tipoItem = tipoItem;}
	
	
}
