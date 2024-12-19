package Vehicleinator;

/**
 * Subclasse de Veículo que representa uma mota.
 */
public class Moto extends Veiculo {
    private boolean temSidecar; // Indica se a moto tem sidecar.
    private String tipo; // Tipo de moto: desportiva, touring, off-road.

    /**
     * Construtor para criar uma mota.
     *
     * @param categoria   Categoria da mota.
     * @param modelo      Modelo da mota.
     * @param cilindradas Cilindradas.
     * @param ano         Ano da mota.
     * @param vida_pneus  Vida dos pneus.
     * @param vida_motor  Vida do motor.
     * @param cavalos     Cavalos.
     * @param KGVeiculo   Peso da mota.
     * @param temSidecar  Indica se tem sidecar.
     * @param tipo        Tipo de mota.
     */
    public Moto(String categoria, String modelo, double cilindradas, int ano, double vida_pneus, double vida_motor,
                int cavalos, double KGVeiculo, boolean temSidecar, String tipo) {
        super(categoria, modelo, cilindradas, ano, vida_pneus, vida_motor, cavalos, KGVeiculo);
        this.temSidecar = temSidecar;
        this.tipo = tipo;
    }

    // Getters e Setters
    public boolean isTemSidecar() {
        return temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {
        this.temSidecar = temSidecar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularConsumo() {
        // Implementação específica para motos.
        return getCilindradas() * 0.08;
    }
}