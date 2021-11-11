package lapr.project.model;

import lapr.project.utils.CommonMethods;
import lapr.project.utils.Constants;
import lapr.project.utils.DTO.ShipMovementsDTO;

import java.util.Objects;

public class ShipMovements implements Comparable<ShipMovements> {

    private int mmsi;
    private String imo;
    private String callSign;
    private String vesselName;
    private String startBaseDateTime;
    private String endBaseDateTime;
    private double totalMovementTime;
    private double totalNumberOfMovements;
    private double maxSOG;
    private double meanSOG;
    private double maxCOG;
    private double meanCOG;
    private double departureLatitude;
    private double departureLongitude;
    private double arrivalLongitude;
    private double arrivalLatitude;
    private double travelledDistance;
    private double deltaDistance;


    /**
     * Instantiates a new Ship movements.
     *
     * @param dto the dto
     */
    public ShipMovements(ShipMovementsDTO dto) {
        setMmsi(dto.getMmsi());
        setImo(dto.getImo());
        setCallSign(dto.getCallSign());
        setVesselName(dto.getVesselName());
        setStartBaseDateTime(dto.getStartBaseDateTime());
        setEndBaseDateTime(dto.getEndBaseDateTime());
        setTotalMovementTime(dto.getTotalMovementTime());
        setTotalNumberOfMovements(dto.getTotalNumberOfMovements());
        setMaxSOG(dto.getMaxSOG());
        setMeanSOG(dto.getMeanSOG());
        setMeanCOG(dto.getMeanCOG());
        setMaxCOG(dto.getMaxCOG());
        setDepartureLatitude(dto.getDepartureLatitude());
        setArrivalLatitude(dto.getArrivalLatitude());
        setDepartureLongitude(dto.getDepartureLongitude());
        setArrivalLongitude(dto.getArrivalLongitude());
        setTravelledDistance(dto.getTravelledDistance());
        setDeltaDistance(dto.getDeltaDistance());
    }



    public ShipMovements(int mmsi, int totalNumberOfMovements,double travelledDistance, double deltaDistance){
        this.mmsi=mmsi;
        this.totalMovementTime=totalNumberOfMovements;
        this.travelledDistance=travelledDistance;
        this.deltaDistance=deltaDistance;

    }

    /**
     * Gets mmsi.
     *
     * @return the mmsi
     */

    public int getMmsi() {
        return mmsi;
    }

    /**
     * Sets mmsi.
     *
     * @param mmsi the mmsi
     */
    public void setMmsi(int mmsi) {
        if (String.valueOf(mmsi).length() == Constants.MMSI_DIGITS)
            this.mmsi = mmsi;
        if (String.valueOf(mmsi).length() != Constants.MMSI_DIGITS)
            throw new IllegalArgumentException("The MMSI code must have 9 number digits");
    }

    /**
     * Gets imo.
     *
     * @return the imo
     */
    public String getImo() {
        return imo;
    }

