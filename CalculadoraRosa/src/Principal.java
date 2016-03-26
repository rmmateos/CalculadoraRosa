import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		int num1, num2,suma;
		double division;
		System.out.println("\nIntroduce el número 1:");
		num1 = teclado.nextInt();
		System.out.println("\nIntroduce el número 2:");
		num2 = teclado.nextInt();
		Calculadora calc = new Calculadora(num1,num2);
		suma = calc.suma();
		division=calc.division();
		System.out.println("\nLa suma es:"+suma);
		System.out.println("\nLa división es:"+division);
	}

}
