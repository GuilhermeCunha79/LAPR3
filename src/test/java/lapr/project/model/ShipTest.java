package lapr.project.model;

import lapr.project.model.Ship;
import lapr.project.utils.DTO.ShipDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipTest {

    @Test
    void setMmsi() {
        ShipDTO dto = new ShipDTO(111141111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        int expected = 123456789;
        ship.setMmsi(123456789);
        assertEquals(ship.getMmsi(), expected);
    }


    @Test
    public void creatCorrectShip() {
        ShipDTO dto = new ShipDTO(113111111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        new Ship(dto);
    }

    @Test
    public void garanteeNullShipIsntCreatedWithoutVesselName() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipDTO dto = new ShipDTO(111111131, null, "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("not available", thrown.getMessage());
    }

    @Test
    public void garanteeNullShipIsntCreatedWithoutImo() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipDTO dto = new ShipDTO(131111111, "VARAMO", null, "C4SQ2", 70, 1, 1, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("not available", thrown.getMessage());

    }

    @Test
    public void garanteeNullShipIsntCreatedWithoutCallSign() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipDTO dto = new ShipDTO(111131111, "VARAMO", "IMO3212345", null, 70, 1, 1, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("not available", thrown.getMessage());

    }

    @Test
    public void garanteeMmsi9Chars() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(1111111181, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("The MMSI code must have 9 number digits", thrown.getMessage());
    }

    @Test
    public void garanteeImoStartsWithIMO() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111111411, "VARAMO", "OLA3212345", "-lh,j", 70, 1, 1, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("The format must be IMOXXXXXXX.", thrown.getMessage());
    }

    @Test
    public void garanteeCallSignJustHaveAlphanum() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(411111111, "VARAMO", "IMO1234567", "-lh,j", 70, 1, 1, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("Call Sign must have just alphanumerical", thrown.getMessage());
    }

    @Test
    public void garanteeVesselTypeCannotBeNegative() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111111114, "VARAMO", "IMO1234567", "CDS56", -70, 1, 1, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("not available", thrown.getMessage());

    }

    @Test
    public void garanteLengthCannotBeNull() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111611111, "VARAMO", "IMO1234567", "CD456", 70, 0, 1, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("not available", thrown.getMessage());
    }

    @Test
    public void garanteWidthCannotBeNull() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111111161, "VARAMO", "IMO1234567", "CD456", 70, 4, 0, 9.5, "NA");
            new Ship(dto);
        });
        assertEquals("Must be bigger than 0", thrown.getMessage());
    }

    @Test
    public void garanteCargoCannotBeNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipDTO dto = new ShipDTO(611111111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 9.5, null);
            new Ship(dto);
        });
        assertEquals("not available", thrown.getMessage());
    }

    @Test
    public void garanteDraftCannotBe0() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111111112, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 0, "NA");
            new Ship(dto);
        });
        assertEquals("Cannot be 0", thrown.getMessage());
    }

    @Test
    public void getVesselName() {
        ShipDTO dto = new ShipDTO(111114111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        new Ship(dto);
        String expected = "VARAMO";
        assertEquals(dto.getVesselName(), expected);
    }

    @Test
    public void getImo() {
        ShipDTO dto = new ShipDTO(111119111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        new Ship(dto);
        String expected = "IMO1234567";
        assertEquals(dto.getImo(), expected);
    }

    @Test
    public void getCallSign() {
        ShipDTO dto = new ShipDTO(111111911, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        new Ship(dto);
        String expected = "CD456";
        assertEquals(dto.getCallSign(), expected);
    }

    @Test
    public void getLength() {
        ShipDTO dto = new ShipDTO(911111111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        new Ship(dto);
        int expected = 4;
        assertEquals(dto.getLength(), expected);
    }

    @Test
    public void getWidth() {
        ShipDTO dto = new ShipDTO(111111151, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        new Ship(dto);
        int expected = 6;
        assertEquals(dto.getWidth(), expected);
    }

    @Test
    public void getDraft() {
        ShipDTO dto = new ShipDTO(115111111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2.3, "NA");
        new Ship(dto);
        double expected = 2.3;
        double delta = 0.1;
        assertEquals(dto.getDraft(), expected, delta);
    }

    @Test
    public void getCargo() {
        ShipDTO dto = new ShipDTO(111111115, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        new Ship(dto);
        String expected = "NA";
        assertEquals(dto.getCargo(), expected);
    }

    @Test
    public void setVesselName() {
        ShipDTO dto = new ShipDTO(111111811, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        String expected = "VARAMI";
        ship.setVesselName("VARAMI");
        assertEquals(ship.getVesselName(), expected);
    }

    @Test
    public void setImo() {
        ShipDTO dto = new ShipDTO(181111111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        String expected = "IMO1234568";
        ship.setImo("IMO1234568");
        assertEquals(ship.getImo(), expected);
    }

    @Test
    public void setCallSign() {
        ShipDTO dto = new ShipDTO(111111181, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        String expected = "CD456";
        ship.setCallSign("CD456");
        assertEquals(ship.getCallSign(), expected);
    }

    @Test
    public void setVesselType() {
        ShipDTO dto = new ShipDTO(117111711, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        int expected = 89;
        ship.setVesselType(89);
        assertEquals(ship.getVesselType(), expected);
    }

    @Test
    public void setLength() {
        ShipDTO dto = new ShipDTO(117111117, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        int expected = 89;
        ship.setLength(89);
        assertEquals(ship.getLength(), expected);
    }

    @Test
    public void setWidth() {
        ShipDTO dto = new ShipDTO(111111781, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        int expected = 89;
        ship.setWidth(89);
        assertEquals(ship.getWidth(), expected);
    }

    @Test
    public void setDraft() {
        ShipDTO dto = new ShipDTO(111111110, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        double expected = 89;
        double delta = 0.1;
        ship.setDraft(89);
        assertEquals(ship.getDraft(), expected, delta);
    }

    @Test
    public void setCargo() {
        ShipDTO dto = new ShipDTO(111011111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
        Ship ship = new Ship(dto);
        String expected = "NB";
        ship.setCargo("NB");
        assertEquals(ship.getCargo(), expected);
    }

    @Test
    public void setMmsiMoreThan9Digits() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(1011111111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setMmsi(111111111);
        });
        assertEquals("The MMSI code must have 9 number digits", thrown.getMessage());
    }

    @Test
    public void setVesselNameNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipDTO dto = new ShipDTO(111111110, null, "IMO1234567", "CD456", 70, 4, 6, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setVesselName(null);
        });
        assertEquals("not available", thrown.getMessage());
    }

    @Test
    public void setImoNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipDTO dto = new ShipDTO(101111111, "VARAMO", null, "CD456", 70, 4, 6, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setImo(null);
        });
        assertEquals("not available", thrown.getMessage());
    }

    @Test
    public void setImoDifferentFormat() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111141111, "VARAMO", "IMO12345678", "CD456", 70, 4, 6, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setImo("IMO12345678");
        });
        assertEquals("The format must be IMOXXXXXXX.", thrown.getMessage());
    }

    @Test
    public void setCallSignNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipDTO dto = new ShipDTO(131111111, "VARAMO", "IMO1234567", null, 70, 4, 6, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setCallSign(null);
        });
        assertEquals("not available", thrown.getMessage());

    }

    @Test
    public void setCallSignDifferentFormat() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111111113, "VARAMO", "IMO1234567", "CD456_*", 70, 4, 6, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setCallSign("CD456_*");
        });
        assertEquals("Call Sign must have just alphanumerical", thrown.getMessage());

    }

    @Test
    public void setVesselTypeDifferentFormat() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111111611, "VARAMO", "IMO1234567", "CD456", -1, 4, 6, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setVesselType(-1);
        });

        assertEquals("not available", thrown.getMessage());

    }

    @Test
    public void setLengthDifferentFormat() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(116111111, "VARAMO", "IMO1234567", "CD456", 70, -1, 6, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setLength(-1);
        });
        assertEquals("not available", thrown.getMessage());
    }

    @Test
    public void setWidthDifferentFormat() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(555533331, "VARAMO", "IMO1234567", "CD456", 70, 4, -1, 2, "NA");
            Ship ship = new Ship(dto);
            ship.setWidth(-1);
        });
        assertEquals("Must be bigger than 0", thrown.getMessage());
    }

    @Test
    public void setDraftDifferentFormat() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111555111, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 0, "NA");
            Ship ship = new Ship(dto);
            ship.setDraft(0);
        });
        assertEquals("Cannot be 0", thrown.getMessage());
    }

    @Test
    public void setCargoNull() throws NullPointerException {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            ShipDTO dto = new ShipDTO(111111000, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, null);
            Ship ship = new Ship(dto);
            ship.setCargo(null);
        });
        assertEquals("not available", thrown.getMessage());
    }

    @Test
    public void setCargoDifferentFormat() throws IllegalArgumentException {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ShipDTO dto = new ShipDTO(111118818, "VARAMO", "IMO1234567", "CD456", 70, 4, 6, 2, "2_n1");
            Ship ship = new Ship(dto);
            ship.setCargo("2_n1");
        });
        assertEquals("Cargo just have ONLY numbers or letters.", thrown.getMessage());

    }

    @Test
    public void compareTo() {
        ShipDTO dto = new ShipDTO(113331111, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ship = new Ship(dto);
        ShipDTO dto1 = new ShipDTO(311114112, "VARAMA", "IMO3412345", "C5SQ2", 71, 2, 3, 9.4, "BA");
        Ship ship1 = new Ship(dto1);
        Assertions.assertNotNull(ship1.compareTo(ship));
    }

    @Test
    public void equals() {
        ShipDTO dto = new ShipDTO(111137776, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ship = new Ship(dto);
        ShipDTO dto1 = new ShipDTO(111137776, "VARAMO", "IMO3212345", "C4SQ2", 70, 1, 1, 9.5, "NA");
        Ship ship1 = new Ship(dto1);
        Assertions.assertNotNull(ship1.equals(ship));
    }


}