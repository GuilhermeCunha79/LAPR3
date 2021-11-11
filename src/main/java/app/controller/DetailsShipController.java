package app.controller;

import app.model.Company;
import app.model.Ship;
import app.store.ShipStore;
import app.utils.BST.CodeSearch;
import app.utils.DTO.ShipDTO;

import java.io.IOException;

public class DetailsShipController {

    private ShipStore shipStore;
    private Ship ship;
    CodeSearch codeSearch;


    public DetailsShipController() {
        this(App.getInstance().getCompany());
    }

    public DetailsShipController(Company company) {
        this.shipStore=company.getShipStore();
        this.ship=null;
    }

    public boolean newShip(ShipDTO dto) {
        this.ship = this.shipStore.newShip(dto);
        return this.shipStore.validateShip(ship);
    }

    public Ship searchByMMSI (int mmsi) throws IOException {
        this.ship=this.shipStore.getShipByMMSI(mmsi);
        return this.ship;
    }

    public Ship searchByIMO(String imo) throws IOException{
        this.ship=this.shipStore.getShipByImo(imo);
        return this.ship;
    }

    public Ship searchByCallSign(String callSign) throws IOException{
        this.ship=this.shipStore.getShipByCallSign(callSign);
        return this.ship;
    }


}

