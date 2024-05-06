import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o tempo de contribuição (em anos): ");
        int tempoContribuicao = scanner.nextInt();

        // Verifica se a pessoa atende aos critérios de aposentadoria
        if (idade >= 60 && tempoContribuicao >= 15) {
            System.out.println("A pessoa pode se aposentar.");
        } else {
            System.out.println("A pessoa não pode se aposentar.");
        }

        scanner.close();
    }
}
