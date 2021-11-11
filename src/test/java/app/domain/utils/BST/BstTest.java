package app.domain.utils.BST;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BstTest {

    Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
    int[] height = {0, 1, 2, 3, 3, 3, 3, 3, 3, 4};
    Integer[] inorderT = {7, 8, 10, 13, 15, 17, 20, 30, 40, 50};
    Integer[] preorderT = {20, 15, 10, 8, 7, 13, 17, 40, 30, 50};
    Integer[] posorderT = {7, 8, 13, 10, 17, 15, 30, 50, 40, 20};

    BST<Integer> instance;

    @Before
    public void setUp() {
        instance = new BST();
        for (int i : arr)
            instance.insert(i);
    }

    /**
     * Test of size method, of class BST.
     */
    @Test
    public void testSize() {
        Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
        BST<Integer> instance;
        instance = new BST<>();
        for (int i : arr)
            instance.insert(i);
        System.out.println("size");
        Assertions.assertEquals(instance.size(), arr.length, "size should be = 10");

        BST<String> sInstance = new BST<>();
        Assertions.assertEquals(sInstance.size(), 0, "size should be = 0");
        sInstance.insert("A");
        Assertions.assertEquals(sInstance.size(), 1, "size should be = 1");
        sInstance.insert("B");
        Assertions.assertEquals(sInstance.size(), 2, "size should be = 2");
        sInstance.insert("A");
        Assertions.assertEquals(sInstance.size(), 2, "size should be = 2");
    }

    /**
     * Test of insert method, of class BST.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int arr[] = {20, 15, 10, 13, 8, 17, 40, 50, 30, 20, 15, 10};
        BST<Integer> instance = new BST<>();
        for (int i = 0; i < 9; i++) {            //new elements
            instance.insert(arr[i]);
            Assertions.assertEquals(instance.size(), i + 1, "size should be = " + (i + 1));
        }
        for (int i = 9; i < arr.length; i++) {    //duplicated elements => same size
            instance.insert(arr[i]);
            Assertions.assertEquals(instance.size(), 9, "size should be = 9");
        }
    }

    /**
     * Test of remove method, of class BST.
     */
    @Test
    public void testRemove() {
        Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
        BST<Integer> instance;
        instance = new BST();
        for (int i : arr)
            instance.insert(i);
        System.out.println("remove");
        int qtd = arr.length;
        instance.remove(999);

        assertEquals("size should be = " + qtd, instance.size(), qtd);
        for (int i = 0; i < arr.length; i++) {
            instance.remove(arr[i]);
            qtd--;
            assertEquals("size should be = " + qtd, qtd, instance.size());
        }

        instance.remove(999);
        assertEquals("size should be = 0", 0, instance.size());
    }

    /**
     * Test of isEmpty method, of class BST.
     */
    @Test
    public void testIsEmpty() {
        Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
        BST<Integer> instance;
        instance = new BST<>();
        for (int i : arr)
            instance.insert(i);
        System.out.println("isempty");

        Assertions.assertFalse(instance.isEmpty(), "the BST should be NOT empty");
        instance = new BST<>();
        Assertions.assertTrue(instance.isEmpty(), "the BST should be empty");

        instance.insert(11);
        Assertions.assertFalse(instance.isEmpty(), "the BST should be NOT empty");

        instance.remove(11);
        Assertions.assertTrue(instance.isEmpty(), "the BST should be empty");
    }

    /**
     * Test of height method, of class BST.
     */
//    @Test
//    public void testHeight() {
//        System.out.println("height");
//
//        instance = new BST();
//        Assertions.assertEquals(instance.height(), -1, "height should be = -1");
//        for (int idx = 0; idx < arr.length; idx++) {
//            instance.insert(arr[idx]);
//            Assertions.assertEquals(instance.height(), height[idx], "height should be = " + height[idx]);
//        }
//        instance = new BST<>();
//        Assertions.assertEquals(instance.height(), -1, "height should be = -1");
//    }

    /**
     * Test of smallestelement method, of class TREE.
     */
    @Test
    public void testSmallestElement() {
        Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
        BST<Integer> instance;
        instance = new BST<>();
        for (int i : arr)
            instance.insert(i);
        System.out.println("smallestElement");
        Assertions.assertEquals(Integer.valueOf(7), instance.smallestElement());
        instance.remove(7);
        Assertions.assertEquals(Integer.valueOf(8), instance.smallestElement());
        instance.remove(8);
        Assertions.assertEquals(Integer.valueOf(10), instance.smallestElement());
    }

    /**
     * Test of processBstByLevel method, of class TREE.
     */
//    @Test
//    public void testProcessBstByLevel() {
//        Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
//        BST<Integer> instance;
//        instance = new BST();
//        for (int i : arr)
//            instance.insert(i);
//        System.out.println("processbstbylevel");
//        Map<Integer, List<Integer>> expResult = new HashMap<>();
//        expResult.put(0, Collections.singletonList(20));
//        expResult.put(1, Arrays.asList(15, 40));
//        expResult.put(2, Arrays.asList(10, 17, 30, 50));
//        expResult.put(3, Arrays.asList(8, 13));
//        expResult.put(4, Collections.singletonList(7));
//
//        Map<Integer, List<Integer>> result = instance.nodesByLevel();
//
//        for (Map.Entry<Integer, List<Integer>> e : result.entrySet())
//            Assertions.assertEquals(expResult.get(e.getKey()), e.getValue());
//    }


    /**
     * Test of inOrder method, of class BST.
     */
    @Test
    public void testInOrder() {
        Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
        BST<Integer> instance;
        instance = new BST<>();
        for (int i : arr)
            instance.insert(i);
        System.out.println("inOrder");
        List<Integer> lExpected = Arrays.asList(inorderT);
        Assertions.assertEquals(lExpected, instance.inOrder(), "inOrder should be " + lExpected.toString());
    }

    /**
     * Test of preOrder method, of class BST.
     */
//    @Test
//    public void testpreOrder() {
//        Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
//        BST<Integer> instance;
//        instance = new BST<>();
//        for (int i : arr)
//            instance.insert(i);
//        System.out.println("preOrder");
//        List<Integer> lExpected = Arrays.asList(preorderT);
//        Assertions.assertEquals(lExpected, instance.preOrder(), "preOrder should be " + lExpected.toString());
//    }

//    /**
//     * Test of posOrder method, of class BST.
//     */
//    @Test
//    public void testposOrder() {
//        Integer[] arr = {20, 15, 10, 13, 8, 17, 40, 50, 30, 7};
//        BST<Integer> instance;
//        instance = new BST<>();
//        for (int i : arr)
//            instance.insert(i);
//        System.out.println("posOrder");
//        List<Integer> lExpected = Arrays.asList(posorderT);
//        Assertions.assertEquals(lExpected, instance.posOrder(), "posOrder should be " + lExpected.toString());
//    }

}
