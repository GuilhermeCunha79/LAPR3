package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;
import org.junit.Test;

import static org.junit.Assert.*;

public class CallSignTreeTest {
    @Test
    public void compareTo() {
        ShipDTO dto = new ShipDTO(111111111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        CallSignTree callSignTree = new CallSignTree(dto);
        Ship ship = new Ship(dto);
        org.junit.Assert.assertNotNull(callSignTree.compareTo(ship));

    }

}