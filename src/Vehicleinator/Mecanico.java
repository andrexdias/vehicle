package Vehicleinator;

/**
 * Subclasse de Vehicleinator.Pessoa que representa um mecânico.
 */
public class Mecanico extends Pessoa {

    private String especialidade; // e.g., motores, chassis, eletrônica

    /**
     * Construtor para criar um mecânico.
     *
     * @param nome         Nome do mecânico.
     * @param idade        Idade do mecânico.
     * @param experiencia  Experiência em anos.
     * @param especialidade Especialidade do mecânico.
     */
    public Mecanico(String nome, int idade, int experiencia, String especialidade) {
        super(nome, idade, experiencia);
        this.especialidade = especialidade;
    }

    /**
     * Simula o mecânico realizando uma manutenção.
     */
    public void realizarManutencao() {
        System.out.println(getNome() + " está realizando manutenção na área de " + especialidade + ".");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}