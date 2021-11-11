package app.ui;

import app.controller.DetailsShipController;
import app.model.Ship;
import app.utils.CommonMethods;

import java.io.IOException;
import java.util.Scanner;

public class FindShipUI {

    DetailsShipController ctrl = new DetailsShipController();

    public void findShipUI() throws IOException {
        Ship ship;
        System.out.println("\nDigite o código IMO/MMSI/Call Sign do navio que pretende procurar:");
        Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();
        int option;
        if (CommonMethods.imoVerification(code)) {
            option = 1;
        } else if (CommonMethods.checkIfStringJustHaveNumbers(code) && code.length() == 9) {
            option = 2;
        } else {
            option = 3;
        }
        System.out.println("\nShip details:");
        switch (option) {
            case 1:
                System.out.println("Searched by IMO:\n");
                try {
                    ship = ctrl.searchByIMO(code);
                    System.out.println(ship.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            case 2:
                System.out.println("\nSearched by MMSI:");
                try {
                    ship = ctrl.searchByMMSI(Integer.parseInt(code));
                    System.out.println(ship.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("\nSearched by Call Sign:\n");
                try {
                    ship = ctrl.searchByCallSign(code);
                    System.out.println(ship.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Ship don't found.");
        }
    }
}
