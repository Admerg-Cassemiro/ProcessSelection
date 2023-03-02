package Faturamento;

import java.util.Scanner;

public class Faturamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalcFaturamento calc = new CalcFaturamento();
		
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double Outros = 19849.53;

		calc.soma(SP);
		calc.soma(RJ);
		calc.soma(MG);
		calc.soma(ES);
		calc.soma(Outros);

		System.out.printf("SP %.2f / ", (float) calc.calc(SP));
		System.out.printf("RJ %.2f / ", (float) calc.calc(RJ));
		System.out.printf("MG %.2f / ", (float) calc.calc(MG));
		System.out.printf("ES %.2f / ", (float) calc.calc(ES));
		System.out.printf("Outros %.2f", (float) (calc.calc(Outros)));
		
		scanner.close();

	}

}
