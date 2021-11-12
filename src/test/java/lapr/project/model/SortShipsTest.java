package lapr.project.model;

import lapr.project.controller.ImportShipsController;
import lapr.project.controller.PositionalMessagesController;
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

class SortShipsTest {
    ImportShipsController ctrl = new ImportShipsController();
    SortShips sortShips = new SortShips();
    PositionalMessagesController ctrlPositions = new PositionalMessagesController();


    @Test
    void listOfShipsMovementsTest() throws IOException {
        int nOfMov1, nOfMov2;
        double travelledDistance1, travelledDistance2;
        double deltaDistance1, deltaDistance2;

        BST<Ship> bst1 = ctrl.importShips("listShips.csv", "MMSI");
        BST<Position> bst2 = ctrl.importShipsPosition("listShips.csv");

        Map<Ship, Set<Position>> map = ctrlPositions.associatePositions(bst2, bst1);

        List<Position> mmsi1 = new ArrayList<>(); //210950000
        PositionDTO dto1 = new PositionDTO(210950000, "31/12/2020 17:19", 42.97875, -66.97001, 12.9, 13.1, 355, "B");
        Position p1 = new Position(dto1);

        PositionDTO dto2 = new PositionDTO(210950000, "31/12/2020 17:03", 42.92236, -66.97243, 12.5, 2.4, 358, "B");
        Position p2 = new Position(dto2);
        mmsi1.add(p1);
        mmsi1.add(p2);

        List<Position> mmsi2 = new ArrayList<>(); //228339600
        PositionDTO dto3 = new PositionDTO(228339600, "31/12/2020 00:34", 28.30354, -88.78563, 11.7, 129.9, 131, "B");
        Position p3 = new Position(dto3);
        PositionDTO dto4 = new PositionDTO(228339600, "31/12/2020 00:25", 28.32168, -88.81035, -88.81035, 128.3, 130, "B");
        Position p4 = new Position(dto4);
        mmsi2.add(p3);
        mmsi2.add(p4);


        nOfMov1 = getNumberOfMovements(mmsi1);
        travelledDistance1 = DistanceCalculator.travelledDistance(mmsi1);
        deltaDistance1 = DistanceCalculator.deltaDistance(mmsi1);

        nOfMov2 = getNumberOfMovements(mmsi2);
        travelledDistance2 = DistanceCalculator.travelledDistance(mmsi2);
        deltaDistance2 = DistanceCalculator.deltaDistance(mmsi2);


        List<ShipMovements> expected = new ArrayList<>();

        ShipMovements ship1 = new ShipMovements(210950000, nOfMov1, travelledDistance1, deltaDistance1);
        expected.add(ship1);
        ShipMovements ship2 = new ShipMovements(228339600, nOfMov2, travelledDistance2, deltaDistance2);
        expected.add(ship2);


        List<ShipMovements> listShips;
        listShips = sortShips.listShipsMovements(map);
        assertEquals(expected, listShips);


    }


