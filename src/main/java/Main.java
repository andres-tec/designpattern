import java.awt.DisplayMode;
import java.io.ObjectInputFilter.Status;
import java.util.Arrays;

import javax.sound.midi.VoiceStatus;

public class Main {

    public static void main(String[] args){
    	
    	Duck[] ducks= {
    			new Duck("Daffy", 8), 
				new Duck("Dewey", 2),
				new Duck("Howard", 7),
				new Duck("Louie", 2),
				new Duck("Donald", 10), 
				new Duck("Huey", 2)
    	}; 
       
    	System.out.println("BEFORE SORTING.");
    	display(ducks);
    	
    	Arrays.sort(ducks);
    	
    	System.out.println("\n After Sorting:");
    	display(ducks);
    	
    }
    
    public static void display(Duck[] ducks) {
    	for (Duck duck: ducks) {
    		System.out.println(duck);
    	}
    }
    
}
