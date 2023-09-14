package features;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import messages.AddMessages;

public class FileAddition {
	
	public static void addFile() throws Exception{
		File path = new File("/home/savvaskalderisv/Desktop/phase1_end_project/LockedMe.com/Hobbits");
		String Hobbits = path.getPath();
		Scanner sc = new Scanner (System.in);
		
		while(true) {
		
		System.out.println("Please enter the filename you want to add to folder Hobbits");  // Please enter the path where you saved the folder Hobbits
		String filename = sc.next();
		String newfilepath = Hobbits + "/"+filename;
		path =new File(newfilepath);
		
		if (path.exists()){
			System.out.println("File already exists in the folder. Please");
	AddMessages.menuAdd();
		}else {
			path.createNewFile();
			System.out.println(""+filename +" created and added to folder Hobbits");
			System.out.println("What do you want to do?");	
			AddMessages.menuAdd();
			}	
		}
	}
}
		

