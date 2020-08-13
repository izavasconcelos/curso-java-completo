package br.com.iza.secao06;
// Tipos de dados Int e Float
public class Programa11 {
	public static void main(String[] args) {
		//Primarios
		long num0 = 4;
		int num1 =400000000; // 
		short num2 = 4000; // int menor 
		byte num3 = 40;
		char num8 = 65;
		//Nao primarios
		
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		Long num7 = (long) 99999;
		Character num9 = 35;
		
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		System.out.println("num3 = "+ num3);
		System.out.println("num4 = "+ num4);
		System.out.println("num5 = "+ num5);
		System.out.println("num6 = "+ num6);
		
		System.out.println("int/Integer = "+ Integer.SIZE + " bits");
		System.out.println("short/Short = " + Short.SIZE+ " bits");
		System.out.println("byte/Byte = "+ Byte.SIZE+ " bits");
		System.out.println("long/Long = "+ Long.SIZE+ " bits");
		
		
		System.out.println("Min int/Integer = "+ Integer.MIN_VALUE + " bits");
		System.out.println("Max int/Integer = "+ Integer.MAX_VALUE + " bits");
		System.out.println("MIN short/Short = " + Short.MIN_VALUE+ " bits");
		System.out.println("MAX short/Short = " + Short.MAX_VALUE+ " bits");
		System.out.println("MIN byte/Byte = "+ Byte.MIN_VALUE+ " bits");
		System.out.println("MAX byte/Byte = "+ Byte.MAX_VALUE);
		System.out.println("long/Long = "+ Long.MIN_VALUE);
		System.out.println("long/Long = "+ Long.MAX_VALUE);
		
		
		System.out.println("num8 = "+ num8);
		System.out.println("num9 = "+ num9);
		System.out.println("Char = "+ Character.SIZE+ " bits");
		System.out.println("Min char = "+ Character.MIN_VALUE);
		System.out.println("Max char = "+ Character.MAX_VALUE);
	}
}
