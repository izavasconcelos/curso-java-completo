package br.com.iza.secao04;
// if, else, else if
public class Programa04 {

	public static void main(String[] args) {
		int num = 4;
		
		if (num > 5) {
			System.out.println("Sim, " + num + " maior que 5");
		}else if (num==5) {
			System.out.println(num + " igual a 5");
		}
		else System.out.println(num +" menor que 5");
	}

}
