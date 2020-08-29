package br.com.iza.secao11;
//Protected (Protegido)
/*
 * O modificador de acesso Protected faz com que
 * o elemento seja vis�vel somento dentro do mesmo
 * pacote onde o elemento foi declarado. 
 */
public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
		//this.dizer_oi();
	}
	protected void dizer_oi() { //Acess�vel dentro do pacote
	System.out.println("Oi "+this.nome);
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
}
