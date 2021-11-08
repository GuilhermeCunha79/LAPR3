package lapr.project.ui;

import lapr.project.controller.ImportShipsController;
import lapr.project.model.CalculatorExample;
import lapr.project.model.Position;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

    /**
     * Logger class.
     */
    private static final Logger LOGGER = Logger.getLogger("MainLog");

    /**
     * Private constructor to hide implicit public one.
     */
    private Main() {

    }

    /**
     * Application main method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        BST <Ship> bst = new BST<>();
        BST <Ship> bst1 = new BST<>();
        BST <Ship> bst2 = new BST<>();
        BST <Position> bst3 = new BST<>();
        bst= ImportShipsController.importShips("sships.csv","IMO");
        bst1= ImportShipsController.importShips("sships.csv","MMSI");
        bst2= ImportShipsController.importShips("sships.csv","CallSign");
        bst3=ImportShipsController.importShipsPosition("sships.csv");
        //CalculatorExample calculatorExample = new CalculatorExample();
        //FindShipUI ui=new FindShipUI();
         //ui.findShipUI(bst,bst1,bst2);
        //int value = calculatorExample.sum(3, 5);

        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.log(Level.INFO, bst3.toString());
        }
    }
}

