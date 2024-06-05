package lacoscondicionais;

import java.util.Scanner;

public class praticaCondicional3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiradoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiradoacao = leia.nextBoolean();
		
		if(idade >=18 && idade <= 60) {
			System.out.printf("%s está aptx para doar sange!", nome);
		}else if(idade>=60 && idade <= 69 && !primeiradoacao) {
			System.out.printf("%s está aptx para doar sangue!", nome);
		}else {
			System.out.printf("%s não está aptx para doar sangue!", nome);
		}

	}

}
