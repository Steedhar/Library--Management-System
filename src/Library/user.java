package Library;

import java.util.*;

public class user {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter Username");
		String username = in.nextLine();
		System.out.println("Welcome!!! " + username);
		String ad = "Admin";
		String needbook;

		library l = new library();
		int choice;
		do {
			System.out.println("1.Print the books in the Library");
			System.out.println("2.Add book in the library");
			System.out.println("3.withdraw book from the library");
			System.out.println("4.Enter 4 to exit");
			System.out.println("Enter the your request ");
			choice = in.nextInt();
			in.nextLine();
			switch (choice) {
			case 1: {
				l.print();
				break;
			}
			case 2: {
				if (username.equals(ad)) {
					l.addBook();
					break;
				} else {
					System.out.println("Sorry!!,You not have access");
					break;
				}
			}
			case 3: {
				System.out.println("Enter the book you need");
				needbook = in.nextLine();
				l.available(needbook);
			}
			case 4: {
				System.out.println("Thank You!, Come again" + "\n" + "         -By Library Management");
				break;
			}
			default: {
				System.out.println("You were entered wrong option");
				break;
			}
			}
		} while (choice != 4);
		in.close();
	}

}
