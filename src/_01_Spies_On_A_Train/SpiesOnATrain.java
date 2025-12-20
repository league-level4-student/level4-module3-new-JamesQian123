package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
	TrainCar traincar;
	String answer;
	String culprit;
	String[] named;
	int namecount = 0;
	String largestcount;
	int y;
	ArrayList<String> names = new ArrayList();
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	for(int i = 0; i < clues.length; i++) {
    		//System.out.println(clues[i]);
    	}
    	Node<TrainCar> current = train.getHead();
    	while(current!=null){
    		traincar = current.getValue();
    		answer = traincar.questionPassenger();
    		for(int i =0; i < clues.length; i++) {
    			if(answer.contains(clues[i])) {
    				culprit = answer.substring(answer.indexOf("I saw ")+6);
    				named = culprit.split(" ");
    				names.add(named[0]);
    				System.out.println(named[0]);
    			}
    		}
    		HashMap<String,Integer> count = new HashMap<String,Integer>();
    		for( String name: names){
    			if(!count.containsKey(name)) {
    				count.put(name,1);
    			}
    			else {
    				count.put(name,count.get(name)+1);
    			}
    		}
    		for(String name: count.keySet()) {
    			if(count.get(name) > namecount) {
    				namecount = count.get(name);
    				largestcount = name;
    			}
    		}
    		//System.out.println(answer);
    		//System.out.println(names);
    		current = current.getNext();    	
    		}
        return largestcount;

    }

}
