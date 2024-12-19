package Vehicleinator;

/**
 * Subclasse de Vehicleinator.Pessoa que representa um engenheiro.
 */
public class Engenheiro extends Pessoa {

    private String area; // Área de atuação (e.g., aerodinâmica, estratégia)

    /**
     * Construtor para criar um engenheiro.
     *
     * @param nome        Nome do engenheiro.
     * @param idade       Idade do engenheiro.
     * @param experiencia Experiência em anos.
     * @param area        Área de atuação.
     */
    public Engenheiro(String nome, int idade, int experiencia, String area) {
        super(nome, idade, experiencia);
        this.area = area;
    }

    /**
     * Simula o engenheiro a desenvolver tecnologia.
     */
    public void desenvolverTecnologia() {
        System.out.println(getNome() + " está desenvolvendo tecnologia na área de " + area + ".");
    }

    // Getters e Setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}