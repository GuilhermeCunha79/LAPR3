/*package app.ui;

import lapr.project.app.controller.AuthController;
import app.ui.app.domain.utils.Utils;
import app.app.domain.utils.Constants;
import lapr.project.auth.mappers.dto.UserRoleDTO;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;


/**
 * @author Paulo Maio <pam@isep.ipp.pt>
 *//*

public class AuthUI implements Runnable {
    private AuthController ctrl;

    public AuthUI() {
        ctrl = new AuthController();
    }

    public void run() {
        boolean success = doLogin();

        if (success) {
            List<UserRoleDTO> roles = this.ctrl.getUserRoles();
            if ((roles == null) || (roles.isEmpty())) {
                Utils.printToConsole("User has not any role assigned.");
            } else {
                UserRoleDTO role = selectsRole(roles);
                if (!Objects.isNull(role)) {
                    List<MenuItem> rolesUI = getMenuItemForRoles();
                    this.redirectToRoleUI(rolesUI, role);
                } else {
                    Utils.printToConsole("User did not select a role.");
                }
            }
        }
        this.logout();
    }

    private List<MenuItem> getMenuItemForRoles() {
        List<MenuItem> rolesUI = new ArrayList<>();
        //rolesUI.add(new MenuItem(Constants.ROLE_HUMAN_RESOURCES, new HumanResourcesUI()));
        //rolesUI.add(new MenuItem(Constants.ROLE_CLIENT, new ClientUI()));
        //rolesUI.add(new MenuItem(Constants.ROLE_TRAFFIC_MANAGER, new TrafficManagerUI()));
        return rolesUI;
    }

    private boolean doLogin() {
        Utils.printToConsole("\nLogin UI:");

        int maxAttempts = 3;
        boolean success = false;
        do {
            maxAttempts--;
            String id = Utils.readLineFromConsole("Enter UserId/Email: ");
            String pwd = Utils.readLineFromConsole("Enter Password: ");

            success = ctrl.doLogin(id, pwd);
            if (!success) {
                Utils.printToConsole("Invalid UserId and/or Password. \n You have  " + maxAttempts + " more attempt(s).");
            }

        } while (!success && maxAttempts > 0);
        return success;
    }

    private void logout() {
        ctrl.doLogout();
    }

    private void redirectToRoleUI(List<MenuItem> rolesUI, UserRoleDTO role) {
        boolean found = false;
        Iterator<MenuItem> it = rolesUI.iterator();
        while (it.hasNext() && !found) {
            MenuItem item = it.next();
            found = item.hasDescription(role.getDescription());
            if (found)
                item.run();
        }
        if (!found)
            Utils.printToConsole("There is no UI for users with role '" + role.getDescription() + "'");
    }

    private UserRoleDTO selectsRole(List<UserRoleDTO> roles) {
        if (roles.size() == 1)
            return roles.get(0);
        else
            return (UserRoleDTO) Utils.showAndSelectOne(roles, "Select the role you want to adopt in this session:");
    }


}*/
