public class MyBook extends Book {

    private String title, author;
    private int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ price);
    }

}