package collections;

import java.util.Scanner;
import java.util.ArrayList;

public class práticaList2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int entrada;

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.print("Digite o número que você deseja encontrar: ");
		entrada = leia.nextInt();
		if(numeros.indexOf(entrada)>=0) {System.out.print("O número "+ entrada+ " está localizado na posição: "+numeros.indexOf(entrada));}
		else {System.out.print("O número "+entrada+" não foi encontrado!");}

		leia.close();
	}

}
