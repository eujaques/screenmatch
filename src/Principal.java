import pt.eujaques.screenmatch.Film;

public class Principal {
    public static void main(String[] args) {
        Film meuFilme = new Film();
        meuFilme.setNome("Burlesque");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setDuracaoEmMinutos(120);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(6);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
//comentario para commit