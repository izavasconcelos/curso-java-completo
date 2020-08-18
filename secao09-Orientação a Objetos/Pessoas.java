package br.com.iza.secao09;

public class Pessoas {
	String nome, email;
	int ano_nasc;
	
	public Pessoas() {
		
	}
	public Pessoas(String nome, String email, int ano_nasc) {
		this.nome = nome;
		this.email = email;
		this.ano_nasc = ano_nasc;

	}
	void imprimir() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Email: "+this.email);
		System.out.println("Ano nascimento: "+this.ano_nasc);
	}
}
