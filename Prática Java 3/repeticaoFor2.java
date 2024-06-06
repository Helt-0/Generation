package lacofor;

import java.util.Scanner;

public class repeticaoFor2 {

	public static void main(String[] args) {

		int n, controle, contadorp=0, contadorimp=0;

		Scanner leia = new Scanner(System.in);

		for (controle = 1; controle <=10; controle++) {

			System.out.printf("Digite o %d º número: ", controle);
			n = leia.nextInt();

			if(n%2==0) { contadorp++;}
			else {contadorimp++;}
		}
		System.out.printf("Total de números pares: %d", contadorp);
		System.out.printf("\nTotal de números ímpares: %d", contadorimp);
        
		leia.close();
	}

}
