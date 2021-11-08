package lapr.project.utils;

import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.BST.CodeSearch;

import java.io.FileNotFoundException;

public class CodeSearchTest {
    CodeSearch cs;
    private String fileName = "sships.csv";
    private BST<Ship> mmsi;
    private BST<Ship> callSign;
    private BST<Ship> imo;


    public CodeSearchTest() throws FileNotFoundException {
        this.cs = new CodeSearch(fileName);
        this.imo = cs.getImoTree();
        this.callSign = cs.getCallSignTree();
        this.mmsi = cs.getMMSITree();
    }

    /*@Test
    public void testSearchByMMSI() throws IOException {
        int mmsiNumber = 210950000;
        ShipDTO sdto = new ShipDTO(210950000,"VARAMO","IMO9395044","C4SQ2",70,166,25,9.5,"NA");
        Ship expResult = new Ship(sdto);
        Ship result = cs.searchByMMSI(mmsiNumber);
        //Assert.assertTrue(expResult.equals(result));
        assertEquals(expResult, result);
    }
*/


}
