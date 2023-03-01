package Faturamento;

public class CalcFaturamento {

	double total;

	void soma(double soma) {

		total += soma;
	}

	double calc(double n) {

		n = n / total * 100;

		return n;
	}

}
