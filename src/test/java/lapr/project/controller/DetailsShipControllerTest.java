package lapr.project.controller;

import lapr.project.model.Ship;
import lapr.project.store.ShipStore;
import lapr.project.utils.BST.BST;
import lapr.project.utils.DTO.ShipDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DetailsShipControllerTest {
    DetailsShipController ctrl=new DetailsShipController();
    private ShipStore shipStore;

    public DetailsShipControllerTest() throws IOException {
    }

   /* @Test
    public void checksearchByMMSI() throws IOException {
        BST<Ship> result = new BST<>();
        ShipDTO shipDTO1 = new ShipDTO(210950015, "VARAMO", "IMO9395044", "C4SQ2", 70, 166, 25, 9.5, "NA");
        Ship ship1 = new Ship(shipDTO1);
        this.shipStore.saveShipMmsi(this.shipStore.newShip(shipDTO1),"MMSI");
        this.shipStore.addShipMmsi(ship1);
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
        Assertions.assertEquals(ship3,ctrl.searchByMMSI(210950020));

    }*/

    @Test
    public void checksearchByMmsiWrong() throws IOException {
        BST<Ship> result = new BST<>();
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
        Assertions.assertNotEquals(ship2,ctrl.searchByMMSI(210950020));

    }
/*
    @Test
    public void checksearchByImo() throws IOException {
        BST<Ship> result = new BST<>();
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
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450668", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        Assertions.assertEquals(ship6,ctrl.searchByIMO("IMO9450668"));

    }*/

    @Test
    public void checksearchByImoWrong() throws IOException {
        BST<Ship> result = new BST<>();
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
        ShipDTO shipDTO6 = new ShipDTO(210950017, "CMA CGM ALMAVIVA", "IMO9450668", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship6 = new Ship(shipDTO6);
        result.insert(ship6);
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUE", 70, 334, 42, 15, "79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        Assertions.assertNotEquals(ship1,ctrl.searchByIMO("IMO9450668"));

    }

   /* @Test
    public void checkSearchByCallSign() throws IOException {
        BST<Ship> result = new BST<>();
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
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUUE", 70, 334, 42, 15, "79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        Assertions.assertEquals(ship7,ctrl.searchByCallSign("FLSUUE"));

    }
*/
    @Test
    public void checksearchByCallSignWrong() throws IOException {
        BST<Ship> result = new BST<>();
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
        ShipDTO shipDTO7 = new ShipDTO(210950025, "CMA CGM ALMAVIVA", "IMO9450648", "FLSUUE", 70, 334, 42, 15, "79");
        Ship ship7 = new Ship(shipDTO7);
        result.insert(ship7);
        Assertions.assertNotEquals(ship1,ctrl.searchByCallSign("FLSUUE"));

    }
}
