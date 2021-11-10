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
        String vesselName = "SHIP";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setVesselName(vesselName);
        Assert.assertEquals(vesselName, shipMovements.getVesselName());
    }
    @Test
    void setVesselNameNull() throws NullPointerException{
            NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
                String vesselName = null;
                ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", null, "31/12/2020 00:00", "31/12/2020 17:03",
                        15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                        43.22513, -66.96725, 150, 12);
                ShipMovements shipMovements = new ShipMovements(dto);
                shipMovements.setVesselName(vesselName);
            });
            Assertions.assertEquals("not available", thrown.getMessage());
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
        String date  = "31/12/2020 00:00";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setStartBaseDateTime(date);
        Assert.assertEquals(date, shipMovements.getStartBaseDateTime());
    }

    @Test
    void setStartBaseDateTimeNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            String date  = null;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", null, "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setStartBaseDateTime(date);
        });
        Assertions.assertEquals("not available", thrown.getMessage());
    }

    @Test
    void getEndBaseDateTime() {
        String date  = "31/12/2020 17:03";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setEndBaseDateTime(date);
        Assert.assertEquals(date, shipMovements.getEndBaseDateTime());
    }
    @Test
    void setEndBaseDateTimeNull() {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            String date  = null;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", null,
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setEndBaseDateTime(date);
        });
        Assertions.assertEquals("not available", thrown.getMessage());
    }

    @Test
    void setEndBaseDateTime() {
        String date  = "31/12/2020 17:03";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setEndBaseDateTime(date);
        Assert.assertEquals(date, shipMovements.getEndBaseDateTime());
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

        double expected = 15;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }

    @Test
    void setTotalMovementTimeNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    -1, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("Total movement time cannot be a negative number.", thrown.getMessage());
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
        double expected = 10;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }

    @Test
    void setTotalNumberOfMovementsNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, -1, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("Total number of movements cannot be a negative number.", thrown.getMessage());
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
        double expected = 12.5;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

    }
    @Test
    void setMaxSOGNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, -1, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("SOG cannot be a negative number.", thrown.getMessage());

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
        double expected = 12.5;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }
    @Test
    void setMeanSOGNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, -1, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("SOG cannot be a negative number.", thrown.getMessage());
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
        double expected = 2.4;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }

    @Test
    void setMaxCOGNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, -1, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("COG cannot be a negative number.", thrown.getMessage());

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
        double expected = 2.4;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }
    @Test
    void setMeanCOGNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, -1, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("COG cannot be a negative number.", thrown.getMessage());

    }

    @Test
    void setMeanCOGBigger() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = 1000;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 1000, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("COG cannot be a negative number.", thrown.getMessage());

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
        double expected = 42.92236;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }

    @Test
    void setDepartureLatitudeWrong() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = 499;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 488, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("not available", thrown.getMessage());
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
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }

    @Test
    void setDepartureLongitudeWrong() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = 499;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, 599,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("not available", thrown.getMessage());
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
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }
    @Test
    void setArrivalLongitudeWrong() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    344, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("not available", thrown.getMessage());
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
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }
    @Test
    void setArrivalatitudeWrong() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, 433, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("not available", thrown.getMessage());
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
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }

    @Test
    void setTravelledDistanceWrong() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, -1, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("Travelled Distance cannot be a negative number.", thrown.getMessage());
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
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
    }
    @Test
    void setDeltaDistanceWrong() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, -1);
            ShipMovements shipMovements = new ShipMovements(dto);
        });
        Assertions.assertEquals("Delta Distance cannot be a negative number.", thrown.getMessage());
    }

    @Test
    void compareTo() {
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        ShipMovementsDTO dto1 = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 11, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements1 = new ShipMovements(dto1);
        org.junit.Assert.assertNotNull(shipMovements1.compareTo(shipMovements));
    }

    @Test
    void equals() {
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        ShipMovementsDTO dto1 = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements1 = new ShipMovements(dto1);
        org.junit.Assert.assertNotNull(shipMovements1.equals(shipMovements));
    }
}