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

    /*public List<ListShips> listOfShipsMovements(Map<Ship, Set<Position>> mapShips){
        List<ListShips> listShips = new ArrayList<>();
        List<Position> positions;
        int nOfMov;
        double travelledDistance;
        double deltaDistance;
        for (Map.Entry<Ship, Set<Position>> me : mapShips.entrySet()) {
            positions = new ArrayList<Position>(me.getValue()); //converter o Set para uma List
            nOfMov = getNumberOfMovements(positions);
            travelledDistance = DistanceCalculator.travelledDistance(positions);
            deltaDistance = DistanceCalculator.deltaDistance(positions);
            ListShips lShips = new ListShips(me.getKey().getMmsi(), nOfMov, travelledDistance, deltaDistance);
            listShips.add(lShips);
        }

        return listShips;
        }

     */







/*
    public List<String> listOfShipsMovements(Map<Ship, Set<Position>> mapShips) {
        List<String> listShips = new ArrayList<>();
        List<Position> positions;
        int nOfMov;
        double travelledDistance;
        double deltaDistance;
        for (Map.Entry<Ship, Set<Position>> me : mapShips.entrySet()) {
            positions = new ArrayList<Position>(me.getValue()); //converter o Set para uma List
            nOfMov = getNumberOfMovements(positions);
            travelledDistance = DistanceCalculator.travelledDistance(positions);
            deltaDistance = DistanceCalculator.deltaDistance(positions);
            String lShips = "\nMMSI " + me.getKey().getMmsi() +
                    "\nTravelled Distance:" + travelledDistance +
                    "\nNumber of Movements:" + nOfMov +
                    "\nDelta Distance:" + deltaDistance + "\n";
            listShips.add(lShips);

        }
        return listShips;
    }


 */

   /* public Map<Integer, Set<Double>> listOfShipsMovements(Map<Ship, Set<Position>> mapShips) {
        Map<Integer, Set<Double>> map = new HashMap<>();
        Set<Double> value = new HashSet<>();

        List<Position> positions;
        int nOfMov;
        double travelledDistance;
        double deltaDistance;
        for (Map.Entry<Ship, Set<Position>> me : mapShips.entrySet()) {
            positions = new ArrayList<Position>(me.getValue()); //converter o Set para uma List
            nOfMov = getNumberOfMovements(positions);
            travelledDistance = DistanceCalculator.travelledDistance(positions);
            deltaDistance = DistanceCalculator.deltaDistance(positions);
            double s1 = nOfMov;

            value.add(s1);
            value.add(travelledDistance);
            value.add(deltaDistance);

            map.put(me.getKey().getMmsi(), value);

        }
        return map;
    }

/*
    public Map<Integer, Set<Double>> sortDescendingTravelled(Map<Integer, Set<Double>> map){
        Map<Integer, Set<Double>> sortedMap = new HashMap<>();
        Set<Double> newSet = new HashSet<>();
        int aux = 0;
        double temp = 0;
        for (Map.Entry<Integer, Set<Double>> me : map.entrySet()) {
            Iterator<Double> itr = me.getValue().iterator();
                while (itr.hasNext()) {
                    aux++;
                    if (aux == 2){
                        temp = itr.next();

                    }

                }


        }
        return sortedMap;
    }

 */



    /*public List<String> sortDescendingTravelled(List<String> list){
        String travelled;
        List<String> sortedList = new ArrayList<>();
        String temporaria = null;
        for (String s : list){
            for (String s1: sortedList) {
            for (int i = 0; i < list.size(); i++){
                s = list.get(i);
                travelled = s.substring(32,s.length());

                    if(temporaria.compareTo(travelled) < 0){
                        temporaria = travelled;
                        sortedList.add(list.get(i));
                    }

                }
            }


        }

        return sortedList;
    }





}

     */
