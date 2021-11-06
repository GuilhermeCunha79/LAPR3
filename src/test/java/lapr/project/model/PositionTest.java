package lapr.project.model;

import lapr.project.utils.DTO.PositionDTO;
import org.junit.Test;

public class PositionTest {


    @Test
    public void checkPosition(){
        PositionDTO dto = new PositionDTO(111111111,"31/12/2020 17:19",1,1,2.4f, 2.4f,0,"A");
        new Position(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeMmsi9Chars(){
        PositionDTO dto = new PositionDTO(1111111181,"VARAMO",2,2,70,1,1,"A");
        new Position(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutTransciverClass(){
        PositionDTO dto = new PositionDTO(222222222,"31/12/2020 17:19",1,1,2.4, 2.4,0,null);
        new Position(dto);
    }

    @Test (expected = NullPointerException.class)
    public void garanteeNullShipIsntCreatedWithoutDate(){
        PositionDTO dto = new PositionDTO(111111111,null,1,1,2.4, 2.4,0,"A");
        new Position(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeLatitudeBetween90And_90(){
        PositionDTO dto = new PositionDTO(111111111,"31/12/2020 17:19",120,1,2.4, 2.4,0,"A");
        new Position(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeLongitudeBetween180And_180(){
        PositionDTO dto = new PositionDTO(111111111,"31/12/2020 17:19",76,181,2.4, 2.4,0,"A");
        new Position(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeSogEqualOrBiggerThan0(){
        PositionDTO dto = new PositionDTO(111111111,"31/12/2020 17:19",76,181,-1, 2.4,0,"A");
        new Position(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeCogBetween0and359(){
        PositionDTO dto = new PositionDTO(111111111,"31/12/2020 17:19",76,170,-1, 360,0,"A");
        new Position(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeHeadingBetween0and359(){
        PositionDTO dto = new PositionDTO(111111111,"31/12/2020 17:19",76,170,5, 34,369,"A");
        new Position(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeTrancieverClassOneLetter(){
        PositionDTO dto = new PositionDTO(111111111,"31/12/2020 17:19",76,170,5, 34,300,"AA");
        new Position(dto);
    }

    @Test (expected = IllegalArgumentException.class)
    public void garanteeTrancieverClassOnlyLetter(){
        PositionDTO dto = new PositionDTO(111111111,"31/12/2020 17:19",76,170,5, 34,300,"1");
        new Position(dto);
    }
}
