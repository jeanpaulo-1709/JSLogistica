package controle;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import DAO.ClienteDAO;
import modelo.Cliente;

@ManagedBean(name = "ClienteMB")
public class ClienteMB implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	ClienteDAO dao = new ClienteDAO();
	Cliente cli = new Cliente();
	
	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public String irParaHome() throws ClassNotFoundException, IOException{
		return "home.xhtml";
	}
	
	public String irParaHistorico() throws ClassNotFoundException, IOException{
		return "historico.xhtml";
	}
	
	public String irParaMapa() throws ClassNotFoundException, IOException{
		return "mapa.xhtml";
	}
	
	public String irParaMeusCarros() throws ClassNotFoundException, IOException{
		return "meusCarros.xhtml";
	}
	
	public String irParaLogin() throws ClassNotFoundException, IOException{
		return "login.xhtml";
	}
	
	
	
	

	// private List<Cliente> clientes = null;

	// criar um dao

	// criar métodos de filtro

	// criar get cliente

	// criar get todos clientes

	// criar metodos que retornam Strings com o nome do JSF (página) para
	// navegação

	// criar CRUD
}
