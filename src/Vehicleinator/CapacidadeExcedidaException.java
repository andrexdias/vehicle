package Vehicleinator;

/**
 * Exceção lançada quando a capacidade de veículos é excedida.
 */
public class CapacidadeExcedidaException extends RuntimeException {
    public CapacidadeExcedidaException(String mensagem) {
        super(mensagem);
    }
}