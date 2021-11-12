package lapr.project.controller;

import lapr.project.model.Position;
import lapr.project.model.Ship;
import lapr.project.model.ShipMovements;
import lapr.project.model.SortShips;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortShipsController {

    SortShips sort;

    public SortShipsController() {
        sort = new SortShips();
    }

    /*public List<ShipMovements> getListShipMovements(Map<Ship, Set<Position>> mapShips){
        return sort.listShipsMovements(mapShips);
    }*/

    public List<ShipMovements> sortDescendingTravelled(List<ShipMovements> list){
        return sort.sortDescendingTravelled(list);
    }

    public List<ShipMovements> sortAscendingNumberMov(List<ShipMovements> list){
        return sort.sortAscendingNumberMov(list);
    }



}