    /**
     * Sets imo.
     *
     * @param imo the imo
     */
    public void setImo(String imo) {
        if (imo == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        if (CommonMethods.imoVerification(imo)) {
            this.imo = imo;
        } else {
            throw new IllegalArgumentException("The format must be IMOXXXXXXX.");
        }

    }

    /**
     * Gets call sign.
     *
     * @return the call sign
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * Sets call sign.
     *
     * @param callSign the call sign
     */
    public void setCallSign(String callSign) {
        if (callSign == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        if (!CommonMethods.stringHaveAlphanumerical(callSign))
            throw new IllegalArgumentException("Call Sign must have just alphanumerical");
        this.callSign = callSign;
    }

    /**
     * Gets vessel name.
     *
     * @return the vessel name
     */
    public String getVesselName() {
        return vesselName;
    }

    /**
     * Sets vessel name.
     *
     * @param vesselName the vessel name
     */
    public void setVesselName(String vesselName) {
        if (vesselName == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        this.vesselName = vesselName;
    }

    /**
     * Gets start base date time.
     *
     * @return the start base date time
     */
    public String getStartBaseDateTime() {
        return startBaseDateTime;
    }

    /**
     * Sets start base date time.
     *
     * @param startBaseDateTime the start base date time
     */
    public void setStartBaseDateTime(String startBaseDateTime) {
        if (startBaseDateTime == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        this.startBaseDateTime = startBaseDateTime;
    }

    /**
     * Gets end base date time.
     *
     * @return the end base date time
     */
    public String getEndBaseDateTime() {
        return endBaseDateTime;
    }

    /**
     * Sets end base date time.
     *
     * @param endBaseDateTime the end base date time
     */
    public void setEndBaseDateTime(String endBaseDateTime) {
        if (endBaseDateTime == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        this.endBaseDateTime = endBaseDateTime;
    }

    /**
     * Gets total movement time.
     *
     * @return the total movement time
     */
    public double getTotalMovementTime() {
        return totalMovementTime;
    }

    /**
     * Sets total movement time.
     *
     * @param totalMovementTime the total movement time
     */
    public void setTotalMovementTime(double totalMovementTime) {
        if(totalMovementTime>=0) {
            this.totalMovementTime = totalMovementTime;
        } else {
            throw new IllegalArgumentException("Total movement time cannot be a negative number.");
        }
    }

    /**
     * Gets total number of movements.
     *
     * @return the total number of movements
     */
    public double getTotalNumberOfMovements() {
        return totalNumberOfMovements;
    }

    /**
     * Sets total number of movements.
     *
     * @param totalNumberOfMovements the total number of movements
     */
    public void setTotalNumberOfMovements(double totalNumberOfMovements) {
        if(totalNumberOfMovements>=0) {
            this.totalNumberOfMovements = totalNumberOfMovements;
        } else {
            throw new IllegalArgumentException("Total number of movements cannot be a negative number.");
        }
    }

    /**
     * Gets max sog.
     *
     * @return the max sog
     */
    public double getMaxSOG() {
        return maxSOG;
    }

    /**
     * Sets max sog.
     *
     * @param maxSOG the max sog
     */
    public void setMaxSOG(double maxSOG) {

        if (maxSOG >= 0) {
            this.maxSOG = maxSOG;
        } else {
            this.maxSOG = -1;
            throw new IllegalArgumentException("SOG cannot be a negative number.");
        }
    }

    /**
     * Gets mean sog.
     *
     * @return the mean sog
     */
    public double getMeanSOG() {
        return meanSOG;
    }

    /**
     * Sets mean sog.
     *
     * @param meanSOG the mean sog
     */
    public void setMeanSOG(double meanSOG) {
        if (meanSOG >= 0) {
            this.meanSOG = meanSOG;
        } else {
            this.meanSOG = -1;
            throw new IllegalArgumentException("SOG cannot be a negative number.");
        }
    }

    /**
     * Gets max cog.
     *
     * @return the max cog
     */
    public double getMaxCOG() {
        return maxCOG;
    }

    /**
     * Sets max cog.
     *
     * @param maxCOG the max cog
     */
    public void setMaxCOG(double maxCOG) {

        if (Constants.COG_HEAD_MIN <= maxCOG && maxCOG <= Constants.COG_HEAD_MAX) {
            this.maxCOG = maxCOG;
        } else {
            this.maxCOG = -1;// not available
            throw new IllegalArgumentException("COG cannot be a negative number.");
        }

    }

    /**
     * Gets mean cog.
     *
     * @return the mean cog
     */
    public double getMeanCOG() {
        return meanCOG;
    }

    /**
     * Sets mean cog.
     *
     * @param meanCOG the mean cog
     */
    public void setMeanCOG(double meanCOG) {
        if (Constants.COG_HEAD_MIN <= meanCOG && meanCOG <= Constants.COG_HEAD_MAX) {
            this.meanCOG = meanCOG;
        } else {
            this.meanCOG = -1;// not available
            throw new IllegalArgumentException("COG cannot be a negative number.");
        }
    }

    /**
     * Gets departure latitude.
     *
     * @return the departure latitude
     */
    public double getDepartureLatitude() {
        return departureLatitude;
    }

    /**
     * Sets departure latitude.
     *
     * @param departureLatitude the departure latitude
     */
    public void setDepartureLatitude(double departureLatitude) {
        if (CommonMethods.isValidLatitude(departureLatitude)) {
            this.departureLatitude = departureLatitude;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    /**
     * Gets departure longitude.
     *
     * @return the departure longitude
     */
    public double getDepartureLongitude() {
        return departureLongitude;
    }

    /**
     * Sets departure longitude.
     *
     * @param departureLongitude the departure longitude
     */
    public void setDepartureLongitude(double departureLongitude) {
        if (CommonMethods.isValidLongitude(departureLongitude)) {
            this.departureLongitude = departureLongitude;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    /**
     * Gets arrival longitude.
     *
     * @return the arrival longitude
     */
    public double getArrivalLongitude() {
        return arrivalLongitude;
    }

    /**
     * Sets arrival longitude.
     *
     * @param arrivalLongitude the arrival longitude
     */
    public void setArrivalLongitude(double arrivalLongitude) {
        if (CommonMethods.isValidLongitude(arrivalLongitude)) {
            this.arrivalLongitude = arrivalLongitude;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    /**
     * Gets arrival latitude.
     *
     * @return the arrival latitude
     */
    public double getArrivalLatitude() {
        return arrivalLatitude;
    }

    /**
     * Sets arrival latitude.
     *
     * @param arrivalLatitude the arrival latitude
     */
    public void setArrivalLatitude(double arrivalLatitude) {
        if (CommonMethods.isValidLatitude(arrivalLatitude)) {
            this.arrivalLatitude = arrivalLatitude;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    /**
     * Gets travelled distance.
     *
     * @return the travelled distance
     */
    public double getTravelledDistance() {
        return travelledDistance;
    }

    /**
     * Sets travelled distance.
     *
     * @param travelledDistance the travelled distance
     */
    public void setTravelledDistance(double travelledDistance) {
        if (travelledDistance >= 0) {
            this.travelledDistance = travelledDistance;
        } else {
            throw new IllegalArgumentException("Travelled Distance cannot be a negative number.");
        }
    }

    /**
     * Gets delta distance.
     *
     * @return the delta distance
     */
    public double getDeltaDistance() {
        return deltaDistance;
    }

    /**
     * Sets delta distance.
     *
     * @param deltaDistance the delta distance
     */
    public void setDeltaDistance(double deltaDistance) {
        if (deltaDistance >= 0) {
            this.deltaDistance = deltaDistance;
        } else {
            throw new IllegalArgumentException("Delta Distance cannot be a negative number.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipMovements that = (ShipMovements) o;
        return mmsi == that.mmsi &&
                Objects.equals(imo, that.imo) &&
                Objects.equals(callSign, that.callSign) &&
                Objects.equals(vesselName, that.vesselName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mmsi, imo, callSign, vesselName, startBaseDateTime, endBaseDateTime, totalMovementTime, totalNumberOfMovements, maxSOG, meanSOG, maxCOG, meanCOG, departureLatitude, departureLongitude, arrivalLongitude, arrivalLatitude, travelledDistance, deltaDistance);
    }

    @Override
    public String toString() {
        return "\nSHIP MOVEMENTS" +
                "\nMMSI: " + mmsi +
                "\nIMO: " + imo  +
                "\nCall Sign: " + callSign +
                "\nVessel Name: " + vesselName +
                "\nStart Date Base Time:" + startBaseDateTime +
                "\nEnd Date Base Time:" + endBaseDateTime +
                "\nMovement Time:" + totalMovementTime +
                "\nNumber of Movements:" + totalNumberOfMovements +
                "\nMaximum SOG:" + maxSOG +
                "\nMean SOG:" + meanSOG +
                "\nMaximum COG:" + maxCOG +
                "\nMean COG:" + meanCOG +
                "\nDeparture Latitude:" + departureLatitude +"°"+
                "\nDeparture Longitude:" + departureLongitude +"°"+
                "\nArrival Latitude:" + arrivalLatitude +"°"+
                "\nArrival Longitude:" + arrivalLongitude +"°"+
                "\nTravelled Distance:" + travelledDistance +"m"+
                "\nDelta Distance:" + deltaDistance + "m"+"\n";
    }

    @Override
    public int compareTo(ShipMovements o) {
        return 0;
    }
}
