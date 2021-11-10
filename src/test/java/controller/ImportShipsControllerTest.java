package controller;/*package lapr.project.controller;

import lapr.project.model.CallSignTree;
import lapr.project.model.IMOTree;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.DTO.ShipDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;


class ImportShipsControllerTest {

    @Test
    void importShips() throws IOException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();

        ShipDTO shipDTO1 = new ShipDTO(210950015, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        Ship ship1 = new Ship(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2 = new ShipDTO(210950010, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        Ship ship2 = new Ship(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3 = new ShipDTO(210950020, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        Ship ship3 = new Ship(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4 = new ShipDTO(210950008, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        Ship ship4 = new Ship(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5 = new ShipDTO(210950012, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship5 = new Ship(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        expResult = ImportShipsController.importShips("sshipsTest.txt", "MMSI");
        Assertions.assertEquals(result.size(), expResult.size());
    }

   /*@Test
    public void importPositionsTest2() throws FileNotFoundException {
        int result = 181;
        BST<Position> expResult = new BST<>();
        expResult = importShipsPosition("sships.csv");
        assertEquals(result, expResult.size());
    }*/
/*
    @Test
    public void importShipsTest4() throws IOException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();

        ShipDTO shipDTO1 = new ShipDTO(210950015, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        Ship ship1 = new Ship(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2 = new ShipDTO(210950010, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        Ship ship2 = new Ship(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3 = new ShipDTO(210950020, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        Ship ship3 = new Ship(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4 = new ShipDTO(210950008, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        Ship ship4 = new Ship(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5 = new ShipDTO(210950012, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship5 = new Ship(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        expResult = ImportShipsController.importShips("sshipsTest.txt", "MMSI");
        Assertions.assertEquals(result.smallestElement(), expResult.smallestElement());
    }

    @Test
    public void importShipsTest5() throws IOException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();
        ShipDTO shipDTO1 = new ShipDTO(210950015, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        Ship ship1 = new Ship(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2 = new ShipDTO(210950010, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        Ship ship2 = new Ship(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3 = new ShipDTO(210950020, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        Ship ship3 = new Ship(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4 = new ShipDTO(210950008, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        Ship ship4 = new Ship(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5 = new ShipDTO(210950012, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship5 = new Ship(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        expResult = ImportShipsController.importShips("sshipsTest.txt", "MMSI");
        Assertions.assertEquals(result.toString(), expResult.toString());
    }

    @Test
    public void importShipsTest6() throws IOException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();

        ShipDTO shipDTO1 = new ShipDTO(210950015, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        IMOTree ship1 = new IMOTree(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2 = new ShipDTO(210950010, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        IMOTree ship2 = new IMOTree(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3 = new ShipDTO(210950020, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        IMOTree ship3 = new IMOTree(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4 = new ShipDTO(210950008, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        IMOTree ship4 = new IMOTree(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5 = new ShipDTO(210950012, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        IMOTree ship5 = new IMOTree(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        IMOTree ship6 = new IMOTree(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        IMOTree ship7 = new IMOTree(shipDTO7);
        result.insert(ship7);
        expResult = ImportShipsController.importShips("sshipsTest.txt", "IMO");
        Assertions.assertEquals(result.toString(), expResult.toString());
    }

    @Test
    public void importShipsTest7() throws IOException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();
        ShipDTO shipDTO1 = new ShipDTO(210950015, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        CallSignTree ship1 = new CallSignTree(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2 = new ShipDTO(210950010, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        CallSignTree ship2 = new CallSignTree(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3 = new ShipDTO(210950020, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        CallSignTree ship3 = new CallSignTree(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4 = new ShipDTO(210950008, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        CallSignTree ship4 = new CallSignTree(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5 = new ShipDTO(210950012, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        CallSignTree ship5 = new CallSignTree(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        CallSignTree ship6 = new CallSignTree(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        CallSignTree ship7 = new CallSignTree(shipDTO7);
        result.insert(ship7);
        expResult = ImportShipsController.importShips("sshipsTest.txt", "CallSign");
        Assertions.assertEquals(result.toString(), expResult.toString());
    }

    @Test
    public void importShipsTest8() throws IOException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();
        ShipDTO shipDTO1 = new ShipDTO(210950015, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        CallSignTree ship1 = new CallSignTree(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2 = new ShipDTO(210950010, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        CallSignTree ship2 = new CallSignTree(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3 = new ShipDTO(210950020, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        CallSignTree ship3 = new CallSignTree(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4 = new ShipDTO(210950008, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        CallSignTree ship4 = new CallSignTree(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5 = new ShipDTO(210950012, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        CallSignTree ship5 = new CallSignTree(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        CallSignTree ship6 = new CallSignTree(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        CallSignTree ship7 = new CallSignTree(shipDTO7);
        result.insert(ship7);
        expResult = ImportShipsController.importShips("sshipsTest.txt", "CallSign");
        Assertions.assertEquals(result.smallestElement(), expResult.smallestElement());
    }

    @Test
    public void importShipsTest9() throws IOException {
        BST<Ship> result = new BST<>();
        BST<Ship> expResult = new BST<>();
        ShipDTO shipDTO1 = new ShipDTO(210950015, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        IMOTree ship1 = new IMOTree(shipDTO1);
        result.insert(ship1);
        ShipDTO shipDTO2 = new ShipDTO(210950010, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        IMOTree ship2 = new IMOTree(shipDTO2);
        result.insert(ship2);
        ShipDTO shipDTO3 = new ShipDTO(210950020, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        IMOTree ship3 = new IMOTree(shipDTO3);
        result.insert(ship3);
        ShipDTO shipDTO4 = new ShipDTO(210950008, "SAITA I", "IMO9643544", "5BBA4", 70, 228, 32, 14.4, "NA");
        IMOTree ship4 = new IMOTree(shipDTO4);
        result.insert(ship4);
        ShipDTO shipDTO5 = new ShipDTO(210950012, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        IMOTree ship5 = new IMOTree(shipDTO5);
        result.insert(ship5);
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        IMOTree ship6 = new IMOTree(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        IMOTree ship7 = new IMOTree(shipDTO7);
        result.insert(ship7);
        expResult = ImportShipsController.importShips("sshipsTest.txt", "IMO");
        Assertions.assertEquals(result.smallestElement(), expResult.smallestElement());
    }
}
*/