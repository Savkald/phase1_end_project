package menus;
import java.util.Scanner;

public class ReturnMenu {

	public static void menuReturn() throws Exception {	
		Scanner sc= new Scanner(System.in);
		System.out.println("");
		System.out.println("What do you want to do now?");
		
		while(true) {
			System.out.println("1.Return to Main Menu");
			System.out.println("2.Exit app?");
		try {
		int sel =sc.nextInt();
		if (sel==1) {
		MainMenu.menuOptions();
		}else if (sel==2) {
		System.out.println("Thank you for using LockedMe.com");
		System.exit(0);}
		else {
			System.out.println("Wron option. Please select 1 or 2");
		}}
	catch(Exception e) {
		System.out.println("Invalid option. Please selct 1 or 2");
		sc.nextLine();
		continue;
	}
}}}
