package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;

public class CallSignTree extends Ship {

    public CallSignTree(ShipDTO dto) {
        super(dto);
    }

    public CallSignTree(String callSign){
        super(0, null, null, callSign, 0, 0, 0, 0, null);
    }

    @Override
    public int compareTo(Ship o) {
        return super.getCallSign().compareTo(o.getCallSign());
    }

}
