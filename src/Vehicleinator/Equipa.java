package Vehicleinator;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma equipa de desportos motorizados.
 */
public class Equipa {
    private String nomeEquipa;
    private String categoria; //Categoria da equipa (F1, MotoGP.....)
    private List<Pessoa> membros; //pilotos, mecânicos , engenheiros
    private List<Veiculo> veiculos; //associados à equipa
    private List<String> resultados;

    public Equipa(String nomeEquipa) {
        this.nomeEquipa = nomeEquipa;
        this.categoria = categoria;
        this.membros = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.resultados = new ArrayList<>();
    }

    public void adicionarMembro(Pessoa membro) {
        if (membro instanceof Piloto || membro instanceof Mecanico || membro instanceof Engenheiro) {
            membros.add(membro);
        } else {
            System.out.println("Membro inválido para a equipa.");
        }
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo.getCategoria().equals(this.categoria)) {
            veiculos.add(veiculo);
        } else {
            System.out.println("Veículo não corresponde à categoria da equipa.");
        }
    }

    public void registrarResultado(String resultado) {
        resultados.add(resultado);
    }

    public void exibirDetalhes() {
        System.out.println("Vehicleinator.Equipa: " + nomeEquipa + " (" + categoria + ")");
        System.out.println("Membros:");
        for (Pessoa membro : membros) {
            System.out.println("- " + membro.getNome());
        }
        System.out.println("Veículos:");
        for (Veiculo veiculo : veiculos) {
            System.out.println("- " + veiculo.getModelo());
        }
        System.out.println("Resultados:");
        for (String resultado : resultados) {
            System.out.println("- " + resultado);
        }
    }

    public String getNomeEquipa() {
        return nomeEquipa;
    }

    public void setNomeEquipa(String nomeEquipa) {
        this.nomeEquipa = nomeEquipa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Pessoa> getMembros() {
        return membros;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<String> getResultados() {
        return resultados;
    }
}