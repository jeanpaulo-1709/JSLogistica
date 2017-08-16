package modelo;

public class Cliente {
	
	int    idCliente;
	String razaoSocial;
	String nome;
	String cnpj;
	String inscricaoMunicipal;
	String inscricaoEstadual;
	String endereco;
	String bairro;
	String cep;
	String cidade;
	String uf;
	String email;
	String telefone;
	boolean status;
	boolean isLogado;
	int numero;
	
	public Cliente(){
		
	}
	
	
	

	public Cliente(int idCliente, String razaoSocial, String nome, String cnpj, String inscricaoMunicipal,
			String inscricaoEstadual, String endereco, String bairro, String cep, String cidade, String uf,
			String email, String telefone, boolean status, boolean isLogado, int numero) {
		super();
		this.idCliente = idCliente;
		this.razaoSocial = razaoSocial;
		this.nome = nome;
		this.cnpj = cnpj;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.inscricaoEstadual = inscricaoEstadual;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.email = email;
		this.telefone = telefone;
		this.status = status;
		this.isLogado = isLogado;
		this.numero = numero;
	}




	

	public int getIdCliente() {
		return idCliente;
	}




	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}




	public String getRazaoSocial() {
		return razaoSocial;
	}




	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCnpj() {
		return cnpj;
	}




	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}




	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}




	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}




	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}




	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	public String getBairro() {
		return bairro;
	}




	public void setBairro(String bairro) {
		this.bairro = bairro;
	}




	public String getCep() {
		return cep;
	}




	public void setCep(String cep) {
		this.cep = cep;
	}




	public String getCidade() {
		return cidade;
	}




	public void setCidade(String cidade) {
		this.cidade = cidade;
	}




	public String getUf() {
		return uf;
	}




	public void setUf(String uf) {
		this.uf = uf;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	public boolean isStatus() {
		return status;
	}




	public void setStatus(boolean status) {
		this.status = status;
	}




	public boolean isLogado() {
		return isLogado;
	}




	public void setLogado(boolean isLogado) {
		this.isLogado = isLogado;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCliente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idCliente != other.idCliente)
			return false;
		return true;
	}
	
	
	

}
