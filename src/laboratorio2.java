/* Aluno: André Pereira de Andrade
 * Aluno: Carlos Vinicius
 */
import java.util.Scanner;
import java.util.Random;

public class laboratorio2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random pc =new Random();
		int usuário1;
		int usuário2;
		int computador;
		System.out.println("Digite 1 para papel;  2 para pedra ou 3 para tesoura");
		
		System.out.println("usuário1 faça sua jogada");
		usuário1 = sc.nextInt();
		
		System.out.println(" usuário2 faça sua jogada");
		
		
			
		
			
		
		usuário2 = sc.nextInt();
		computador = pc.nextInt(3)+1;
	
		switch(usuário1) {
		case 1:
			System.out.println("usuário1 escolheu papel");
			break;
		case 2:
			System.out.println("usuário1 escolheu pedra");
			break;
		case 3 :
			System.out.println("usuário1 escolheu tesoura");
			break;
		}
		switch(usuário2) {
		case 1:
			System.out.println("usuário2 escolheu papel");
			break;
		case 2:
			System.out.println("usuário2 escolheu pedra");
			break;
		case 3 :
			System.out.println("usuário2 escolheu tesoura");
			break;
		}
		/*switch(computador) {
		case 1:
			System.out.println("computador escolheu papel");
			break;
		case 2:
			System.out.println("computador escolheu pedra");
			break;
		case 3 :
			System.out.println("computador escolheu tesoura");
			break;
		}*/

		if(usuário1 == usuário2) {
		//	if(usuário1 == computador) {
			System.out.println("enpate");
		}
		else if((usuário1- usuário2)== -1 || (usuário1 - usuário2)== 2) { 
			
		
		//	else if((usuário1- computador)== -1 || (usuário1 - computador)== 2) {
					System.out.println("usuário1 vencedor");
					
	}
		else { 
			System.out.println("usuário2 vencedor");
			//System.out.println("computador vencedor");
		}
	
		}
	

}