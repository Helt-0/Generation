package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Iterator;

public class práticaSet1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();

		for(int x=0; x<10; x++) {
			System.out.print("Digite o "+(x+1)+"º número da Collection Set: ");
			setNumeros.add(leia.nextInt());
		}
		System.out.print("Listar dados do Set: \n");

		Iterator <Integer> iNumeros = setNumeros.iterator();
		while(iNumeros.hasNext()) {System.out.println(iNumeros.next());}

		leia.close();

	}

}


