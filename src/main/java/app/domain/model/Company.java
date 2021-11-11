package app.domain.model;


//import auth.AuthFacade;
//import auth.domain.app.domain.model.User;

import app.domain.store.PositionStore;
import app.domain.store.ShipStore;
import app.domain.utils.BST.BST;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.StringUtils;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */

public class Company {


    private String designation;
    //private AuthFacade authFacade;

    private ShipStore shipStore = new ShipStore();
    private PositionStore positionStore = new PositionStore();


    /**
     * Constructor of the company class assigning a designation to it
     * @param designation of the company
     */

    public Company(String designation)
    {
        if (StringUtils.isBlank(designation))
            throw new IllegalArgumentException("Designation cannot be blank.");

        this.designation = designation;
        //this.authFacade = new AuthFacade();

        setPositionStore();
        setShipStore();
        //setUserStore();

    }

    /*private void setUserStore() {
        try (FileInputStream input = new FileInputStream("data\\user.dat"); ObjectInputStream in = new ObjectInputStream(input)){
            Set<User> userList = new HashSet<>((Set<User>) in.readObject());
            this.authFacade.getUsers().setStore(userList);
        }catch (IOException | ClassNotFoundException e){
            e.getLocalizedMessage();
        }
    }*/

    private void setShipStore() {
        try (FileInputStream input = new FileInputStream("data\\ship.dat"); ObjectInputStream in = new ObjectInputStream(input)) {
            BST<Ship> ship = (BST<Ship>) in.readObject();
            this.shipStore.setShipTree(ship);
        } catch (IOException | ClassNotFoundException e) {
            e.getLocalizedMessage();
        }
    }

    private void setPositionStore() {
        try (FileInputStream input = new FileInputStream("data\\position.dat"); ObjectInputStream in = new ObjectInputStream(input)) {
            BST<Position> position = (BST<Position>) in.readObject();
            this.positionStore.setPositionTree(position);
        } catch (IOException | ClassNotFoundException e) {
            e.getLocalizedMessage();
        }
    }


    /**
     * Method that returns the designation of the company
     * @return the designation of the company
     */

    public String getDesignation() {
        return designation;
    }

    /**
     * This method returns the authentication facade of the company
     * @return the authentication facade
     */

    /*public AuthFacade getAuthFacade() {
        return authFacade;
    }*/

    /**
     * This method returns the Ship app.domain.store used by the company
     * @return the parameter category app.domain.store
     */

    public ShipStore getShipStore(){
        return this.shipStore;
    }

    /**
     * This method returns the Position app.domain.store used by the company
     * @return the parameter category app.domain.store
     */

    public PositionStore getPositionStore(){
        return this.positionStore;
    }
}
