package _06_How_Many_Are_Smaller_Than_Me;

import java.util.ArrayList;

import _00_Intro_to_Linked_Lists.Node;
import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

    /*
     * Given an AVLTree filled with the random numbers from 1 to 20, and a
     * single number within the AVL Tree, figure out how many numbers in the
     * AVLTree are smaller than the provided number and return the result.
     * 
     * You may want to create a helper method to search through the AVLTree and
     * count iteratively or recursively.
     */
	int counter = 0;
    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
    	
    	countLessThanNum(avlTree.getRoot(), me);
        return counter;

    }
    
	private void countLessThanNum(AVLNode<Integer> node, int me) {
		// TODO Auto-generated method stub
		if(node.getValue() < me) {
			counter++;
		}
		if(node.getLeft() != null) {
			countLessThanNum(node.getLeft(), me);
		}
		if(node.getRight() != null) {
			countLessThanNum(node.getRight(), me);
		}
	
		
		
	}
//    public static Node<Integer> recursiveSearch(AVLTree<Integer> avlTree, int me, Node root) {
//    	boolean tester = true;
//    	int counter = 0;
//    	AVLNode<Integer> currentLeft = avlTree.getRoot().getLeft();
//    	AVLNode<Integer> currentRight = avlTree.getRoot().getRight();
//    	ArrayList<Integer> amounts = new ArrayList();
//    	
//    	if(avlTree.getRoot().getValue() < me) {
//    		currentRight = currentRight.getLeft();
//    		if(currentRight.getValue() < me) {
//    			
//    		}
//    	}
//  
//    		amounts.add(currentLeft.getValue());
//    		if(currentLeft.getLeft().getValue() != null) {
//    			currentLeft = currentLeft.getLeft();
//    			
//    		}
//    		if(currentLeft.getLeft().getValue() == null) {
//    			currentLeft = currentLeft.getRight();
//    			
//    		}
//    		
//		return null;
//    	
//    }



}
