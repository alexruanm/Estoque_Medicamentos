package br.com.Estoque_De_Medicamentos.Businness;

import br.com.Estoque_De_Medicamentos.dao.DaoItemProduto;
import br.com.Estoque_De_Medicamentos.dao.IDaoItemProduto;
import br.com.Estoque_De_Medicamentos.entidade.ItemProduto;
import br.com.Estoque_De_Medicamentos.exceptions.BusinessException;

public class BusinessItemProduto implements IBusinessItemProduto {
	
	private IDaoItemProduto daoItemProduto;
	
	public BusinessItemProduto() {
		this.daoItemProduto= new DaoItemProduto();
	}

	@Override
	public void salvar (ItemProduto itemProduto, int id_fornecedor, int id_produto) throws BusinessException {
		try {
			this.daoItemProduto.salvar(itemProduto, id_fornecedor, id_produto);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

	@Override
	public void editar(ItemProduto itemProduto) throws BusinessException {
		try {
			this.daoItemProduto.editar(itemProduto);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public ItemProduto buscarPorId(int id) throws BusinessException {
		try {
			return this.daoItemProduto.buscarPorId(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}



}
