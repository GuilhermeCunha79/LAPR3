package model;
/*
import lapr.project.controller.ImportShipsController;
import lapr.project.utils.BST.BST;
import lapr.project.utils.DTO.PositionDTO;
import lapr.project.utils.DTO.ShipDTO;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PositionalMessagesTest {

   @Test
    void getPositionalMessages() throws IOException {
        List<Position> list = new ArrayList<>();
        BST<Ship> bst1= ImportShipsController.importShips("sships.csv","MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition("sships.csv");

        LocalDateTime date1 = LocalDateTime.of(2020,12,31,0,0);
        LocalDateTime date2 = LocalDateTime.of(2020,12,31,0,20);

        ShipDTO shipDTO1=new ShipDTO(228339600,"CMA CGM ALMAVIVA","IMO9450648","FLSU",70,334,42,15,"79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessages.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessages.getPositionalMessages(ship1, map, date1, date2);

        PositionDTO dto1 = new PositionDTO(228339600, "31/12/2020 00:16", 28.34134, -88.83706, 11.899999618530273, 126.9000015258789, 129, "B");
        Position p1 = new Position(dto1);
        PositionDTO dto2 = new PositionDTO(228339600, "31/12/2020 00:11", 28.35085, -88.85024, 12.0, 127.30000305175781, 130, "B");
        Position p2 = new Position(dto2);
        PositionDTO dto3 = new PositionDTO(228339600, "31/12/2020 00:13", 28.3484, -88.84688, 12.0, 129.0, 130, "B");
        Position p3 = new Position(dto3);
        PositionDTO dto4 = new PositionDTO(228339600, "31/12/2020 00:18", 28.33618, -88.82967, 11.899999618530273, 127.80000305175781, 131, "B");
        Position p4 = new Position(dto4);
        PositionDTO dto5 = new PositionDTO(228339600, "31/12/2020 00:15", 28.34412, -88.84108, 12.0, 128.3000030517578, 129, "B");
        Position p5 = new Position(dto5);

        list.add(p2);
        list.add(p3);
        list.add(p5);
        list.add(p1);
        list.add(p4);

        assertEquals(list,positions);
    }

   /* @Test
    public void associatePositions() throws FileNotFoundException {

        BST<Ship> bst1= ImportShipsController.importShips("sshipsTest2.csv","MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition("sshipsTest2.csv");
        Map<Ship, Set<Position>> map = PositionalMessages.associatePositions(bst2, bst1);

        Map<Ship,Set<Position>> map2 = new HashMap<>();

        ShipDTO shipDTO1=new ShipDTO(210950000,"VARAMO","IMO9395044" , "C4SQ2" ,70,166,25,9.5,"NA");
        Ship ship1 = new Ship(shipDTO1);
        ShipDTO shipDTO2=new ShipDTO(210950008,"SAITA I", "IMO9643544" ,"5BBA", 70,228,32,14.4,"NA");
        Ship ship2 = new Ship(shipDTO2);

        PositionDTO dto1 = new PositionDTO(210950000,"31/12/2020 17:19",42.97875,-66.97001,12.9,13.1,355,"B");
        Position p1 = new Position(dto1);
        PositionDTO dto2 = new PositionDTO(210950000,"31/12/2020 17:03",42.92236,-66.97243,12.5,2.4,358,"B");
        Position p2 = new Position(dto2);
        PositionDTO dto3 = new PositionDTO(210950000,"31/12/2020 16:20",42.7698,-66.9759,13.3,3.7,356,"B");
        Position p3 = new Position(dto3);
        PositionDTO dto4 = new PositionDTO(210950008,"31/12/2020 21:49",24.14301,-84.72268,11.7,116.6,114,"B");
        Position p4 = new Position(dto4);

        Set<Position> set1 = new HashSet<>();
        Set<Position> set2 = new HashSet<>();
        set1.add(p1);
        set1.add(p2);
        set1.add(p3);
        set2.add(p4);

        map2.put(ship2,set2);
        map2.put(ship1,set1);


        Assert.assertEquals(map2, map);
    }*/

    /*@Test
    public void getPositionalMessagesShipNotFound(){
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {

            BST<Ship> bst1 = ImportShipsController.importShips("sships.csv", "MMSI");
            BST<Position> bst2 = ImportShipsController.importShipsPosition("sships.csv");

            LocalDateTime date1 = LocalDateTime.of(2020, 12, 31, 0, 0);
            LocalDateTime date2 = LocalDateTime.of(2020, 12, 31, 0, 20);

            ShipDTO shipDTO1 = new ShipDTO(123456789, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
            Ship ship1 = new Ship(shipDTO1);

            Map<Ship, Set<Position>> map = PositionalMessages.associatePositions(bst2, bst1);
            PositionalMessages.getPositionalMessages(ship1, map, date1, date2);

        });

        Assertions.assertEquals("This Ship does not exist.", thrown.getMessage());
    }
}*/