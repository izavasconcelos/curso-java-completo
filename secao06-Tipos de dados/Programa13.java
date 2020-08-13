package br.com.iza.secao06;
// caracter e strings
public class Programa13 {
	public static void main(String[] args) {
		//Primitivos
		char letra = 'a'; // Aspas simples
		char letra1 = 97;
		
		letra1 = (char) (letra1 + 1);
		//Nao primitivos
		Character letra3 = 'A';
		String nome = "Geek University";
		
		System.out.println("Letra "+letra);
		System.out.println("Letra "+letra1);
		System.out.println("Letra 3 "+letra3);
		System.out.println("Nome "+ nome);
		System.out.println("Tamanho "+ nome.length());
	}
}
