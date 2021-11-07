package lapr.project.ui;

import lapr.project.controller.DetailsShipController;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.CommonMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FindShipUI {

    DetailsShipController ctrl = new DetailsShipController("sships.csv");

    public FindShipUI() throws FileNotFoundException {
    }

    public void findShipUI(BST bstIMO, BST bstMMSI, BST bstCallSign) throws IOException {
            Ship ship;
            System.out.println("Digite o código IMO/MMSI/Call Sign do navio que pretende procurar:\n");
            Scanner scan=new Scanner(System.in);
            String code= scan.nextLine();
            int option=0;
            if(CommonMethods.imoVerification(code)){
                option=1;
            }else if(CommonMethods.checkIfStringJustHaveNumbers(code) && code.length()==9){
                option=2;
            }else{
                option=3;
            }

            switch(option){
                case 1:
                    System.out.println("Searched by IMO:\n");
                    try {
                        ship=ctrl.searchByIMO(code);
                        System.out.println(ship.toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    System.out.println("Searched by MMSI:\n");
                    try {
                        ship=ctrl.searchByMMSI(Integer.parseInt(code));
                        System.out.println(ship.toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Searched by Call Sign:\n");
                    try {
                        ship=ctrl.searchByCallSign(code);
                        System.out.println(ship.toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Ship don't found.");
            }
        }
    /*@Override
    public void run() {

            boolean repeat;
            do {
                repeat = findShipUI();
            } while (repeat && Utils.confirm("Do you wish to check another client test details? (Y or N)"));
        }
    }*/

}
