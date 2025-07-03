public class AlunoGraduacao extends Escola implements Avaliacao {
    
    public AlunoGraduacao(String nome, int idade, int matricula, Double nota){
        super(nome, idade, matricula, nota);
    }
    
    @Override
    public Double calcularMedia() {
        return getNota() * 1.0;
    }
    
}
