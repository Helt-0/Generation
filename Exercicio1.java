package primeiraPratica;

import 	java.util.Scanner;	

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		leia.close();
		
		System.out.printf("Novo salario: %.2f", (salario + abono));
		
		
                                             
	}

}
