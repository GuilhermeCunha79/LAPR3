package lapr.project.store;

import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.BST.CodeSearch;
import lapr.project.utils.CommonMethods;
import lapr.project.utils.DTO.ShipDTO;

public class ShipStore {

    private final String DATA_PATH = "data\\ship.dat";
    private Ship ship;
    private CodeSearch codeSearch;
    private BST<Ship> shipTree = new BST<>();


    public Ship newShip(ShipDTO dto) {
        return new Ship(dto);
    }

    public BST<Ship> getShipTree() {
        return new BST<>(shipTree);
    }

    private boolean addShipMmsi(Ship ship) {
        if (validateShip(ship)) {
            this.shipTree.insert(ship);
            return true;
        }
        return false;
    }

    private boolean addShipImo(Ship ship) {
        if (validateShip(ship)) {
            this.shipTree.insert(ship);
            return true;
        }
        return false;
    }

    public Ship getShipByMMSI(int mmsi) {
        Iterable<Ship> arvore = shipTree.preOrder();
        for (Ship ship : arvore) {
            if (mmsi == ship.getMmsi()) {
                return ship;
            }
        }
        return null;
    }

    public Ship getShipByImo(String imo) {
        Iterable<Ship> arvore = shipTree.preOrder();
        for (Ship ship : arvore) {
            if (imo.equals(ship.getImo())) {
                return ship;
            }
        }
        return null;
    }

    public Ship getShipByCallSign(String callSign) {
        Iterable<Ship> arvore = shipTree.preOrder();
        for (Ship ship : arvore) {
            if (callSign.equals(ship.getCallSign())) {
                return ship;
            }
        }
        return null;
    }

    public boolean validateShip(Ship ship) {
        if(checkDuplicate(ship)){
            return false;
        }
        return true;
    }

    /***
     * This method sets  the ship list
     * @param shipShip
     */
    public void setShipTree(BST<Ship> shipShip) {
        this.shipTree = new BST<>(shipShip);
    }

    /**
     * Method to save a test object
     *
     * @param ship object test to be saved
     * @return true if added with success, false if not
     */
    public boolean saveShip(Ship ship, String type) {
        if (validateShip(ship)) {
            if(type.equals("MMSI")) {
                addShipMmsi(ship);
                CommonMethods.serializeStore(this.shipTree, "data\\ship.dat");
                return true;
            }else if (type.equals("IMO")){
                addShipMmsi(ship);
                CommonMethods.serializeStore(this.shipTree, "data\\ship.dat");
                return true;
            }else if(type.equals("Call Sign")){
                addShipMmsi(ship);
                CommonMethods.serializeStore(this.shipTree, "data\\ship.dat");
                return true;
            }
        }
        return false;
    }

    /***
     * Method that checks if two ships are equals
     * @param ship
     * @return true or false
     */
    public boolean checkDuplicate(Ship ship) {
        Iterable<Ship> arvore = shipTree.preOrder();
        for (Ship ship1 : arvore) {
            if (ship.getMmsi() == ship1.getMmsi()) {
                return true;
            }
        }
        return false;
    }

}
