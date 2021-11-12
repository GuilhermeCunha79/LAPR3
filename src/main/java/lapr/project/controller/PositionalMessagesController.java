package lapr.project.controller;


import lapr.project.model.Company;
import lapr.project.model.Position;
import lapr.project.model.Ship;

import lapr.project.store.PositionStore;
import lapr.project.store.ShipStore;
import lapr.project.utils.BST.BST;
import lapr.project.utils.BST.CodeSearch;

import lapr.project.utils.CommonMethods;
import lapr.project.utils.DTO.PositionDTO;

import java.time.LocalDateTime;
import java.util.*;

public class PositionalMessagesController {

    private Position position;
    private PositionStore positionStore;
    private ShipStore shipStore;
    CodeSearch codeSearch;


    public PositionalMessagesController() {
        this(App.getInstance().getCompany());
    }

    public boolean newPosition(PositionDTO dto) {
        this.position = this.positionStore.newPosition(dto);
        return this.positionStore.validatePosition(position);
    }

    public PositionalMessagesController(Company company) {
        this.positionStore = company.getPositionStore();
        this.position = null;
    }

    public Map<Ship, Set<Position>> associatePositions(BST<Position> bst1, BST<Ship> bst2) {
        Map<Ship, Set<Position>> map = new HashMap<>();

        for (Ship s : bst2.inOrder()) {
            int mmsi = s.getMmsi();
            Set<Position> positionSet = new HashSet<>();
            for (Position p : bst1.inOrder()) {
                if (mmsi == p.getMmsi()) {
                    positionSet.add(p);
                }
            }
            map.put(s, positionSet);
        }
        return map;
    }

    public List<Position> getPositionalMessages(Ship ship, Map<Ship, Set<Position>> map, LocalDateTime date1, LocalDateTime date2) {
        List<Position> positions = new ArrayList<>();

        /*System.out.println(ship.toString());
        System.out.println(map.containsKey(ship));
        System.out.println(map.get(ship));*/

        if (map.containsKey(ship)) {
            Set<Position> set = map.get(ship);

            for (Position p : set) {
                LocalDateTime date = CommonMethods.convertStringToDate(p.getDateTime());
                if (date.isAfter(date1.minusSeconds(1)) && date.isBefore(date2.plusSeconds(1))) {
                    positions.add(p);
                }
            }

        } else {
            throw new IllegalArgumentException("This Ship does not exist.");
        }

        positions.sort(Comparator.comparing(Position::getDateTime));

        return positions;
    }

    public LocalDateTime convertStringToDate(String name) {
        return CommonMethods.convertStringToDate(name);
    }

    public boolean savePosition() {
        return this.positionStore.savePosition(position);
    }

    public BST<Position> getPositionTree() {
        return App.getInstance().getCompany().getPositionStore().getPositionTree();
    }

    public void printList(List<Position> positionList) {
        for (Position value : positionList) {
            System.out.println("---------------------------------------");
            System.out.println(value);
            System.out.println("---------------------------------------");
        }
    }
}











