package Vehicleinator;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma competição entre equipas de desportos motorizados.
 */
public class Competicao {

    private String nome;
    private String localizacao;
    private String data;
    private List<Equipa> equipasParticipantes;

    /**
     * Construtor para criar uma competição.
     *
     * @param nome           Nome da competição.
     * @param localizacao    Local onde a competição será realizada.
     * @param data           Data da competição no formato "dd/MM/yyyy".
     */
    public Competicao(String nome, String localizacao, String data) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.data = data;
        this.equipasParticipantes = new ArrayList<>();
    }

    /**
     * Adiciona uma equipa à lista de equipas participantes.
     *
     * @param equipa Vehicleinator.Equipa a ser adicionada.
     */
    public void adicionarEquipa(Equipa equipa) {
        if (!equipasParticipantes.contains(equipa)) {
            equipasParticipantes.add(equipa);
        } else {
            System.out.println("Vehicleinator.Equipa já está registrada nesta competição.");
        }
    }

    /**
     * Remove uma equipa da lista de equipas participantes.
     *
     * @param equipa Vehicleinator.Equipa a ser removida.
     */
    public void removerEquipa(Equipa equipa) {
        if (equipasParticipantes.contains(equipa)) {
            equipasParticipantes.remove(equipa);
        } else {
            System.out.println("Vehicleinator.Equipa não encontrada nesta competição.");
        }
    }

    /**
     * Organiza a corrida, simulando a competição entre as equipas participantes.
     *
     * @return Nome da equipa vencedora.
     */
    public String organizarCorrida() {
        if (equipasParticipantes.isEmpty()) {
            throw new IllegalStateException("Nenhuma equipa registrada para competir.");
        }

        // Simulação simples de escolha da equipa vencedora.
        int vencedoraIndex = (int) (Math.random() * equipasParticipantes.size());
        Equipa vencedora = equipasParticipantes.get(vencedoraIndex);

        System.out.println("A competição foi realizada com sucesso!");
        System.out.println("A equipa vencedora é: " + vencedora.getNomeEquipa());

        return vencedora.getNomeEquipa();
    }

    /**
     * Exibe as informações sobre a competição.
     */
    public void exibirDetalhes() {
        System.out.println("Competição: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Data: " + data);
        System.out.println("Equipas Participantes:");
        for (Equipa equipa : equipasParticipantes) {
            System.out.println("- " + equipa.getNomeEquipa());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Equipa> getEquipasParticipantes() {
        return equipasParticipantes;
    }
}