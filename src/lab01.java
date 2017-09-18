
import java.util.Scanner; 
public class lab01 {
	

	public static void main(String[]args){
		
		final int NÚMEROS_A_LER=3;
	    Scanner sc= new Scanner(System.in);
	    int minimo= Integer.MAX_VALUE;
	    int maximo= Integer.MIN_VALUE;
	    
	    for(int i= 0; i<NÚMEROS_A_LER; i++) {
	    	System.out.println("entre com o próximo número inteiro");
	    	int num = sc.nextInt();
	    	if(num<minimo) {
	    		minimo = num;
	    	}
	    	if (num>maximo){
	    		maximo=num;
	    	
	    }
	    	
	   
	         

	    }	
	    System.out.println("o maior número é:"+maximo);
        System.out.println("o menor número é:"+minimo);
}
	
}