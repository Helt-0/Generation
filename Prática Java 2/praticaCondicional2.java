package lacoscondicionais;

import java.util.Scanner;

public class praticaCondicional2 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		a = leia.nextInt();
		
		if(a%2==0 && a>0) {
			System.out.printf("O Número %d é par e positivo!", a);
		} else if(a%2==0 && a<0) {
			System.out.printf("O Número %d é par e negativo!", a);
		} else if(a%2!=0 && a>0) {
			System.out.printf("O Número %d é ímpar e positivo!",a);
		}else {
			System.out.printf("O Número %d é ímpar e negativo!", a);
		}
		
	}

}
