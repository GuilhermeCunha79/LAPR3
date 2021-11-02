package lapr.project.controller;

import lapr.project.model.Ship;
import lapr.project.utils.BST;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadFile {

    public static BST<Ship> importShips(String file) throws FileNotFoundException {
        BST<Ship> bst = new BST<>();
        File ficheiro = new File(file);

        Scanner scan = new Scanner(file);
        String line = scan.nextLine();

        while(scan.hasNextLine()){
            String buff[] = scan.nextLine().trim().split(",");
            Ship ship = new Ship(Integer.parseInt(buff[0]),buff[1],Double.parseDouble(buff[2]),Double.parseDouble(buff[3]), Float.parseFloat(buff[4]),Float.parseFloat(buff[5]),Integer.parseInt(buff[6]),buff[7],buff[8],buff[9],Integer.parseInt(buff[10]),Integer.parseInt(buff[11]),Integer.parseInt(buff[12]),Double.parseDouble(buff[13]),buff[14],buff[15]);
            bst.insert(ship);
        }
        return bst;
    }
}