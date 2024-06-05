package lacoscondicionais;

import java.util.Scanner;

public class praticaSwitch1 {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		double preco;
		String produto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do produto: ");
        codigo = leia.nextInt();
        
        System.out.println("Quantidade: ");
        quantidade = leia.nextInt();
        
        switch(codigo) {
        
        case 1:
        	preco = (quantidade * 10.00);
        	System.out.print("Produto: Cachorro Quente");
        	System.out.printf("\nValor total: R$ %.2f", preco);
        	break;
        case 2:
        	preco = (quantidade*15.00);
        	System.out.print("Produto: X-Salada");
        	System.out.printf("\nValor total: R$ %.2f ", preco);
        	break;
        case 3:
        	preco = (quantidade*18.00);
        	System.out.print("Produto: X-Bacon");
        	System.out.printf("\nValor total: R$ %.2f ", preco);
        	break;
        case 4:
        	preco = (quantidade*12.00);
        	System.out.print("Produto: Bauru");
        	System.out.printf("\nValor total: R$ %.2f ", preco);
        	break;
        case 5:
        	preco = (quantidade*8.00);
        	System.out.print("Produto: Refrigerante");
        	System.out.printf("\nValor total: R$ %.2f ", preco);
        	break;
        case 6:
        	preco = (quantidade*13.00);
        	System.out.print("Produto: Suco de laranja");
        	System.out.printf("\nValor total: R$ %.2f ", preco);
        	break;
        default:
        	System.out.println("Houve uma entrada inválida.");
        }

	}

}
