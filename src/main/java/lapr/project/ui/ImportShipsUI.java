package lapr.project.ui;

import lapr.project.controller.ImportShipsController;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;

import java.io.IOException;
import java.util.Scanner;

public class ImportShipsUI {
    private final ImportShipsController ctrl = new ImportShipsController();

    public BST<Ship> importShipsUI() throws IOException {
        BST<Ship> bst = new BST<>();
        Scanner scan = new Scanner(System.in);
        String fileName;
        int option;
        try {
            do {
                System.out.println("Coloque neste campo o nome do ficheiro que pretende importar: ");
                fileName=scan.nextLine();
                System.out.println("\nSelecione a opção que pretende para ordenar os navios :\n1 - MMSI\n2 - IMO\n3 - Call Sign");
                option = scan.nextInt();
                switch (option) {
                    case (1):
                        bst = ctrl.importShips(fileName, "MMSI");
                        System.out.println("\nImportados e ordenados por MMSI, com sucesso!");
                        break;
                    case (2):
                        bst = ctrl.importShips(fileName, "IMO");
                        System.out.println("\nImportados e ordenados por IMO,com sucesso!");
                        break;
                    case (3):
                        bst = ctrl.importShips(fileName, "Call Sign");
                        System.out.println("\nImportados e ordenados por Call Sign, com sucesso!");
                        break;
                    default:
                        System.out.println("Por favor insira uma opção válida!");
                        break;
                }
                return bst;

            } while (option != 1 || option != 2||option != 3);
        } catch (Exception e) {
            throw new IllegalArgumentException("File not found");
        }
    }
}
