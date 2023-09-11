package features;
import java.io.File;
import java.util.Scanner;

import messages.DelMessages;

public class FileDeletion {
	
	public static void delFile() throws Exception {
		File path = new File("/home/savvaskalderisv/eclipse-workspace/LockedMe.com/Hobbits");
		String Hobbits = path.getPath();
		Scanner sc = new Scanner (System.in);
		
		while(true) {
		System.out.println("Please enter the filename you want to delete from folder Hobbits");
		
		String filename = sc.next();
		String newfilepath = Hobbits + "/"+filename;
		path =new File(newfilepath);
		if (!path.exists()) {
			System.out.println("File "+filename +" doesn't exist in the folder Hobbits. Please");
	DelMessages.menuDel();
		}else {
		path.delete();
			System.out.println(""+filename +" deleted and removed from folder Hobbits");
			System.out.println("What do you want to do?");
			DelMessages.menuDel();
		}
	}}}
