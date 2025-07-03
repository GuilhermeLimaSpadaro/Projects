public class AlunoPosGraduacao extends Escola implements Avaliacao {
    
    public AlunoPosGraduacao (String nome, int idade, int matricula, Double nota){

        super(nome, idade, matricula, nota);

    }

    @Override
    public Double calcularMedia() {
        return getNota() * 1.5;
    }
}
