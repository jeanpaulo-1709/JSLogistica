package controle;

import java.io.IOException;

import javax.faces.bean.ManagedBean;

import controle.util.SessionUtil;
import modelo.Cliente;

@ManagedBean(name = "minhaContaMB")
public class minhaContaMB {
	
	Cliente cliente = new Cliente();
	
	public String irParaMinhaConta() throws ClassNotFoundException, IOException{
		this.cliente = (Cliente) SessionUtil.getParam("USUARIOLogado");
		//this.cliente = cliDAO.getMinhaConta(this.cliente.getNome());
		return "minhaConta.xhtml";
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
