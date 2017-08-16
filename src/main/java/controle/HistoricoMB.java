package controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.HistoricoDAO;
import modelo.Historico;

@SessionScoped
@ManagedBean(name = "historicoMB")
public class HistoricoMB {

	Historico his = new Historico();
	HistoricoDAO dao = new HistoricoDAO();
	ArrayList<Historico> historico;
	
	public ArrayList<Historico> getHistorico() throws ClassNotFoundException, IOException, SQLException {
		this.historico = dao.getTable();
		return historico;
	}
	
	
	
	
	
}
