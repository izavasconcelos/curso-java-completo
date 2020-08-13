package br.com.iza.secao04;

public class Programa05 {
	// criar main() -> main + ctrl+espaço
	public static void main(String[] args) {
		int valor = 9, num;
		/*
		if(valor > 0) {
			num = valor;
		} else num = 7;
		*/
		// Operador ternário
		num = (valor > 0) ? valor : 7;
		// sysout + ctrl + espaço
		System.out.println(num);
	}
}
