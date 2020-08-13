package br.com.iza.secao08;

public class Programa21 {
	public static void main(String[] args) {
		int valor =6, valor2=4;
		//res = soma(valor,valor2);
		//System.out.println("Resultado = "+res);
		System.out.println("Resultado = "+soma(valor,valor2));
		
		System.out.println(msg());
	}
	
	static int soma(int v1,int v2) {
		return v1 + v2;
	}
	static String msg() {
		return "Olá User";
	}
}
