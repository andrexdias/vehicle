package Vehicleinator;

/**
 * Subclasse de Veículo que representa um carro de Rally.
 */
public class RallyCar extends Veiculo {
    private boolean possuiRollCage; // Indica se o carro tem estrutura de segurança (roll cage).
    private double alturaSuspensao; // Altura da suspensão em centímetros.

    /**
     * Construtor para criar um carro de Rally.
     *
     * @param categoria        Categoria do carro.
     * @param modelo           Modelo do carro.
     * @param cilindradas      Cilindradas.
     * @param ano              Ano do carro.
     * @param vida_pneus       Vida dos pneus.
     * @param vida_motor       Vida do motor.
     * @param cavalos          Cavalos.
     * @param KGVeiculo        Peso do carro.
     * @param possuiRollCage   Indica se tem estrutura de segurança.
     * @param alturaSuspensao  Altura da suspensão.
     */
    public RallyCar(String categoria, String modelo, double cilindradas, int ano,
                    double vida_pneus, double vida_motor, int cavalos, double KGVeiculo,
                    boolean possuiRollCage, double alturaSuspensao) {
        super(categoria, modelo, cilindradas, ano, vida_pneus, vida_motor, cavalos, KGVeiculo);
        this.possuiRollCage = possuiRollCage;
        this.alturaSuspensao = alturaSuspensao;
    }

    public boolean isPossuiRollCage() {
        return possuiRollCage;
    }

    public void setPossuiRollCage(boolean possuiRollCage) {
        this.possuiRollCage = possuiRollCage;
    }

    public double getAlturaSuspensao() {
        return alturaSuspensao;
    }

    public void setAlturaSuspensao(double alturaSuspensao) {
        this.alturaSuspensao = alturaSuspensao;
    }

    @Override
    public double calcularConsumo() {
        return getCilindradas() * 0.12;
    }
}