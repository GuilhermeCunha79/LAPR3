package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;
import org.junit.Test;

public class IMOTreeTest {
    @Test
    public void compareTo() {
        ShipDTO dto = new ShipDTO(111111111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        IMOTree imoTree = new IMOTree(dto);
        Ship ship = new Ship(dto);
        org.junit.Assert.assertNotNull(imoTree.compareTo(ship));

    }
}
