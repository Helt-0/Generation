package vetormatriz;

import java.util.Scanner;

public class praticaVetores1 {

	public static void main(String[] args) {

		int numeros[] = {2,5,1,3,4,9,7,8,10,6}, usuario, x,y=0;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar: ");
		usuario = leia.nextInt();

		for(x=0; x < numeros.length; x++){
			if(numeros[x] == usuario) {
				y=x;
				System.out.printf("O número %d está localizado na posição: %d", usuario, x);
			}
		}

		if(y==0) {System.out.printf("O número %d não foi encontrado!", usuario);}

		leia.close();
	}

}
