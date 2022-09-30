public class Shop {

    Book booksArray[] = new Book[500];
    static int bookCounter = 0; 
    static int revenue = 0;

    public Shop (Book[] booksArray) {
        this.booksArray = booksArray;
    }

    public Book[] getBooks() {
        return booksArray;
    }

    public void setBooks(Book[] booksArray) {
        this.booksArray = booksArray;
    }

    public void setOneBook(Book oneBook) {
        booksArray[bookCounter] = oneBook;
    }

    public Book searchByISBN(String ISBN) {

        Book findBook = new Book(0, "", "", new Author("", "", ""));

        for (int counter = 0; counter < bookCounter; counter++) {
            if (ISBN == booksArray[counter].getISBN()) {
                findBook = booksArray[counter];
            }
        }

        return findBook;
    }
}
