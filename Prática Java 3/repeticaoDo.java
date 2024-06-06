package lacofor;

import java.util.Scanner;

public class repeticaoDo {

	public static void main(String[] args) {

		int n, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.print("Digite um número: ");
			n = leia.nextInt();

			if(n>0) {
				soma = soma + n;
			}
		} while (n!=0);
		System.out.printf("A soma dos números positivos é: %d", soma);
	}

}
