import java.util.Scanner;

public class Problema_Pesas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int p10,cont10=0;
		int p20, cont20=0;
		int p15,cont15=0;
		int p5,cont5=0;
		int p2,cont2=0;
		int p1,cont1=0;
		int ptotal = 26;
		int x = 0;
		
		p20 = teclado.nextInt();
		p15 = teclado.nextInt();
		p10 = teclado.nextInt();
		p5 = teclado.nextInt();
		p2 = teclado.nextInt();
		p1 = teclado.nextInt();
		
		do {
			if(p20 > 0 && (x+20) <= ptotal) { x = x+20;
				cont20++;}
			if(p15 > 0 && (x+15) <= ptotal) { x = x+15 ;
			cont15++;}
			if(p10 > 0 && (x+10) <= ptotal) {x = x+10 ;
			cont10++;}
			if(p5 > 0 && (x+5) <= ptotal) {x = x+5 ;
			cont5++;}
			if(p2 > 0 && (x+2) <= ptotal) { x = x+2 ;
			cont2++;}
			if(p1 > 0 && (x+1) <= ptotal) {x = x+1 ;
			cont1++;}
			
			
		}while(x!=ptotal);
		
		System.out.println("20-"+cont20);
		System.out.println("15-"+cont15);
		System.out.println("10-"+cont10);
		System.out.println("5-"+cont5);
		System.out.println("2-"+cont2);
		System.out.println("1-"+cont1);
		
		
	}

}
