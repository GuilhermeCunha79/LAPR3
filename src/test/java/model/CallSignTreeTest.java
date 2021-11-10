package model;

import lapr.project.model.CallSignTree;
import lapr.project.model.Ship;
import lapr.project.utils.DTO.ShipDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CallSignTreeTest {

    @Test
    void compareTo() {
        ShipDTO dto = new ShipDTO(111111111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        CallSignTree callSignTree = new CallSignTree(dto);
        Ship ship = new Ship(dto);
        int expected=0;
        assertEquals(expected,callSignTree.compareTo(ship));
    }

}