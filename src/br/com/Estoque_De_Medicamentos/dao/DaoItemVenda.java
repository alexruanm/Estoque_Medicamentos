package br.com.Estoque_De_Medicamentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.Estoque_De_Medicamentos.entidade.ItemVenda;
import br.com.Estoque_De_Medicamentos.exceptions.DaoException;
import br.com.Estoque_De_Medicamentos.sql.ConexaoSQL;
import br.com.Estoque_De_Medicamentos.sql.SQLEstoque;



public class DaoItemVenda implements IDaoItemVenda{
	
	private Connection conexao;
	private PreparedStatement statement;
	
	@Override
	public void salvar(ItemVenda itemVenda)throws DaoException {
		
		try {
			this.conexao = ConexaoSQL.getConnectionInstance(ConexaoSQL.NOME_BD_CONNECTION_POSTGRESS);
			this.statement = conexao.prepareStatement(SQLEstoque.insert_ItemVenda_All);	
			
//			statement.setString(1, itemVenda.getProdutos_comprados());
			statement.setDouble(2, itemVenda.getValor_da_compra());

            statement.executeUpdate();
            this.conexao.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
	}
	@Override
	public void editar(ItemVenda itemVenda) throws DaoException{
		try {
			this.conexao = ConexaoSQL.getConnectionInstance(ConexaoSQL.NOME_BD_CONNECTION_POSTGRESS);
			this.statement = conexao.prepareStatement(SQLEstoque.update_ItemVenda_All);	
			
//			statement.setString(1, itemVenda.getProdutos_comprados());
			statement.setDouble(2, itemVenda.getValor_da_compra());
						
			statement.executeUpdate();
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException("Erro ao Atualizar  Item Venda");
		}
		
	}
	@Override
	public ItemVenda buscarPorId(int id)throws DaoException {
		try {
    		this.conexao = ConexaoSQL.getConnectionInstance(ConexaoSQL.NOME_BD_CONNECTION_POSTGRESS);
			this.statement = conexao.prepareStatement("SELECT * FROM item_venda where id  = '" + id + "'");	

            ResultSet result = this.statement.executeQuery();
            ItemVenda itemVenda= new ItemVenda();
            if (result.next()) {
            	
            	itemVenda.setId(result.getInt(1));
//            	itemVenda.setProdutos_comprados(result.getString(2));
            	itemVenda.setValor_da_compra(result.getDouble(3));
           
            	                
            } else {
                throw new DaoException("ITEM VENDA N�O EXISTE");
            }
            this.conexao.close();
            return itemVenda;

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new DaoException("PROBLEMA AO CONSULTAR itemVenda - CONTATE O ADMINISTRADOR QUALIFICADO");
        }
	}
	
	

}