    @Test
    void sortDescendingTravelledTest() {

        int nOfMov1, nOfMov2;
        double travelledDistance1, travelledDistance2;
        double deltaDistance1, deltaDistance2;


        List<Position> mmsi1 = new ArrayList<>(); //210950000
        PositionDTO dto1 = new PositionDTO(210950000, "31/12/2020 17:19", 42.97875, -66.97001, 12.9, 13.1, 355, "B");
        Position p1 = new Position(dto1);

        PositionDTO dto2 = new PositionDTO(210950000, "31/12/2020 17:03", 42.92236, -66.97243, 12.5, 2.4, 358, "B");
        Position p2 = new Position(dto2);
        mmsi1.add(p1);
        mmsi1.add(p2);

        List<Position> mmsi2 = new ArrayList<>(); //228339600
        PositionDTO dto3 = new PositionDTO(228339600, "31/12/2020 00:34", 28.30354, -88.78563, 11.7, 129.9, 131, "B");
        Position p3 = new Position(dto3);
        PositionDTO dto4 = new PositionDTO(228339600, "31/12/2020 00:25", 28.32168, -88.81035, -88.81035, 128.3, 130, "B");
        Position p4 = new Position(dto4);
        mmsi2.add(p3);
        mmsi2.add(p4);


        nOfMov1 = getNumberOfMovements(mmsi1);
        System.out.println("nofMov1 =" + nOfMov1);
        travelledDistance1 = DistanceCalculator.travelledDistance(mmsi1);
        System.out.println("travel dist1 =" + travelledDistance1);
        deltaDistance1 = DistanceCalculator.deltaDistance(mmsi1);
        System.out.println("delta dist1 =" + deltaDistance1);


        nOfMov2 = getNumberOfMovements(mmsi2);
        System.out.println("nofMov2 =" + nOfMov2);
        travelledDistance2 = DistanceCalculator.travelledDistance(mmsi2);
        System.out.println("travel dist2 =" + travelledDistance2);
        deltaDistance2 = DistanceCalculator.deltaDistance(mmsi2);
        System.out.println("delta dist2 =" + deltaDistance2);

        List<ShipMovements> listNotSort = new ArrayList<>();
        ShipMovements ship1 = new ShipMovements(210950000, nOfMov1, travelledDistance1, deltaDistance1);
        listNotSort.add(ship1);
        ShipMovements ship2 = new ShipMovements(228339600, nOfMov2, travelledDistance2, deltaDistance2);
        listNotSort.add(ship2);

        List<ShipMovements> expected = new ArrayList<>();
        expected.add(ship1);
        expected.add(ship2);
        List<ShipMovements> result = new ArrayList<>();
        result = sortShips.sortDescendingTravelled(listNotSort);
        assertEquals(expected, result);

    }


    @Test
    void sortAscendingNumberMovTest() {
        int nOfMov1, nOfMov2;
        double travelledDistance1, travelledDistance2;
        double deltaDistance1, deltaDistance2;


        List<Position> mmsi1 = new ArrayList<>(); //210950000
        PositionDTO dto1 = new PositionDTO(210950000, "31/12/2020 17:19", 42.97875, -66.97001, 12.9, 13.1, 355, "B");
        Position p1 = new Position(dto1);

        PositionDTO dto2 = new PositionDTO(210950000, "31/12/2020 17:03", 42.92236, -66.97243, 12.5, 2.4, 358, "B");
        Position p2 = new Position(dto2);
        mmsi1.add(p1);
        mmsi1.add(p2);

        List<Position> mmsi2 = new ArrayList<>(); //228339600
        PositionDTO dto3 = new PositionDTO(228339600, "31/12/2020 00:34", 28.30354, -88.78563, 11.7, 129.9, 131, "B");
        Position p3 = new Position(dto3);
        PositionDTO dto4 = new PositionDTO(228339600, "31/12/2020 00:25", 28.32168, -88.81035, -88.81035, 128.3, 130, "B");
        Position p4 = new Position(dto4);
        mmsi2.add(p3);
        mmsi2.add(p4);


        nOfMov1 = getNumberOfMovements(mmsi1);
        System.out.println("nofMov1 =" + nOfMov1);
        travelledDistance1 = DistanceCalculator.travelledDistance(mmsi1);
        System.out.println("travel dist1 =" + travelledDistance1);
        deltaDistance1 = DistanceCalculator.deltaDistance(mmsi1);
        System.out.println("delta dist1 =" + deltaDistance1);


        nOfMov2 = getNumberOfMovements(mmsi2);
        System.out.println("nofMov2 =" + nOfMov2);
        travelledDistance2 = DistanceCalculator.travelledDistance(mmsi2);
        System.out.println("travel dist2 =" + travelledDistance2);
        deltaDistance2 = DistanceCalculator.deltaDistance(mmsi2);
        System.out.println("delta dist2 =" + deltaDistance2);

        List<ShipMovements> listNotSort = new ArrayList<>();
        ShipMovements ship1 = new ShipMovements(210950000, nOfMov1, travelledDistance1, deltaDistance1);
        listNotSort.add(ship1);
        ShipMovements ship2 = new ShipMovements(228339600, nOfMov2, travelledDistance2, deltaDistance2);
        listNotSort.add(ship2);

        List<ShipMovements> expected = new ArrayList<>();
        //expected.add()
        expected.add(ship1);
        expected.add(ship2);
        List<ShipMovements> result = new ArrayList<>();
        result = sortShips.sortAscendingNumberMov(listNotSort);
        assertEquals(expected, result);


    }
}


