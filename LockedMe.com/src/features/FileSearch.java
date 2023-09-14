package features;
import java.io.File;
import java.util.Scanner;

import messages.SearchMessages;

public class FileSearch {

	
public static void searchFile() throws Exception {
	
	File path = new File("/home/savvaskalderisv/Desktop/phase1_end_project/LockedMe.com/Hobbits");  // Please enter the path where you saved the folder Hobbits
	String Hobbits = path.getPath();
	Scanner sc = new Scanner (System.in);
	
	while(true) {
		
	System.out.println("Please enter the filename you want to search in folder Hobbits");
	String filename = sc.next();
	String newfilepath = Hobbits + "/"+filename;
	path =new File(newfilepath);
	
	if (path.exists()) {
		System.out.println("File "+filename +" exists in the folder Hobbits");
		System.out.println("What do you want to do?");
		SearchMessages.menuSrc();
		}
	else {
		System.out.println("File "+filename +" doesn't exist in the folder Hobbits. Please");
		SearchMessages.menuSrc();	
			}
		}
	}
}
