package app.domain.store;

import app.domain.model.Ship;
import app.domain.utils.BST.BST;
import app.domain.utils.DTO.ShipDTO;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShipStoreTest {

    ShipStore store = new ShipStore();

    @Before
    public void createShipTree() {
        ShipDTO dto = new ShipDTO(111111111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ct01 = store.newShip(dto);
        store.saveShipMmsi(ct01,"MMSI");
    }

    @Test
    public void ensureCannotAddSameShipTwice() {
        ShipDTO dto = new ShipDTO(114111111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ct01 = store.newShip(dto);
        Ship ct02 = store.newShip(dto);
        store.saveShipMmsi(ct01,"MMSI");
        assertFalse(store.saveShipMmsi(ct02,"MMSI"));
    }

    @Test
    public void getClientListTest(){
        ShipDTO dto = new ShipDTO(114133111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ct01 = store.newShip(dto);
        BST<Ship> shipBST=new BST<>();
        store.addShipMmsi(ct01);
        store.saveShipMmsi(ct01,"MMSI");
        assertEquals(shipBST.toString(), store.getShipTree().toString());
    }

    @Test
    public void getShipByMmsi(){
        ShipDTO dto = new ShipDTO(543456768, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ct01 = store.newShip(dto);
        store.saveShipMmsi(ct01,"MMSI");
        int mmsi=543456768;
        assertEquals(ct01, store.getShipByMMSI(mmsi));
    }

    @Test
    public void testSaveClient() {
        ShipDTO dto = new ShipDTO(653919469, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ct01 = store.newShip(dto);
        assertTrue(store.saveShipMmsi(ct01,"MMSI"));
    }

    @Test
    public void checkDuplicate(){
        ShipDTO dto = new ShipDTO(653929469, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ct01 = store.newShip(dto);
        store.saveShipMmsi(ct01,"MMSI");
        ShipDTO dto1 = new ShipDTO(653929469, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ct02 = store.newShip(dto1);
        store.saveShipMmsi(ct02,"MMSI");
        assertTrue(store.checkDuplicate(ct01));
    }

    @Test
    public void validateShip(){
        ShipDTO dto = new ShipDTO(989898989, "VARAMO", "IMO3212445", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ct01 = store.newShip(dto);
        store.saveShipMmsi(ct01,"MMSI");
        assertFalse(store.validateShip(ct01));
    }
}
