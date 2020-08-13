package br.com.iza.secao07;

public class Programa17 {
	public static void main(String[] args) {
		int num[] = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i]=i+3;
		}
		System.out.println(num[0]);
		System.out.println(num[9]);
		
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)Math.round(Math.random()*100);
		}
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[9]);
		
		for (int i : num) {
			System.out.println("i "+ i);
		}
	}
}
