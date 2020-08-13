package br.com.iza.secao06;

public class Programa14 {
	public static void main(String[] args) {
		//tipos booleanos
		boolean v = true;
		boolean f = false;
		
		//nao primitivos
		Boolean ver = true;
		Boolean fal = false;
		
		System.out.println("Verdadeiro "+ v);
		System.out.println("Falso "+ f);
		System.out.println("Verdadeiro "+ ver);
		System.out.println("Falso "+ fal);	
		
		if (v) {
			System.out.println("É verdadeiro");
		} else System.out.println("É falso");
	}
}
