import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em quilogramas (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros (m): ");
        double altura = scanner.nextDouble();

        // Calculando o IMC 
        double imc = peso / (altura * altura);

        // Classificando o IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II (severa)";
        } else {
            classificacao = "Obesidade grau III (mórbida)";
        }

        // Exibindo o resultado
        System.out.println("O IMC é: " + imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
