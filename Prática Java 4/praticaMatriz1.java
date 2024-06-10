package vetormatriz;

import java.util.Scanner;

public class praticaMatriz1 {

	public static void main(String[] args) {

		int matriz[][] = new int [3][3], linha, coluna, diagonalP[]= new int[3], diagonalS[]=new int[3],
				somaP=0, somaS=0;

		Scanner leia = new Scanner(System.in);
		for(linha = 0; linha<3; linha++) {
			for(coluna = 0; coluna <3; coluna++) {
				System.out.print("Digite um valor para a posição: ["+linha+"]"+"["+coluna+"]");
				matriz[linha][coluna] = leia.nextInt();

				if (linha == coluna) {diagonalP[linha] = matriz[linha][coluna];} // A condição para um elemento de matriz quadrada estar na diagonal principal é que  linha = coluna. 
				if (linha + coluna == matriz.length - 1) {diagonalS[linha] = matriz[linha][coluna];}  // A condição para um elemento de matriz quadrada estar na diagonal secundária é que a soma da linha com a coluna seja o (tamanho da matriz) -1. 
			}
		}
		System.out.print("\nElementos da Diagonal Principal:\n");
		for(int x=0; x<diagonalP.length; x++) {
			if(diagonalP[x]!=0) {somaP+=diagonalP[x]; System.out.print(diagonalP[x] + " ");}
		}
		System.out.print("\nElementos da Diagonal Secundária:\n");
		for(int y=0; y<diagonalS.length; y++) {
			if(diagonalS[y]!=0) {somaS+=diagonalS[y]; System.out.print(diagonalS[y] + " ");}}
		
		System.out.print("\nSoma dos Elementos da Diagonal Principal:\n " + somaP);
		System.out.print("\nSoma dos Elementos da Diagonal Secundária:\n " + somaS);
	}

}
