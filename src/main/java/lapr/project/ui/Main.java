package lapr.project.ui;

import lapr.project.controller.ImportShipsController;
import lapr.project.model.CalculatorExample;
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
        bst= ImportShipsController.importShips("sships.csv","MMSI");
        //CalculatorExample calculatorExample = new CalculatorExample();

        //int value = calculatorExample.sum(3, 5);

        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.log(Level.INFO, bst.toString());
        }
    }
}

