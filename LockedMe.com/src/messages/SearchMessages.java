package messages;
import java.util.Scanner;

import features.FileSearch;
import menus.MainMenu;
import menus.SubMenu;

public class SearchMessages {
	
	public static void menuSrc() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Search another file");
		System.out.println("2.Return to previous menu");
		System.out.println("3.Return to Main Menu");
	while(true) {
	try {	
		int subop = sc.nextInt();
	switch (subop) {
	case 1: FileSearch.searchFile();
	break;
	case 2: SubMenu.addDel();
	break;
	case 3: MainMenu.menuOptions();
	break;
	default: 
			System.out.println("Wrong option! Please select 1, 2, or 3.");
}}
catch (Exception e) {
System.out.println("Invalid option. Pelase select 1, 2, or 3.");
sc.nextLine();
continue;
	}
}}}



