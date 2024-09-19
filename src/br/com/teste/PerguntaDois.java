package br.com.teste;

public class PerguntaDois {

	public static void main(String[] args) {
		int number = 610;

		if (isFibonacci(number)) {
			System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
		}

	}

	public static boolean isFibonacci(int number) {
		int a = 0, b = 1, c = 0;

		if (number == 0 || number == 1) {
			return true;
		}

		while (c < number) {
			c = a + b;
			a = b;
			b = c;
		}

		return c == number;
	}

}
