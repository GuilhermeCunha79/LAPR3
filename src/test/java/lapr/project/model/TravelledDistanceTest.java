package lapr.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelledDistanceTest {

    private final double Precision = 0.001;

    /**
    * Test with different directions values
    */
    @Test
    public void distanceDifferentDirections() {
        double distanceDirection1 = TravelledDistance.travelledDistance(-33.926510, 18.364603, -26.208450, 28.040572);
        double distanceDirection2 = TravelledDistance.travelledDistance(-26.208450, 28.040572, -33.926510, 18.364603);
        assertEquals(1265065.6094, distanceDirection1, Precision);
        assertEquals(1265065.6094, distanceDirection2, Precision);
    }

    /**
     * Test with values of Merithian
     */
    @Test
    public void distanceAround180thMeridianFiji() {
        double distance = TravelledDistance.travelledDistance(-17.947826, 177.221232, -16.603513, -179.779055);
        assertEquals(351826.7740, distance, Precision);
    }

    /**
     * Test with values of North to South of Netherlands
     */
    @Test
    public void distanceTheNetherlandsNorthToSouth() {
        double distance = TravelledDistance.travelledDistance(53.478612, 6.250578, 50.752342, 5.916981);
        assertEquals(304001.0210, distance, Precision);
    }

    /**
     * Test with values of North to South of Netherlands
     */
    @Test
    public void distanceFrom180ToMinus180LongitudeShouldBeZero() {
        double distance = TravelledDistance.travelledDistance(20, -180, 20, 180);
        assertEquals(0, distance, Precision);
    }

    @Test
    public void distanceAround0thMeridianLondon() {
        double distance = TravelledDistance.travelledDistance(51.512722, -0.288552, 51.516100, 0.068025);
        assertEquals(24677.4562, distance, Precision);
    }

    @Test
    public void distanceAround90LatitudeArctic() {
        double distance = TravelledDistance.travelledDistance(89.9, -179.9, 89.9, 179.9);
        assertEquals(38.8143, distance, Precision);
    }

    @Test
    public void distance90LatitudeNorthPole() {
        double distance = TravelledDistance.travelledDistance(90, -179.9, 90, 179.9);
        assertEquals(0, distance, Precision);
    }

    @Test
    public void distanceAroundMinus90LatitudeAntarctica() {
        double distance = TravelledDistance.travelledDistance(-89.9, -179.9, -89.9, 179.9);
        assertEquals(38.8143, distance, Precision);
    }

    @Test
    public void distanceAustraliaWestToEast() {
        double distance = TravelledDistance.travelledDistance(-23.939607, 113.585605, -28.293166, 153.718989);
        assertEquals(4018083.0398, distance, Precision);
    }

    @Test
    public void distanceFromCapetownToJohannesburg() {
        double distance = TravelledDistance.travelledDistance(-33.926510, 18.364603, -26.208450, 28.040572);
        assertEquals(1265065.6094, distance, Precision);
    }

    @Test
    public void distanceFromSantiagoToSaoPaolo() {
        double distance = TravelledDistance.travelledDistance(-33.464087, -70.660573, -23.553981, -46.630563);
        assertEquals(2585109.9646, distance, Precision);
    }

    @Test
    public void maxDistance() {
        double distance = TravelledDistance.travelledDistance(90, 10, -90, 10);
        assertEquals(20015086.7960, distance, Precision);
    }

    @Test
    public void maxDistanceAlongTheEquator() {
        double distance = TravelledDistance.travelledDistance(0, 0, 0, 180);
        assertEquals(20015086.7960, distance, Precision);
    }

    @Test
    public void maxDistanceAlongTheEquator2() {
        double distance = TravelledDistance.travelledDistance(0, 10, 0, -170);
        assertEquals(20015086.7960, distance, Precision);
    }

    @Test
    public void maxDistanceAlongTheEquator3() {
        double distance = TravelledDistance.travelledDistance(0, 175, 0, -5);
        assertEquals(20015086.7960, distance, Precision);
    }

    @Test
    public void verySmallDistance() {
        double distance = TravelledDistance.travelledDistance(0, 0, 0.00000001, 0);
        assertEquals(0.001, distance, Precision);
    }

    @Test
    public void distanceBetweenTheSamePointsIs0() {
        double distance = TravelledDistance.travelledDistance(42, 99, 42, 99);
        assertEquals(0, distance);
    }

    @Test //negative case
    public void distanceBetweenTheSamePointsIs0_2() {
        double distance = TravelledDistance.travelledDistance(-42, -99, -42, -99);
        assertEquals(0, distance);
    }

    @Test
    public void distanceBetweenTheSamePoints0() {
        double distance = TravelledDistance.travelledDistance(0, 0, 0, 0);
        assertEquals(0, distance);
    }



    //https://github.com/ice-lenor/ExampleUnitTests/blob/master/src/test/java/geometry/GeometryHelpersTest2.java
}
