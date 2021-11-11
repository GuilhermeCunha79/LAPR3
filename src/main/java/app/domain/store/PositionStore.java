package app.domain.store;

import app.domain.model.Position;
import app.domain.utils.BST.BST;
import app.domain.utils.BST.CodeSearch;
import app.domain.utils.DTO.PositionDTO;

public class PositionStore {

    private Position position;
    private CodeSearch codeSearch;
    private BST<Position> positionTree = new BST<>();
    /***
     * Method that receives parameters from the associated app.controller to create a new Position
     * @param dto
     * @return Position
     */

    public Position newPosition(PositionDTO dto) {
        return new Position(dto);
    }

    public BST<Position> getPositionTree() {
        return new BST<>(positionTree);
    }


    /***
     * This method sets  the ship tree
     * @param positionPosition
     */
    public void setPositionTree(BST<Position> positionPosition) {
        this.positionTree = new BST<>(positionPosition);
    }

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

}
