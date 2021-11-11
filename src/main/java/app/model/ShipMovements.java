package app.model;

import app.utils.CommonMethods;
import app.utils.Constants;
import app.utils.DTO.ShipMovementsDTO;

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

    public int getMmsi() {
        return mmsi;
    }

    public void setMmsi(int mmsi) {
        if (String.valueOf(mmsi).length() == Constants.MMSI_DIGITS)
            this.mmsi = mmsi;
        if (String.valueOf(mmsi).length() != Constants.MMSI_DIGITS)
            throw new IllegalArgumentException("The MMSI code must have 9 number digits");
    }

    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        if (imo == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        if (CommonMethods.imoVerification(imo)) {
            this.imo = imo;
        } else {
            throw new IllegalArgumentException("The format must be IMOXXXXXXX.");
        }

    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        if (callSign == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        if (!CommonMethods.stringHaveAlphanumerical(callSign))
            throw new IllegalArgumentException("Call Sign must have just alphanumerical");
        this.callSign = callSign;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        if (vesselName == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        this.vesselName = vesselName;
    }

    public String getStartBaseDateTime() {
        return startBaseDateTime;
    }

    public void setStartBaseDateTime(String startBaseDateTime) {
        if (startBaseDateTime == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        this.startBaseDateTime = startBaseDateTime;
    }

    public String getEndBaseDateTime() {
        return endBaseDateTime;
    }

    public void setEndBaseDateTime(String endBaseDateTime) {
        if (endBaseDateTime == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        this.endBaseDateTime = endBaseDateTime;
    }

    public double getTotalMovementTime() {
        return totalMovementTime;
    }

    public void setTotalMovementTime(double totalMovementTime) {
        if(totalMovementTime>=0) {
            this.totalMovementTime = totalMovementTime;
        } else {
            throw new IllegalArgumentException("Total movement time cannot be a negative number.");
        }
    }

    public double getTotalNumberOfMovements() {
        return totalNumberOfMovements;
    }

    public void setTotalNumberOfMovements(double totalNumberOfMovements) {
        if(totalNumberOfMovements>=0) {
            this.totalNumberOfMovements = totalNumberOfMovements;
        } else {
            throw new IllegalArgumentException("Total number of movements cannot be a negative number.");
        }
    }

    public double getMaxSOG() {
        return maxSOG;
    }

    public void setMaxSOG(double maxSOG) {

        if (maxSOG >= 0) {
            this.maxSOG = maxSOG;
        } else {
            this.maxSOG = -1;
            throw new IllegalArgumentException("SOG cannot be a negative number.");
        }
    }

    public double getMeanSOG() {
        return meanSOG;
    }

    public void setMeanSOG(double meanSOG) {
        if (meanSOG >= 0) {
            this.meanSOG = meanSOG;
        } else {
            this.meanSOG = -1;
            throw new IllegalArgumentException("SOG cannot be a negative number.");
        }
    }

    public double getMaxCOG() {
        return maxCOG;
    }

    public void setMaxCOG(double maxCOG) {

        if (Constants.COG_HEAD_MIN <= maxCOG && maxCOG <= Constants.COG_HEAD_MAX) {
            this.maxCOG = maxCOG;
        } else {
            this.maxCOG = -1;// not available
            throw new IllegalArgumentException("COG cannot be a negative number.");
        }

    }

    public double getMeanCOG() {
        return meanCOG;
    }

    public void setMeanCOG(double meanCOG) {
        if (Constants.COG_HEAD_MIN <= meanCOG && meanCOG <= Constants.COG_HEAD_MAX) {
            this.meanCOG = meanCOG;
        } else {
            this.meanCOG = -1;// not available
            throw new IllegalArgumentException("COG cannot be a negative number.");
        }
    }

    public double getDepartureLatitude() {
        return departureLatitude;
    }

    public void setDepartureLatitude(double departureLatitude) {
        if (CommonMethods.isValidLatitude(departureLatitude)) {
            this.departureLatitude = departureLatitude;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    public double getDepartureLongitude() {
        return departureLongitude;
    }

    public void setDepartureLongitude(double departureLongitude) {
        if (CommonMethods.isValidLongitude(departureLongitude)) {
            this.departureLongitude = departureLongitude;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    public double getArrivalLongitude() {
        return arrivalLongitude;
    }

    public void setArrivalLongitude(double arrivalLongitude) {
        if (CommonMethods.isValidLongitude(arrivalLongitude)) {
            this.arrivalLongitude = arrivalLongitude;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    public double getArrivalLatitude() {
        return arrivalLatitude;
    }

    public void setArrivalLatitude(double arrivalLatitude) {
        if (CommonMethods.isValidLatitude(arrivalLatitude)) {
            this.arrivalLatitude = arrivalLatitude;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    public double getTravelledDistance() {
        return travelledDistance;
    }

    public void setTravelledDistance(double travelledDistance) {
        if (travelledDistance >= 0) {
            this.travelledDistance = travelledDistance;
        } else {
            throw new IllegalArgumentException("Travelled Distance cannot be a negative number.");
        }
    }

    public double getDeltaDistance() {
        return deltaDistance;
    }

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
