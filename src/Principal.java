public class Principal {
    public static void main(String[] args) {
        Film meuFilme = new Film();
        meuFilme.nome = "Burlesque";
        meuFilme.anoDeLancamento = 2010;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(6);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
