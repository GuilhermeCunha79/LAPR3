package model;

import lapr.project.controller.ImportShipsController;
import lapr.project.controller.PositionalMessagesController;
import lapr.project.model.DistanceCalculator;
import lapr.project.model.Position;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.Constants;
import lapr.project.utils.DTO.ShipDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceCalculatorTest {

    ImportShipsController ctrl = new ImportShipsController();
    PositionalMessagesController ctrl1 = new PositionalMessagesController();

    private final double precision = 0.001;

    /**
     * Test with different directions values
     */
    @Test
    void distanceDifferentDirections() {
        double distanceDirection1 = DistanceCalculator.distance(-33.926510, 18.364603, -26.208450, 28.040572);
        double distanceDirection2 = DistanceCalculator.distance(-26.208450, 28.040572, -33.926510, 18.364603);
        assertEquals(1265065.6094, distanceDirection1, precision);
        assertEquals(1265065.6094, distanceDirection2, precision);
    }


    /**
     * Test with values of Merithian
     */
    @Test
    public void distanceAround180thMeridianFiji() {
        double distance = DistanceCalculator.distance(-17.947826, 177.221232, -16.603513, -179.779055);
        assertEquals(351826.7740, distance, precision);
    }

    /**
     * Test with values of North to South of Netherlands
     */
    @Test
    public void distanceTheNetherlandsNorthToSouth() {
        double distance = DistanceCalculator.distance(53.478612, 6.250578, 50.752342, 5.916981);
        assertEquals(304001.0210, distance, precision);
    }

    /**
     * Test with values of North to South of Netherlands
     */
    @Test
    public void distanceFrom180ToMinus180LongitudeShouldBeZero() {
        double distance = DistanceCalculator.distance(20, -180, 20, 180);
        assertEquals(0, distance, precision);
    }

    @Test
    public void distanceAround0thMeridianLondon() {
        double distance = DistanceCalculator.distance(51.512722, -0.288552, 51.516100, 0.068025);
        assertEquals(24677.4562, distance, precision);
    }

    @Test
    public void distanceAround90LatitudeArctic() {
        double distance = DistanceCalculator.distance(89.9, -179.9, 89.9, 179.9);
        assertEquals(38.8143, distance, precision);
    }

    @Test
    public void distance90LatitudeNorthPole() {
        double distance = DistanceCalculator.distance(90, -179.9, 90, 179.9);
        assertEquals(0, distance, precision);
    }

    @Test
    public void distanceAroundMinus90LatitudeAntarctica() {
        double distance = DistanceCalculator.distance(-89.9, -179.9, -89.9, 179.9);
        assertEquals(38.8143, distance, precision);
    }

    @Test
    public void distanceAustraliaWestToEast() {
        double distance = DistanceCalculator.distance(-23.939607, 113.585605, -28.293166, 153.718989);
        assertEquals(4018083.0398, distance, precision);
    }

    @Test
    public void distanceFromCapetownToJohannesburg() {
        double distance = DistanceCalculator.distance(-33.926510, 18.364603, -26.208450, 28.040572);
        assertEquals(1265065.6094, distance, precision);
    }

    @Test
    public void distanceFromSantiagoToSaoPaolo() {
        double distance = DistanceCalculator.distance(-33.464087, -70.660573, -23.553981, -46.630563);
        assertEquals(2585109.9646, distance, precision);
    }

    @Test
    public void maxDistance() {
        double distance = DistanceCalculator.distance(90, 10, -90, 10);
        assertEquals(20015086.7960, distance, precision);
    }

    @Test
    public void maxDistanceAlongTheEquator() {
        double distance = DistanceCalculator.distance(0, 0, 0, 180);
        assertEquals(20015086.7960, distance, precision);
    }

    @Test
    public void maxDistanceAlongTheEquator2() {
        double distance = DistanceCalculator.distance(0, 10, 0, -170);
        assertEquals(20015086.7960, distance, precision);
    }

    @Test
    public void maxDistanceAlongTheEquator3() {
        double distance = DistanceCalculator.distance(0, 175, 0, -5);
        assertEquals(20015086.7960, distance, precision);
    }

    @Test
    public void verySmallDistance() {
        double distance = DistanceCalculator.distance(0, 0, 0.00000001, 0);
        assertEquals(0.001, distance, precision);
    }

    @Test
    public void distanceBetweenTheSamePointsIs0() {
        double distance = DistanceCalculator.distance(42, 99, 42, 99);
        assertEquals(0, distance);
    }

    @Test //negative case
    public void distanceBetweenTheSamePointsIs0_2() {
        double distance = DistanceCalculator.distance(-42, -99, -42, -99);
        assertEquals(0, distance);
    }

    @Test
    public void distanceBetweenTheSamePoints0() {
        double distance = DistanceCalculator.distance(0, 0, 0, 0);
        assertEquals(0, distance);
    }

    @Test
    public void wrongLatitude1() throws  IllegalArgumentException{
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DistanceCalculator.distance(123, 0, 0, 0);
        });
        Assertions.assertEquals("Wrong latitude and/or longitude.", thrown.getMessage());
    }

    @Test
    public void wrongLongitude1() throws  IllegalArgumentException{
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DistanceCalculator.distance(0, 300, 0, 0);
        });
        Assertions.assertEquals("Wrong latitude and/or longitude.", thrown.getMessage());
    }

    @Test
    public void wrongLatitude2()throws  IllegalArgumentException{
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DistanceCalculator.distance(0, 0, 300, 0);
        });
        Assertions.assertEquals("Wrong latitude and/or longitude.", thrown.getMessage());
    }

    @Test
    public void wrongLongitude2()throws  IllegalArgumentException{
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DistanceCalculator.distance(0, 0, 0, 300);
        });
        Assertions.assertEquals("Wrong latitude and/or longitude.", thrown.getMessage());
    }

    @Test
    void travelledDistance() throws IOException {

        BST<Ship> bst1 = ctrl.importShips("sships.csv", "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition("sships.csv");

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);

        Assertions.assertEquals(85261.64759566927, DistanceCalculator.travelledDistance(positions));

    }

    @Test
    void getStartDateBaseTime() throws IOException {
        BST<Ship> bst1 = ctrl.importShips("sships.csv", "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition("sships.csv");

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        String expected = "31/12/2020 00:00";
        Assertions.assertEquals(expected, DistanceCalculator.getStartDateBaseTime(positions));
    }

    @Test
    void getEndDateBaseTime() throws IOException {
        BST<Ship> bst1 = ctrl.importShips("sships.csv", "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition("sships.csv");

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        String expected = "31/12/2020 03:56";
        Assertions.assertEquals(expected, DistanceCalculator.getEndDateBaseTime(positions));
    }

    @Test
    void getNumberOfMovements() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        int expected = 18;

        Assertions.assertEquals(expected, DistanceCalculator.getNumberOfMovements(positions));
    }

    @Test
    void getMaxCOG() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = 131.1;

        Assertions.assertEquals(expected, DistanceCalculator.getMaxCOG(positions), precision);
    }

    @Test
    void getMeanCOG() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = 129.0368423461914;

        Assertions.assertEquals(expected, DistanceCalculator.getMeanCOG(positions));
    }

    @Test
    void getMaxSOG() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = 12;

        Assertions.assertEquals(expected, DistanceCalculator.getMaxSOG(positions));
    }

    @Test
    void getMeanSOG() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = 11.731578927291068;

        Assertions.assertEquals(expected, DistanceCalculator.getMeanSOG(positions));
    }

    @Test
    void getArrivalLat() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = 27.87869;

        Assertions.assertEquals(expected, DistanceCalculator.getArrivalLat(positions));
    }

    @Test
    void getArrivalLong() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = -88.22321;

        Assertions.assertEquals(expected, DistanceCalculator.getArrivalLong(positions));
    }

    @Test
    void getDepartureLat() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = 28.37458;

        Assertions.assertEquals(expected, DistanceCalculator.getDepartureLat(positions));
    }

    @Test
    void getDepartureLong() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = -88.88584;

        Assertions.assertEquals(expected, DistanceCalculator.getDepartureLong(positions));
    }

    @Test
    void deltaDistance() throws IOException {
        BST<Ship> bst1 = ctrl.importShips(Constants.FILE_NAME, "MMSI");
        BST<Position> bst2 = ImportShipsController.importShipsPosition(Constants.FILE_NAME);

        LocalDateTime date1 = LocalDateTime.of(1, 1, 1, 0, 0);
        LocalDateTime date2 = LocalDateTime.now();

        ShipDTO shipDTO1 = new ShipDTO(228339600, "CMA CGM ALMAVIVA", "IMO9450648", "FLSU", 70, 334, 42, 15, "79");
        Ship ship1 = new Ship(shipDTO1);

        Map<Ship, Set<Position>> map = PositionalMessagesController.associatePositions(bst2, bst1);
        List<Position> positions = PositionalMessagesController.getPositionalMessages(ship1, map, date1, date2);
        double expected = 85222.07283417888;

        Assertions.assertEquals(expected, DistanceCalculator.deltaDistance(positions));
    }

    //https://github.com/ice-lenor/ExampleUnitTests/blob/master/src/test/java/geometry/GeometryHelpersTest2.java
}