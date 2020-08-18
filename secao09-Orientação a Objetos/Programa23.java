package br.com.iza.secao09;

public class Programa23 {
	public static void main(String[] args) {
		Pessoas pessoa1 = new Pessoas();
		
		pessoa1.nome = "Izabela";
		pessoa1.email = "iza@gmail.com";
		pessoa1.ano_nasc = 1995;
		
		pessoa1.imprimir();
		
		Pessoas pessoa2 = new Pessoas("Angelina", "ang@gmail.com",1976);
		pessoa2.imprimir();
	}
}
