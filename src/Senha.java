public class Senha {
    public static void main(String[] args) {
        String senha = "123456";
        String senhaCofre = "123456";

        if (senha.equals(senhaCofre)) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado!");
        }

        String textBlock = """
                É possível escrever formantando colocando 3 aspas
                Assim
                Pode
                Pular
                Linha
                No próprio editor hehe
                """;
        System.out.println(textBlock);
    }
}
