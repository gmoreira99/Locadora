public class Carro{
	private String modelo;
	private String placa;
	private int ano;
	private int estado;

	public Carro(){
		this.modelo="";
		this.placa="";
		this.ano=0;
		this.estado=0;
	}

	public void setModelo(String modelo){
		this.modelo=modelo;
	}

	public String getModelo(){
		return modelo;
	}

	public void setPlaca(String placa){
		this.placa=placa;
	}

	public String getPlaca(){
		return placa;
	}

	public void setAno(int ano){
		this.ano=ano;
	}

	public int getAno(){
		return ano;
	}
	
	public void setEstado(int estado){
		this.estado=estado;
	}

	public int getEstado(){
		return estado;
	}

}