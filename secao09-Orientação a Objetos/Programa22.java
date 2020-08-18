package br.com.iza.secao09;

public class Programa22 {
	public static void main(String[] args) {
		
		//Declarar objeto
		Produto p0;
		//Declarar e inicializar objeto
		Produto p1 = new Produto(); //Construtor
		//Constroi o objeto
		p1.nome = "Notenbook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		System.out.println("");
		p0 = new Produto(); //Construtor
		p0.nome = "Caneta BIC";
		p0.preco = 2.45f;
		p0.desconto = 5;
		
		System.out.println(p0.nome);
		System.out.println("R$" + p0.preco);
		System.out.println(p0.desconto+"%");
		System.out.println("");
		Pessoas pessoa1 = new Pessoas();
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "jolie@gmail.com";
		pessoa1.ano_nasc = 1976;
		
		System.out.println("Nome: "+ pessoa1.nome);
		System.out.println("Email: "+pessoa1.email);
		System.out.println("Ano nascimento: "+pessoa1.ano_nasc);
		
	}
}
