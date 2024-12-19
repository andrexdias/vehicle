package Vehicleinator;

/**
 * Classe (base) que representa uma pessoa.
 */
public class Pessoa {

    private String nome;
    private int idade;
    private int experiencia; // Experiência -- em anos

    /**
     * Construtor para criar uma pessoa.
     *
     * @param nome        Nome da pessoa.
     * @param idade       Idade da pessoa.
     * @param experiencia Experiência (em anos).
     */
    public Pessoa(String nome, int idade, int experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.experiencia = experiencia;
    }

    /**
     * Descreve a pessoa com informações básicas (nome, idade, experiência).
     */
    public void descreverPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Experiência: " + experiencia + " anos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}