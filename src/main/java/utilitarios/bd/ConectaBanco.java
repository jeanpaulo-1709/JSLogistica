package utilitarios.bd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectaBanco {
	//Properties prop = new Properties();

	private Statement stm;
	private ResultSet rs;
	public Connection conn;

	public void conexao() throws IOException, ClassNotFoundException {
		try {
			
			//prop = Configuracao.getProp();

			//System.setProperty("jdbc.Drivers", prop.getProperty("driver"));
			Class.forName("org.postgresql.Driver");
			System.setProperty("jdbc.Drivers", "org.postgresql.Driver");

			//this.conn = DriverManager.getConnection(prop.getProperty("caminho"), prop.getProperty("login"),	prop.getProperty("senha"));
			this.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/js", "postgres","c4st3l0s");
			
			///System.out.println("Conectou");

		} catch (SQLException ex) {
			System.out.println("ERRO DE CONEXAO \n ERRO: " + ex.getMessage());
			//System.out.println("NAO Conectou");
		//	ex.printStackTrace();
		}
	}

	public void desconecta() {
		try {
			this.conn.close();
		} catch (SQLException ex) {
			System.out.println("ERRO AO DESCONECTAR \n ERRO: " + ex.getMessage());

			ex.printStackTrace();
		}
	}

	
}
