package Principal;

import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    List<Candidato> candidatos = new ArrayList<>();

    public void cadastrarCandidato(String nome, int idade, String email, double experiencia) {
        Candidato candidato = new Candidato(nome, idade, email, experiencia);
        candidatos.add(candidato);

    }

public void validarCandidatos(double experienciaMinima, int idadeMinima) {
    System.out.println("Candidatos aprovados:");
    for (Candidato candidato : candidatos) {
        if (candidato.experiencia >= experienciaMinima && candidato.idade >= idadeMinima) {
            System.out.println(candidato);
        }
    }
}

public static void main(String[] args) {
    ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();

    // Cadastrar candidatos
    processoSeletivo.cadastrarCandidato("João Silva", 25, "joao.silva@example.com", 3.5);
    processoSeletivo.cadastrarCandidato("Maria Oliveira", 30, "maria.oliveira@example.com", 5.0);
    processoSeletivo.cadastrarCandidato("Pedro Santos", 22, "pedro.santos@example.com", 2.0);

    // Validar candidatos
    double experienciaMinima = 3.0;
    int idadeMinima = 25;
    processoSeletivo.validarCandidatos(experienciaMinima, idadeMinima);
}
}