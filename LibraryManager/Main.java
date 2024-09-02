package demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   
	        while (true) {
	        Scanner sc=new Scanner(System.in); 
	        System.out.println("---------------------------");
	        System.out.println("Library Management System ");
	        System.out.println("1.Add Book \n2.List Book \n3.Search Books \n4.Exit");
	        System.out.print("Choice an option: ");
	        int choice =sc.nextInt();
	        System.out.println("---------------------------");
	        if (choice==1) {
	            System.out.println("Enter Id: ");
	            int id=sc.nextInt(); 
	            System.out.println("Enter your Title : ");
	            String title=sc.next();
	            System.out.println("Enter your Auther : ");
	            String author=sc.next();
	            Book b=new Book(id,title,author);
	            LibraryManager.add(b);
	        }else if(choice==2){
	            LibraryManager.Listbooks();
	        }else if(choice==3){
	            System.out.println("Enter Scarch Query : ");
	            String query=sc.next();
	            LibraryManager.searchBooks(query);

	        }
	        sc.close();}
	       
	    }

	}

