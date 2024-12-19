package Vehicleinator;

/**
 * Subclasse de Veículo que representa um carro de Fórmula 1.
 */
public class Formula1Car extends Veiculo {
    private double downforce; // Força aerodinâmica em Newtons.
    private int numParadasPitStop; // Número de paradas em pit stops durante a corrida.

    /**
     * Construtor para criar um carro de Fórmula 1.
     *
     * @param categoria         Categoria do carro.
     * @param modelo            Modelo do carro.
     * @param cilindradas       Cilindradas.
     * @param ano               Ano do carro.
     * @param vida_pneus        Vida dos pneus.
     * @param vida_motor        Vida do motor.
     * @param cavalos           Cavalos.
     * @param KGVeiculo         Peso do carro.
     * @param downforce         Força aerodinâmica.
     * @param numParadasPitStop Número de paradas no pit stop.
     */
    public Formula1Car(String categoria, String modelo, double cilindradas, int ano, double vida_pneus,
                       double vida_motor, int cavalos, double KGVeiculo, double downforce, int numParadasPitStop) {
        super(categoria, modelo, cilindradas, ano, vida_pneus, vida_motor, cavalos, KGVeiculo);
        this.downforce = downforce;
        this.numParadasPitStop = numParadasPitStop;
    }

    // Getters e Setters
    public double getDownforce() {
        return downforce;
    }

    public void setDownforce(double downforce) {
        this.downforce = downforce;
    }

    public int getNumParadasPitStop() {
        return numParadasPitStop;
    }

    public void setNumParadasPitStop(int numParadasPitStop) {
        this.numParadasPitStop = numParadasPitStop;
    }

    @Override
    public double calcularConsumo() {
        return getCilindradas() * 0.15;
    }
}