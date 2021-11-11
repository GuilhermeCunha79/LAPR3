package app.model;

import app.utils.DTO.ShipDTO;

public class IMOTree extends Ship {

    public IMOTree(ShipDTO dto) {
        super(dto);
    }

    public IMOTree(String imo){
        super(0, null, imo, null, 0, 0, 0, 0, null);
    }

    @Override
    public int compareTo(Ship o) {
        return super.getImo().compareTo(o.getImo());
    }


}
