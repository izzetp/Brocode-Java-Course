public class Library {
    
    String name;
    int years;
    Book[] books;

    Library(String name, int years, Book[] books) {
        this.name = name;
        this.years = years;
        this.books = books;
    }

    void displayInfo() {
        System.out.println("The " + this.years + " " + this.name);
        System.out.println("Books Available: ");
        for (Book book: books) {
            System.out.println(book.displayInfo());
        }
    }    
}
