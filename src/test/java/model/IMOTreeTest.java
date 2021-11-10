package model;

import lapr.project.model.IMOTree;
import lapr.project.model.MMSITree;
import lapr.project.model.Ship;
import lapr.project.utils.DTO.ShipDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class IMOTreeTest {

    @Test
    public void creatCorrectShip(){
        String imo="IMO3212345";
        IMOTree mmsiTree=new IMOTree(imo);
    }

    @Test
    void compareTo() {
        ShipDTO dto = new ShipDTO(111111111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        IMOTree imoTree = new IMOTree(dto);
        Ship ship = new Ship(dto);
        Assertions.assertNotNull(imoTree.compareTo(ship));

    }
}