package Exerc;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int x = sc.nextInt();
		if (x<15) {
			System.out.print("O número é menor que 15");
		}
		if (x>100) {
			System.out.print("O número é maior que 100");
		}
		if (x<=100 && x>=15) {
			System.out.print("O número está entre 15 e 100");
		}
		sc.close();

	}
	
}
