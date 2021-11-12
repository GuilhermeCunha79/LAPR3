package lapr.project.ui;

import lapr.project.controller.ImportShipsController;
import lapr.project.model.Position;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.ui.gui.FindShipUI;
import lapr.project.ui.gui.ImportShipsUI;
import lapr.project.ui.gui.ShipMessagesUI;

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
        ImportShipsUI uii= new ImportShipsUI();
        ImportShipsController ctrl=new ImportShipsController();
        BST <Ship> bst = new BST<>();
        BST <Position> bst1 = new BST<>();
        uii.importShipsUI();
        ctrl.importShipsPosition("sships.csv");

        FindShipUI ui=new FindShipUI();
        ShipMessagesUI ul=new ShipMessagesUI();
        ui.findShipUI();
        ul.shipMessagesUi();


        if (LOGGER.isLoggable(Level.INFO)) {
            //LOGGER.log(Level.INFO, bst1.toString());
        }
    }
}

