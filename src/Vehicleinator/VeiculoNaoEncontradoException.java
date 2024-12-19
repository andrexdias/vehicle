package Vehicleinator;

/**
 * Exceção lançada quando um veículo não é encontrado.
 */
public class VeiculoNaoEncontradoException extends Exception {
    public VeiculoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}