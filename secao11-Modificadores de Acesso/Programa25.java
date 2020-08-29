package br.com.iza.secao11;

public class Programa25 {
	public static void main(String[] args) {
		Cliente joao = new Cliente("João da Silva", "Rua da paz, 45");
		Cliente maria = new Cliente("Maria da Silva", "Rua da paz, 45");
		
		Conta contaJoao = new Conta(1,100.0f,200.0f,joao);
		Conta contaMaria = new Conta(1,300.0f,500.0f,maria);
		
		System.out.println("Saldo Joao: "+ contaJoao.getSaldo());
		System.out.println("Saldo Maria: "+ contaMaria.getSaldo());
		System.out.println();
		
		contaJoao.sacar(300);
		System.out.println("Saldo Joao: "+ contaJoao.getSaldo());
		System.out.println("Limite Joao: "+ contaJoao.getLimite());
		
	}
}
