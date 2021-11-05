package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;
import org.junit.Test;

public class ShipTest {


    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutDate(){
        ShipDTO dto=new ShipDTO(111111111,null,3,3,2,2,2,"VARAMO","IMO6213111","C4SQ2",70,123,32,23.5,"NA","B");
        new Ship(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutVesselName(){
        ShipDTO dto=new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,null,"IMO1231316","C4SQ2",70,123,32,23.5,"NA","B");
        new Ship(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutImo(){
        ShipDTO dto=new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO",null,"C4SQ2",70,123,32,23.5,"NA","B");
        new Ship(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutCallSign(){
        ShipDTO dto=new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO","IMO1231316",null,70,123,32,23.5,"NA","B");
        new Ship(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutCargo(){
        ShipDTO dto=new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO","IMO1261311","C4SQ2",70,123,32,23.5,null,"B");
        new Ship(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutTransciverClass(){
        ShipDTO dto=new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO","IMO1231111","C4SQ2",70,123,32,23.5,"NA",null);
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeMmsi9Chars(){
        ShipDTO dto=new ShipDTO(1111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO","IMO12313121","C4SQ2",70,123,32,23.5,"NA","B");
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeImoStartsWithIMO(){
        ShipDTO dto=new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO","OLA3212345","C4SQ2",70,123,32,23.5,"NA","B");
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeCallSignJustHaveAlphanum(){
        ShipDTO dto=new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO","IMO3212345","-,.76",70,123,32,23.5,"NA","B");
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeCallSignJustHaveMoreThan5Alphanum(){
        ShipDTO dto=new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO","IMO3212345","CDSF555",70,123,32,23.5,"NA","B");
        new Ship(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeVesselTypeCannotBeNegative(){
        ShipDTO dto = new ShipDTO(111111111,"31/12/2020 17:03",3,3,2,2,2,"VARAMO","IMO1234567","CDSF456",-80,123,32,23.5,"NA","B");
        new Ship(dto);
    }





}
