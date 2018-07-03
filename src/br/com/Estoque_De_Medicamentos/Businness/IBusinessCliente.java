package br.com.Estoque_De_Medicamentos.Businness;

import java.util.List;

import br.com.Estoque_De_Medicamentos.entidade.Cliente;

public interface IBusinessCliente {
	
	 public void salvar(Cliente cliente);
	 public void editar(Cliente cliente);
	 public Cliente buscarPorId(int id);
	 public Cliente buscarPorCpf(String cpf);
	 public List<Cliente> buscarPorBusca(String busca);

}
