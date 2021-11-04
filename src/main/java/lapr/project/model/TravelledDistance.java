package lapr.project.model;

import lapr.project.utils.CommonMethods;

public class TravelledDistance {

    public static double travelledDistance(double latitude1,double longitude1,double latitude2, double longitude2){

        double earthRadius=6371;

        if (!CommonMethods.isValidLatitude(latitude1) || !CommonMethods.isValidLatitude(latitude2) || !CommonMethods.isValidLongitude(longitude1) || !CommonMethods.isValidLongitude(longitude2))
            throw new IllegalArgumentException("Wrong latitude and/or longitude.");

        latitude1=Math.toRadians(latitude1);
        longitude1=Math.toRadians(longitude1);
        latitude2=Math.toRadians(latitude2);
        longitude2=Math.toRadians(longitude2);

        double distanceLong = longitude2 - longitude1;
        double distanceLat = latitude2 - latitude1;
        double count = Math.pow(Math.sin(distanceLat / 2), 2)+ Math.cos(latitude1) * Math.cos(latitude2)* Math.pow(Math.sin(distanceLong / 2),2);

        double latLong = 2 * Math.atan2(Math.sqrt(count), Math.sqrt(1-count));

        return (latLong*earthRadius)*1000;//meters
    }


}
