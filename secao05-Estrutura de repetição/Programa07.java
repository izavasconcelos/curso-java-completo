package br.com.iza.secao05;

import java.util.Scanner;
// Receba dados do usuário enquanto a idade for maior que zero
// while 	
public class Programa07 {
	public static void main(String[] args) {
		int idade=1;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		while(idade>0) {
		
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe sua idade: ");
		//idade = teclado.nextInt();  -> BUG Java
		idade = Integer.parseInt(teclado.nextLine());
		System.out.println(nome + " tem "+ idade +" anos");
		
		}
		teclado.close();
		System.out.println("Fim!");
	}
}
