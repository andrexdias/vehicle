package Vehicleinator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Veiculo> veiculos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Menu inicial
        while (true) {
            System.out.println("## BEM-VINDO AO VEHICLEINATOR ##");
            System.out.print("Escolha uma opção: ");
            System.out.println("\n1 - Adicionar Veículo");
            System.out.println("2 - Remover Veículo");
            System.out.println("3 - Listar Veículos");
            System.out.println("4 - Calcular Consumo");
            System.out.println("5 - Competição");
            System.out.println("6 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarVeiculo();
                    break;
                case 2:
                    removerVeiculo();
                    break;
                case 3:
                    listarVeiculos();
                    break;
                case 4:
                    calcularConsumo();
                    break;
                case 5:
                    Competicao();
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarVeiculo() {
        System.out.print("Categoria do veículo (F1, MotoGP, Rally): ");
        String categoria = scanner.nextLine();
        System.out.print("Tipo de veículo (Carro, Vehicleinator.Moto): ");
        String tipoVeiculo = scanner.nextLine();

        Veiculo veiculo = null;
        if (tipoVeiculo.equalsIgnoreCase("Carro")) {
            veiculo = adicionarCarro(categoria);
        } else if (tipoVeiculo.equalsIgnoreCase("Vehicleinator.Moto")) {
            veiculo = adicionarMoto(categoria);
        } else {
            System.out.println("Tipo de veículo inválido.");
            return;
        }

        try {
            if (veiculos.size() >= 10) {
                throw new CapacidadeExcedidaException("A capacidade máxima de veículos foi atingida.");
            }
            veiculos.add(veiculo);
            System.out.println("Veículo adicionado com sucesso.");
        } catch (CapacidadeExcedidaException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Veiculo adicionarCarro(String categoria) {
        System.out.print("Modelo do Carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Cilindradas: ");
        double cilindradas = scanner.nextDouble();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Vida dos Pneus: ");
        double vidaPneus = scanner.nextDouble();
        System.out.print("Vida do Motor: ");
        double vidaMotor = scanner.nextDouble();
        System.out.print("Cavalos: ");
        int cavalos = scanner.nextInt();
        System.out.print("Peso (Kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Downforce: ");
        double downforce = scanner.nextDouble();
        System.out.print("Número de paradas no pit stop: ");
        int numParadasPitStop = scanner.nextInt();
        scanner.nextLine();

        return new Formula1Car(categoria, modelo, cilindradas, ano, vidaPneus, vidaMotor, cavalos, peso, downforce, numParadasPitStop);
    }

    private static Veiculo adicionarMoto(String categoria) {
        System.out.print("Modelo da Vehicleinator.Moto: ");
        String modelo = scanner.nextLine();
        System.out.print("Cilindradas: ");
        double cilindradas = scanner.nextDouble();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Vida dos Pneus: ");
        double vidaPneus = scanner.nextDouble();
        System.out.print("Vida do Motor: ");
        double vidaMotor = scanner.nextDouble();
        System.out.print("Cavalos: ");
        int cavalos = scanner.nextInt();
        System.out.print("Peso (Kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Tem Sidecar (true/false): ");
        boolean temSidecar = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Tipo de Vehicleinator.Moto (Desportiva, Touring, Off-road): ");
        String tipo = scanner.nextLine();

        return new Moto(categoria, modelo, cilindradas, ano, vidaPneus, vidaMotor, cavalos, peso, temSidecar, tipo);
    }

    private static void removerVeiculo() {
        System.out.print("Informe o modelo do veículo a ser removido: ");
        String modelo = scanner.nextLine();

        try {
            Veiculo veiculoRemover = buscarVeiculo(modelo);
            veiculos.remove(veiculoRemover);
            System.out.println("Veículo removido com sucesso.");
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Veiculo buscarVeiculo(String modelo) throws VeiculoNaoEncontradoException {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                return veiculo;
            }
        }
        throw new VeiculoNaoEncontradoException("Veículo não encontrado: " + modelo);
    }

    private static void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Não há veículos registados.");
        } else {
            for (Veiculo veiculo : veiculos) {
                System.out.println("Modelo: " + veiculo.getModelo());
                System.out.println("Categoria: " + veiculo.getCategoria());
                System.out.println("Cilindradas: " + veiculo.getCilindradas());
                System.out.println("Ano: " + veiculo.getAno());
                System.out.println("Cavalos: " + veiculo.getCavalos());
                System.out.println("Peso: " + veiculo.getKGVeiculo());
                System.out.println("Vida dos Pneus: " + veiculo.getVidaPneus());
                System.out.println("Vida do Motor: " + veiculo.getVidaMotor());
                System.out.println();
            }
        }
    }

    private static void calcularConsumo() {
        System.out.print("Informe o modelo do veículo para calcular o consumo: ");
        String modelo = scanner.nextLine();

        try {
            Veiculo veiculoConsumir = buscarVeiculo(modelo);
            System.out.println("Consumo do veículo " + veiculoConsumir.getModelo() + ": " + veiculoConsumir.calcularConsumo() + " litros.");
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void Competicao() {
        System.out.print("Informe o nome da competição: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a localização da competição: ");
        String localizacao = scanner.nextLine();

        System.out.print("Informe a data da competição (dd/MM/yyyy): ");
        String data = scanner.nextLine();

        Competicao competicao = new Competicao(nome, localizacao, data);

        while (true) {
            System.out.println("\n## MENU COMPETIÇÃO ##");
            System.out.print("Escolha uma opção: ");
            System.out.println("\n1 - Adicionar Equipa");
            System.out.println("2 - Remover Equipa");
            System.out.println("3 - Listar Equipas");
            System.out.println("4 - Organizar Corrida");
            System.out.println("5 - Exibir Detalhes da Competição");
            System.out.println("6 - Voltar ao Menu Principal");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarEquipa(competicao);
                    break;
                case 2:
                    removerEquipa(competicao);
                    break;
                case 3:
                    listarEquipas(competicao);
                    break;
                case 4:
                    organizarCorrida(competicao);
                    break;
                case 5:
                    exibirDetalhes(competicao);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarEquipa(Competicao competicao) {
        System.out.print("Nome da equipa: ");
        String nomeEquipa = scanner.nextLine();

        Equipa equipa = new Equipa(nomeEquipa);
        competicao.adicionarEquipa(equipa);

        System.out.println("Equipa adicionada com sucesso.");
    }

    private static void removerEquipa(Competicao competicao) {
        System.out.print("Nome da equipa a ser removida: ");
        String nomeEquipa = scanner.nextLine();

        Equipa equipa = new Equipa(nomeEquipa);
        competicao.removerEquipa(equipa);

        System.out.println("Equipa removida com sucesso.");
    }

    private static void listarEquipas(Competicao competicao) {
        List<Equipa> equipas = competicao.getEquipasParticipantes();
        if (equipas.isEmpty()) {
            System.out.println("Não há equipas registradas.");
        } else {
            System.out.println("Equipas participantes:");
            for (Equipa equipa : equipas) {
                System.out.println("- " + equipa.getNomeEquipa());
            }
        }
    }

    private static void organizarCorrida(Competicao competicao) {
        try {
            String equipaVencedora = competicao.organizarCorrida();
            System.out.println("A equipa vencedora é: " + equipaVencedora);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void exibirDetalhes(Competicao competicao) {
        competicao.exibirDetalhes();
    }
}