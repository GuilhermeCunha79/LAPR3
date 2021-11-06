package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;
import org.junit.Test;

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
        ShipDTO dto = new ShipDTO(111111111,"VARAMO","IMO1234567","CD456",70,4,6,0,null);
        new Ship(dto);
    }
}
