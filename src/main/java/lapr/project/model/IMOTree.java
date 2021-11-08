package lapr.project.model;

import lapr.project.utils.DTO.ShipDTO;

public class IMOTree extends Ship implements Comparable<Ship> {

    public IMOTree(ShipDTO dto) {
        super(dto);
    }

    @Override
    public int compareTo(Ship o) {
        return super.getImo().compareTo(o.getImo());
    }
}
