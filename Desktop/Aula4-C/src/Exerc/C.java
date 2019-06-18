package Exerc;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro entre 0 e 6");
		int x = sc.nextInt();
		switch (x) {
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		}
		sc.close();
	}

}
