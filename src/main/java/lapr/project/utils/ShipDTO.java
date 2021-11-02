package lapr.project.utils;

public class ShipDTO {

    private static final double POWER_OUTPUT = 20;
    private int mmsi;
    private String dateTime;
    private double latitude;
    private double longitude;
    private float sog;
    private float cog;
    private int heading;
    private String vesselName;
    private String imo;
    private String callSign;
    private int vesselType;
    private int length;
    private int width;
    private double draft;
    private String cargo;
    private String transcieverClass;
    private double powerOutput;

    /**
     * @param mmsi
     * @param dateTime
     * @param latitude
     * @param longitude
     * @param sog
     * @param cog
     * @param heading
     * @param vesselName
     * @param imo
     * @param callSign
     * @param vesselType
     * @param length
     * @param width
     * @param draft
     * @param cargo
     * @param transcieverClass
     */
    public ShipDTO(int mmsi, String dateTime, double latitude, double longitude, float sog, float cog, int heading, String vesselName, String imo, String callSign, int vesselType, int length, int width, double draft, String cargo, String transcieverClass) {
        this.mmsi = mmsi;
        this.dateTime = dateTime;
        this.latitude = latitude;
        this.longitude = longitude;
        this.sog = sog;
        this.cog = cog;
        this.heading = heading;
        this.vesselName = vesselName;
        this.imo = imo;
        this.callSign = callSign;
        this.vesselType = vesselType;
        this.length = length;
        this.width = width;
        this.draft = draft;
        this.cargo = cargo;
        this.transcieverClass = transcieverClass;
        this.powerOutput = POWER_OUTPUT;
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
    public float getSog() {
        return sog;
    }

    /**
     * Method that returns the COG
     *
     * @return cog
     */
    public float getCog() {
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
     * Method that returns the Vessel Name
     *
     * @return vesselName
     */
    public String getVesselName() {
        return vesselName;
    }

    /**
     * Method that returns the IMO code
     *
     * @return imo
     */
    public String getImo() {
        return imo;
    }

    /**
     * Method that returns the Vessel type
     *
     * @return vesselType
     */
    public int getVesselType() {
        return vesselType;
    }

    /**
     * Method that returns the Length
     *
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * Method that returns the Width
     *
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Method that returns the Call Sign
     *
     * @return callSign
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * Method that returns the Draft
     *
     * @return draft
     */
    public double getDraft() {
        return draft;
    }

    /**
     * Method that return the Cargo
     *
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Method that returns the Transciever Class
     *
     * @return transcieverClass
     */
    public String getTranscieverClass() {
        return transcieverClass;
    }

    /**
     * Method that returns the Power Output
     * @return powerOutput
     */
    public double getPowerOutput() {
        return powerOutput;
    }

}
