package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;

public class IMOTree extends Ship{

    public IMOTree(ShipDTO dto) {
        super(dto);
    }



    public IMOTree(String imo){
        super(0, null, imo, null, 0, 0, 0, 0, null);
    }

    @Override
    public int compareTo(Ship o) {
        return this.getImo().compareTo(o.getImo());
    }

}
