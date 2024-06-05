package lacoscondicionais;

import java.util.Scanner;

public class praticaCondicional4 {

	public static void main(String[] args) {
		
		String estrutura, classe, dieta;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a estrutura do animal? ");
		estrutura = leia.nextLine();
		
		System.out.println("Qual a classe do animal? ");
	    classe = leia.nextLine();
	    
	    System.out.println("Qual o tipo de dieta do animal? ");
	    dieta = leia.nextLine();

	    if(estrutura.equals("vertebrado")) {
	    	if(classe.equals("ave") && dieta.equals("carnívoro")) {System.out.println("Ave");}
	    	else if(classe.equals("ave") && dieta.equals("onívoro")) {System.out.println("Pomba");}    
	    	else if(classe.equals("mamífero") && dieta.equals("onívoro")) {System.out.println("Homem");}
	    	else if(classe.equals("mamífero") && dieta.equals("herbívoro")) {System.out.println("Vaca");}
	    }	
	    else if(estrutura.equals("invertebrado")) {
	    	if(classe.equals("inseto") && dieta.equals("hematófago")) {System.out.println("Pulga");}
	    	else if(classe.equals("inseto") && dieta.equals("herbívoro")) {System.out.println("Lagarta");}
	    	else if(classe.equals("anelídeo") && dieta.equals("hematófago")) {System.out.println("Sanguessuga");}
	        else if(classe.equals("anelídeo") && dieta.equals("onívoro")) {System.out.println("Minhoca");}
	    }
	    else {System.out.println("Alguma entrada é inválida");}
	}

}
