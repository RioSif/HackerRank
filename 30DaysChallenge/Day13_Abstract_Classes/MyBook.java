package Day13_Abstract_Classes;

class MyBook extends Book{
    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.printf("Title: %s\n", title);
        System.out.printf("Author: %s\n", author);
        System.out.printf("Price: %d\n", price);
    }
}