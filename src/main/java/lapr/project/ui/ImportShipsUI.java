package lapr.project.ui;

import lapr.project.controller.ImportShipsController;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import java.io.IOException;
import java.util.Scanner;

public class ImportShipsUI {

    public static BST<Ship> importShipsUI(String fileName) throws IOException {
        BST<Ship> bst = new BST<>();
        Scanner scan = new Scanner(System.in);
        int option;
        try {
            do {
                System.out.println("Selecione a opção pela qual quer importar e ordenar os navios:\n1 - MMSI\n2 - IMO\n3 - Call Sign\n");
                option = scan.nextInt();
                switch (option) {
                    case (1):
                        bst = ImportShipsController.importShips(fileName, "MMSI");
                        break;
                    case (2):
                        bst = ImportShipsController.importShips(fileName, "IMO");
                        break;
                    case (3):
                        bst = ImportShipsController.importShips(fileName, "CallSign");
                        break;
                    default:
                        System.out.println("Please insert a valid option!");
                        break;
                }
                return bst;
                
            } while (option!=-1);
        } catch (Exception e) {
            throw new IllegalArgumentException("File not found");
        }
    }
}
