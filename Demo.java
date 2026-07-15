import java.util.Scanner;

class Book {
    private int bookid;
    private String title;
    private String author;

    public void setBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book id:");
        bookid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter book title:");
        title = sc.nextLine();
        System.out.println("Enter book author:");
        author = sc.nextLine();
    }

    public int getBookid() {
        return bookid;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}

class BookUtility {
    public static void displayBook(Book b) {
        System.out.println("Book Id:" + b.getBookid());
        System.out.println("Book title:" + b.getTitle());
        System.out.println("Book Author:" + b.getAuthor());
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        Book b1=new Book();
        Book b2=new Book();
        System.out.println("Book 1 details");
        b1.setBook();
        System.out.println("Book 2 details");
        b2.setBook();
        BookUtility.displayBook(b1);
        BookUtility.displayBook(b2);

    }
}