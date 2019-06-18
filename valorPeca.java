import java.util.Locale;
import java.util.Scanner;

public class valorPeca {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, 
		// o número de peças 1, o valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor 
		// unitário de cada peça 2. 
		// Calcule e mostre o valor a ser pago.

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca = sc.nextInt();
		int qntpeca = sc.nextInt();
		double valorUnitarioPeca = sc.nextDouble();
		int codigoPeca2 = sc.nextInt();
		int qntpeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorCompra1 = qntpeca * valorUnitarioPeca;
		double valorCompra2 = qntpeca2 * valorUnitarioPeca2;
		
		double valorTotal = valorCompra1 + valorCompra2;
		
		System.out.println("O Valor a pagar é de R$ " + valorTotal);
		
		sc.close();
	}

}
