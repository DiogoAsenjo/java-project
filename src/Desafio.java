import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float saldoConta = 2500;
        int operacao = 5;
        String continuar = "S";
        String menu = """
                ***********************
                Dados do cliente:
                                
                Nome: Diogo Asenjo
                Tipo conta: Corrente
                Saldo: R$ %.2f
                ***********************
                                
                Operações
                                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;

        while (continuar.equals("S")) {
            System.out.println(menu.formatted(saldoConta));
            operacao = leitura.nextInt();
            leitura.nextLine();

            if (operacao < 1 || operacao > 4) {
                System.out.println("Digite uma opção válida!");
            }

            if (operacao == 1) {
                System.out.println("Saldo da conta: " + saldoConta);
            }

            if (operacao == 2) {
                System.out.println("Quanto deseja receber? ");
                float valorRecebido = leitura.nextFloat();
                leitura.nextLine();
                saldoConta += valorRecebido;
                System.out.println("""
                    Transferência recebida!
                    Saldo em conta: %.2f
                    """.formatted(saldoConta));
            }

            if (operacao == 3){
                System.out.println("Qual o valor da transferência? ");
                float valorTransferencia = leitura.nextFloat();
                leitura.nextLine();
                if (valorTransferencia < saldoConta) {
                    saldoConta -= valorTransferencia;
                    System.out.println("""
                        Transferência realizada!
                        Saldo em conta: %.2f
                        """.formatted(saldoConta));
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }

            if (operacao == 4) {
                System.out.println("Obrigado por usar nossos serviços, volte sempre!");
                break;
            }

            System.out.println("Deseja continuar? (S/N) ");
            continuar = leitura.nextLine();
            if (continuar.equals("N")) {
                System.out.println("Obrigado por usar nossos serviços, volte sempre!");
                break;
            }
        }
    }
}
