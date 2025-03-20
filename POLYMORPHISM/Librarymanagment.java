import java.util.*;

 class Media {
    String title;
    boolean isCheckedOut;

    Media(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }

   void checkOut();
  void returnMedia();
   void displayInfo();
}

class Book extends Media {
    String author;

    Book(String title, String author) {
        super(title);
        this.author = author;
    }


    void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Checked out: " + title);
        } else {
            System.out.println(title + " is already checked out.");
        }
    }


    void returnMedia() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Returned: " + title);
        } else {
            System.out.println(title + " was not checked out.");
        }
    }


    void displayInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Magazine extends Media {
    int issueNumber;

    Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }


    void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Checked out: " + title);
        } else {
            System.out.println(title + " is already checked out.");
        }
    }


    void returnMedia() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Returned: " + title);
        } else {
            System.out.println(title + " was not checked out.");
        }
    }


    void displayInfo() {
        System.out.println("Magazine: " + title + ", Issue: " + issueNumber);
    }
}

class DVD extends Media {
    int duration; // in minutes

    DVD(String title, int duration) {
        super(title);
        this.duration = duration;
    }


    void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Checked out: " + title);
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

 
    void returnMedia() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Returned: " + title);
        } else {
            System.out.println(title + " was not checked out.");
        }
    }


    void displayInfo() {
        System.out.println("DVD: " + title + ", Duration: " + duration + " minutes");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();// i did intialize an array named list to store the data ...
        mediaList.add(new Book("1984", "George Orwell"));
        mediaList.add(new Magazine("National Geographic", 202));
        mediaList.add(new DVD("Inception", 148));

        for (Media media : mediaList) {
            media.displayInfo();
            media.checkOut();
            media.returnMedia();
            System.out.println();
        }
    }
}
