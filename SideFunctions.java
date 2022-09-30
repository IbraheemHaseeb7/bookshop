import java.util.Scanner;

public class SideFunctions {

    Shop shop = Menu.shop;

    public void say() {
        System.out.println("hello world");
    }
    
    public Book linearSearch(String ISBN) {
        Book search = new Book(0, null, null, new Author(null, null, null));
        
        for (int counter = 0; counter < Shop.bookCounter; counter++) {
            if (this.shop.getBooks()[counter].getISBN().equals(ISBN)) {
                search = this.shop.getBooks()[counter];
            }
        }

        return search;
    }
    
    public String takeISBN() {
        Scanner input = new Scanner(System.in);
        String ISBN = input.nextLine();
        return ISBN;
    }
    
    public Book makeBook() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Price: ");
        int price = input2.nextInt();
        System.out.print("ISBN: ");
        String ISBN = input.nextLine();
        System.out.print("Title: ");
        String title = input.nextLine();
        System.out.print("First Name of Author: ");
        String fname = input.nextLine();
        System.out.print("Last Name of Author: ");
        String lname = input.nextLine();
        System.out.print("Email Address of Author: ");
        String email = input.nextLine();

        return new Book(price, ISBN, title, new Author(fname, lname, email));
    }

    public void removeFromArray(String ISBN) {
        // Book foundBook = new Book(0, "", "", new Author("", "", ""));

        for (int counter = 0; counter < Shop.bookCounter; counter++) {
            if (shop.getBooks()[counter].getISBN().equals(ISBN)) {
                shop.getBooks()[counter].setISBN(null);
                shop.getBooks()[counter].setPrice(0);
                shop.getBooks()[counter].setTitle(null);
                shop.getBooks()[counter].setISBN(null);
            }
        }

        Shop.bookCounter--;
    }
}
