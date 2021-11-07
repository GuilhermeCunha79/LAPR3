package lapr.project.controller;

import lapr.project.model.Ship;
import lapr.project.utils.BST.CodeSearch;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DetailsShipController {
    CodeSearch codeSearch;


    public DetailsShipController(String fileName) throws FileNotFoundException {
        codeSearch = new CodeSearch(fileName);

    }

    public Ship searchByMMSI (int mmsi) throws IOException {
        return codeSearch.searchByMMSI(mmsi);
    }

    public Ship searchByIMO (String imo) throws IOException{
        return codeSearch.searchByIMO(imo);
    }

    public Ship searchByCallSign(String callSign) throws IOException{
        return codeSearch.searchCallSign(callSign);
    }
}

