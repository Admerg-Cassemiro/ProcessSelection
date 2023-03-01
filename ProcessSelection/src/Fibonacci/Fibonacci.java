package Fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		Fibo fibo = new Fibo();

		boolean status = false;
		Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Valor Para Calcular Sequência:"));

		int[] Valores = new int[(valor + 1)];

		for (int i = 1; i <= valor; i++) {
			Valores[i] = fibo.grfibo(i);
			System.out.println(Valores[i]);
		}

		for (int i = 0; i < Valores.length; i++) {
			status = false;
			if (Valores[i] == valor) {
				status = true;
				break;

			}
		}
		if (status) {
			JOptionPane.showMessageDialog(null, "Valor: " + valor + " Existe na Sequência!");

		} else {
			JOptionPane.showMessageDialog(null, "Valor: " + valor + " Não Existe na Sequência!");

		}

	}

}
