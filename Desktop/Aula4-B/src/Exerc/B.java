package Exerc;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		System.out.println("Digite um número");
		double x = sc.nextDouble();
		if(x >=1.99 && x <=5.99) {
			System.out.println(x + " é maior que 1,99 e menor que 5,99");
		}
		if(x <1.99) {
			System.out.println(x + " é menor que 1,99");
		}
		if(x >5.99) {
			System.out.println(x + " é maior que 5,99");
		}
		sc.close();
	}

}
