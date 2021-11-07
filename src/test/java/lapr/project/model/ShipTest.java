package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShipTest {

    @Test
    public void creatCorrectShip(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO3212345","C4SQ2",70,1,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutVesselName(){
        ShipDTO dto = new ShipDTO(111111111,null,"IMO3212345","C4SQ2",70,1,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutImo(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO",null,"C4SQ2",70,1,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutCallSign(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO3212345",null,70,1,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeMmsi9Chars(){
        ShipDTO dto = new ShipDTO(1111111181,"VARAMO","IMO3212345","C4SQ2",70,1,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeImoStartsWithIMO(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","OLA3212345","-lh,j",70,1,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeCallSignJustHaveAlphanum(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","-lh,j",70,1,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeVesselTypeCannotBeNegative(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CDS56",-70,1,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected=IllegalArgumentException.class)
    public void garanteLengthCannotBeNull(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,0,1,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected=IllegalArgumentException.class)
    public void garanteWidthCannotBeNull(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,0,9.5,"NA");
        new Ship(dto);
    }

    @Test (expected=NullPointerException.class)
    public void garanteCargoCannotBeNull(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,9.5,null);
        new Ship(dto);
    }

    @Test (expected=IllegalArgumentException.class)
    public void garanteDraftCannotBe0(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,0,"NA");
        new Ship(dto);
    }

    @Test
    public void getVesselName(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        new Ship(dto);
        String expected="VARAMO";
        assertEquals(dto.getVesselName(),expected);
    }

    @Test
    public void getImo(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        new Ship(dto);
        String expected="IMO1234567";
        assertEquals(dto.getImo(),expected);
    }

    @Test
    public void getCallSign(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        new Ship(dto);
        String expected="CD456";
        assertEquals(dto.getCallSign(),expected);
    }

    @Test
    public void getLength(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        new Ship(dto);
        int expected=4;
        assertEquals(dto.getLength(),expected);
    }

    @Test
    public void getWidth(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        new Ship(dto);
        int expected=6;
        assertEquals(dto.getWidth(),expected);
    }

    @Test
    public void getDraft(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2.3,"NA");
        new Ship(dto);
        double expected=2.3;
        double delta=0.1;
        assertEquals(dto.getDraft(),expected,delta);
    }

    @Test
    public void getCargo(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        new Ship(dto);
        String expected="NA";
        assertEquals(dto.getCargo(),expected);
    }

    @Test
    public void setMmsi(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        int expected=123456789;
        ship.setMmsi(123456789);
        assertEquals(ship.getMmsi(),expected);
    }

    @Test
    public void setVesselName(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        String expected="VARAMI";
        ship.setVesselName("VARAMI");
        assertEquals(ship.getVesselName(),expected);
    }

    @Test
    public void setImo(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        String expected="IMO1234568";
        ship.setImo("IMO1234568");
        assertEquals(ship.getImo(),expected);
    }

    @Test
    public void setCallSign(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        String expected="CD456";
        ship.setCallSign("CD456");
        assertEquals(ship.getCallSign(),expected);
    }

    @Test
    public void setVesselType(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        int expected=89;
        ship.setVesselType(89);
        assertEquals(ship.getVesselType(),expected);
    }

    @Test
    public void setLength(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        int expected=89;
        ship.setLength(89);
        assertEquals(ship.getLength(),expected);
    }

    @Test
    public void setWidth(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        int expected=89;
        ship.setWidth(89);
        assertEquals(ship.getWidth(),expected);
    }

    @Test
    public void setDraft(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        double expected=89;
        double delta=0.1;
        ship.setDraft(89);
        assertEquals(ship.getDraft(),expected,delta);
    }

    @Test
    public void setCargo(){
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,2,"NA");
        Ship ship=new Ship(dto);
        String expected="NB";
        ship.setCargo("NB");
        assertEquals(ship.getCargo(),expected);
    }
}
