package br.com.iza.secao06;
//Reais
public class Programa12 {
	public static void main(String[] args) {
	//Primarios
	float preco = 23.48798789f; //em java precisa do .f
	double preco2 = 23.48897897; //qualquer ponto flutuante é double em java
	//Nao primarios
	Float num1 = 24.4f;
	Double num2 = 26.4;
	
	System.out.println("preco = "+preco);
	System.out.println("preco = "+preco2);
	System.out.println("preco = "+num1);
	System.out.println("preco = "+num2);
	System.out.println("Float = "+ Float.SIZE + " bits");
	System.out.println("Double = " + Double.SIZE+ " bits");
	
	
	System.out.println("Min Float = "+ Float.MIN_VALUE);
	System.out.println("Max Float = "+ Float.MAX_VALUE);
	
	System.out.println("Min Double = "+ Double.MIN_VALUE);
	System.out.println("Max Double = "+ Double.MAX_VALUE);
	}
	
}
