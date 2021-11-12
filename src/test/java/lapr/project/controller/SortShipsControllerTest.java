package lapr.project.controller;
/*
import lapr.project.model.*;
import lapr.project.utils.BST.BST;
import lapr.project.utils.DTO.PositionDTO;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static lapr.project.model.DistanceCalculator.getNumberOfMovements;
import static org.junit.jupiter.api.Assertions.*;

class SortShipsControllerTest {
    SortShipsController ctrSort = new SortShipsController();
    ImportShipsController ctrl = new ImportShipsController();
    SortShips sortShips = new SortShips();

    @Test
    void getListShipMovementsTest() throws IOException {

        BST<Ship> bst1 = ctrl.importShips("listShips.csv", "MMSI");
        BST<Position> bst2 = ctrl.importShipsPosition("listShips.csv");

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);

        List<ShipMovements> listShips = new ArrayList<>();

        List<ShipMovements> expected;
        expected = sortShips.listShipsMovements(map);

        listShips = ctrSort.getListShipMovements(map);

        assertEquals(expected, listShips);
    }


    @Test
    void sortDescendingTravelled() throws IOException {

        BST<Ship> bst1 = ctrl.importShips("listShips.csv", "MMSI");
        BST<Position> bst2 = ctrl.importShipsPosition("listShips.csv");

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);

        List<ShipMovements> list = new ArrayList<>();
        List<ShipMovements> expected = new ArrayList<>();
        list = sortShips.listShipsMovements(map);
        expected = ctrSort.sortDescendingTravelled(list);


        List<ShipMovements> listResult = ctrSort.getListShipMovements(map);
        listResult = ctrSort.sortDescendingTravelled(listResult);

        assertEquals(expected, listResult);



    }

    @Test
    void sortAscendingNumberMov() throws IOException {
        BST<Ship> bst1 = ctrl.importShips("listShips.csv", "MMSI");
        BST<Position> bst2 = ctrl.importShipsPosition("listShips.csv");

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);

        List<ShipMovements> list = new ArrayList<>();
        List<ShipMovements> expected = new ArrayList<>();
        list = sortShips.listShipsMovements(map);
        expected = ctrSort.sortAscendingNumberMov(list);


        List<ShipMovements> listResult = ctrSort.getListShipMovements(map);
        listResult = ctrSort.sortAscendingNumberMov(listResult);

        assertEquals(expected, listResult);
    }
}*/