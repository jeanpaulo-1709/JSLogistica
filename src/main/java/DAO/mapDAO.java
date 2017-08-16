package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utilitarios.bd.ConectaBanco;

public class mapDAO {
	
	private ConectaBanco conexao = new ConectaBanco();
	private ResultSet rs;
	private PreparedStatement stm;
	//private String coordenadas = "";
	private String lat;
	private String lon;
	
	
	
	public void atualizaCoordenadas(){
		
		try {
			conexao.conexao();
			stm = conexao.conn.prepareStatement("SELECT coordenadas FROM historico where idcliente = 1 ORDER BY idhistorico DESC limit 1");
			rs = stm.executeQuery();
			
			if(rs.next()){
			lat = rs.getString(1).substring(0,10);
			lon = rs.getString(1).substring(11,21);
			stm.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			try {
				rs.close();
				stm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			conexao.desconecta();
		}
	}
	

	public String getLat() {
		atualizaCoordenadas();
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		atualizaCoordenadas();
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	
	
}
