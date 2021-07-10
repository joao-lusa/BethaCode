package aula7;

import java.util.Scanner;

public class WhileParImpar {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int num, par = 0, impar= 0;
		String informarNum = "";
		
		
		
		do {
			System.out.print("informe um número: ");
			num = sc.nextInt();
			
			if(informarNum.trim() != "") {
				informarNum += ",";
			}
			informarNum += num;
			
			if(num % 2 == 0) {
				par = par + 1;
			}else {
				impar = impar + 1;
			}
		}while(num != 0);
		
		System.out.println("números informados: " + informarNum);
		System.out.println("contem: " + par + " números pares");
		System.out.println("contem: " + impar + " números impares");
		

		
		
	}
}
