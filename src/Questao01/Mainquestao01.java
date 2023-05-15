package Questao01;
import java.util.Stack;
import java.util.Scanner;

public class Mainquestao01 {
	public static void main(String[] args) {
		
		Stack<Caminhao> prioridade = new Stack<>();
		Stack<Caminhao> correios = new Stack<>();
		
		Scanner scanner = new Scanner(System.in);
		boolean carregaPerecivel;
		
		
		 int num = 0;
		    while (num != 3) {
		      System.out.print("Digite uma opção (1-3): ");
		      int option = scanner.nextInt();
		      
		      switch (option) {
		        case 1:
		        		System.out.print("Informe a placa do caminhao:	");
		        			String placa = scanner.next();
		        			
		        		System.out.print("Informe nome do Motorista:	");
		        			String nomeMotorista = scanner.next();	
		        			 
		        		System.out.print("A Carga é perecivel:	");
		        			String Perecivel = scanner.next();
		        			 Caminhao caminhao = new Caminhao(placa, nomeMotorista);
		        			if (Perecivel.equalsIgnoreCase("S")) {
		        			    carregaPerecivel = true;	
		        			    prioridade.push(caminhao);
//		        			    vai na pilha de prioridade
		        			}
		        			 else if(!Perecivel.equalsIgnoreCase("S")) {
		        				    carregaPerecivel = false;
		        				    correios.push(caminhao);
//		        				    adciona em uma pilha com menos prioridade
		        			}
		        		
		          break;
		        case 2:
		        	if (!prioridade.isEmpty()) {
		        	    System.out.println("Removendo caminhão da pilha de prioridade...");
		        	    prioridade.pop();
		        	} else if (!correios.isEmpty()) {
		        	    System.out.println("Removendo caminhão da pilha de correios...");
		        	    correios.pop();
		        	} else {
		        	    System.out.println("Não há caminhões nas pilhas.");
		        	}
//		          remover da pilha
		        
		          break;
		        case 3:
		          System.out.println("Você escolheu a opção 3.");
		          System.out.println("saindo..");
		          break;
		        default:
		          System.out.println("Opção inválida.");
		      }
		      
		    }
		
				

	}

}
