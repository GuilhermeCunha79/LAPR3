package lapr.project.controller;

import lapr.project.model.CallSignTree;
import lapr.project.model.IMOTree;
import lapr.project.model.Position;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.BST.Utils;
import lapr.project.utils.DTO.PositionDTO;
import lapr.project.utils.DTO.ShipDTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportShipsController extends BST{

    public static BST<Ship> importShips(String file,String type) throws FileNotFoundException {
        BST<Ship> bst = new BST<>();
        File ficheiro = new File(file);
        try {
            Scanner scan = new Scanner(ficheiro);
            String line = scan.nextLine();

            while (scan.hasNextLine()) {
                String buff[] = scan.nextLine().trim().split(",");
                ShipDTO shipDTO = new ShipDTO(Integer.parseInt(buff[0]), buff[7], buff[8], buff[9], Integer.parseInt(buff[10]), Integer.parseInt(buff[11]), Integer.parseInt(buff[12]), Double.parseDouble(buff[13]), buff[14]);
                Ship ship = new Ship(shipDTO);
                switch (type) {
                    case ("MMSI"):
                        bst.insert(ship);
                        break;
                    case ("CallSign"):
                        CallSignTree callSignTree = new CallSignTree(shipDTO);
                        bst.insert(callSignTree);
                        break;
                    case ("IMO"):
                        IMOTree imoTree = new IMOTree(shipDTO);
                        bst.insert(imoTree);
                        break;
                }
            }
        }catch (Exception e){
            throw new IllegalArgumentException("File not found");
        }
        return bst;
    }

    public static BST<Position> importShipsPosition(String file) throws FileNotFoundException {
        BST<Position> bst1 = new BST<>();
        File ficheiro = new File(file);

        Scanner scan = new Scanner(ficheiro);
        String line = scan.nextLine();

        while(scan.hasNextLine()){
            String buff[] = scan.nextLine().trim().split(",");
            PositionDTO positionDTO=new PositionDTO(Integer.parseInt(buff[0]),buff[1],Double.parseDouble(buff[2]),Double.parseDouble(buff[3]),Float.parseFloat(buff[4]),Float.parseFloat(buff[5]),Integer.parseInt(buff[6]),buff[15]);
            Position position = new Position(positionDTO);
            bst1.insert(position);
        }
        return bst1;
    }
}