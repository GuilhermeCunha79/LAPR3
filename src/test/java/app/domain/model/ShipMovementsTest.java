package app.domain.model;

import app.domain.utils.DTO.ShipMovementsDTO;
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
        Assertions.assertEquals(mmsi, shipMovements.getMmsi());
    }

    @Test
    void setMmsi() {
        int mmsi = 111111111;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setMmsi(mmsi);

        Assertions.assertEquals(mmsi, shipMovements.getMmsi());
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

        Assertions.assertEquals(imo, shipMovements.getImo());
    }

    @Test
    void setImo() {
        String imo = "IMO1234567";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setImo(imo);

        Assertions.assertEquals(imo, shipMovements.getImo());
    }

    @Test
    void setImoNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setImo(null);
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

        Assertions.assertEquals(callSign, shipMovements.getCallSign());
    }

    @Test
    void setCallSign() {
        String callSign = "C4SQ3";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setCallSign(callSign);
        Assertions.assertEquals(callSign, shipMovements.getCallSign());
    }

    @Test
    void SetCallSignNull() throws NullPointerException{
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setCallSign(null);
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

        Assertions.assertEquals(vesselName, shipMovements.getVesselName());
    }

    @Test
    void setVesselName() {
        String vesselName = "SHIP";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setVesselName(vesselName);
        Assertions.assertEquals(vesselName, shipMovements.getVesselName());
    }
    @Test
    void setVesselNameNull() throws NullPointerException{
            NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
                ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", null, "31/12/2020 00:00", "31/12/2020 17:03",
                        15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                        43.22513, -66.96725, 150, 12);
                ShipMovements shipMovements = new ShipMovements(dto);
                shipMovements.setVesselName(null);
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

        Assertions.assertEquals(date, shipMovements.getStartBaseDateTime());
    }

    @Test
    void setStartBaseDateTime() {
        String date  = "31/12/2020 00:00";
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setStartBaseDateTime(date);
        Assertions.assertEquals(date, shipMovements.getStartBaseDateTime());
    }

    @Test
    void setStartBaseDateTimeNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", null, "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setStartBaseDateTime(null);
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
        Assertions.assertEquals(date, shipMovements.getEndBaseDateTime());
    }
    @Test
    void setEndBaseDateTimeNull() {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", null,
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setEndBaseDateTime(null);
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
        Assertions.assertEquals(date, shipMovements.getEndBaseDateTime());
    }

    @Test
    void getTotalMovementTime() {
        double expected = 15;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);

        Assertions.assertEquals(expected, shipMovements.getTotalMovementTime());
    }

    @Test
    void setTotalMovementTime() {

        double expected = 15;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        Assertions.assertEquals(expected,shipMovements.getTotalMovementTime());
    }

    @Test
    void setTotalMovementTimeNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    -1, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            Assertions.assertEquals(expected,shipMovements.getTotalMovementTime());
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

        Assertions.assertEquals(expected, shipMovements.getTotalNumberOfMovements());
    }

    @Test
    void setTotalNumberOfMovements() {
        double expected = 10;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        Assertions.assertEquals(expected,shipMovements.getTotalNumberOfMovements());
    }

    @Test
    void setTotalNumberOfMovementsNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, -1, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            Assertions.assertEquals(expected,shipMovements.getTotalNumberOfMovements());
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

        Assertions.assertEquals(expected, shipMovements.getMaxSOG());
    }

    @Test
    void setMaxSOG() {
        double expected = 12.5;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        Assertions.assertEquals(expected,shipMovements.getMaxSOG());

    }
    @Test
    void setMaxSOGNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, -1, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            Assertions.assertEquals(expected,shipMovements.getMaxSOG());
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

        Assertions.assertEquals(expected, shipMovements.getMeanSOG());
    }

    @Test
    void setMeanSOG() {
        double expected = 12.5;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        Assertions.assertEquals(expected,shipMovements.getMeanSOG());
    }
    @Test
    void setMeanSOGNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, -1, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setMeanSOG(expected);
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

        Assertions.assertEquals(expected, shipMovements.getMaxCOG());
    }

    @Test
    void setMaxCOG() {
        double expected = 2.4;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        Assertions.assertEquals(expected,shipMovements.getMeanCOG());
    }

    @Test
    void setMaxCOGNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, -1, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setMaxSOG(expected);
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

        Assertions.assertEquals(expected, shipMovements.getMeanCOG());
    }

    @Test
    void setMeanCOG() {
        double expected = 2.4;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        Assertions.assertEquals(expected,shipMovements.getMeanCOG());
    }
    @Test
    void setMeanCOGNegative() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = -1;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, -1, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setMeanCOG(expected);
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
            shipMovements.setMeanCOG(expected);
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

        Assertions.assertEquals(expected, shipMovements.getDepartureLatitude());
    }

    @Test
    void setDepartureLatitude() {
        double expected = 42.92236;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        Assertions.assertEquals(shipMovements.getDepartureLatitude(),expected);
    }

    @Test
    void setDepartureLatitudeWrong() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = 499;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 488, -66.97243,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setDepartureLatitude(expected);
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

        Assertions.assertEquals(expected, shipMovements.getDepartureLongitude());
    }

    @Test
    void setDepartureLongitude() {
        double expected=111;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setDepartureLongitude(111);
        Assertions.assertEquals(expected,shipMovements.getDepartureLongitude());
    }

    @Test
    void setDepartureLongitudeWrong() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double expected = 499;
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, 599,
                    43.22513, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setDepartureLongitude(expected);
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

        Assertions.assertEquals(expected, shipMovements.getArrivalLongitude());
    }

    @Test
    void setArrivalLongitude() {
        double expected=12;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setArrivalLongitude(expected);
        Assertions.assertEquals(expected,shipMovements.getArrivalLongitude());
    }
    @Test
    void setArrivalLongitudeWrong() {
        double expected=123312;
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    344, -66.96725, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setArrivalLongitude(expected);
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

        Assertions.assertEquals(expected, shipMovements.getArrivalLatitude());
    }

    @Test
    void setArrivalLatitude() {
        double expected=50;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setArrivalLatitude(expected);
        Assertions.assertEquals(expected,shipMovements.getArrivalLatitude());
    }
    @Test
    void setArrivaLatitudeWrong() {
        double expected=123456;
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, 433, 150, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setArrivalLatitude(expected);
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

        Assertions.assertEquals(expected, shipMovements.getTravelledDistance());
    }

    @Test
    void setTravelledDistance() {
        double expected=1231313133;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setTravelledDistance(expected);
        Assertions.assertEquals(expected,shipMovements.getTravelledDistance());
    }

    @Test
    void setTravelledDistanceWrong() {
        double expected=1213134123;
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, -1, 12);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setTravelledDistance(expected);
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

        Assertions.assertEquals(expected, shipMovements.getDeltaDistance());
    }

    @Test
    void setDeltaDistance() {
        double expected=12344422;
        ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                43.22513, -66.96725, 150, 12);
        ShipMovements shipMovements = new ShipMovements(dto);
        shipMovements.setDeltaDistance(expected);
        Assertions.assertEquals(expected,shipMovements.getDeltaDistance());

    }
    @Test
    void setDeltaDistanceWrong() {
        double expected=1231341313;
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipMovementsDTO dto = new ShipMovementsDTO(123456789, "IMO1234567", "C4SQ2", "SHIP", "31/12/2020 00:00", "31/12/2020 17:03",
                    15, 10, 12.5, 12.5, 2.4, 2.4, 42.92236, -66.97243,
                    43.22513, -66.96725, 150, -1);
            ShipMovements shipMovements = new ShipMovements(dto);
            shipMovements.setDeltaDistance(expected);
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
        Assertions.assertEquals(shipMovements1, shipMovements);
    }
}