package Vehicleinator;

/**
 * Subclasse de Vehicleinator.Pessoa que representa um piloto.
 */
public class Piloto extends Pessoa {

    private String licenca; // Tipo de licença (e.g., FIA, FIM)
    private String categoria; // Categoria (e.g., F1, MotoGP, Rally)

    /**
     * Construtor para criar um piloto.
     *
     * @param nome        Nome do piloto.
     * @param idade       Idade do piloto.
     * @param experiencia Experiência em anos.
     * @param licenca     Tipo de licença.
     * @param categoria   Categoria de corrida.
     */
    public Piloto(String nome, int idade, int experiencia, String licenca, String categoria) {
        super(nome, idade, experiencia);
        this.licenca = licenca;
        this.categoria = categoria;
    }

    /**
     * Simula o piloto participando de uma corrida.
     */
    public void participarCorrida() {
        System.out.println(getNome() + " está participando de uma corrida na categoria " + categoria + ".");
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}