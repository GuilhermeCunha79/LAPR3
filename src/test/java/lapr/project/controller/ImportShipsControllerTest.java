package lapr.project.controller;


import lapr.project.model.CallSignTree;
import lapr.project.model.IMOTree;
import lapr.project.model.Position;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.DTO.PositionDTO;
import lapr.project.utils.DTO.ShipDTO;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static lapr.project.controller.ImportShipsController.importShipsPosition;
import static org.junit.Assert.*;
import static lapr.project.controller.ImportShipsController.importShips;

public class ImportShipsControllerTest {


    @Test
    public void importShipsTest() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();

        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship1 = new Ship(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship2 = new Ship(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship3 = new Ship(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship4 = new Ship(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship5 = new Ship(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "MMSI");
        assertEquals(result.size(), expResult.size());
    }/*

    @Test
    public void importShipsTest1() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();

        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship1 = new Ship(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship2 = new Ship(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship3 = new Ship(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship4 = new Ship(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship5 = new Ship(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "CallSign");
        assertEquals(result.size(), expResult.size());
    }
    @Test
    public void importShipsTest3() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();

        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship1 = new Ship(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship2 = new Ship(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship3 = new Ship(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship4 = new Ship(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship5 = new Ship(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "IMO");
        assertEquals(result.size(), expResult.size());
    }
    @Test
    public void importPositionsTest() throws FileNotFoundException {
        BST<Position> result = new BST<>();
        BST<Position> expResult = new BST<>();

        PositionDTO positionDTO1=new PositionDTO(210950015,"31/12/2020 17:03",42.92236,-66.97243,12.5,2.4,358,"B");
        Position ship1 = new Position(positionDTO1);
        result.insert(ship1);
        PositionDTO shipDTO2=new PositionDTO(210950010,"31/12/2020 16:20",42.7698,-66.9759,13.3,3.7,356,"B");
        Position ship2 = new Position(shipDTO2);
        result.insert(ship2);
        PositionDTO shipDTO3=new PositionDTO(210950020,"31/12/2020 19:37",24.34573,-85.12394,11.7,119.9,117,"A");
        Position ship3 = new Position(shipDTO3);
        result.insert(ship3);
        PositionDTO shipDTO4=new PositionDTO(210950008,"31/12/2020 21:49",24.14301,-84.72268,11.7,116.6,114,"B");
        Position ship4 = new Position(shipDTO4);
        result.insert(ship4);
        PositionDTO shipDTO5=new PositionDTO(210950012,"31/12/2020 00:25",28.32168,-88.81035,11.7,128.3,130,"B");
        Position ship5 = new Position(shipDTO5);
        result.insert(ship5);
        PositionDTO shipDTO6=new PositionDTO(210950017,"31/12/2020 00:20",28.33263,-88.82491,11.8,129.5,131,"B");
        Position ship6 = new Position(shipDTO6);
        result.insert(ship6);
        PositionDTO shipDTO7=new PositionDTO(210950025,"31/12/2020 00:40",28.33264,-88.82492,11.8,129.6,132,"B");
        Position ship7 = new Position(shipDTO7);
        result.insert(ship7);
        expResult = importShipsPosition("sshipsTest.txt");
        assertEquals(result.size(), expResult.size());
    }
    */
//    @Test
//    public void importPositionsTest1() throws FileNotFoundException {
//        BST<Position> result = new BST<>();
//        BST<Position> expResult = new BST<>();
//
//        PositionDTO positionDTO1=new PositionDTO(210950015,"31/12/2020 17:03",42.92236,-66.97243,12.5,2.4,358,"B");
//        Position ship1 = new Position(positionDTO1);
//        result.insert(ship1);
//        PositionDTO shipDTO2=new PositionDTO(210950010,"31/12/2020 16:20",42.7698,-66.9759,13.3,3.7,356,"B");
//        Position ship2 = new Position(shipDTO2);
//        result.insert(ship2);
//        PositionDTO shipDTO3=new PositionDTO(210950020,"31/12/2020 19:37",24.34573,-85.12394,11.7,119.9,117,"A");
//        Position ship3 = new Position(shipDTO3);
//        result.insert(ship3);
//        PositionDTO shipDTO4=new PositionDTO(210950008,"31/12/2020 21:49",24.14301,-84.72268,11.7,116.6,114,"B");
//        Position ship4 = new Position(shipDTO4);
//        result.insert(ship4);
//        PositionDTO shipDTO5=new PositionDTO(210950012,"31/12/2020 00:25",28.32168,-88.81035,11.7,128.3,130,"B");
//        Position ship5 = new Position(shipDTO5);
//        result.insert(ship5);
//        PositionDTO shipDTO6=new PositionDTO(210950017,"31/12/2020 00:20",28.33263,-88.82491,11.8,129.5,131,"B");
//        Position ship6 = new Position(shipDTO6);
//        result.insert(ship6);
//        PositionDTO shipDTO7=new PositionDTO(210950025,"31/12/2020 00:40",28.33264,-88.82492,11.8,129.6,132,"B");
//        Position ship7 = new Position(shipDTO7);
//        result.insert(ship7);
//        expResult = importShipsPosition("sshipsTest.txt");
//        assertEquals(result.toString(), expResult.toString());
//    }
    @Test
    public void importPositionsTest2() throws FileNotFoundException {
        int result = 22;
        BST<Position> expResult = new BST<>();
        expResult = importShipsPosition("sships.csv");
        assertEquals(result, expResult.size());
    }
    @Test
    public void importShipsTest4() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();

        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship1 = new Ship(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship2 = new Ship(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship3 = new Ship(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship4 = new Ship(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship5 = new Ship(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "MMSI");
        assertEquals(result.smallestElement(), expResult.smallestElement());
    }
    @Test
    public void importShipsTest5() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();
        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship1 = new Ship(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship ship2 = new Ship(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship3 = new Ship(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        Ship ship4 = new Ship(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship5 = new Ship(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "MMSI");
        assertEquals(result.toString(), expResult.toString());
    }
    @Test
    public void importShipsTest6() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();

        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        IMOTree ship1 = new IMOTree(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        IMOTree ship2 = new IMOTree(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        IMOTree ship3 = new IMOTree(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        IMOTree ship4 = new IMOTree(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        IMOTree ship5 = new IMOTree(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        IMOTree ship6 = new IMOTree(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        IMOTree ship7 = new IMOTree(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "IMO");
        assertEquals(result.toString(), expResult.toString());
    }
    @Test
    public void importShipsTest7() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();
        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        CallSignTree ship1 = new CallSignTree(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        CallSignTree ship2 = new CallSignTree(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        CallSignTree ship3 = new CallSignTree(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        CallSignTree ship4 = new CallSignTree(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        CallSignTree ship5 = new CallSignTree(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        CallSignTree ship6 = new CallSignTree(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        CallSignTree ship7 = new CallSignTree(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "CallSign");
        assertEquals(result.toString(), expResult.toString());
    }
    @Test
    public void importShipsTest8() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();
        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        CallSignTree ship1 = new CallSignTree(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        CallSignTree ship2 = new CallSignTree(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        CallSignTree ship3 = new CallSignTree(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        CallSignTree ship4 = new CallSignTree(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        CallSignTree ship5 = new CallSignTree(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        CallSignTree ship6 = new CallSignTree(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        CallSignTree ship7 = new CallSignTree(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "CallSign");
        assertEquals(result.smallestElement(), expResult.smallestElement());
    }
    @Test
    public void importShipsTest9() throws FileNotFoundException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();
        ShipDTO shipDTO1=new ShipDTO(210950015,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        IMOTree ship1 = new IMOTree(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2=new ShipDTO(210950010,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        IMOTree ship2 = new IMOTree(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3=new ShipDTO(210950020,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        IMOTree ship3 = new IMOTree(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4=new ShipDTO(210950008,"SAITA I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        IMOTree ship4 = new IMOTree(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5=new ShipDTO(210950012,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        IMOTree ship5 = new IMOTree(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6=new ShipDTO(210950017,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        IMOTree ship6 = new IMOTree(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7=new ShipDTO(210950025,"CMA CGM ALMAVIVA","IMO9450648","FLSUE",70,334,42,15,"79");
        IMOTree ship7 = new IMOTree(shipDTO7);
        result.insert(ship7);
        expResult = importShips("sshipsTest.txt", "IMO");
        assertEquals(result.smallestElement(), expResult.smallestElement());
    }
}
