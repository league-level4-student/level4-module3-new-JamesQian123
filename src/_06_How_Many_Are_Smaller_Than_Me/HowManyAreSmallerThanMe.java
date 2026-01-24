package _06_How_Many_Are_Smaller_Than_Me;

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

    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
    	
    	
        return 0;

    }
    public static Node<Integer> recursiveSearch(AVLTree<Integer> avlTree, int me) {
    	boolean tester = true;
    	int counter = 0;
    	AVLNode<Integer> currentLeft = avlTree.getRoot().getLeft();
    	AVLNode<Integer> currentRight = avlTree.getRoot().getRight();
    	for(int i = 0; i< avlTree.)
    	if(currentLeft.getValue() > me) {
			//do this
    		counter++;
    		
		}
		else if(avlTree.getRoot().getRight().getValue() < me) {
			//do this
		}
    	while(tester) {
    		if(avlTree.getRoot().getLeft().getValue() > me) {
    			//do this
    		}
    		else if(avlTree.getRoot().getRight().getValue() < me) {
    			//do this
    		}
    	}
		return null;
    	
    }

}
