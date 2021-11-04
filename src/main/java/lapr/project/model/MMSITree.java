package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;

public class MMSITree extends Ship{


    public MMSITree(int mmsi){
        super();
        super.setMmsi(mmsi);
    }
    
    public MMSITree(ShipDTO dto) {
        super(dto);
    }

    @Override
    public int compareTo(Ship o) {
        if (this.getMmsi() < o.getMmsi())
            return 0;
        return 1;
    }
}
