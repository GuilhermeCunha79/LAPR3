package lapr.project.utils.DTO;

public class PositionDTO {

    private int mmsi;
    private String dateTime;
    private double latitude;
    private double longitude;
    private double sog;
    private double cog;
    private int heading;
    private int position=0;
    private String transcieverClass;

    public PositionDTO(int mmsi,String dateTime, double latitude, double longitude, double sog, double cog, int heading, String transcieverClass){
        this.mmsi=mmsi;
        this.dateTime=dateTime;
        this.latitude=latitude;
        this.longitude=longitude;
        this.sog=sog;
        this.cog=cog;
        this.heading=heading;
        this.position=0;
        this.transcieverClass=transcieverClass;
    }

    /**
     * Method that returns the mmsi code
     *
     * @return mmsi
     */
    public int getMmsi() {
        return mmsi;
    }

    /**
     * Method that returns the date
     *
     * @return dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Method that returns the latitude
     *
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Method that returns the longitude
     *
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Method that returns the SOG
     *
     * @return sog
     */
    public double getSog() {
        return sog;
    }

    /**
     * Method that returns the COG
     *
     * @return cog
     */
    public double getCog() {
        return cog;
    }

    /**
     * Method that returns the heading
     *
     * @return heading
     */
    public int getHeading() {
        return heading;
    }

    /**
     * Method that returns the position
     *
     * @return position
     */
    public int getPosition() {
        return position;
    }

    /**
     * Method that returns the Transciever Class
     *
     * @return transcieverClass
     */
    public String getTranscieverClass() {
        return transcieverClass;
    }

}
