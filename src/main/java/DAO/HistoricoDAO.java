package DAO;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Historico;
import utilitarios.bd.ConectaBanco;

public class HistoricoDAO {

	
	private ConectaBanco conexao = new ConectaBanco();
	private ResultSet rs;
	private PreparedStatement stm;
	private List<Historico> table;

	public ArrayList<Historico> getTable() throws SQLException {
		try {

			conexao.conexao();
			stm = conexao.conn.prepareStatement("SELECT idcliente,idcarro,endereco,km,datahora FROM historico");
			rs = stm.executeQuery();
			table = new ArrayList<Historico>();
			while (rs.next()) {
				
				Historico his = new Historico(rs.getInt("idcliente"),rs.getInt("idcarro"),rs.getString("endereco"),rs.getString("km"),rs.getString("datahora"));
				table.add(his);
			}
			stm.close();
			return (ArrayList<Historico>) table;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		} finally {
			rs.close();
			stm.close();
			conexao.desconecta();
		}
	
	return (ArrayList<Historico>) table;
	}

}
