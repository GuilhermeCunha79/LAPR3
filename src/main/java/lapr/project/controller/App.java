package lapr.project.controller;

//import lapr.project.auth.AuthFacade;
//import lapr.project.auth.UserSession;
import lapr.project.model.Company;
import lapr.project.utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */

public class App {

    private Company company;
    //private AuthFacade authFacade;

    private App()
    {
        Properties props = getProperties();
        this.company = new Company(props.getProperty(Constants.PARAMS_COMPANY_DESIGNATION));
       // this.authFacade = this.company.getAuthFacade();
        //bootstrap();
    }

    public Company getCompany()
    {
        return this.company;
    }


    /*public UserSession getCurrentUserSession()
    {
        return this.authFacade.getCurrentUserSession();
    }*/

    /*public boolean doLogin(String email, String pwd)
    {
        return this.authFacade.doLogin(email,pwd).isLoggedIn();
    }

    public void doLogout()
    {
        this.authFacade.doLogout();
    }*/

    private Properties getProperties()
    {
        Properties props = new Properties();

        // Add default properties and values
        props.setProperty(Constants.PARAMS_COMPANY_DESIGNATION, "Many Labs");


        // Read configured values
        try
        {
            InputStream in = new FileInputStream(Constants.PARAMS_FILENAME);
            props.load(in);
            in.close();
        }
        catch(IOException ex)
        {

        }
        return props;
    }

/*
    private void bootstrap() {
        this.authFacade.addUserRole(Constants.ROLE_HUMAN_RESOURCES, Constants.ROLE_HUMAN_RESOURCES);
        this.authFacade.addUserRole(Constants.ROLE_CLIENT, Constants.ROLE_CLIENT);
        this.authFacade.addUserRole(Constants.ROLE_FLEET_MANAGER, Constants.ROLE_FLEET_MANAGER);
        this.authFacade.addUserRole(Constants.ROLE_TRAFFIC_MANAGER, Constants.ROLE_TRAFFIC_MANAGER);
        this.authFacade.addUserRole(Constants.ROLE_WAREHOUSE_MANAGER, Constants.ROLE_WAREHOUSE_MANAGER);
        this.authFacade.addUserRole(Constants.ROLE_WAREHOUSE_STAFF, Constants.ROLE_WAREHOUSE_STAFF);
        this.authFacade.addUserRole(Constants.ROLE_PORT_STAFF, Constants.ROLE_PORT_STAFF);
        this.authFacade.addUserRole(Constants.ROLE_PORT_MANAGER, Constants.ROLE_PORT_MANAGER);
        this.authFacade.addUserRole(Constants.ROLE_SHIP_CAPTAIN, Constants.ROLE_SHIP_CAPTAIN);
        this.authFacade.addUserRole(Constants.ROLE_SHIP_CHIEF_ELETRICAL_ENGINEER, Constants.ROLE_SHIP_CHIEF_ELETRICAL_ENGINEER);
        this.authFacade.addUserRole(Constants.ROLE_TRUCK_DRIVER, Constants.ROLE_TRUCK_DRIVER);

        this.authFacade.addUserWithRole("Human Resources", "human@lei.sem2.pt", "123456", Constants.ROLE_HUMAN_RESOURCES);
    }*/

    // Extracted from https://www.javaworld.com/article/2073352/core-java/core-java-simply-singleton.html?page=2
    private static App singleton = null;
    public static App getInstance()
    {
        if(singleton == null)
        {
            synchronized(App.class)
            {
                singleton = new App();
            }
        }
        return singleton;
    }
}
