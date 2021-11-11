/*package app.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class ShipPairController {

    public HashMap<Integer, ShipMovements> selectShipsMmsi(BST<Ship> shipBST) {
        int mmsi;
        HashMap<Integer, ShipMovements> shipHash = new HashMap<>();

        Iterable<Ship> shipIterable = shipBST.preOrder();
        for (Ship ship : shipIterable) {
            mmsi = ship.getMmsi();
            ShipMovements movements = null;//= DistanceCalculator.distance()

            if (movements.getTravelledDistance() > 10000) {
                shipHash.put(mmsi, movements);
            }
        }
        return shipHash;
    }

    public TreeMap getCloseShips(HashMap<Integer, ShipMovements> shipMovementsHashMap) {
        List<Integer> list = new ArrayList<>();
        TreeMap<Double, HashMap<ShipMovements, ShipMovements>> treeMap = new TreeMap<>();
        shipMovementsHashMap.forEach();
    }
}
*/