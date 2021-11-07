package lapr.project.utils.BST;

import lapr.project.controller.DetailsShipController;
import lapr.project.controller.ImportShipsController;
import lapr.project.model.CallSignTree;
import lapr.project.model.IMOTree;
import lapr.project.model.MMSITree;
import lapr.project.model.Ship;
import lapr.project.utils.BST.BST;


import java.io.FileNotFoundException;
import java.io.IOException;


public class CodeSearch {

    private String fileName;
    private BST<Ship> mmsiTree;
    private BST<Ship> callSignTree;
    private BST<Ship> imoTree;

    public CodeSearch(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        //this.imoTree = new BST<>();
        //this.callSignTree = new BST<>();
        //this.mmsiTree = new BST<>();

        this.mmsiTree = ImportShipsController.importShips(fileName, "MMSI");
        this.callSignTree = ImportShipsController.importShips(fileName, "CallSign");
        this.imoTree = ImportShipsController.importShips(fileName, "IMO");

    }

    public BST<Ship> getImoTree() {
        return imoTree;
    }

    public BST<Ship> getMMSITree(){
        return mmsiTree;
    }

    public BST<Ship> getCallSignTree(){
        return callSignTree;
    }

    /**
     * Search a ship by his mmsi code
     * @param mmsi ship code
     * @return ship
     * @throws IOException
     */
    public Ship searchByMMSI(int mmsi) throws IOException {
        Ship sh = new MMSITree(mmsi);
        BST.Node<Ship> node = this.mmsiTree.find(this.mmsiTree.root(),sh);
        return node.getElement();
    }

    /**
     * Search a ship by his imo code
     * @param imo ship code
     * @return
     * @throws IOException
     */
    public Ship searchByIMO(String imo) throws IOException{
        Ship sh = new IMOTree(imo);
        BST.Node<Ship> node =this.imoTree.find(this.imoTree.root(),sh);
        return node.getElement();
    }

    /**
     * Search a ship by his call sign code
     * @param callSign ship code
     * @return
     * @throws IOException
     */
    public Ship searchCallSign (String callSign) throws IOException{
        Ship sh = new CallSignTree(callSign);
        BST.Node<Ship> node  = this.callSignTree.find(this.callSignTree.root(), sh);
        return node.getElement();
    }



/*
    public BST.Node searchByMMSI(int mmsiNumber, BST.Node<Ship> root){
        root = this.mmsi.root;

        // Base Cases: root is null or key is present at root
        if (root==null) {
            System.out.println("Key not found");
            return root;
        }

        // Key is greater than root's key
        if(root.getElement().getMmsi() < mmsiNumber){
            return searchByMMSI(mmsiNumber, root.getLeft());
        }

        // Key is smaller than root's key
        return searchByMMSI(mmsiNumber, root.getRight());

    }

    public BST.Node searchByIMO(String imoString, BST.Node<Ship> root){
            root = this.imo.root;

            // Base Cases: root is null or key is present at root
            if (root==null) {
                System.out.println("Key not found");
                return root;
            }

            // Key is greater than root's key
            if(root.getElement().getImo().compareTo(imoString) > 0){
                return searchByIMO(imoString, root.getLeft());
            }

            // Key is smaller than root's key
            return searchByIMO(imoString, root.getRight());
    }



    public BST.Node searchByCallSign (String callSignString, BST.Node<Ship> root){
        root = this.callSign.root;

        // Base Cases: root is null or key is present at root
        if (root==null) {
            System.out.println("Key not found");
            return root;
        }

        // Key is greater than root's key
        if(root.getElement().getImo().compareTo(callSignString) > 0){
            return searchByIMO(callSignString, root.getLeft());
        }

        // Key is smaller than root's key
        return searchByCallSign(callSignString, root.getRight());
    }

*/


}
