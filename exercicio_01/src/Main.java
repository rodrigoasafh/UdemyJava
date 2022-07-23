import java.util.Locale;
import java.util.Scanner;

//Exercicio proposto contem 6 exercicios

public class Main {

	public static void main(String[] args) {
		/*Soma de 2 valores
		
		Scanner digita = new Scanner(System.in);
		
		System.out.println("---Exercicio 1---"); 
		
		int n1 = digita.nextInt();
		int n2 = digita.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("Entrada:");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("Saída");
		System.out.println(soma);
		
		System.out.println("---Fim exercicio 1---");
		*/
		
		/* Exercicio 2
		
		Scanner digita = new Scanner(System.in);
		
		
		double raio = digita.nextDouble();
		double area = Math.pow(raio, 2.0) * 3.14159;
		
		System.out.printf("Entrada:%n%.2f%nSaída:%n%.4f", raio, area);
		*/
		
		/* Exercicio 3
		 
		 Scanner digita = new Scanner(System.in);
		 
		 int A, B, C, D, CALC;
		 
		 System.out.println("Entrada: ");
		 
		
		 A = digita.nextInt();
		 B = digita.nextInt();
		 C = digita.nextInt();
		 D = digita.nextInt();
		 CALC = (A*B)-(C*D);
		 
		 System.out.printf("Saída: %nDiferença = %d", CALC);
		 
		 
		 digita.close();
		 */
		
		/*Exercicio 4
		Locale.setDefault(Locale.US);
		Scanner digita = new Scanner(System.in);
		
		int fun, h;
		double vh, sal;
		
		fun = digita.nextInt();
		h = digita.nextInt();
		vh = digita.nextDouble();
		sal = h * vh ;
		
		System.out.println("Number = " + fun);
		System.out.printf("Salary = %.2f", sal);
		
		digita.close();
		*/
		
		/* Exercicio 5
		Locale.setDefault(Locale.US);
		Scanner d = new Scanner(System.in);
		System.out.println("----Calculadora Valor Final---");
		
		int cod1, qtd1, cod2, qtd2;
		double vu1, vu2, vFinal;
		
		System.out.print("Código peça 1: ");
		cod1 = d.nextInt();
		System.out.printf("Qtd para Cód %d: ", cod1);
		qtd1 = d.nextInt();
		System.out.print("Valor Unitário: ");
		vu1 = d.nextDouble();
		
		System.out.println("<------------->");
		
		System.out.print("Código Peça 2: ");
		cod2 = d.nextInt();
		System.out.printf("Qtd para Cód %d: ", cod2);
		qtd2 = d.nextInt();
		System.out.print("Valor unitário: ");
		vu2 = d.nextDouble();
		
		vFinal = (qtd1 * vu1) + (qtd2 * vu2);
		System.out.printf("Valor a pagar = %.2f", vFinal);
		
		d.close();
		*/
		
		//Exercício 6
		
		Locale.setDefault(Locale.US);
		Scanner d = new Scanner(System.in);
		
		double A, B, C, AT, AC, AQ, AR, ATR;
		
		A = d.nextDouble();
		B = d.nextDouble();
		C = d.nextDouble();
		
		AT = (A*C)/2;
		AC = 3.14159 * (C * C);
		ATR = ((A + B)*C) / 2;
		AQ = B*B;
		AR = A * B;
		
		System.out.printf("Area Triangulo Retangulo: %.3f%n", AT);
		System.out.printf("Area Cirulo: %.3f%n", AC);
		System.out.printf("Area Trapezio: %.3f%n", ATR);
		System.out.printf("Area Quadrado: %.3f%n", AQ);
		System.out.printf("Area Retangulo: %.3f%n", AR);
		
		d.close();
	}

}
