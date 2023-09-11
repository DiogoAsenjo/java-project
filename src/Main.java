public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao meu catálogo de filmes!");

        String filme = "Mãe";
        //System.out.println(filme);

        int anoDeLancamento = 2043;
        //System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        //System.out.println("Incluso no plano: " + incluidoNoPlano);

        double avaliacao = 8.5000;
        //System.out.println("Nota média da crítica: " + avaliacao);

        /*if (avaliacao >= 7) {
            System.out.println("A crítica foi acima da média");
        } else {
            System.out.println("A crítica disse que o filme é ruim");
        }*/

        String sinopse = "Filmo doido com referências bíblicas!";
        //System.out.println(sinopse);

        String fichaDoFilme = """
                Filme: %s
                Lançamento: %d
                Incluso no plano: %b
                Avaliação: %.2f
                Sinopse: %s
                """.formatted(filme, anoDeLancamento, incluidoNoPlano, avaliacao, sinopse);
        System.out.println(fichaDoFilme);
    }
}
