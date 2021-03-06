package br.com.Estoque_De_Medicamentos.entidade;

import java.util.List;

public class Produto {
	
	private Integer id;
	private String nome;
	private String tipo;
	private List<ItemProduto> itemProduto;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the itemProduto
	 */
	public List<ItemProduto> getItemProduto() {
		return itemProduto;
	}

	public void setItemProduto(List<ItemProduto> itemProduto) {
		this.itemProduto = itemProduto;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome:"+ getNome()+"\nTipo: "+getTipo();
	}
	
	

}
