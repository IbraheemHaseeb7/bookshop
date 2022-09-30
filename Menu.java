import java.util.Scanner;

public class Menu {
    
    int option;
    Book booksArray[] = new Book[500];
    Shop shop = new Shop(booksArray);

    public String showOptions() {
        System.out.println(Shop.bookCounter);

        return String.format("1. Add new Book\n2. Search one Book\n3. Sell One Book\n4. Print All Book\n5. Terminate\n6. See Revenue\n");

    }

    public void setOption(int option) {
        this.option = option;
        switch (option) {
            case 1:
                AddNewBook();
                break;
            case 2:
                searchOneBook();
                break;
            case 3:
                sellOneBook();
                break;
            case 4:
                printAllBooks();
                break;
            case 5:
                terminate();
                break;
            case 6:
                showRevenue();
                break;
        }
    }

    public void printAllBooks() {
        System.out.printf("%s %20s %20s %20s %23s\n", "TITLE", "PRICE", "ISBN", "AUTHOR NAME", "EMAIL");
        
        for (int counter = 0; counter < Shop.bookCounter; counter++) {
            System.out.println(shop.getBooks()[counter].getAllData());
        }
    }

    public void AddNewBook() {
        shop.getBooks()[Shop.bookCounter] = makeBook();
        Shop.bookCounter++;
    }
    
    public void searchOneBook() {
        String ISBN = takeISBN();
        System.out.printf("%s %20s %20s %20s %23s\n", "TITLE", "PRICE", "ISBN", "AUTHOR NAME", "EMAIL");
        System.out.println(linearSearch(ISBN).getAllData());
    }

    public void sellOneBook() {
        Book search = linearSearch(takeISBN());
        Shop.revenue = Shop.revenue + search.getPrice();
        Shop.bookCounter--;
    }

    public void terminate() {
        System.out.println("\n\n\tThank you for using my program...\n\n");
    }

    public void showRevenue() {
        System.out.println("Revenue Generated: $" + Shop.revenue);
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
