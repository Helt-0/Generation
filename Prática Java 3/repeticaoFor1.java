package lacofor;

import java.util.Scanner;

public class repeticaoFor1 {

	public static void main(String[] args) {

		int n1, n2,controle;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();

		System.out.print("Digite o segundo número do intervalo: ");
		n2 = leia.nextInt();

		leia.close();

		if(n1<n2) {

			for(controle=n1; controle <= n2; controle++) {

				if (controle%3==0 && controle%5==0) {System.out.printf("%d é múltiplo de 3 e 5\n", controle);}

			} 
			for(controle=n1; controle <= n2; controle++) {

				if(controle%3!=0 && controle%5!=0) {System.out.print("O interválo não possui múltiplos de 3 e 5");}
				break;
			} 

		}
		else {System.out.print("Intervalo inválido!");}
	}

}
