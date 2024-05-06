import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo n: ");
        int n = scanner.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }

        System.out.println("A soma da sequência numérica é: " + soma);

        scanner.close();
    }
}
