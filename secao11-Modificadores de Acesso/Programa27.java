package br.com.iza.secao11;
//Private
/*
 * Privado � pr�pria classe.
 */
public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1= new Cliente ("Izabela", "Av nonoai, 1458");
		Cliente cli2= new Cliente ("Angelina", "Av nonoai, 1458");
		
		System.out.println("Nome: "+ cli1.getNome());
		System.out.println("Endere�o: "+ cli1.getEndereco());
		System.out.println("Nome: "+ cli2.getNome());
		System.out.println("Endere�o: "+ cli2.getEndereco());
	}
	

}
