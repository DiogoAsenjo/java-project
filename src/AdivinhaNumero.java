import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);

        for (int i = 5; i > 0; i--) {
            System.out.println("Digite um número entre 0-10: ");
            int chute = leitura.nextInt();

            if (chute == numeroAleatorio) {
                chute = leitura.nextInt();
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (i > 1){
                System.out.printf("Tente novamente, faltam %d tentativas \n", i-1);
            } else {
                System.out.println("Você perdeu, o número era " + numeroAleatorio);
            }
        }
    }
}
