
package lapr.project.utils.BST;
import lapr.project.controller.ImportShipsController;
import lapr.project.model.MMSITree;
import lapr.project.model.Ship;
import java.io.IOException;


public class CodeSearch {
    private String fileName;

    private BST<Ship> mmsiTree;
    private BST<Ship> callSignTree;
    private BST<Ship> imoTree;

    public CodeSearch(String fileName) throws IOException {
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

    public BST<Ship> getMMSITree() {
        return mmsiTree;
    }

    public BST<Ship> getCallSignTree() {
        return callSignTree;
    }

    /**
     * Search a ship by his mmsi code
     *
     * @param mmsi ship code
     * @return ship
     * @throws IOException
     */
  /* public Ship searchByMMSI(BST bstMMSI,int mmsi) throws IOException {
        Ship ship=new MMSITree(mmsi);
        BST.Node<Ship> node = bstMMSI.find(this.mmsiTree.root(),ship);
        return node.getElement();
    }
*/

    public Ship findShipMmsi(BST bst, int mmsi) {
        Iterable<Ship> arvore = bst.preOrder();
        for (Ship ship : arvore) {
            if (mmsi == ship.getMmsi()) {
                return ship;
            }
        }
        return null;
    }





    /**
     * Search a ship by his imo code
     *
     * @param imo ship code
     * @return
     * @throws IOException
     */

   /* public Ship searchByIMO(BST bst,String imo) throws IOException{
        Ship sh = new IMOTree(imo);
        BST.Node<Ship> node =this.imoTree.find(this.imoTree.root(),sh);
        return node.getElement();
    }
    */

    public Ship findShipImo(BST bst, String imo) {
        Iterable<Ship> arvore = bst.preOrder();
        for (Ship ship : arvore) {
            if(imo.equals(ship.getImo())){
                return ship;
            }
            /*
            if (imo.compareTo(ship.getImo()) == 0) {
                return ship;
            }
            */

        }
        return null;
    }



    /**
     * Search a ship by his call sign code
     * // * @param callSign ship code
     *
     * @return
     * @throws IOException
     */
    /*public Ship searchCallSign (String callSign) throws IOException{
        Ship sh = new CallSignTree(callSign);
        BST.Node<Ship> node  = this.callSignTree.find(this.callSignTree.root(), sh);
        return node.getElement();
    }
   */
    public Ship findShipCallSign(BST bst, String callSign) {
        Iterable<Ship> arvore = bst.preOrder();
        for (Ship ship : arvore) {
            if (callSign.compareTo(ship.getCallSign()) == 0) {
                return ship;
            }
        }
        return null;
    }



   /* public Ship searchByMMSI(int mmsiNumber, BST.Node<Ship> root){
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

/*
    // Recursive function to search in a given BST
    public BST.Node<Ship> search(BST.Node root, int key, BST.Node parent) {
        // if the key is not present in the key
        if (root == null) {
            System.out.println("Key not found");
            return null;
        }

        // if the key is found
        if (root.getElement().hashCode() == key) {
            if (parent == null) {
                System.out.println("The node with key " + key + " is root node");
                return root;
            } else if (key < parent.getElement().hashCode()) {
                System.out.println("The given key is the left node of the node " +
                        "with key " + parent.getElement().hashCode());
                return parent;
            } else {
                System.out.println("The given key is the right node of the node " +
                        "with key " + parent.getElement().hashCode());
                return parent;
            }
        }
        // if the given key is less than the root node, recur for the left subtree;
        // otherwise, recur for the right subtree
        if (key < root.getElement().hashCode()) {
            search(root.getLeft(), key, root);
        } else {
            search(root.getRight(), key, root);
        }
        return parent;
    }

 */
}

