package selecao;

public class Fibo {
	
	int grfibo(int n) {
		if (n == 1)
			return (0);
		if (n == 2)
			return (1);

		int i, N = 0, N1 = 0, N2 = 1;
		for (i = 3; i <= n; i++) {
			N = N1 + N2;
			N1 = N2;
			N2 = N;
		}

		return (N);

	}
}
