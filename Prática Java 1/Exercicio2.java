package primeiraPratica;

import java.util.Scanner;		

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		leia.close();
		
		float mediaFinal = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf(" A média final  é: %.1f" , mediaFinal);
		
		
		
	}

}
