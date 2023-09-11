package menus;
import java.util.Scanner;

import features.FileAddition;
import features.FileDeletion;
import features.FileSearch;

public class SubMenu {
	
	public static void addDel() throws Exception {
		System.out.println("Please select your option");
		Scanner sc= new Scanner(System.in);
		while (true) {
		System.out.println("1. Add new file");
		System.out.println("2. Delete existing file");
		System.out.println("3. Search for specific file");
		System.out.println("4. Return to Main Menu");
		try {
		int subopt = sc.nextInt();
		switch (subopt) {
		case 1: FileAddition.addFile();
		break;
		case 2: FileDeletion.delFile();
			break;
		case 3: FileSearch.searchFile();
			break;
		case 4: MainMenu.menuOptions();
		break;
		default:
			System.out.println("Wrong option! Please select 1, 2, 3, or 4.");
		}}
		catch(Exception e) {
			System.out.println(("Invalid option! Please select 1, 2, 3, or 4."));
			sc.nextLine();
			continue;
		}
	}	
}}
