package lapr.project.utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEI-ESINF
 */
public class Utils {
    public static <E extends Comparable<E>> Iterable<E> sortByBST(List<E> listUnsorted){
        BST<E> tree = new BST<>();
        for (E element : listUnsorted) {
            tree.insert(element);
        }
        return  tree.inOrder();
    }
}

