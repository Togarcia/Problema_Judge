import java.util.Scanner;

public class Problema_Pesas {

	public static void main(String[] args) {
		/*
		 * @param p20 - total pesas de 20
		 * 
		 * @param p15 - total pesas de 15
		 * 
		 * @param p10 - total pesas de 10
		 * 
		 * @param p5 - total pesas de 5
		 * 
		 * @param p2 - total pesas de 2
		 * 
		 * @param p1 - total pesas de 1
		 * 
		 * @param cont20 - contador pesas introducidas de 20
		 * 
		 * @param cont15 - contador pesas introducidas de 15
		 * 
		 * @param cont10 - contador pesas introducidas de 10
		 * 
		 * @param cont5 - contador pesas introducidas de 5
		 * 
		 * @param cont2 - contador pesas introducidas de 2
		 * 
		 * @param cont1 - contador pesas introducidas de 1
		 * 
		 * @param x = numero de iteracions
		 * 
		 */
		Scanner teclado = new Scanner(System.in);
		int p10, cont10;
		int p20, cont20;
		int p15, cont15;
		int p5, cont5;
		int p2, cont2;
		int p1, cont1;
		int ptotal;
		int x;
		int j = teclado.nextInt();

		for (int i = 0; i < j; i++) {
			ptotal= teclado.nextInt();
			p20 = teclado.nextInt();
			p15 = teclado.nextInt();
			p10 = teclado.nextInt();
			p5 = teclado.nextInt();
			p2 = teclado.nextInt();
			p1 = teclado.nextInt();
			cont10 = 0;
			cont20 = 0;
			cont15 = 0;
			cont5 = 0;
			cont2 = 0;
			cont1 = 0;
			x = 0;
			do {
				if (p20 > cont20 && (x + 20) <= ptotal) {
					x = x + 20;
					cont20++;
				} else if (p15 > cont15 && (x + 15) <= ptotal) {
					x = x + 15;
					cont15++;
				} else if (p10 > cont10 && (x + 10) <= ptotal) {
					x = x + 10;
					cont10++;
				} else if (p5 > cont5 && (x + 5) <= ptotal) {
					x = x + 5;
					cont5++;
				} else if (p2 > cont2 && (x + 2) <= ptotal) {
					x = x + 2;
					cont2++;
				} else if (p1 > cont1 && (x + 1) <= ptotal) {
					x = x + 1;
					cont1++;
				}

			} while (x != ptotal);
			System.out.println("20-" + cont20);
			System.out.println("15-" + cont15);
			System.out.println("10-" + cont10);
			System.out.println("5-" + cont5);
			System.out.println("2-" + cont2);
			System.out.println("1-" + cont1);

		}

	}

	
}
