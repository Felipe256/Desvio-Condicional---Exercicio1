package Exerc;
import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o 1� n�mero");
		int a = sc.nextInt();
		System.out.println("Digite o 2� n�mero");
		int b = sc.nextInt();
		System.out.println("Digite o 3� n�mero");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a + " � o maior n�mero entre eles");
			if(b<c){
				System.out.println(b + " � o menor n�mero entre eles");
			}
			if(c<b){
				System.out.println(c + " � o menor n�mero entre eles");
			}
		}
		if(b>a && b>c) {
			System.out.println(b + " � o maior n�mero entre eles");
			if(a<c){
				System.out.println(a + " � o menor n�mero entre eles");
			}
			if(c<a){
				System.out.println(c + " � o menor n�mero entre eles");
			}
		}
		if(c>b && c>a) {
			System.out.println(c + " � o maior n�mero entre eles");
			if(b<a){
				System.out.println(b + " � o menor n�mero entre eles");
			}
			if(a<b){
				System.out.println(a + " � o menor n�mero entre eles");
			}
		}
		sc.close();
	}

}
