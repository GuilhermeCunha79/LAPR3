package lapr.project.utils.DTO;

public class ShipMovementsDTO {

    private final int mmsi;
    private final String imo;
    private final String callSign;
    private final String vesselName;
    private final String startBaseDateTime;
    private final String endBaseDateTime;
    private final double totalMovementTime;
    private final double totalNumberOfMovements;
    private final double maxSOG;
    private final double meanSOG;
    private final double maxCOG;
    private final double meanCOG;
    private final double departureLatitude;
    private final double departureLongitude;
    private final double arrivalLongitude;
    private final double arrivalLatitude;
    private final double travelledDistance;
    private final double deltaDistance;

    public ShipMovementsDTO(int mmsi, String imo, String callSign, String vesselName, String startBaseDateTime,
                            String endBaseDateTime, double totalMovementTime, double totalNumberOfMovements,
                            double maxSOG, double meanSOG, double maxCOG, double meanCOG, double departureLatitude,
                            double departureLongitude, double arrivalLongitude, double arrivalLatitude,
                            double travelledDistance, double deltaDistance) {
        this.mmsi = mmsi;
        this.imo = imo;
        this.callSign = callSign;
        this.vesselName = vesselName;
        this.startBaseDateTime = startBaseDateTime;
        this.endBaseDateTime = endBaseDateTime;
        this.totalMovementTime = totalMovementTime;
        this.totalNumberOfMovements = totalNumberOfMovements;
        this.maxSOG = maxSOG;
        this.meanSOG = meanSOG;
        this.maxCOG = maxCOG;
        this.meanCOG = meanCOG;
        this.departureLatitude = departureLatitude;
        this.departureLongitude = departureLongitude;
        this.arrivalLongitude = arrivalLongitude;
        this.arrivalLatitude = arrivalLatitude;
        this.travelledDistance = travelledDistance;
        this.deltaDistance = deltaDistance;
    }

    public int getMmsi() {
        return this.mmsi;
    }

    public String getImo() {
        return this.imo;
    }

    public String getCallSign() {
        return this.callSign;
    }

    public String getVesselName() {
        return this.vesselName;
    }

    public String getStartBaseDateTime() {
        return this.startBaseDateTime;
    }

    public String getEndBaseDateTime() {
        return this.endBaseDateTime;
    }

    public double getTotalMovementTime() {
        return this.totalMovementTime;
    }

    public double getTotalNumberOfMovements() {
        return this.totalNumberOfMovements;
    }

    public double getMaxSOG() {
        return this.maxSOG;
    }

    public double getMeanSOG() {
        return this.meanSOG;
    }

    public double getMaxCOG() {
        return this.maxCOG;
    }

    public double getMeanCOG() {
        return this.meanCOG;
    }

    public double getDepartureLatitude() {
        return this.departureLatitude;
    }

    public double getDepartureLongitude() {
        return this.departureLongitude;
    }

    public double getArrivalLongitude() {
        return this.arrivalLongitude;
    }

    public double getArrivalLatitude() {
        return this.arrivalLatitude;
    }

    public double getTravelledDistance() {
        return this.travelledDistance;
    }

    public double getDeltaDistance() {
        return this.deltaDistance;
    }
}
