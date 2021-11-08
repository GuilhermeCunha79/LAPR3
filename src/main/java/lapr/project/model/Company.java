/*package lapr.project.model;



import lapr.project.auth.AuthFacade;
import lapr.project.auth.domain.User;
import lapr.project.store.PositionStore;
import lapr.project.store.ShipStore;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.StringUtils;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
/*
public class Company {


    private String designation;
    private AuthFacade authFacade;

    private ShipStore shipStore = new ShipStore();
    private PositionStore positionStore = new PositionStore();


    /**
     * Constructor of the company class assigning a designation to it
     * @param designation of the company
     */
/*
    public Company(String designation)
    {
        if (StringUtils.isBlank(designation))
            throw new IllegalArgumentException("Designation cannot be blank.");

        this.designation = designation;
        this.authFacade = new AuthFacade();

        //setPositionStore();
        //setShipStore();
        setUserStore();

    }

    private void setUserStore() {
        try (FileInputStream input = new FileInputStream("data\\user.dat"); ObjectInputStream in = new ObjectInputStream(input)){
            Set<User> userList = new HashSet<>((Set<User>) in.readObject());
            this.authFacade.getUsers().setStore(userList);
        }catch (IOException | ClassNotFoundException e){
            e.getLocalizedMessage();
        }
    }
/*
    private void setShipStore() {
        try (FileInputStream input = new FileInputStream("data\\ship.dat"); ObjectInputStream in = new ObjectInputStream(input)) {
            List<Ship> lClient = (List<Ship>) in.readObject();
            this.shipStore.setClientList(lClient);
        } catch (IOException | ClassNotFoundException e) {
            e.getLocalizedMessage();
        }
    }

    private void setPositionStore() {
        try (FileInputStream input = new FileInputStream("data\\position.dat"); ObjectInputStream in = new ObjectInputStream(input)){
            List<PositionStore> lCALab = (List<PositionStore>) in.readObject();
            this.positionStore.setCALabList(lCALab);
        }catch (IOException | ClassNotFoundException e){
            e.getLocalizedMessage();
        }
    }
*/
/*
    /**
     * Method that returns the designation of the company
     * @return the designation of the company
     */
/*
    public String getDesignation() {
        return designation;
    }

    /**
     * This method returns the authentication facade of the company
     * @return the authentication facade
     *//*

    public AuthFacade getAuthFacade() {
        return authFacade;
    }

    /**
     * This method returns the parameter category store used by the company
     * @return the parameter category store
     *//*

    public ShipStore getShipStore(){
        return this.shipStore;
    }

    /**
     * This method returns the parameter store used by the company
     * @return the parameter store
     *//*

    public PositionStore getPositionStore(){
        return this.positionStore;
    }

}*/
