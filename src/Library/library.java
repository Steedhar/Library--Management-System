package Library;

import java.util.*;

public class library extends Book {

	public static ArrayList<Book> books = new ArrayList<Book>();
{
		Book b1=new Book("Think and Grow Rich","O","3","E",5);
		Book b2=new Book("The Night","K","3","E",5);
		Book b3=new Book("Believe in yourself","E","3","E",5);
		Book b4=new Book("You can","S","3","E",5);
		Book b5=new Book("Do it Today","H","3","E",5);
		books.add(0, b1);
		books.add(1, b2);
		books.add(2, b3);
		books.add(3, b4);
		books.add(4, b5);
	}
	Scanner in = new Scanner(System.in);

	public void addBook() throws Exception {
		char opt = 'A', opt1 = 'D';
		if (books.size() % 5 == 0) {
			System.out.println("Added Books  " + books.size() + " if you want to continue press Y else press N");
			opt = in.next().toUpperCase().charAt(0);
			opt1 = (opt == 'Y') ? 'Y' : 'N';
		}
		if (opt1 == 'Y' || books.size() % 5 != 0) {
			Book b1 = new Book("");
			books.add(b1);
		}
		if (opt1 == 'N') {
			System.out.println("Thank You for Adding Book");
			return;
		}
	}

	public void print() {
		System.out.println("//////Books in the Library////// ");
		int i = 1;
		for (Book bb : books) {
			System.out.println("S.No: " + i);
			System.out.println("Tittle: " + bb.tittle);
			System.out.println("Author: " + bb.author);
			System.out.println("ISBN No: " + bb.isbn);
			System.out.println("Genre: " + bb.genre);
			System.out.println("Number of Copies in Library :" + bb.count);
			System.out.println("***");
			i++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void available(String needbook) {
		int n = 0;
		boolean isavailable=true;
		for (Book bs : library.books) {
			
			if (needbook.equals(bs.tittle)) {
			     isavailable=false;
			     
				if (bs.count > 1) {
					System.out.println("Congrats!!! Book is available in the Library");
					n = bs.count--;
					System.out.println("Remaining " + (n - 1) + " Books in the Library");
					
				}  
			} 
		
		
			}
		if(isavailable) {
			
				System.out.println("You Entered Book is not available in the library");
		}

	
	}}