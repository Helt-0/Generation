package primeiraPratica;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.print("n1? ");
		n1 = leia.nextFloat();
		
		
		System.out.print("n2? ");
		n2 = leia.nextFloat();
		
		System.out.print("n3? ");
		n3= leia.nextFloat();
		
		System.out.print("n4? ");
		n4= leia.nextFloat();
		
		leia.close();
		
		System.out.printf("a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: %.1f", ((n1*n2)-(n3*n4)));

	}

}
