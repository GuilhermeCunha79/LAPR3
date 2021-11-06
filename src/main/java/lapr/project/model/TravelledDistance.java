package lapr.project.model;

import lapr.project.utils.CommonMethods;
import lapr.project.utils.Constants;

public class TravelledDistance {

    public static double travelledDistance(double latitude1,double longitude1,double latitude2, double longitude2){

        if (!CommonMethods.isValidLatitude(latitude1) || !CommonMethods.isValidLatitude(latitude2) || !CommonMethods.isValidLongitude(longitude1) || !CommonMethods.isValidLongitude(longitude2))
            throw new IllegalArgumentException("Wrong latitude and/or longitude.");

        latitude1=Math.toRadians(latitude1);
        longitude1=Math.toRadians(longitude1);
        latitude2=Math.toRadians(latitude2);
        longitude2=Math.toRadians(longitude2);

        double distanceLong = longitude2 - longitude1;
        double distanceLat = latitude2 - latitude1;
        double count = Math.pow(Math.sin(distanceLat / Constants.DIVISION), Constants.DIVISION)+ Math.cos(latitude1) * Math.cos(latitude2)* Math.pow(Math.sin(distanceLong / Constants.DIVISION),Constants.DIVISION);

        double latLong = Constants.DIVISION * Math.atan2(Math.sqrt(count), Math.sqrt(1-count));

        return (latLong*Constants.EARTH_RADIUS)*Constants.METERS;//meters
    }


}
