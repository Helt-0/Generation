package lacofor;

import java.util.Scanner;

public class repeticaoDo2 {

	public static void main(String[] args) {

		int n, soma = 0; 
		float contador = 0; 

		Scanner leia = new Scanner(System.in);

		do {

			System.out.print("Digite um número: ");
			n = leia.nextInt();

			if(n>0) {
				if (n%3==0) {soma+=n;contador++;}
			}
		} while (n!=0);
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", (soma/contador));
        
		leia.close();
	}

}
