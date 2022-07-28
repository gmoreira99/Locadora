public class Locadora{
	private int qnt;

	public Locadora(){
		this.qnt=0;
	}
	
	public void setQnt(int qnt){
		this.qnt=qnt;
	}

	public int getQnt(){
		return qnt;
	}

	public int alugar(Carro c, int posicao){
		if(c.getEstado()==1)
			return 0;
		else{
			c.setEstado(1);
			return 1;
		}
	}

	public int devolver(Carro c, int posicao){
		if(c.getEstado()==0)
			return 0;
		else{
			c.setEstado(0);
			return 1;
		}		
	}
	
	public void exibir(Carro[] c){
		for(int i=0; i<qnt; i++){
			System.out.println(" - - Carro_" + (i+1) + " - -");
			System.out.println("Modelo: " + c[i].getModelo());
			System.out.println("Placa: " + c[i].getPlaca());
			System.out.println("Ano: " + c[i].getAno());
			System.out.println("Estado: " + c[i].getEstado());
		}	
	}
}