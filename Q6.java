import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero inteiro :");
		int n = entrada.nextInt();

		if (n % 3 == 0) {
			System.out.println(n + " é múltiplo de 3 ");
		}

		else {
			System.out.println(n + " não é múltiplo de 3 ");
		}

		entrada.close();

	}

}
