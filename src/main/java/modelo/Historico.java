package modelo;


public class Historico {

	private int idCliente;
	private int idCarro;
	private String endereco;
	private String km;
	private String datahora;
	
	public Historico(){
		
	}
	
	

	public Historico(int idCliente, int idCarro, String endereco, String km,String datahora) {
		super();
		this.idCliente = idCliente;
		this.idCarro = idCarro;
		this.endereco = endereco;
		this.km = km;
		this.datahora = datahora;
	}



	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}



	public String getDatahora() {
		return datahora;
	}



	public void setDatahora(String datahora) {
		this.datahora = datahora;
	}
	
	
	
	
	
}
