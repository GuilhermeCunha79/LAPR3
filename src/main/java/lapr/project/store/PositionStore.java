package lapr.project.store;

import lapr.project.model.Position;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.BST.CodeSearch;
import lapr.project.utils.CommonMethods;
import lapr.project.utils.DTO.PositionDTO;

public class PositionStore {

    private final String DATA_PATH = "data\\position.dat";
    private Position position;
    private CodeSearch codeSearch;
    private BST<Position> positionTree = new BST<>();
    /***
     * Method that receives parameters from the associated controller to create a new Position
     * @param dto
     * @return Position
     */

    public Position newPosition(PositionDTO dto) {
        return new Position(dto);
    }

   /* /***
     * This method sets  the ship tree
     * @param positionPosition
     *//*
    public void setPositionTree(BST<Position> positionPosition) {
        this.positionTree = new BST<>(positionPosition);
    }*/

    public boolean validatePosition(Position ship) {
        return !checkDuplicate(ship);
    }

    private boolean addPosition(Position position) {
        if (validatePosition(position)) {
            this.positionTree.insert(position);
            return true;
        }
        return false;
    }

    public boolean savePosition(Position position) {
        if (validatePosition(position)) {
            addPosition(position);
            CommonMethods.serializeStore(this.positionTree, "data\\position.dat");
            return true;
        }
        return false;
    }

    public boolean checkDuplicate(Position position) {
        Iterable<Position> arvore = positionTree.preOrder();
        for (Position position1 : arvore) {
            if (position.getMmsi() == position1.getMmsi() && position.getDateTime().equals(position1.getDateTime())) {
                return true;
            }
        }
        return false;
    }

   /* public BST<Position> getPositionTree() {
        return new BST<>(positionTree);
    }*/
}
