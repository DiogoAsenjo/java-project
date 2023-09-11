import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        System.out.println("Bem vindo a classe LeituraDeDados");

        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = leitura.nextLine();

        System.out.println("Qual sua trilha de formação? ");
        String formacao = leitura.nextLine();

        System.out.println("Qual sua avaliação do processo de formação (0-10)? ");
        int avaliacao = leitura.nextInt();

        System.out.println("""
                Nome do estagiário: %s
                Trilha de formação: %s
                Avaliação de trilha: %d
                """.formatted(nome, formacao, avaliacao));
    }
}
