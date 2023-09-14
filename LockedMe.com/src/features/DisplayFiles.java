package features;
import java.io.File;

import java.util.Arrays;


public class DisplayFiles {
	
	public static void ascenOrd() {
	System.out.println("");
	System.out.println("The available files in the folder Hobbits are:");
	System.out.println("(Note: Files are displayed in ascending order)");	
	File path = new File("/home/savvaskalderisv/Desktop/phase1_end_project/LockedMe.com/Hobbits"); // Please enter the path where you saved the folder Hobbits
	String Hobbits[] = path.list();
	Arrays.sort(Hobbits);
	
	for(String name:Hobbits) {
		System.out.println(name);
		}
	}
}