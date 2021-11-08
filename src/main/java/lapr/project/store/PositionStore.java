package lapr.project.store;

import lapr.project.model.Position;
import lapr.project.utils.DTO.PositionDTO;

public class PositionStore {

    private final String DATA_PATH = "data\\position.dat";

    /***
     * Method that receives parameters from the associated controller to create a new Position
     * @param dto
     * @return Position
     */

    public Position newShip(PositionDTO dto) {
        return new Position(dto);
    }
}
