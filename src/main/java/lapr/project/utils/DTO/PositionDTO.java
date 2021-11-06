package lapr.project.utils.DTO;

public class PositionDTO {

    private final int mmsi;
    private final String dateTime;
    private final double latitude;
    private final double longitude;
    private final double sog;
    private final double cog;
    private final int heading;
    private int position=0;
    private final String transcieverClass;

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
        return this.mmsi;
    }

    /**
     * Method that returns the date
     *
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    /**
     * Method that returns the latitude
     *
     * @return latitude
     */
    public double getLatitude() {
        return this.latitude;
    }

    /**
     * Method that returns the longitude
     *
     * @return longitude
     */
    public double getLongitude() {
        return this.longitude;
    }

    /**
     * Method that returns the SOG
     *
     * @return sog
     */
    public double getSog() {
        return this.sog;
    }

    /**
     * Method that returns the COG
     *
     * @return cog
     */
    public double getCog() {
        return this.cog;
    }

    /**
     * Method that returns the heading
     *
     * @return heading
     */
    public int getHeading() {
        return this.heading;
    }

    /**
     * Method that returns the position
     *
     * @return position
     */
    public int getPosition() {
        return this.position;
    }

    /**
     * Method that returns the Transciever Class
     *
     * @return transcieverClass
     */
    public String getTranscieverClass() {
        return this.transcieverClass;
    }

}
