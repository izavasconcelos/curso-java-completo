package br.com.iza.secao09;
//Classes
public class Produto {
	String nome;
	float preco;
	float desconto;
	
	//M�todo para aumentar o pre�o
	void aumentar_preco() {
		this.preco = this.preco + 10;
	}
	
}
