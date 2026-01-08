package _02_Rainbow_Zombie_Conga_Line;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class RainbowZombieCongaLine {
    
    /*
     * You are hosting a rainbow zombie conga dance party! Zombies are not very
     * smart(maybe that's why they crave brains) and need your help to direct
     * them through the choreography.
     * 
     * Each method is a dance move you will need to implement.
     * 
     * When you think you've gotten your zombies trained well enough you can
     * start the party by running the main method in RainbowZombieDanceParty and
     * typing how many rounds you want in the console to see if they followed
     * your choreography correctly.
     * 
     * Note: The party will always start with a rainbow brains and every 5
     * rounds the head and tail of the dance line will be removed.
     */

    private LinkedList<Zombie> congaLine;
    private ZombieHatColor[] zombieHats;

    public RainbowZombieCongaLine() {
    	
        congaLine = new LinkedList<Zombie>();
        zombieHats = ZombieHatColor.values();
        
    }

    // Make the passed in zombie the first Zombie in the conga line!
    public void engine(Zombie dancer) {
    	Node<Zombie> next = congaLine.getHead();
    	Node<Zombie> first = new Node<Zombie>(dancer);
    	congaLine.setHead(first);
    	if(congaLine.size()==1) {
    		congaLine.setTail(first);
    	}
    	first.setNext(next);
    	if(next!=null) {
    		next.setPrev(first);
    	}

    }

    // Make the passed in zombie the last Zombie in the conga line!
    public void caboose(Zombie dancer) {
    	Node<Zombie> prev = congaLine.getTail();
    	Node<Zombie> last = new Node<Zombie>(dancer);
    
    	last.setPrev(prev);
    	if(prev!=null) {
    		prev.setNext(last);
    	}
	congaLine.setTail(last);
    }

    // Place the zombie at the designated position in the conga line!
    public void jumpInTheLine(Zombie dancer, int position) {
    	Node<Zombie> prev = congaLine.getHead();
    	for(int i = 0; i < position; i++) {
    		prev = prev.getNext();
    	}
    	Node<Zombie> next = prev.getNext();
    	Node<Zombie> mid = new Node<Zombie>(dancer);
    	mid.setPrev(prev);
    	mid.setNext(next);
    	prev.setNext(mid);
    	if(next == null) {
    		congaLine.setTail(mid);
    	}
    	else {
    		next.setPrev(mid);
    	}
 
    }

    /*
     * Remove all zombies with the same hat color as the passed in zombie from
     * the conga line!
     */
    public void everyoneOut(Zombie dancer) {
    	//Node<Zombie> color = new Node<Zombie>(dancer);
    	Node<Zombie> current = congaLine.getHead();
    	//Node<Zombie> next = congaLine.getHead().getNext();
    	ZombieHatColor colorToRemove = dancer.getZombieHatColor();
    	int counter = 0;
    	while(current != null){
    		if(colorToRemove == current.getValue().getZombieHatColor()) {
    			congaLine.remove(counter);
    		}
    		else {
    			current = current.getNext();
    			counter++;
    		}
    		

    	}
    	
    }
    
    public Node<Zombie> getNode(int position){
    	Node<Zombie> current = congaLine.getHead();
    	int counter = 0;
    	while(counter != position) {
    		current = current.getNext();
    		counter++;
    	}
    	
    	return current;
    }

    /*
     * Remove the first zombie with the same hat color as the passed in zombie
     * from the conga line!
     */
    public void youAreDone(Zombie dancer) {
    	ZombieHatColor colorToRemove = dancer.getZombieHatColor();
    	Node<Zombie> inputZom = new Node<Zombie>(dancer);
    	Node<Zombie> current = congaLine.getHead();
    	Node<Zombie> after = congaLine.getHead().getNext();
    	for(int i = 0; i < congaLine.size(); i++) {
    		if(colorToRemove == current.getValue().getZombieHatColor()) {
    			congaLine.remove(i);
    			break;
    		}
    		else {
    			current = current.getNext();
    	}
    	}
    		
    }

    /*
     * Make two more zombies with the same hat color as the passed in zombie and
     * add one to the front, one to the end and one in the middle.
     */
    public void brains(Zombie dancer) {
    	engine(dancer);
    	caboose(dancer);
    	jumpInTheLine(dancer,congaLine.size()/2);
    	
    	
    	
    }

    /*
     * Add the passed in zombie to the front and then add one zombie of each hat
     * color to the end of the line.
     */
    public void rainbowBrains(Zombie dancer) {
    	engine(dancer);
    	
    	Zombie zombieRed = new Zombie(ZombieHatColor.R);
    	Zombie zombieOrange = new Zombie(ZombieHatColor.O);
    	Zombie zombieYellow = new Zombie(ZombieHatColor.Y);
    	Zombie zombieGreen = new Zombie(ZombieHatColor.G);
    	Zombie zombieBlue = new Zombie(ZombieHatColor.B);
    	Zombie zombieIndigo = new Zombie(ZombieHatColor.I);
    	Zombie zombieViolet = new Zombie(ZombieHatColor.V);
    	
    	caboose(zombieRed);
    	caboose(zombieOrange);
    	caboose(zombieYellow);
    	caboose(zombieGreen);
    	caboose(zombieBlue);
    	caboose(zombieIndigo);
    	caboose(zombieViolet);

    }

    public LinkedList<Zombie> getCongaLine() {
        return congaLine;
    }
}
