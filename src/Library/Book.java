
package Library;

import java.util.Scanner;
import Library.library;
public class Book extends user {
	    Scanner in =new Scanner(System.in);
		String tittle;
		String author;
		String isbn;
		String genre;
		int count;
		boolean availablity;
		Book(){}
		Book(String t,String a,String i,String g,int j){
			tittle=t;
			author=a;
			isbn=i;
			genre=g;
			count =j;}
		Book(String h)throws Exception{
			System.out.println("Enter the Tittle");
			tittle=in.nextLine();
			System.out.println("Enter Name of author");
			author=in.nextLine();
			System.out.println("Enter ISBN No");
			isbn=in.nextLine();
			System.out.println("Enter Genre of the book");
			genre=in.nextLine();
			System.out.println("Enter the number of copies:");
			count=in.nextInt();
			}
		}
	
	

