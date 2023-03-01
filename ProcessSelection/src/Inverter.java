import java.util.Scanner;

import javax.swing.JOptionPane;

public class Inverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String palavra = JOptionPane.showInputDialog("Digite a String que será invertida:");
		invert(palavra);
		scanner.close();
	}

	public static void invert(String palavra) {
		int tamanho = palavra.length();
		char[] a = new char[tamanho];
		String palavrainv = "";
		a = palavra.toCharArray();

		for (char c : a) {
			System.out.println(c);

		}

		for (var i = (tamanho - 1); i >= 0; i--) {
			palavrainv = palavrainv + a[i];

		}
		JOptionPane.showMessageDialog(null, "String Invertida: " + palavrainv);

	}

}
