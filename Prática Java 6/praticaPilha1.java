package fila;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class praticaPilha1 {

	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int escolhaMenu= -1;

		System.out.println("***********************************************************************");
		System.out.println("1: Adicionar um novo livro na pilha.");
		System.out.println("2: Listar todos os livros.");
		System.out.println("3: Retirar um livro da pilha.");
		System.out.println("0: Sair.");
		System.out.print("***********************************************************************");

		while(escolhaMenu!=0) {
			System.out.print("\nDigite uma opção:\n");
			escolhaMenu=leia.nextInt();

			leia.nextLine(); //nextLine vazio para evitar bug!
			if (escolhaMenu<=3) {
				if(escolhaMenu==1) {
					System.out.print("Digite o nome do livro: ");
					pilhaLivros.push(leia.nextLine());

					System.out.print("\nLivro adicionado!\n");

				}
				else if(escolhaMenu==2) {
					Iterator<String> iPilha = pilhaLivros.iterator();
					System.out.print("\nLista de livros na pilha:\n\n");
					while(iPilha.hasNext()) {System.out.print(iPilha.next()+"\n");}

				}
				else if(escolhaMenu==3) { 
					pilhaLivros.isEmpty();
					if(pilhaLivros.isEmpty()==true) {System.out.print("A pilha está vazia!"); }
					else {
						pilhaLivros.pop(); 
						Iterator<String> iPilha = pilhaLivros.iterator();
						while(iPilha.hasNext()) {System.out.print(iPilha.next()+"\n");}
						System.out.print("\nUm livro foi retirado da pilha!\n");
					}
				}

			}
			else {System.out.print("\nOpção inválida, escolha uma opção dentro do intervalo do menu (0-3)\n");}
		}
		System.out.println("Programa Finalizado!");
		leia.close(); 

	}

}
