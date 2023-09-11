package menus;
import java.util.Scanner;

import features.DisplayFiles;

public class MainMenu {
	
	public static void menuOptions() throws Exception {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please select your option");
	
		while(true) {
			System.out.println("1. Display all files");
			System.out.println("2. Add/Delete menu");
			System.out.println("3. Exit app");
try {
				int option = sc.nextInt();
					switch (option) {
						case 1: DisplayFiles.ascenOrd();
						ReturnMenu.menuReturn();;
						break;
						case 2: SubMenu.addDel();
						break;
						case 3: System.out.println("Thank you for using LockedMe.com");
						System.exit(0);
						break;
		 				default:
		 					System.out.println("Wrong option! Please select 1, 2, or 3.");
     }}
 catch (Exception e) {
     System.out.println("Invalid option. Pelase select 1, 2, or 3.");
     sc.nextLine();
 continue;

		}}
				
	
	}	}
	




