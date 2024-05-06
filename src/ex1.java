import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHora;
        double imposto = salarioBruto * 0.15;
        double gratificacao = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto + gratificacao - imposto;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Imposto (15%): R$" + imposto);
        System.out.println("Gratificação (5%): R$" + gratificacao);
        System.out.println("Salário Líquido: R$" + salarioLiquido);

        scanner.close();
    }
}
