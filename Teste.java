import java.util.Scanner;

public class Teste{

	public static void main(String[] args){
		System.out.println("Insira a quantidade de veiculos: ");
		Scanner input = new Scanner(System.in);
		int qnt = input.nextInt();
		Carro[] c = new Carro[qnt];
		
		for(int i=0; i<qnt; i++)
			c[i] = new Carro();

		String aux1;
		int aux2;
		for(int i=0;i<qnt;i++){
			System.out.println(" - - Carro_" + (i+1) + " - -");
			System.out.printf("Modelo: ");
			aux1 = input.next();
			c[i].setModelo(aux1);
			System.out.printf("Placa: ");
			aux1 = input.next();
			c[i].setPlaca(aux1);
			System.out.printf("Ano: ");
			aux2 = input.nextInt();
			c[i].setAno(aux2);
			System.out.printf("Estado: ");
			aux2 = input.nextInt();
			c[i].setEstado(aux2);
		}			
		Locadora l = new Locadora();
		l.setQnt(qnt);
		aux2=0;
		while(aux2!=4){
			System.out.println("\n");
			System.out.println("1. Alugar Veiculo\n2. Devolver Veiculo\n3. Exibir Catalogo\n4. Sair");
			aux2 = input.nextInt();
			switch(aux2){
				case 1: System.out.println("- - Insira a placa do veiculo - -");
					aux1 = input.next();
					for(int i=0;i<qnt;i++){
						if(aux1.equals(c[i].getPlaca())){
							if(l.alugar(c[i],i)==1){
								System.out.println("- - Veiculo alugado com sucesso - -");
								break;
							}
							else{
								System.out.println("- - ERRO - -");
								break;
							}
						}
					}
					break;

				case 2: System.out.println("- - Insira a placa do veiculo - -");
					aux1 = input.next();
					for(int i=0;i<qnt;i++){
						if(aux1.equals(c[i].getPlaca())){
							if(l.devolver(c[i],i)==1){
								System.out.println("- - Veiculo devolvido com sucesso - -");
								break;
							}
							else{
								System.out.println("- - ERRO - -");
								break;
							}
						}
					}
					break;
				
				case 3: l.exibir(c);
					break;

				case 4: break;

				default: System.out.println("- - Digite uma opcao valida - -");
			}
		}
	}
}