package lapr.project.model;

import lapr.project.utils.DTO.ShipMovementsDTO;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class ShipMovementsTest {

    @Test
    void getMmsi() {
        int mmsi = 123456789;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        Assert.assertEquals(mmsi, shipMovements.getMmsi());
    }

    @Test
    void setMmsi() {
        int mmsi = 111111111;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setMmsi(mmsi);

        Assert.assertEquals(mmsi, shipMovements.getMmsi());
    }

    @Test
    void setMmsiException() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int mmsi = 11111111;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setMmsi(mmsi);
        });
        Assertions.assertEquals("The MMSI code must have 9 number digits", thrown.getMessage());
    }

    @Test
    void getImo() {
        String imo = "IMO1234567";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        Assert.assertEquals(imo, shipMovements.getImo());
    }

    @Test
    void setImo() {
        String imo = "IMO1234567";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setImo(imo);

        Assert.assertEquals(imo, shipMovements.getImo());
    }

    @Test
    void setImoNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            String imo = null;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setImo(imo);
        });
        Assertions.assertEquals("not available", thrown.getMessage());
    }

    @Test
    void setImoFormat() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String imo = "123";
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setImo(imo);
        });
        Assertions.assertEquals("The format must be IMOXXXXXXX.", thrown.getMessage());
    }

    @Test
    void getCallSign() {
        String callSign = "C4SQ2";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        Assert.assertEquals(callSign, shipMovements.getCallSign());
    }

    @Test
    void setCallSign() {
        String callSign = "C4SQ3";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setCallSign(callSign);
        Assert.assertEquals(callSign, shipMovements.getCallSign());

    }

    @Test
    void SetCallSignNull() throws NullPointerException{
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            String callSign = null;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setCallSign(callSign);
        });
        Assertions.assertEquals("not available", thrown.getMessage());
    }

    @Test
    void SetCallSignFormat() throws  IllegalArgumentException{
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String callSign = "!23";
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setCallSign(callSign);
        });
        Assertions.assertEquals("Call Sign must have just alphanumerical", thrown.getMessage());
    }

    @Test
    void getVesselName() {
        String vesselName = "SHIP";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        Assert.assertEquals(vesselName, shipMovements.getVesselName());
    }

    @Test
    void setVesselName() {
    }

    @Test
    void getStartBaseDateTime() {
        String date  = "31/12/2020 00:00";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        Assert.assertEquals(date, shipMovements.getStartBaseDateTime());
    }

    @Test
    void setStartBaseDateTime() {
    }

    @Test
    void getEndBaseDateTime() {
        String date  = "31/12/2020 17:03";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        Assert.assertEquals(date, shipMovements.getEndBaseDateTime());
    }

    @Test
    void setEndBaseDateTime() {
    }

    @Test
    void getTotalMovementTime() {
        double expected = 15;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getTotalMovementTime());
    }

    @Test
    void setTotalMovementTime() {
    }

    @Test
    void getTotalNumberOfMovements() {
        double expected = 10;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getTotalNumberOfMovements());
    }

    @Test
    void setTotalNumberOfMovements() {
    }

    @Test
    void getMaxSOG() {
        double expected = 12.5;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getMaxSOG());
    }

    @Test
    void setMaxSOG() {
    }

    @Test
    void getMeanSOG() {
        double expected = 12.5;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getMeanSOG());
    }

    @Test
    void setMeanSOG() {
    }

    @Test
    void getMaxCOG() {
        double expected = 2.4;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getMaxCOG());
    }

    @Test
    void setMaxCOG() {
    }

    @Test
    void getMeanCOG() {
        double expected = 2.4;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getMeanCOG());
    }

    @Test
    void setMeanCOG() {
    }

    @Test
    void getDepartureLatitude() {
        double expected = 42.92236;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getDepartureLatitude());
    }

    @Test
    void setDepartureLatitude() {
    }

    @Test
    void getDepartureLongitude() {
        double expected = -66.97243;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getDepartureLongitude());
    }

    @Test
    void setDepartureLongitude() {
    }

    @Test
    void getArrivalLongitude() {
        double expected = 43.22513;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getArrivalLongitude());
    }

    @Test
    void setArrivalLongitude() {
    }

    @Test
    void getArrivalLatitude() {
        double expected = -66.96725;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getArrivalLatitude());
    }

    @Test
    void setArrivalLatitude() {
    }

    @Test
    void getTravelledDistance() {
        double expected = 150;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getTravelledDistance());
    }

    @Test
    void setTravelledDistance() {

    }

    @Test
    void getDeltaDistance() {
        double expected = 12;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        assertEquals(expected, shipMovements.getDeltaDistance());
    }

    @Test
    void setDeltaDistance() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void compareTo() {
    }

}