package lacofor;

import java.util.Scanner;

public class repeticaoWhile1 {

	public static void main(String[] args) {

		int idade, menor=0, maior=0, condicao=0;

		Scanner leia = new Scanner(System.in);

		while(condicao>=0) {

			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			condicao=idade;

			if (idade<21 && idade>0) {menor++;}
			else if (idade>50 && idade>0) {maior++;}

		}
		System.out.printf("Total de pessoas menores de 21 anos: %d", menor);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maior);
	}

}
