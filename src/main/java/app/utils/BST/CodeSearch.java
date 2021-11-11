package app.utils.BST;

import app.controller.ImportShipsController;
import app.model.Ship;
import app.store.ShipStore;


import java.io.IOException;


public class CodeSearch {
    private ShipStore shipStore;
    private final BST<Ship> mmsiTree;
    private final BST<Ship> callSignTree;
    private final BST<Ship> imoTree;

    ImportShipsController ctrl = new ImportShipsController();

    public CodeSearch(String fileName) throws IOException {
        //this.imoTree = new BST<>();
        //this.callSignTree = new BST<>();
        //this.mmsiTree = new BST<>();

        this.mmsiTree = ctrl.importShips(fileName, "MMSI");
        this.callSignTree = ctrl.importShips(fileName, "CallSign");
        this.imoTree = ctrl.importShips(fileName, "IMO");

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
   /* public Ship searchByMMSI(BST bstMMSI,int mmsi) throws IOException {
        Ship ship=new MMSITree(mmsi);
        BST.Node<Ship> node = bstMMSI.find(this.mmsiTree.root(),ship);
        return node.getElement();
    }*/

    public Ship findShipMmsi(BST<Ship> bst, int mmsi){
        Iterable<Ship> arvore= bst.preOrder();
        for(Ship ship : arvore){
            if(mmsi==ship.getMmsi()){
                return ship;
            }
        }
        return null;
    }
    /**
     * Search a ship by his imo code
     * @param imo ship code
     * @return
     * @throws IOException
     */

    /*public Ship searchByIMO(BST bst,String imo) throws IOException{
        Ship sh = new IMOTree(imo);
        BST.Node<Ship> node =this.imoTree.find(this.imoTree.root(),sh);
        return node.getElement();
    }
*/
    public Ship findShipImo(BST bst, String imo){
        Iterable<Ship> arvore= bst.preOrder();
        for(Ship ship : arvore){
            if(imo.compareTo(ship.getImo())==0){
                return ship;
            }
        }
        return null;
    }
    /**
     * Search a ship by his call sign code
    // * @param callSign ship code
     * @return
     * @throws IOException
     *//*
    public Ship searchCallSign (String callSign) throws IOException{
        Ship sh = new CallSignTree(callSign);
        BST.Node<Ship> node  = this.callSignTree.find(this.callSignTree.root(), sh);
        return node.getElement();
    }*/

    public Ship findShipCallSign(BST<Ship> bst, String imo){
        Iterable<Ship> arvore= bst.preOrder();
        for(Ship ship : arvore){
            if(imo.compareTo(ship.getCallSign())==0){
                return ship;
            }
        }
        return null;
    }


/*
    public Ship searchByMMSI(int mmsiNumber, BST.Node<Ship> root){
        root = this.mmsiTree.root;
        Ship ship;

        // Base Cases: root is null or key is present at root
        if (root==null) {
            System.out.println("Key not found");
            return root.getElement();
        }

        // Key is greater than root's key
        if(root.getElement().getMmsi() < mmsiNumber){
            ship= searchByMMSI(mmsiNumber, root.getLeft());
            return ship;
        }

        // Key is smaller than root's key
        ship=searchByMMSI(mmsiNumber, root.getRight());
        return ship;

    }
    /*

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
