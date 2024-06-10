package vetormatriz;

import java.util.Scanner;

public class PraticaMatriz2 {

	public static void main(String[] args) {
		
		float notaAlunos[][] = new float [10][4], soma1=0, soma2=0, soma3=0, soma4=0, soma5=0, soma6=0, soma7=0, soma8=0, soma9=0,soma10=0,
				media[] = new float[10];
		int linha, coluna, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha<10; linha++) {
			for(coluna = 0; coluna <4; coluna++) {
				System.out.print("Digite a "+(coluna+1)+"º nota do "+(linha+1)+"º aluno: ");
				notaAlunos[linha][coluna] = leia.nextFloat();
			}
		}
		for(x=0; x<4; x++) {soma1+=notaAlunos[0][x];}
		for(x=0; x<4; x++) {soma2+=notaAlunos[1][x];}
		for(x=0; x<4; x++) {soma3+=notaAlunos[2][x];}
		for(x=0; x<4; x++) {soma4+=notaAlunos[3][x];}
		for(x=0; x<4; x++) {soma5+=notaAlunos[4][x];}
		for(x=0; x<4; x++) {soma6+=notaAlunos[5][x];}
		for(x=0; x<4; x++) {soma7+=notaAlunos[6][x];}
		for(x=0; x<4; x++) {soma8+=notaAlunos[7][x];}
		for(x=0; x<4; x++) {soma9+=notaAlunos[8][x];}
		for(x=0; x<4; x++) {soma10+=notaAlunos[9][x];}
	
		System.out.printf("%.1f | ", soma1/4);
		System.out.printf("%.1f | ", soma2/4);
		System.out.printf("%.1f | ", soma3/4);
		System.out.printf("%.1f | ", soma4/4);
		System.out.printf("%.1f | ", soma5/4);
		System.out.printf("%.1f | ", soma6/4);
		System.out.printf("%.1f | ", soma7/4);
		System.out.printf("%.1f | ", soma8/4);
		System.out.printf("%.1f | ", soma9/4);
		System.out.printf("%.1f | ", soma10/4);
		
		
	}

}
