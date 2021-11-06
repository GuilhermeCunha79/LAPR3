package lapr.project.utils.DTO;

public class ShipDTO {

    private static final double POWER_OUTPUT = 20;
    private int mmsi;
    private String vesselName;
    private String imo;
    private String callSign;
    private int vesselType;
    private int length;
    private int width;
    private double draft;
    private String cargo;
    private double powerOutput;

    /**
     * @param mmsi
     * @param vesselName
     * @param imo
     * @param callSign
     * @param vesselType
     * @param length
     * @param width
     * @param draft
     */
    public ShipDTO(int mmsi, String vesselName, String imo, String callSign, int vesselType, int length, int width, double draft,String cargo) {
        this.mmsi = mmsi;
        this.vesselName = vesselName;
        this.imo = imo;
        this.callSign = callSign;
        this.vesselType = vesselType;
        this.length = length;
        this.width = width;
        this.draft = draft;
        this.cargo=cargo;
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
     * Method that returns the cargo
     *
     * @return cargo
     */
    public String getCargo() {
        return cargo;
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
     * Method that returns the Power Output
     * @return powerOutput
     */
    public double getPowerOutput() {
        return POWER_OUTPUT;
    }

}
