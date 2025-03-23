abstract class Book {
    String title;
    int days;

    public Book(String title) {
        this.title = title;
        this.days = 0;
    }

    abstract void borrow();

    int getDays() {
        return days;
    }
}

class Novel extends Book {
    int pages;

    public Novel(String title, int pages) {
        super(title);
        this.pages = pages;
    }

    void borrow() {
        days = pages / 50;
    }
}

class Magazine extends Book {
    boolean new;

    public Magazine(String title, boolean new) {
        super(title);
        this.new = new;
    }

    void borrow() {
        if (new) {
            days = 7;
        } else {
            days = 3;
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Novel("Satya", 200);
        books[1] = new Magazine("Sai", true);

        for (int i = 0; i < books.length; i++) {
            books[i].borrow();
            System.out.println(books[i].title + " borrow days: " + books[i].getDays());
            System.out.println("------------------------");
        }
    }
}
