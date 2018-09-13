import java.util.Scanner;

public class NameGames {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String vowelName;
		String fName = scanner.nextLine();
		while(fName.length() < 1){
			System.out.print("Enter your first name: ");
			fName = scanner.nextLine();
		}
		System.out.print("Enter your last name: ");
		String lName = scanner.nextLine();
				while(lName.length() < 1){
					System.out.print("Enter your last name: ");
					lName = scanner.nextLine();
		}
		String lowerFName = fName.toLowerCase();
		String lowerLName = lName.toLowerCase();
		if(fName.charAt(0) != 'a' && fName.charAt(0) != 'e' && fName.charAt(0) != 'i' && fName.charAt(0) != 'o' && fName.charAt(0) != 'u'){
			vowelName = fName.substring(1,fName.length());
		} else{
			vowelName = fName;
		}

		System.out.println("Hello " + fName + "!");
		System.out.println("Hello " + lName.charAt(0) + fName.substring(1,fName.length()) + " " + fName.charAt(0) + lName.substring(1, lName.length()) + "!");
		System.out.println("Your name is " + fName.length() + " letters long.");
		System.out.println("Your name starts with a " + fName.charAt(0) + ".");
		System.out.println("The letter " + fName.charAt(fName.length()/2) + " is at the center of your name.");
		System.out.println("Your name ends with a " + fName.charAt(fName.length() - 1) + ".");

		System.out.println("Some good usernames would be: " + lowerLName + lowerFName.charAt(0) + ", " + lowerFName + lowerLName.charAt(0) + ", " + lowerLName + lowerFName.charAt(0) + lowerFName.charAt(1) + ", " + lowerFName + lowerLName.charAt(0) + lowerLName.charAt(1) + ".");

		System.out.println(fName + ", " + fName + ",  bo-b" + vowelName);
		System.out.println("Bonana-fanna fo-f" + vowelName);
		System.out.println("Fee fi mo-m" + vowelName);
		System.out.println(fName + "!");

		System.out.println("Goodbye " + fName + "!");
	}
}