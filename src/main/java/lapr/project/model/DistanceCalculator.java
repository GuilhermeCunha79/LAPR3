package lapr.project.model;

import lapr.project.utils.CommonMethods;
import lapr.project.utils.Constants;

import java.util.List;

public class DistanceCalculator {

//    private TravelledDistance() {
//        throw new IllegalStateException("Utility class");
//    }

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

    public static String getStartDateBaseTime(List<Position> list) {
        return list.get(0).getDateTime();
    }

    public static String getEndDateBaseTime(List<Position> list) {
        return list.get(list.size() - 1).getDateTime();
    }

    public static int getNumberOfMovements(List<Position> list) {
        return list.size() - 1;
    }

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

    public static double getMeanSOG(List<Position> list) {
        double avg = 0;
        for (Position p :
                list) {
            avg = avg + p.getSog();
        }
        return avg / list.size();
    }

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

    public static double getMeanCOG(List<Position> list) {
        double avg = 0;
        for (Position p :
                list) {
            avg = avg + p.getCog();
        }
        return avg / list.size();
    }

    public static double getArrivalLat(List<Position> list) {

        return list.get(list.size() - 1).getLatitude();
    }

    public static double getArrivalLong(List<Position> list) {

        return list.get(list.size() - 1).getLongitude();
    }

    public static double getDepartureLat(List<Position> list) {

        return list.get(0).getLatitude();
    }

    public static double getDepartureLong(List<Position> list) {
        return list.get(0).getLongitude();
    }

    public static double deltaDistance(List<Position> positions) {

        double deltaDistance = 0;

            Position p1 = positions.get(0);
            Position p2 = positions.get(positions.size()-1);

            double lat1 = p1.getLatitude();
            double lat2 = p2.getLatitude();
            double long1 = p1.getLongitude();
            double long2 = p2.getLongitude();

            deltaDistance = deltaDistance + distance(lat1, long1, lat2, long2);

        return deltaDistance;
    }


}
