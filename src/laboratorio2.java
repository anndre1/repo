/* Aluno: Andr� Pereira de Andrade
 * Aluno: Carlos Vinicius
 */
import java.util.Scanner;
import java.util.Random;

public class laboratorio2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random pc =new Random();
		int usu�rio1;
		int usu�rio2;
		int computador;
		System.out.println("Digite 1 para papel;  2 para pedra ou 3 para tesoura");
		
		System.out.println("usu�rio1 fa�a sua jogada");
		usu�rio1 = sc.nextInt();
		
		System.out.println(" usu�rio2 fa�a sua jogada");
		
		
			
		
			
		
		usu�rio2 = sc.nextInt();
		computador = pc.nextInt(3)+1;
	
		switch(usu�rio1) {
		case 1:
			System.out.println("usu�rio1 escolheu papel");
			break;
		case 2:
			System.out.println("usu�rio1 escolheu pedra");
			break;
		case 3 :
			System.out.println("usu�rio1 escolheu tesoura");
			break;
		}
		switch(usu�rio2) {
		case 1:
			System.out.println("usu�rio2 escolheu papel");
			break;
		case 2:
			System.out.println("usu�rio2 escolheu pedra");
			break;
		case 3 :
			System.out.println("usu�rio2 escolheu tesoura");
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

		if(usu�rio1 == usu�rio2) {
		//	if(usu�rio1 == computador) {
			System.out.println("enpate");
		}
		else if((usu�rio1- usu�rio2)== -1 || (usu�rio1 - usu�rio2)== 2) { 
			
		
		//	else if((usu�rio1- computador)== -1 || (usu�rio1 - computador)== 2) {
					System.out.println("usu�rio1 vencedor");
					
	}
		else { 
			System.out.println("usu�rio2 vencedor");
			//System.out.println("computador vencedor");
		}
	
		}
	

}