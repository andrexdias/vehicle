package Vehicleinator;

import java.io.*;
import java.util.List;

/**
 * Classe para exportar dados (persistência de dados).
 */
public class Persistencia {
    public static void salvarEquipas(List<Equipa> equipas, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(equipas);
            System.out.println("Equipas salvas com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar equipas: " + e.getMessage());
        }
    }

    public static List<Equipa> carregarEquipas(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Equipa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar equipas: " + e.getMessage());
            return null;
        }
    }
}