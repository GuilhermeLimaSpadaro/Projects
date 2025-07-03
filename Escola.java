public class Escola {

   private String nome;
   private int idade;
   private int matricula;
   private Double nota;

   public Escola(String nome, int idade, int matricula, Double nota){
    this.nome = nome;
    this.idade = idade;
    this.matricula = matricula;
    this.nota = nota;
   }

   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }

   
   public int getIdade() {
       return idade;
   }
   public void setIdade(int idade) {
       if (idade > 0){
        this.idade = idade;
        System.out.println("Idade registrada com sucesso");
       }
       else{
        System.out.println("Valor Incorreto");
       }
   }

   public int getMatricula() {
       return matricula;
   }
   
   public void setMatricula(int matricula) {
    if (matricula < 0) {
        System.out.println("Valor incorreto. ");
    }   
    else {
       this.matricula = matricula;
       System.out.println("Matriculado com sucesso! ");
   }
   }

   public Double getNota() {
       return nota;
   }
   public void setNota(Double nota) {
    if (nota > 0) {
        this.nota = nota;
        System.out.println("Nota registrada com sucesso! ");
    }
    else {
        System.err.println("Valor incorreto! ");
    }
      
   }

}

