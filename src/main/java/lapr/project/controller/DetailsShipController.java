package lapr.project.controller;

import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;
import lapr.project.utils.BST.CodeSearch;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DetailsShipController {
    CodeSearch codeSearch;


    public DetailsShipController(String fileName) throws IOException {
        codeSearch = new CodeSearch(fileName);

    }

    public Ship searchByMMSI (BST bst,int mmsi) throws IOException {
        return codeSearch.findShipMmsi(bst,mmsi);
    }

    public Ship searchByIMO(BST bst,String imo) throws IOException{
        return codeSearch.findShipImo(bst,imo);
    }

    public Ship searchByCallSign(BST bst, String callSign) throws IOException{
        return codeSearch.findShipCallSign(bst,callSign);
    }


}

