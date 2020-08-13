package br.com.iza.secao05;

import java.util.Scanner;
//Do while
public class Programa08 {
	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		do {
		
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt();  -> BUG Java
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade>0) {
				System.out.println(nome + " tem "+ idade +" anos");
			}
		}while(idade>0);
		teclado.close();
		System.out.println("Fim!");
	}
}
