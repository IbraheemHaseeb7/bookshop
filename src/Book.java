public class Book {
    private String ISBN, title;
    private int price;
    Author author;

    public Book(int price, String ISBN, String title, Author author) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }
    public String getISBN() {
        return this.ISBN;
    }
    public String getTitle() {
        return this.title;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBookData() {
        return String.format("%s %20d %20s", this.title, this.price, this.ISBN);
    }
    public String getAllData() {
        return String.format("%s %20d %20s %20s %s %20s", this.title, this.price, this.ISBN, author.getFname(), author.getLname(), author.getEmail());
    }
}