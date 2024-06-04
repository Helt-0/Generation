package primeiraPratica;

import java.util.Scanner; 

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		System.out.print("Qual o salário bruto? ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Qual o adicional noturno? ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Qual o valor das horas extras? ");
        horasExtras = leia.nextFloat();
        
        System.out.print("De quanto é o desconto? ");
        descontos = leia.nextFloat();
        
        leia.close();
        
        System.out.printf(" O salário liquido é: %.2f" , (salarioBruto + adicionalNoturno + (horasExtras*5) - descontos));

	}

}
