package Ex2;
import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {

		Pessoa AL = new Pessoa();
		Pessoa[] VetPessoa = new Pessoa[10]; // Criando um vetor para Contas 
		Scanner ler = new Scanner(System.in); 
		Pessoa.menu();
		
		
		public void menu() {
			System.out.println("..:: Sistema Bancário::..");
		int x= Console
		int i;
		
			switch (x){
		        case 1: 
		        	for(int i1 = 0 ; i1<3 ; i1++){		
						System.out.println("\n------------------------------- \n");
						
						System.out.println("Informe o nome: "); 
						AL.setNome(ler.next());
						
						System.out.println("Informe a Idade: "); 
						AL.setIdade(ler.nextInt());
						
						System.out.println("Informe o Sexo: "); 
						AL.setSexo(ler.next());
						
						VetPessoa[i1] = AL;
					}
		            break;
		        case 2:
		        	for(int i1 = 0; i1<3 ; i1++){
						AL = VetPessoa[i1]; 
						
						System.out.println("\n------------------------------- \n");
						System.out.println("Nome: "+AL.getnome());
						System.out.println("Idade: "+AL.getidade());
						System.out.println("Sexo: "+AL.getsexo());
					}
	            break;
			}
	    }
	}

}

