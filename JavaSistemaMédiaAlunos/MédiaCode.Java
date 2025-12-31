import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtdAvaliacoes;
        double[] notaCadaAvaliacao;
        double notaFinal = 0;
        double mediaFinal;
        String Situacao;

        // Receber a quantidade de avaliações
        System.out.println("Digite a quantidade de avaliações produzidas (Provas, trabalhos e lições: ");
        qtdAvaliacoes = scanner.nextInt();

        notaCadaAvaliacao = new double [qtdAvaliacoes];

        for (int i = 1; i <= qtdAvaliacoes; i++) {
            System.out.println("Digite as nota de cada avaliação: ");
            notaCadaAvaliacao[i-1] = scanner.nextDouble();
            notaFinal += notaCadaAvaliacao[i-1]; // Soma cada nota à notaFinal
        }

        System.out.println("Soma total das notas: " + notaFinal);

        // Se quiser calcular a média também:
        mediaFinal = notaFinal / qtdAvaliacoes;
        System.out.println("Média final do aluno: " + mediaFinal);

        if (mediaFinal < 5.0){
            Situacao = "Reprovado";

        } else if (mediaFinal > 5.0 && mediaFinal < 7.0){
            Situacao = "Recuperação";

        } else{
            Situacao = "Aprovado";

        }
        System.out.println("Olá, a situação do aluno foi " + Situacao );

        scanner.close();
    }
}
