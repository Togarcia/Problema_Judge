import java.util.Scanner;

public class El_pendulo {

/**
 * Funcio unica i principal del programa
 * 
 * @param double ang- indica el angle de opertura, pot contenir decimals
 * @param int x- numero de interacions
 * @param double resultado- resultat es torna en deciaml  - indica el resultat
 * @param double brazo- per introduir mides deciamls - indica mida del braç
 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double ang;
		int x = teclado.nextInt();
		
		double resultado,brazo;
		
		
		for(int i = 0;i < x;i++) {
		
		brazo = teclado.nextDouble();
		ang = teclado.nextDouble();
		
		resultado = ((2*3.14*brazo)/360)*ang;
		System.out.printf("%.2f", resultado);
		}
		
	}

}
