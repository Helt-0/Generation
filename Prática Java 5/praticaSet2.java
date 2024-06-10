package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class praticaSet2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		System.out.print("Digite o número que você deseja encontrar: ");
		int entrada = leia.nextInt();

		if(setNumeros.contains(entrada)) {System.out.print("O número "+entrada+" foi encontrado!");}
		else {System.out.print("O número "+entrada+" não foi encontrado!");}

		leia.close();

	}

}
