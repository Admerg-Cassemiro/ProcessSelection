package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Fibo fibo = new Fibo();

		Scanner scanner = new Scanner(System.in);

		int limfibo = 0, vlpesq = 0;
		boolean status = false;

		System.out.println("Valor Limite Para Seq. FIBONACCI: ");
		limfibo = scanner.nextInt();
		scanner.nextLine();
		int[] Valores = new int[(limfibo + 1)];

		for (int i = 1; i <= limfibo; i++) {
			Valores[i] = fibo.grfibo(i);
			System.out.println(Valores[i]);
		}
		System.out.println("Valor Para Pesquisa na Seq. FIBONACCI: ");
		vlpesq = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < Valores.length; i++) {
			status = false;
			if (Valores[i] == vlpesq) {
				status = true;
				break;

			}
		}
		if (status)
			System.out.printf("Valor %d Pertence a Lista FIBONACCI!", vlpesq);
		else
			System.out.println("Nao Pertence a Lista!");

		scanner.close();

	}

}
