package br.com.iza.secao04;

public class Programa05 {
	// criar main() -> main + ctrl+espa�o
	public static void main(String[] args) {
		int valor = 9, num;
		/*
		if(valor > 0) {
			num = valor;
		} else num = 7;
		*/
		// Operador tern�rio
		num = (valor > 0) ? valor : 7;
		// sysout + ctrl + espa�o
		System.out.println(num);
	}
}
