package lapr.project.utils.DTO;

public class ShipDTO {

    private static final double POWER_OUTPUT = 20;
    private final int mmsi;
    private final String vesselName;
    private final String imo;
    private final String callSign;
    private final int vesselType;
    private final int length;
    private final int width;
    private final double draft;
    private final String cargo;
    private final double powerOutput;

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
     * Method that returns the MMSI code
     *
     * @return mmsi
     */
    public int getMmsi() {
        return this.mmsi;
    }


    /**
     * Method that returns the Vessel Name
     *
     * @return vesselName
     */
    public String getVesselName() {
        return this.vesselName;
    }

    /**
     * Method that returns the IMO code
     *
     * @return imo
     */
    public String getImo() {
        return this.imo;
    }

    /**
     * Method that returns the cargo
     *
     * @return cargo
     */
    public String getCargo() {
        return this.cargo;
    }

    /**
     * Method that returns the Vessel type
     *
     * @return vesselType
     */
    public int getVesselType() {
        return this.vesselType;
    }

    /**
     * Method that returns the Length
     *
     * @return length
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Method that returns the Width
     *
     * @return width
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Method that returns the Call Sign
     *
     * @return callSign
     */
    public String getCallSign() {
        return this.callSign;
    }

    /**
     * Method that returns the Draft
     *
     * @return draft
     */
    public double getDraft() {
        return this.draft;
    }

    /**
     * Method that returns the Power Output
     * @return powerOutput
     */
    public double getPowerOutput() {
        return POWER_OUTPUT;
    }

}
