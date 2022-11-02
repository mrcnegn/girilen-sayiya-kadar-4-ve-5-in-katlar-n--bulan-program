import java.util.Scanner;

public class kuvvetbulanprogram {

	public static void main(String[] args) {
		//Java döngüler ile girilen sayýya kadar olan 4 ve 5'in 
		//kuvvetlerini ekrana yazdýran programý yazýyoruz.
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
