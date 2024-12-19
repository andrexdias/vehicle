package Vehicleinator;

/**
 * Classe abstrata que representa um veículo genérico.
 */
public abstract class Veiculo {
    private String categoria;
    private String modelo;
    private double cilindradas;
    private int ano;
    private double vida_pneus;
    private double vida_motor;
    private int cavalos;
    private double KGVeiculo; // Peso do veículo

    // Construtor

    /**
     *
     * @param categoria     Categoria do veículo
     * @param modelo        Modelo do veículo
     * @param cilindradas   Cilindradas do veículo
     * @param ano           Ano de fabrico do veículo
     * @param vida_pneus    Vida dos pneus
     * @param vida_motor    Vida do motor
     * @param cavalos       Cavalos do veículo
     * @param KGVeiculo     Peso (kg) do veículo
     */
    public Veiculo(String categoria, String modelo, double cilindradas, int ano,
                   double vida_pneus, double vida_motor, int cavalos, double KGVeiculo) {
        this.categoria = categoria;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
        this.ano = ano;
        this.vida_pneus = vida_pneus;
        this.vida_motor = vida_motor;
        this.cavalos = cavalos;
        this.KGVeiculo = KGVeiculo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVidaPneus() {
        return vida_pneus;
    }

    public void setVidaPneus(double vida_pneus) {
        this.vida_pneus = vida_pneus;
    }

    public double getVidaMotor() {
        return vida_motor;
    }

    public void setVidaMotor(double vida_motor) {
        this.vida_motor = vida_motor;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public double getKGVeiculo() {
        return KGVeiculo;
    }

    public void setKGVeiculo(double KGVeiculo) {
        this.KGVeiculo = KGVeiculo;
    }

    public abstract double calcularConsumo(); // a implementação é específica, definida em cada subclasse.

    @Override
    public String toString() {
        return "Veículo{" +
                "categoria='" + categoria + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindradas=" + cilindradas +
                ", ano=" + ano +
                ", vida_pneus=" + vida_pneus +
                ", vida_motor=" + vida_motor +
                ", cavalos=" + cavalos +
                ", KGVeiculo=" + KGVeiculo +
                '}';
    }
}