package br.com.iza.secao09;
//Classes
public class Produto {
	String nome;
	float preco;
	float desconto;
	
	//Método para aumentar o preço
	void aumentar_preco() {
		this.preco = this.preco + 10;
	}
	
}
