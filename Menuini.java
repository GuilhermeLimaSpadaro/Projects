import java.util.Scanner;

public class Menuini extends Escola {

    //CONSTRUTOR MENUINI INSTANCIANDO OS ATRIBUTROS DA SUPERCLASSE.

    public Menuini (String nome, int idade, int matricula, Double nota) {
        super(nome, idade, matricula, nota);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        //INPUT DOS **NOMES**
        
        System.out.println("Digite o nome do aluno da Gradução: ");
        String nome =sc.nextLine();

        System.out.println("Digite o nome do aluno da Pós Graduação: ");
        String nome1 = sc.nextLine();
        
        //INPUT NOTAS

        System.out.println("Digite a nota do aluno da Graduação: ");
        Double nota = sc.nextDouble();

        System.out.println("Digite a nota do aluno da Pós Graduação: ");
        Double nota1 = sc.nextDouble();
        
        //LIMPEZA DE BUFFER

        sc.nextLine();

        //INPUT DA DAS **IDADES**
        
        System.out.println("Digite a idade do aluno da Graduação: ");
        int idade = sc.nextInt();

        System.out.println("Digite a idade do aluno da Pós Graduação: ");
        int idade1 = sc.nextInt();

        //LIMPEZA DE BUFFER

        sc.nextLine();

        //INPUT DAS **MATRICULAS**

        System.out.println("Digite a matricula do aluno da Graduação: ");
        int matricula = sc.nextInt();

        System.err.println("Digite a matricula do aluno da Pós Graduação:: ");
        int matricula1 = sc.nextInt();
        
        //LIMPEZA DE BUFFER

        sc.nextLine();

        //INSTANCIAS **GRADUACÃO E POS** NAS CLASSES **ALUNOGRADUACÃO** E **ALUNOSPOSGRADUCAO**

        AlunoGraduacao Graduacao = new AlunoGraduacao(nome, idade, matricula, nota);
        AlunoPosGraduacao Pos = new AlunoPosGraduacao(nome1, idade1, matricula1, nota1);

        //GETS PARA RETORNAR OS VALORES DE ENTRADA E FINAIS.

        System.out.println("Nome: " + Graduacao.getNome());
        System.out.println("Nome: " + Pos.getNome());
        
        System.out.println("Nota: " + Graduacao.getNota());
        System.out.println("Nota: " + Pos.getNota());

        System.out.println("Media Final: " + Graduacao.calcularMedia());
        System.out.println("Media Final: " + Pos.calcularMedia());
        
        
        String sim = new String();
        String nao = new String();
        if (sim != nao){
        System.out.println("Escolha sim para acessar a matricula: ");
        sc.nextLine();
        }
        else{
            System.err.println("Saindo");
        }
        sc.close();
  }
}