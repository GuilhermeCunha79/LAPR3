package lapr.project.model;


import lapr.project.utils.CommonMethods;
import lapr.project.utils.Constants;
import lapr.project.utils.DTO.ShipDTO;

import java.util.Objects;

public class Ship implements Comparable<Ship>{

    private int mmsi;
    private String vesselName;
    public String imo;
    private String callSign;
    private int vesselType;
    private int length;
    private int width;
    private double draft;
    private String cargo;
    private double powerOutput;


    public Ship(ShipDTO dto) {
        setMmsi(dto.getMmsi());
        setImo(dto.getImo());
        setVesselName(dto.getVesselName());
        setVesselType(dto.getVesselType());
        setLength(dto.getLength());
        setWidth(dto.getWidth());
        setDraft(dto.getDraft());
        setCallSign(dto.getCallSign());
        setCargo(dto.getCargo());
        setPowerOutput(dto.getPowerOutput());
    }

    public Ship(int mmsi, String vesselName, String imo, String callSign, int vesselType, int length, int width, double draft, String cargo){
        ShipDTO sh = new ShipDTO(mmsi, vesselName, imo, callSign, vesselType, length, width, draft,cargo);
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
     * Method that returns the cargo
     *
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Method that returns the Power Output
     *
     * @return powerOutput
     */
    public double getPowerOutput() {
        return powerOutput;
    }

    /**
     * Method that sets the mmsi code
     *
     * @param mmsi
     */
    public void setMmsi(int mmsi) {
        if (String.valueOf(mmsi).length() == Constants.MMSI_DIGITS)
            this.mmsi = mmsi;
        if (String.valueOf(mmsi).length() != Constants.MMSI_DIGITS)
            throw new IllegalArgumentException("The MMSI code must have 9 number digits");
    }


    /**
     * Method that sets the Vessel Name
     *
     * @param vesselName
     */
    public void setVesselName(String vesselName) {
        if (vesselName == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        this.vesselName = vesselName;
    }

    /**
     * Method that sets the IMO code
     *
     * @param imo
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
     * Method that sets the Call Sign
     *
     * @param callSign
     */
    public void setCallSign(String callSign) {
        if (callSign == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        if (!CommonMethods.stringHaveAlphanumerical(callSign))
            throw new IllegalArgumentException("Call Sign must have just alphanumerical");
        this.callSign = callSign;
    }

    /**
     * Method that sets the Vessel Type
     *
     * @param vesselType
     */
    public void setVesselType(int vesselType) {
        if (vesselType > 0) {
            this.vesselType = vesselType;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }


    /**
     * Method that sets the Length
     *
     * @param length
     */
    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException(Constants.NOT_AVAILABLE);
        }
    }

    /**
     * Method that sets the Width
     *
     * @param width
     */
    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Must be bigger than 0");
        }
    }

    /**
     * Method that sets the Draft
     *
     * @param draft
     */
    public void setDraft(double draft) {
        if(draft==0)
            throw new IllegalArgumentException("Cannot be 0");
        this.draft = draft;
    }

    /**
     * Method that sets the Cargo
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        if (cargo == null)
            throw new NullPointerException(Constants.NOT_AVAILABLE);
        if (cargo.length() == 2 && (CommonMethods.checkIfStringJustHaveLetters(cargo) || CommonMethods.checkIfStringJustHaveNumbers(cargo))) {
            this.cargo = cargo;
        }else {
            throw new IllegalArgumentException("Cargo just have ONLY numbers or letters.");
        }
    }

    /**
     * Method that sets the power output
     *
     * @param powerOutput
     */
    public void setPowerOutput(double powerOutput) {
        this.powerOutput = powerOutput;
    }


    /**
     * Method that compares two Ships
     *
     * @param o
     * @return 0 or 1
     */
    @Override
    public int compareTo(Ship o) {
       /* if (this.mmsi < o.getMmsi())
            return 0;
        return 1;
        */

        if(this.mmsi < o.getMmsi()) {
            return -1;
        } else if(this.mmsi > o.getMmsi()) {
            return 1;
        }else {
            return 0;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Ship otherShip = (Ship) o;
        return this.getMmsi() == (otherShip.getMmsi());
    }

    @Override
    public String toString() {
        return
                "MMSI=" + mmsi +
                "\nVessel Name='" + vesselName + '\'' +
                "\nIMO='" + imo + '\'' +
                "\nCall Sign='" + callSign + '\'' +
                "\nVessel Type=" + vesselType +
                "\nLength=" + length +"m"+
                "\nWidth=" + width +"m"+
                "\nDraft=" + draft +
                "\nCargo='" + cargo + '\'' +
                "\nPower Output=" + powerOutput;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mmsi, vesselName, imo, callSign, vesselType, length, width, draft, cargo, powerOutput);
    }

}
