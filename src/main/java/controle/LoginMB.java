package controle;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import DAO.ClienteDAO;
import modelo.Cliente;

@ManagedBean(name = "loginMB")
@SessionScoped
public class LoginMB implements Serializable
{
	private static final long serialVersionUID = 1L;

	private boolean autenticado = false;
	Cliente cliente = new Cliente();
	ClienteDAO dao = new ClienteDAO();
	
	private String login = "";
	private String senha = "";

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente Cliente)
	{
		this.cliente = Cliente;
	}

	public boolean isAutenticado()
	{
		return autenticado;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getSenha()
	{
		return senha;
	}

	public void setSenha(String senha)
	{
		this.senha = senha;
	}

	/**
	 * 
	 */
	public String acaoAbrirLogin()
	{
		return "login";
	}
	
	public String logar() throws IOException, ClassNotFoundException{
		
		if (login.equals("") && senha.equals("")){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Login e Senha Vazios!","Os campos são obrigatórios!"));
			return getPagLogin();
		}else if(login.equals("")){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Login Vazio!","O campo Login é obrigatório!"));
			return getPagLogin();
		}else if (senha.equals("")){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Senha Vazia!","O campo Senha é obrigatório!"));
			return getPagLogin();
		}else if(dao.getClienteLogin(login, senha)){
			return getHome();
		}else {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Login Inválido!","Por favor tente novamente!"));
	         // invalidate session, and redirect to other pages
	         //message = "Invalid Login. Please Try Again!";
	         return getPagLogin();
		
		}
	}
	
	public String getHome() {
		return "home";
	}
	
	public String getPagLogin() {
		return "";
	}
	
	
	
	

	/**
	 * @throws IOException 
	 * 
	 */
	/* public String acaoAutenticar() throws IOException
	{
		ClienteDAO dao = new ClienteDAO();

		if (dao.getClienteLogin(this.getLogin(),this.getSenha()) == false)
		{
			JSFUtil.retornarMensagemErro("Usuário não existe.", null, null);
			return "login";
		}
		else
		{
			// guardar o obteto usuário
			this.setCliente(dao.getClientePorChave(this.login));
			this.autenticado = true;

			return "home";
		}
	}

	/**
	 * 
	
	public String acaoLogout()
	{
		this.cliente = new Cliente(false);
		this.autenticado = false;
		this.login = null;
		this.senha = null;

		// encerrar a sessão atual
		JSFUtil.getHttpSession().invalidate();

		return "login";
	} */

}
