package lapr.project.model;

import lapr.project.utils.CommonMethods;

public class TravelledDistance {

    public static double travelledDistance(double latitude1,double longitude1,double latitude2, double longitude2){

        double earthRadius=6371;
        int meters=1000;
        int division=2;

        if (!CommonMethods.isValidLatitude(latitude1) || !CommonMethods.isValidLatitude(latitude2) || !CommonMethods.isValidLongitude(longitude1) || !CommonMethods.isValidLongitude(longitude2))
            throw new IllegalArgumentException("Wrong latitude and/or longitude.");

        latitude1=Math.toRadians(latitude1);
        longitude1=Math.toRadians(longitude1);
        latitude2=Math.toRadians(latitude2);
        longitude2=Math.toRadians(longitude2);

        double distanceLong = longitude2 - longitude1;
        double distanceLat = latitude2 - latitude1;
        double count = Math.pow(Math.sin(distanceLat / division), division)+ Math.cos(latitude1) * Math.cos(latitude2)* Math.pow(Math.sin(distanceLong / division),division);

        double latLong = division * Math.atan2(Math.sqrt(count), Math.sqrt(1-count));

        return (latLong*earthRadius)*meters;//meters
    }


}
