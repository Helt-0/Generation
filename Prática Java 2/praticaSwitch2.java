package lacoscondicionais; 

import java.util.Scanner;

public class praticaSwitch2 {

	public static void main(String[] args) {
		
		String nome;
		int cargo; 
		double salario, salarioAjustado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Cargo:");
	    cargo = leia.nextInt(); 
	    
	    System.out.print("Salário");
		salario = leia.nextDouble();
		
		switch(cargo) {
		case 1: 
			salarioAjustado = (salario*1.1);
			System.out.printf("Nome do colaborador: %s", nome);
			System.out.println("\nCargo: Gerente");
			System.out.printf("Salário: R$ %.2f", salarioAjustado);
		break;
		
		case 2: 
			salarioAjustado = (salario*1.07);
			System.out.printf("Nome do colaborador: %s", nome);
			System.out.println("\nCargo: Vendedor");
			System.out.printf("Salário: R$ %.2f", salarioAjustado);
		break;
		
		case 3: 
			salarioAjustado = (salario*1.09);
			System.out.printf("Nome do colaborador: %s", nome);
			System.out.println("\nCargo: Supervisor");
			System.out.printf("Salário: R$ %.2f", salarioAjustado);
		break;
		
		case 4: 
			salarioAjustado = (salario*1.06);
			System.out.printf("Nome do colaborador: %s", nome);
			System.out.println("\nCargo: Motorista");
			System.out.printf("Salário: R$ %.2f", salarioAjustado);
		break;
		
		case 5: 
			salarioAjustado = (salario*1.05);
			System.out.printf("Nome do colaborador: %s", nome);
			System.out.println("\nCargo: Estoquista");
			System.out.printf("Salário: R$ %.2f", salarioAjustado);
		break;
		
		case 6: 
			salarioAjustado = (salario*1.08);
			System.out.printf("Nome do colaborador: %s", nome);
			System.out.println("\nCargo: Técnico de TI");
			System.out.printf("Salário: R$ %.2f", salarioAjustado);
		break;
		
		default:
			System.out.print("Houve uma entrada inválida");
		}
		
		
	}

}
