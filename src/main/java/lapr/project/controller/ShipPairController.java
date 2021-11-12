package lapr.project.controller;

import lapr.project.model.DistanceCalculator;
import lapr.project.model.Ship;
import lapr.project.model.ShipMovements;
import lapr.project.utils.BST.BST;
import lapr.project.utils.Constants;

import java.util.*;


public class ShipPairController {

    public HashMap<Integer, ShipMovements> selectShipsMmsi(BST<Ship> shipBST) {
        int mmsi;
        HashMap<Integer, ShipMovements> shipHash = new HashMap<>();

        Iterable<Ship> shipIterable = shipBST.preOrder();
        for (Ship ship : shipIterable) {
            mmsi = ship.getMmsi();
            /*ShipMovements movements = DistanceCalculator.distance(ship);

            if (movements.getTravelledDistance() > Constansts.MAX_TRAVELLED_DISTANCE) {
                shipHash.put(mmsi, movements);
            }*/
        }
        return shipHash;
    }

    public TreeMap<Double,HashMap<ShipMovements, ShipMovements>> getCloseShips(HashMap<Integer, ShipMovements> shipMovementsHashMap) {

        List<Integer> list = new ArrayList<>();
        TreeMap<Double, HashMap<ShipMovements, ShipMovements>> treeMap = new TreeMap<>();

        shipMovementsHashMap.forEach((currentMmsi, shipDistance) -> {
            shipMovementsHashMap.forEach((nextMmsi, nextDistance) -> {
                if (!Objects.equals(currentMmsi, nextMmsi) && !list.contains(currentMmsi)) {
                    double arrivalDistance = DistanceCalculator.distance(shipDistance.getArrivalLatitude(), nextDistance.getArrivalLatitude(), shipDistance.getArrivalLatitude(), nextDistance.getArrivalLongitude()
                );
                    double departureDistance = DistanceCalculator.distance(shipDistance.getDepartureLatitude(), nextDistance.getDepartureLatitude(), shipDistance.getDepartureLatitude(), nextDistance.getDepartureLongitude()
                );
                    boolean haveCloseRoutes = (arrivalDistance < Constants.MAX_TRAV_DIST || departureDistance < Constants.MAX_TRAV_DIST);
                    boolean diffTravelledDistance = shipDistance.getTravelledDistance() != nextDistance.getTravelledDistance();
                    double diffByTravelledDistance = Math.abs(shipDistance.getTravelledDistance() - nextDistance.getTravelledDistance());

                    if (haveCloseRoutes && diffTravelledDistance) {
                        HashMap<ShipMovements, ShipMovements> shipPairs = new HashMap<>();
                        shipPairs.put(shipDistance, nextDistance);

                        treeMap.put(diffByTravelledDistance, shipPairs);
                    }
                }
            });

            list.add(currentMmsi);
        });
        return treeMap;
    }
}
