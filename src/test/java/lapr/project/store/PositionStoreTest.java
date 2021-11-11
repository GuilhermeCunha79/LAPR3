package lapr.project.store;


import lapr.project.model.Position;
import lapr.project.store.PositionStore;
import lapr.project.utils.DTO.PositionDTO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionStoreTest {
    PositionStore store = new PositionStore();

    @Before
    public void createShipTree() {
        PositionDTO dto = new PositionDTO(111111141, "31/12/2020 17:19", 1, 1, 2.4f, 2.4f, 0, "A");
        Position ct01 = store.newPosition(dto);
        store.savePosition(ct01);
    }

    @Test
    public void ensureCannotAddSamePositionForTheSameBoatTwice() {
        PositionDTO dto = new PositionDTO(115115511, "31/12/2020 17:19", 1, 1, 2.4f, 2.4f, 0, "A");
        Position ct01 = store.newPosition(dto);
        Position ct02 = store.newPosition(dto);
        store.savePosition(ct01);
        assertFalse(store.savePosition(ct02));
    }

  /* @Test
    public void getPositionTreeTest(){
        PositionDTO dto = new PositionDTO(115115511, "31/12/2020 17:19", 1, 1, 2.4f, 2.4f, 0, "A");
        Position ct01 = app.domain.store.newPosition(dto);
        BST<Position> positionBST=new BST<>();
        positionBST.insert(ct01);
        app.domain.store.savePosition(ct01);
        assertEquals(positionBST, app.domain.store.getPositionTree());
    }
*/
    @Test
    public void checkDuplicate(){
        PositionDTO dto = new PositionDTO(115111518, "31/12/2020 17:19", 1, 1, 2.4f, 2.4f, 0, "A");
        Position ct01 = store.newPosition(dto);
        store.savePosition(ct01);
        PositionDTO dto1 = new PositionDTO(115111518, "31/12/2020 17:19", 1, 1, 2.4f, 2.4f, 0, "A");
        Position ct02 = store.newPosition(dto1);
        store.savePosition(ct02);
        assertTrue(store.checkDuplicate(ct01));
    }


    @Test
    public void test() {
        PositionDTO dto = new PositionDTO(115111511, "31/12/2020 17:19", 1, 1, 2.4f, 2.4f, 0, "A");
        Position ct01 = store.newPosition(dto);
        assertTrue(store.savePosition(ct01));
    }



    @Test
    public void validateShip(){
        PositionDTO dto = new PositionDTO(115111811, "31/12/2020 17:19", 1, 1, 2.4f, 2.4f, 0, "A");
        Position ct01 = store.newPosition(dto);
        store.savePosition(ct01);
        assertFalse(store.validatePosition(ct01));
    }
}

