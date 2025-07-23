public class Film {
    String nome;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    double pegaMedia (){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
