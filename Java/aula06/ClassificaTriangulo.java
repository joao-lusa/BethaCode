package aula6;

import java.util.Scanner;

public class ClassificaTriangulo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do lado do triângulo:");
		int lado1 = sc.nextInt();
		
		System.out.print("Informe o tamanho do lado do triângulo:");
		int lado2 = sc.nextInt();
		
		System.out.print("Informe o tamanho do lado do triângulo:");
		int lado3 = sc.nextInt();
		
		if ((lado1 == lado2) && (lado2 == lado3)) {
			System.out.println("Triangulo Equilatero");
		}else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
			System.out.println("Triangulo Isosceles");
		}else {
			System.out.println("Triangulo Escaleno");
		}
	}

}