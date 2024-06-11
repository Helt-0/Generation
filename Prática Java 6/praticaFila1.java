package fila;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class praticaFila1 {

	public static void main(String[] args) {

		Queue<String> filaBanco = new LinkedList <String>();
		Scanner leia = new Scanner(System.in);
		int escolhaMenu= -1;

		System.out.println("***********************************************************************");
		System.out.println("1: Adicionar um novo Cliente na fila.");
		System.out.println("2: Listar todos os Clientes na fila.");
		System.out.println("3: Chamar (retirar) uma pessoa da fila.");
		System.out.println("0: Sair.");
		System.out.print("***********************************************************************");

		while(escolhaMenu!=0) {
			System.out.print("\nDigite uma opção: ");
			escolhaMenu=leia.nextInt();

			leia.nextLine(); //nextLine vazio para evitar bug!
			if (escolhaMenu<=3) {
				if(escolhaMenu==1) {
					System.out.print("Digite o nome: ");
					filaBanco.add(leia.nextLine());

					System.out.print("\nCliente Adicionado!\n");

				}
				else if(escolhaMenu==2) {
					Iterator<String> iPilha = filaBanco.iterator();
					System.out.print("\nLista de clientes na fila:\n\n");
					while(iPilha.hasNext()) {System.out.print(iPilha.next()+"\n");}

				}
				else if(escolhaMenu==3) { 
					filaBanco.isEmpty();
					if(filaBanco.isEmpty()==true) {System.out.print("\nA Fila está vazia!\n"); }
					else {
						filaBanco.poll(); 
						Iterator<String> iPilha = filaBanco.iterator();
						while(iPilha.hasNext()) {System.out.print(iPilha.next()+"\n");}
						System.out.print("\nO Cliente foi Chamado!\n");
					}
				}

			}
			else {System.out.print("\nOpção inválida, escolha uma opção dentro do intervalo do menu (0-3)\n");}
		}
		System.out.println("Programa Finalizado!");
		leia.close(); 
	}

}
