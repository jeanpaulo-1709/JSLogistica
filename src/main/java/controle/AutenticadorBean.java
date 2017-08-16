package controle;
import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import DAO.ClienteDAO;
import controle.util.SessionUtil;
import modelo.Cliente;

@RequestScoped
@ManagedBean(name="autenticadorBean")
public class AutenticadorBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String login;
	private String senha;
	private Cliente cliente = new Cliente();
	private Cliente clienteLogado = new Cliente();
	private ClienteDAO dao = new ClienteDAO();
	private ClienteMB cliMB = new ClienteMB();
	private boolean autenticado = false;
	

	public String autentica() throws ClassNotFoundException, IOException {
		if(dao.getClienteLogin(login, senha)){
			this.cliente = dao.getClientePorChave(login);
			
			SessionUtil.setParam("USUARIOLogado", this.cliente);

			return "home";			
		} else {
			return cliMB.irParaLogin();	
		}

	}

	public String registraSaida() throws ClassNotFoundException, IOException {
		//REMOVER USUARIO DA SESSION
		SessionUtil.invalidate();
		return cliMB.irParaLogin();
	}

	// GETTERS E SETTERS


	public String getSenha() {
		return senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cli) {
		this.cliente = cli;
	}

	public Cliente getClienteLogado() {
		return clienteLogado;
	}

	public void setClienteLogado(Cliente clienteLogado) {
		this.clienteLogado = clienteLogado;
	}
	
	public boolean isAutenticado()
	{
		return autenticado;
	}
	
	
	

}
