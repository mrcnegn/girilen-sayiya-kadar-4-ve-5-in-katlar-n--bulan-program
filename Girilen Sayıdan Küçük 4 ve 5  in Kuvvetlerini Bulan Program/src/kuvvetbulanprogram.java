import java.util.Scanner;

public class kuvvetbulanprogram {

	public static void main(String[] args) {
		//Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in 
		//kuvvetlerini ekrana yazd�ran program� yaz�yoruz.
		Scanner input = new Scanner(System.in);
		int m,i=1;
		
		System.out.println(" sayi Gir : " );
        m = input.nextInt();
        
		    	
	        while(i<m) {
	        	
	        	i++;
	        	if(i%20==0) {
	        		
	        		System.out.println(i );
	        		
	        	}
        	
	        	
        }

	}

}
