package app.domain.utils;

import app.domain.model.Ship;
import app.domain.utils.BST.BST;
import app.domain.utils.BST.CodeSearch;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeSearchTest {
    CodeSearch cs;
    private String fileName = "sships.csv";
    private BST<Ship> mmsi;
    private BST<Ship> callSign;
    private BST<Ship> imo;


    public CodeSearchTest() throws IOException {
        this.cs = new CodeSearch(fileName);
        this.imo = cs.getImoTree();
        this.callSign = cs.getCallSignTree();
        this.mmsi = cs.getMMSITree();
    }

  /*  @Test
    public void testSearchByMMSI() throws IOException {
        int mmsiNumber = 210950000;
        ShipDTO sdto = new ShipDTO(210950000, "SEA", "IMO7819216", "WDG5171", 30, 37, 9, 3, "NA");
        Ship expResult = new Ship(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipMmsi(this.mmsi, mmsiNumber);
        //Assert.assertTrue(expResult.equals(result));
        assertEquals(expResult, result);
    }

    @Test
    public void testSearchByMMSI2() throws IOException {
        int mmsiNumber = 303221000;
        ShipDTO sdto = new ShipDTO(303221000, "SEA", "IMO7819216", "WDG5171", 30, 37, 9, 3, "NA");
        Ship expResult = new Ship(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipMmsi(this.mmsi, mmsiNumber);
        //Assert.assertTrue(expResult.equals(result));
        assertEquals(expResult, result);
    }

    @Test
    public void testSearchByMMSI3() throws IOException {
        int mmsiNumber = 258692000;
        ShipDTO sdto = new ShipDTO(258692000, "SEA", "IMO7819216", "WDG5171", 30, 37, 9, 3, "NA");
        Ship expResult = new Ship(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipMmsi(this.mmsi, mmsiNumber);
        //Assert.assertTrue(expResult.equals(result));
        assertEquals(expResult, result);
    }*/
/*
    @Test
    public void testSearchBYIMO1() throws IOException {
        String imo = "IMO9321677";
        ShipDTO sdto = new ShipDTO(258692000, "KRONVIKEN", "IMO9321677", "LAJB6", 80, 248, 43, 14.9, "NA");
        IMOTree expResult = new IMOTree(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipImo(this.imo, imo);
        Assert.assertTrue(expResult.equals(result));
        //assertEquals(expResult, result);

    }

    @Test
    public void testSearchBYIMO2() throws IOException {
        String imo = "IMO9222285";
        ShipDTO sdto = new ShipDTO(636019825, "CONTI LYON", "IMO9222285", "D5WI6", 79, 300, 40, 9.2, "79");
        IMOTree expResult = new IMOTree(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipImo(this.imo, imo);
        Assert.assertTrue(expResult.equals(result));
        //assertEquals(expResult, result);

    }

    @Test
    public void testSearchBYIMO3() throws IOException {
        String imo = "IMO7819216";
        ShipDTO sdto = new ShipDTO(303221000, "SEA", "IMO7819216", "WDG5171", 30, 37, 9, 3, "NA");
        IMOTree expResult = new IMOTree(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipImo(this.imo, imo);
        Assert.assertTrue(expResult.equals(result));
        //assertEquals(expResult, result);


    }

    @Test
    public void testSearchByCallsign() throws IOException{
        String callSign = "WDG5171";
        ShipDTO sdto = new ShipDTO(303221000, "SEA", "IMO7819216", "WDG5171", 30, 37, 9, 3, "NA");
        CallSignTree expResult = new CallSignTree(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipCallSign(this.callSign, callSign);
        Assert.assertTrue(expResult.equals(result));
        //assertEquals(expResult, result);

    }

    @Test
    public void testSearchByCallsign2() throws IOException{
        String callSign = "9HJC9";
        ShipDTO sdto = new ShipDTO(249047000,"CELEBRITY SUMMIT","IMO9192387","9HJC9",60,294,32,8,"NA");
        CallSignTree expResult = new CallSignTree(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipCallSign(this.callSign, callSign);
        Assert.assertEquals(expResult, result);
        //assertEquals(expResult, result);

    }

    @Test
    public void testSearchByCallsign3() throws IOException{
        String callSign = "5BBA4";
        ShipDTO sdto = new ShipDTO(212180000,"I","IMO9643544","5BBA4",70,228,32,14.4,"NA");
        CallSignTree expResult = new CallSignTree(sdto);
        //Ship result = cs.searchByMMSI(mmsiNumber);
        Ship result = cs.findShipCallSign(this.callSign, callSign);
        Assert.assertTrue(expResult.equals(result));
        //assertEquals(expResult, result);

    }
*/
}
