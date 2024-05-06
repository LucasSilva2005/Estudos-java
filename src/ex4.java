import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de XF: ");
        int xf = scanner.nextInt();

        // Variável para armazenar o próximo número da série
        int proximoNumero = 0;

        System.out.println("Série numérica:");

        // Loop para gerar a série até o valor de XF
        while (proximoNumero <= xf) {
            System.out.print(proximoNumero + " ");

            // Incrementa o próximo número da série em 3
            proximoNumero += 3;
        }

        scanner.close();
    }
}
