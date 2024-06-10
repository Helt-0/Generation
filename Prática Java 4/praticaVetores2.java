package vetormatriz;

import java.util.Scanner;

public class praticaVetores2 {

	public static void main(String[] args) {

		int numeros[]= new int[10], indiceImpar[]= new int[10], elementosPares[]= new int[10]; 
		float soma=0;

		Scanner leia = new Scanner(System.in);

		for(int x=0; x<10; x++) {
			System.out.printf("Digite o %dº número do vetor: ", (x+1));
			numeros[x] = leia.nextInt();

			if(x%2!=0) {indiceImpar[x]= numeros[x];}
			if(numeros[x]%2==0) {elementosPares[x]= numeros[x];}
			soma+=numeros[x];
		}
		System.out.print("Elementos nos índices ímpares:\n");
		for(int y=0; y<indiceImpar.length; y++) {
			if(indiceImpar[y]!=0) {
				System.out.print(indiceImpar[y] + " ");
			}
		} 
		System.out.print("\nElementos pares:\n");
		for(int z=0; z<elementosPares.length; z++) {
			if(elementosPares[z]!=0) {
				System.out.print(elementosPares[z] + " ");}
		}
		float media = soma/numeros.length;
		System.out.printf("\nSoma: %.0f", soma);
		System.out.printf("\nmedia: %.2f", media);
	}

}
