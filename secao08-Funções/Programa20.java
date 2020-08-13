package br.com.iza.secao08;

import java.util.Scanner;

// Criando funções
//Faça um programa que receba um diversas nomes de frutas 
//no usuario e no final imprima 
// os nomes em ordem inversa
// o programa deve solicitar quantas frutas quer informar

public class Programa20 {
	//variaveis globais
	static String nomeFruta[];
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd;
			
		System.out.println("Informe a quantidade:");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);
	
		teclado.close();
	}
	
	/*
	 Uma função deve ter:
	 a) Tipo de retorno
	 b) Nome
	 c) Parametros de entrada (Opcional)
	 d) Retorno (Opcional)
	 */
	//void = vazio
	static void cadastrar_dados(int quantidade) {
		nomeFruta= new String[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Informe o nome da fruta:");
			nomeFruta[i] = teclado.nextLine();
		}
	}
	
	static void mostrar_dados(int quantidade) {
		for (int i = quantidade; i > 0; i--) {
			System.out.println(nomeFruta[i-1]);
		}
	}
	
}
