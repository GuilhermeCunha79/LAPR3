package app.domain.model;

import app.domain.utils.DTO.ShipDTO;

public class MMSITree extends Ship {

    public MMSITree(ShipDTO shipDTO) {
        super(shipDTO.getMmsi(), shipDTO.getVesselName(), shipDTO.getImo(), shipDTO.getCallSign(), shipDTO.getVesselType(), shipDTO.getLength(), shipDTO.getWidth(), shipDTO.getDraft(), shipDTO.getCargo());
    }

    public MMSITree(int mmsi){
        super(mmsi,"VARAMO","IMO9395044","C4SQ2",70,4,4,8.7,"NA");
    }

    @Override
    public int compareTo(Ship o) {
        return super.compareTo(o);

    }

}
