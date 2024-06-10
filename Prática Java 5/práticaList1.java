package collections;

import java.util.Scanner;
import java.util.ArrayList;

public class práticaList1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int contador=0;

		ArrayList<String> cores = new ArrayList<String>();

		for(contador=0; contador <5; contador++) {
			System.out.print("Entre com a cor: ");
			cores.add(leia.nextLine());
		}
		System.out.print("Listar todas as cores:\n\n");
		for(contador=0; contador<5;contador++) {System.out.println(cores.get(contador));}

		System.out.print("\nOrdenar as cores:\n\n");
		cores.sort(null);
		for(contador=0; contador<5;contador++) {System.out.println(cores.get(contador));}

	   leia.close();
	}
}
