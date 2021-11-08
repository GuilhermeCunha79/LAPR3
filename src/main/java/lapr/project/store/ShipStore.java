package lapr.project.store;

import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.DTO.ShipDTO;

public class ShipStore {

    private final String DATA_PATH = "data\\ship.dat";

    /***
     * Method that receives parameters from the associated controller to create a new Ship
     * @param dto
     * @return Ship
     */

    public Ship newShip(ShipDTO dto) {
        return new Ship(dto);
    }

    public Ship getShipByMMSI(BST bst, int mmsi) {
        Iterable<Ship> list=bst.preOrder();
        if (mmsi!=0) {
            for (Ship ship : list) {
                if (mmsi==ship.getMmsi())
                    return ship;
            }
        }
        return null;
    }
}
