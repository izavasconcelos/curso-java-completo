package br.com.iza.secao06;
// Ops Matematicas
public class Programa15 {
	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;
		//soma
		res= num1 +num2;
		System.out.println("Soma = "+res);
		
		//subtração
		res= num2 -num1;
		System.out.println("Sub = "+res);
		//mult
		res= num2 *num1;
		System.out.println("Mult = "+res);
		//Div
		res2= (float)num2/(float)num1; //cast
		System.out.println("Div = "+res2);
		//Resto divisão
		res= num2%num1;
		System.out.println("Resto = "+res);
	}
}
