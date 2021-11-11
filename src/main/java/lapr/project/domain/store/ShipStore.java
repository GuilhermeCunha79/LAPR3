package lapr.project.domain.store;

import lapr.project.domain.model.CallSignTree;
import lapr.project.domain.model.IMOTree;
import lapr.project.domain.model.Ship;
import lapr.project.domain.utils.BST.BST;
import lapr.project.domain.utils.BST.CodeSearch;
import lapr.project.domain.utils.DTO.ShipDTO;

public class ShipStore {

    private Ship ship;
    private CodeSearch codeSearch;
    private BST<Ship> shipTree = new BST<>();


    public Ship newShip(ShipDTO dto) {
        return new Ship(dto);
    }


    public BST<Ship> getShipTree() {
        return new BST<>(shipTree);
    }

    public boolean addShipMmsi(Ship ship) {
        if (validateShip(ship)) {
            this.shipTree.insert(ship);
            return true;
        }
        return false;
    }

    private boolean addShipImo(IMOTree ship) {
        if (validateShip(ship)) {
            this.shipTree.insert(ship);
            return true;
        }
        return false;
    }

    private boolean addShipCallSign(CallSignTree ship) {
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
    public boolean saveShipMmsi(Ship ship, String type) {
        if (validateShip(ship)) {
            if (ship != null) {
                addShipMmsi(ship);
                return true;
            }
        }
        return false;
    }

    public boolean saveShipImo(IMOTree tree){
        if(tree!=null) {
            addShipImo(tree);
            //save here
            return true;
        }
        return false;
    }

    public boolean saveShipCallSign(CallSignTree tree){
        if(tree!=null) {
            addShipCallSign(tree);
            //save here
            return true;
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
