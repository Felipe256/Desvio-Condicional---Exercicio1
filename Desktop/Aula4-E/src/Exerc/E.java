package Exerc;
import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o 1° número");
		int a = sc.nextInt();
		System.out.println("Digite o 2° número");
		int b = sc.nextInt();
		System.out.println("Digite o 3° número");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a + " é o maior número entre eles");
			if(b<c){
				System.out.println(b + " é o menor número entre eles");
			}
			if(c<b){
				System.out.println(c + " é o menor número entre eles");
			}
		}
		if(b>a && b>c) {
			System.out.println(b + " é o maior número entre eles");
			if(a<c){
				System.out.println(a + " é o menor número entre eles");
			}
			if(c<a){
				System.out.println(c + " é o menor número entre eles");
			}
		}
		if(c>b && c>a) {
			System.out.println(c + " é o maior número entre eles");
			if(b<a){
				System.out.println(b + " é o menor número entre eles");
			}
			if(a<b){
				System.out.println(a + " é o menor número entre eles");
			}
		}
		sc.close();
	}

}
