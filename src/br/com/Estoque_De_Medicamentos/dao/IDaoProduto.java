package br.com.Estoque_De_Medicamentos.dao;

import java.util.List;

import br.com.Estoque_De_Medicamentos.entidade.Cliente;
import br.com.Estoque_De_Medicamentos.entidade.Produto;

public interface IDaoProduto {
	
	 public void salvar(Produto produto);
	 public void editar(Produto produto);
	 public Produto buscarPorId(int id);
	 public List<Produto> buscarPorBusca(String busca);

}
