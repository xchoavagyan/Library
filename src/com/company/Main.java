package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    // region Task
        // Create a program `Library`
        //display a menu in console
        //-------------MENU-------------
        //PRESS 1 TO ADD BOOK
        //PRESS 2 TO VIEW BOOK
        //PRESS 3 FOR EXIT
        //------------------------------
        //Book has the following properties
        //	- Name
        //	- Author
        //	- Number of pages
        //	- genre
        //	- year
        //If input is 1
        //	request for the properties for the book ( please enter the name, please enter author ...)
        //	after properties are given create a book with that values and store it in your system
        //	and again display the menu
        //If input is 2
        //	Ask for book name (please enter book name)
        //	display that book details
        //	and again display the menu
        //If input is 3
        //	quit the program
        //in any other case
        //	display the menu

        //endregion

        // region Performace
        Scanner scanner = new Scanner(System.in);
        boolean displayMenu = true;
        Library library = new Library();
        while (displayMenu){
            System.out.println("-------------MENU-------------");
            System.out.println("PRESS 1 TO ADD BOOK");
            System.out.println("PRESS 2 TO VIEW BOOK");
            System.out.println("PRESS 3 FOR EXIT");
            System.out.println("------------------------------");
            int menuNumber = Integer.parseInt(scanner.nextLine());
            switch (menuNumber){
                case 1:
                    library.addBook();
                    break;
                case 2:
                    System.out.println("Please enter the Book Name");
                    String bookName = scanner.nextLine();
                    library.getBook(bookName);
                    break;
                case 3:
                    displayMenu = false;

            }
        }
        //endregion



    }
}
