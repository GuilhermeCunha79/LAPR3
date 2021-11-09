package lapr.project.model;


import lapr.project.utils.BST.BST;
import lapr.project.utils.CommonMethods;

import java.time.LocalDateTime;
import java.util.*;

public class PositionalMessages {

    public static Map<Ship, Set<Position>> associatePositions(BST<Position> bst1, BST<Ship> bst2) {
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

    public static List<Position> getPositionalMessages(Ship ship, Map<Ship, Set<Position>> map, LocalDateTime date1, LocalDateTime date2) {
        List<Position> positions = new ArrayList<>();

        /*System.out.println(ship.toString());
        System.out.println(map.containsKey(ship));
        System.out.println(map.get(ship));*/

        if (map.containsKey(ship)) {
            Set<Position> set = map.get(ship);

            for (Position p : set) {
                LocalDateTime date = CommonMethods.convertStringToDate(p.getDateTime());
                if (date.isAfter(date1) && date.isBefore(date2)) {
                    positions.add(p);
                }
            }

        } else {
            throw new IllegalArgumentException("This Ship does not exist.");
        }

        positions.sort(Comparator.comparing(Position::getDateTime));

        return positions;
    }
}











