package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;

public class IMOTree extends Ship{

    public IMOTree(ShipDTO dto) {
        super(dto);
    }



    @Override
    public int compareTo(Ship o) {
        return this.getImo().compareTo(o.getImo());
    }

}
