package lapr.project.model;

import lapr.project.utils.CommonMethods;
import lapr.project.utils.Constants;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * The type Distance calculator.
 */
public class DistanceCalculator {

    private DistanceCalculator() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Distance double.
     *
     * @param latitude1  the latitude 1
     * @param longitude1 the longitude 1
     * @param latitude2  the latitude 2
     * @param longitude2 the longitude 2
     * @return the double
     */
    public static double distance(double latitude1, double longitude1, double latitude2, double longitude2) {

        if (!CommonMethods.isValidLatitude(latitude1) || !CommonMethods.isValidLatitude(latitude2) || !CommonMethods.isValidLongitude(longitude1) || !CommonMethods.isValidLongitude(longitude2))
            throw new IllegalArgumentException("Wrong latitude and/or longitude.");

        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        double distanceLong = longitude2 - longitude1;
        double distanceLat = latitude2 - latitude1;
        double count = Math.pow(Math.sin(distanceLat / Constants.DIVISION), Constants.DIVISION) + Math.cos(latitude1) * Math.cos(latitude2) * Math.pow(Math.sin(distanceLong / Constants.DIVISION), Constants.DIVISION);

        double latLong = Constants.DIVISION * Math.atan2(Math.sqrt(count), Math.sqrt(1 - count));

        return (latLong * Constants.EARTH_RADIUS) * Constants.METERS;//meters
    }


    /**
     * Travelled distance double.
     *
     * @param positions the positions
     * @return the double
     */
    public static double travelledDistance(List<Position> positions) {

        double travelledDistance = 0;
        for (int i = 0; i < positions.size() - 1; i++) {
            Position p1 = positions.get(i);
            Position p2 = positions.get(i + 1);

            double lat1 = p1.getLatitude();
            double lat2 = p2.getLatitude();
            double long1 = p1.getLongitude();
            double long2 = p2.getLongitude();

            travelledDistance = travelledDistance + distance(lat1, long1, lat2, long2);
        }

        return travelledDistance;
    }

    /**
     * Gets start date base time.
     *
     * @param list the list
     * @return the start date base time
     */
    public static String getStartDateBaseTime(List<Position> list) {
        return list.get(0).getDateTime();
    }

    /**
     * Gets end date base time.
     *
     * @param list the list
     * @return the end date base time
     */
    public static String getEndDateBaseTime(List<Position> list) {
        return list.get(list.size() - 1).getDateTime();
    }

    /**
     * Gets number of movements.
     *
     * @param list the list
     * @return the number of movements
     */
    public static int getNumberOfMovements(List<Position> list) {
        return list.size() - 1;
    }

    /**
     * Gets max sog.
     *
     * @param list the list
     * @return the max sog
     */
    public static double getMaxSOG(List<Position> list) {
        double max = list.get(0).getSog();
        for (Position p :
                list) {
            if (max <= p.getSog()) {
                max = p.getSog();
            }
        }
        return max;
    }

    /**
     * Gets mean sog.
     *
     * @param list the list
     * @return the mean sog
     */
    public static double getMeanSOG(List<Position> list) {
        double avg = 0;
        for (Position p :
                list) {
            avg = avg + p.getSog();
        }
        return avg / list.size();
    }

    /**
     * Gets max cog.
     *
     * @param list the list
     * @return the max cog
     */
    public static double getMaxCOG(List<Position> list) {
        double max = list.get(0).getCog();
        for (Position p :
                list) {
            if (max <= p.getCog()) {
                max = p.getCog();
            }
        }
        return max;
    }

    /**
     * Gets mean cog.
     *
     * @param list the list
     * @return the mean cog
     */
    public static double getMeanCOG(List<Position> list) {
        double avg = 0;
        for (Position p :
                list) {
            avg = avg + p.getCog();
        }
        return avg / list.size();
    }

    /**
     * Gets arrival lat.
     *
     * @param list the list
     * @return the arrival lat
     */
    public static double getArrivalLat(List<Position> list) {

        return list.get(list.size() - 1).getLatitude();
    }

    /**
     * Gets arrival long.
     *
     * @param list the list
     * @return the arrival long
     */
    public static double getArrivalLong(List<Position> list) {

        return list.get(list.size() - 1).getLongitude();
    }

    /**
     * Gets departure lat.
     *
     * @param list the list
     * @return the departure lat
     */
    public static double getDepartureLat(List<Position> list) {

        return list.get(0).getLatitude();
    }

    /**
     * Gets departure long.
     *
     * @param list the list
     * @return the departure long
     */
    public static double getDepartureLong(List<Position> list) {
        return list.get(0).getLongitude();
    }

    /**
     * Delta distance double.
     *
     * @param positions the positions
     * @return the double
     */
    public static double deltaDistance(List<Position> positions) {

        double deltaDistance = 0;

        Position p1 = positions.get(0);
        Position p2 = positions.get(positions.size() - 1);

        double lat1 = p1.getLatitude();
        double lat2 = p2.getLatitude();
        double long1 = p1.getLongitude();
        double long2 = p2.getLongitude();

        deltaDistance = deltaDistance + distance(lat1, long1, lat2, long2);

        return deltaDistance;
    }

    /**
     * Gets total movement time.
     *
     * @param positions the positions
     * @return the total movement time
     */
    public static double getTotalMovementTime(List<Position> positions) {

        LocalDateTime startDate = CommonMethods.convertStringToDate(getStartDateBaseTime(positions));
        LocalDateTime endDate = CommonMethods.convertStringToDate(getEndDateBaseTime(positions));


        return ChronoUnit.MINUTES.between(startDate, endDate);
    }

    /**
     * Make sumary string.
     *
     * @param positions the positions
     * @return the string
     */
    public static String makeSumary(List<Position> positions) {
        int mmsi = positions.get(0).getMmsi();

        double traveledDistance = travelledDistance(positions);
        double deltaDistance = deltaDistance(positions);
        double arrivalLat = getArrivalLat(positions);
        double arrivalLong = getArrivalLong(positions);
        double departureLat = getDepartureLat(positions);
        double departureLong = getDepartureLong(positions);
        double totalMovementTime = getTotalMovementTime(positions);
        double maxSOG = getMaxSOG(positions);
        double meanSOG = getMeanSOG(positions);
        double maxCOG = getMaxCOG(positions);
        double meanCOG = getMeanCOG(positions);
        String endDate = getEndDateBaseTime(positions);
        String startDate = getStartDateBaseTime(positions);
        int numMovements = getNumberOfMovements(positions);

        return "\nSHIP MOVEMENTS" +
                "\nMMSI: " + mmsi +
                "\nStart Date Base Time: " + startDate +
                "\nEnd Date Base Time: " + endDate +
                "\nMovement Time: " + totalMovementTime + " minutes"+
                "\nNumber of Movements: " + numMovements +
                "\nMaximum SOG: " + Math.round(maxSOG) +
                "\nMean SOG: " + Math.round(meanSOG) +
                "\nMaximum COG: " + Math.round(maxCOG) +
                "\nMean COG: " + Math.round(meanCOG) +
                "\nDeparture Latitude: " + departureLat + " °" +
                "\nDeparture Longitude: " + departureLong + " °" +
                "\nArrival Latitude: " + arrivalLat + " °" +
                "\nArrival Longitude: " + arrivalLong + " °" +
                "\nTravelled Distance: " + Math.round(traveledDistance) + " meters" +
                "\nDelta Distance: " + Math.round(deltaDistance) + " meters" + "\n";
    }

}
