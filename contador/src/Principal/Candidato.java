package Principal;

public class Candidato {
    String nome;
    int idade;
    String email;
    double experiencia;

    public Candidato(String nome, int idade, String email, double experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Email: " + email + ", Experiência: " + experiencia;
    }
}