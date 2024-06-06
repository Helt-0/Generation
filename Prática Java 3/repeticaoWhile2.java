package lacofor;

import java.util.Scanner;

public class repeticaoWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		//Separei as váriaveis int por motivo estético, não sei se isso é considerado boa prática...
		int idade, genero, desenvolvedor, contadorBackend = 0, contadorMulheresFrontend = 0; 
		int contadorHomensMobile = 0, contadorNaoBinariosFullStack = 0, totalColaboradores = 0;
		float soma = 0;

		char continuar = 'S';

		while (continuar == 'S') {
			System.out.print("idade: ");
			idade = leia.nextInt();

			System.out.print("Identidade de Gênero: ");
			genero = leia.nextInt();

			System.out.print("Pessoa desenvolvedora: ");
			desenvolvedor = leia.nextInt();

			totalColaboradores++;
			soma += idade;

			if (desenvolvedor == 1) {
				contadorBackend++;
			} else if (desenvolvedor == 2 && (genero == 1 || genero == 4)) {
				contadorMulheresFrontend++;
			} else if (desenvolvedor == 3 && (genero == 2 || genero == 5) && idade > 40) {
				contadorHomensMobile++;
			} else if (desenvolvedor == 4 && genero == 3 && idade < 30) {
				contadorNaoBinariosFullStack++;
			}

			System.out.print("\nDeseja continuar (S/N): ");
			continuar = leia.next().charAt(0);
		}

		System.out.print("Total de pessoas desenvolvedoras Backend: " + contadorBackend);
		System.out.print("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + contadorMulheresFrontend);
		System.out.print("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + contadorHomensMobile);
		System.out.print("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + contadorNaoBinariosFullStack);
		System.out.print("\nO número total de pessoas que responderam à pesquisa: " + totalColaboradores);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", (soma / totalColaboradores));

		leia.close();
	}
}