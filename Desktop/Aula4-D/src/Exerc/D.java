package Exerc;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota do 1°Bimestre");
		int a = sc.nextInt();
		System.out.println("Digite a nota do 2°Bimestre");
		int b = sc.nextInt();
		System.out.println("Digite a nota do 3°Bimestre");
		int c = sc.nextInt();
		System.out.println("Digite a nota do 4°Bimestre");
		int d = sc.nextInt();
		int ma = (a+b+c+d)/4;
		if(ma>=6) {
			System.out.println("Aprovado");
		}
		if(ma<3) {
			System.out.println("Retido");
		}
		if(ma<6 && ma>=3) {
			System.out.println("Exame");
		}
		sc.close();
		
	}

}
