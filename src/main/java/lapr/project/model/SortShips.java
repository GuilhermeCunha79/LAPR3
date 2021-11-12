package lapr.project.model;


import java.util.*;

import static lapr.project.model.DistanceCalculator.getNumberOfMovements;

public class SortShips {


    public List<ShipMovements> listShipsMovements(Map<Ship, Set<Position>> mapShips) {
        List<ShipMovements> listShips = new ArrayList<>();
        List<Position> positions;
        int nOfMov;
        double travelledDistance;
        double deltaDistance;
        for (Map.Entry<Ship, Set<Position>> me : mapShips.entrySet()) {
            positions = new ArrayList<Position>(me.getValue()); //converter o Set para uma List
            nOfMov = getNumberOfMovements(positions);
            travelledDistance = DistanceCalculator.travelledDistance(positions);
            deltaDistance = DistanceCalculator.deltaDistance(positions);
            ShipMovements lShips = new ShipMovements(me.getKey().getMmsi(), nOfMov, travelledDistance, deltaDistance);
            listShips.add(lShips);
        }

        return listShips;
    }



    public List<ShipMovements> sortDescendingTravelled(List<ShipMovements> list){
        list.sort(Comparator.comparing(ShipMovements::getTravelledDistance).reversed());

        return list;
    }



    public List<ShipMovements> sortAscendingNumberMov(List<ShipMovements> list){
        list.sort(Comparator.comparing(ShipMovements::getTotalNumberOfMovements));

        return list;
    }

}

