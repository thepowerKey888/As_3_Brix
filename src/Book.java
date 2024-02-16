public class Book {
    String title;
    String author;
    double price;
    public Book(String t, String a, double p){

        this.title = t;
        this.author = a;
        this.price = p;
    }

    public String toString(){

        return "Title: " + title + ", " + " Author " + author + ", " + " Price: " + price + "\n";
    }
}
