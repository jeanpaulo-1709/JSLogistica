package modelo;

import java.io.Serializable;

public class Usuario implements  Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String login;
	private String nome;
	private String senha;

	public Usuario(String login, String nome, String senha)
	{
		super();
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}

	/**
	 * 
	 */
	public Usuario()
	{
		super();
	}

	public boolean senhaCorreta(String senhaDigitada)
	{
		if (this.senha.equals(senhaDigitada))
			return true;
		else
			return false;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getSenha()
	{
		return senha;
	}

	public void setSenha(String senha)
	{
		this.senha = senha;
	}

	@Override
	public int hashCode()
	{
		if (this.id == null)
			return 0;

		return this.id.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return this.login;
	}

}
