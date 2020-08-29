package br.com.iza.secao11;
/*
 * Getters e Setters
 * Getter é um metodo publico, que serve para consultar dados.
 * A nomenclatura é get_nomedoatributo;
 * 
 */
public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public void sacar(float valor)
	{
		if(valor <= this.saldo) {
		this.saldo = (this.saldo) - valor;
		}
		else if(valor <=this.saldo+this.limite) {
			float aux = this.saldo - valor;
			this.saldo=0;
			this.limite =this.limite + aux;
		}
		else System.out.println("Saldo insuficiente!");
	}
	
	/**
	 * Método para realizar depósito
	 * @param valor a ser depositado
	 */
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	/**
	 * Método getter do atributo Saldo
	 * @returna a soma do saldo + limite
	 */
	public float getSaldo() {
		return this.saldo+this.limite;
	}
	public float getLimite() {
		return this.limite;
	}
	@Override
	public String toString() {
		
		return "O saldo é " + this.getSaldo();
	}
}
