package Basico;

public class Main {
    public static void main (String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //comentários
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de ação com aviões de combate
                Bom filme!
                Ano de lançamento
                """ + anoLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}
