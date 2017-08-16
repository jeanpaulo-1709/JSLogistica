package DAO;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Cliente;
import utilitarios.bd.ConectaBanco;

public class ClienteDAO {
	private Cliente c = new Cliente();
	private ConectaBanco conexao = new ConectaBanco();
	private ResultSet rs;
	private PreparedStatement stm;

	public Cliente getClientePorChave(String login) throws IOException, ClassNotFoundException {
		conexao.conexao();
		try {
			stm = conexao.conn.prepareStatement("SELECT * FROM cliente where usuario = ?");
			stm.setString(1, login);
			rs = stm.executeQuery();

			if (rs.next()) {
				c.setIdCliente(rs.getInt("idCliente"));
				
				c.setEndereco(rs.getString("endereco"));
				c.setCidade(rs.getString("cidade"));
				c.setBairro(rs.getString("bairro"));
				c.setCep(rs.getString("cep"));
				
				c.setNome(rs.getString("nome"));
				
				c.setRazaoSocial(rs.getString("razaoSocial"));
				c.setCnpj(rs.getString("cnpj"));
				c.setEmail(rs.getString("email"));
				c.setInscricaoEstadual(rs.getString("inscricaoEstadual"));
				c.setInscricaoMunicipal(rs.getString("inscricaoMunicipal"));
				
				c.setTelefone(rs.getString("telefone"));
				c.setUf(rs.getString("uf"));
				
				c.setStatus(rs.getBoolean("status"));
				
				return c;
			}

		} catch (SQLException e) {

		} finally {
			conexao.desconecta();
		}
		return null;
	}

	public boolean getClienteLogin(String login, String senha) throws IOException, ClassNotFoundException {
		conexao.conexao();
		try {
			stm = conexao.conn.prepareStatement("SELECT * FROM cliente where usuario = ? and senha = ?");
			stm.setString(1, login);
			stm.setString(2, senha);
			rs = stm.executeQuery();

			if (rs.next()) {

				if (rs.getBoolean("status") == true) {
					return true;
				} else {
					return false; // usuario desativado
				}
			} else {
				return false;
			}

		} catch (SQLException e) {
			return false;
		} finally {
			conexao.desconecta();
		}
		
}
	
	public Cliente getMinhaConta(String login) throws IOException, ClassNotFoundException {
		conexao.conexao();
		try {
			stm = conexao.conn.prepareStatement("SELECT nome,razaosocial,cnpj,endereco,bairro,cidade,numero,cep,uf,email,telefone FROM cliente where login = ?");
			stm.setString(0, login);
			rs = stm.executeQuery();

			if (rs.next()) {
				
				c.setEndereco(rs.getString("endereco"));
				c.setCidade(rs.getString("cidade"));
				c.setBairro(rs.getString("bairro"));
				c.setCep(rs.getString("cep"));
				c.setNumero(rs.getInt("numero"));
				
				c.setNome(rs.getString("nome"));
				
				c.setRazaoSocial(rs.getString("razaoSocial"));
				c.setCnpj(rs.getString("cnpj"));
				c.setEmail(rs.getString("email"));
								
				c.setTelefone(rs.getString("telefone"));
				c.setUf(rs.getString("uf"));
				
				return this.c;
				
			}

		} catch (SQLException e) {
			return c = null;
		} finally {
			conexao.desconecta();
		}
		return c;
		

}
}