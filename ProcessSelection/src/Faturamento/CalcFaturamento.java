package Faturamento;

public class CalcFaturamento {

	double total;

	void soma(double soma) {

		total += soma;
		System.out.println("Valor = " + total);
	}

	double calc(double n) {
		
		n = n / total * 100; 
		
		return n;
	}

}
