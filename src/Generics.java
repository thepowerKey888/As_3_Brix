public class Generics<T> {

    public static void main(String args[]){

        AList booksList = new AList();
        SLList booksSLList = new SLList();
        DLList booksDLList = new DLList();

        Book book1 = new Book("Wireless Networks", "Anke Berr", 14.99);
        Book book2 = new Book("Creme Waffles for Dummies", "Piro Lane", 24.79);

        booksList.toString(); //prints empty

        //adding books to AList
        booksList.listAdd(book1);
        booksList.listAdd(book1);
        booksList.listAdd(book2);
        booksList.listAdd(book1);

        //adding books to SLList
        booksSLList.listAdd(book1);
        booksSLList.listAdd(book1);
        booksSLList.listAdd(book2);
        booksSLList.listAdd(book1);

        //adding books to DLList
        booksDLList.listAdd(book1);
        booksDLList.listAdd(book1);
        booksDLList.listAdd(book2);
        booksDLList.listAdd(book1);

        booksList.listRemove(1);
        booksSLList.listRemove(1);
        booksDLList.listRemove(1);

        //printing
        booksList.toString();
        booksSLList.toString();
        booksDLList.toString();

        System.out.println("");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1);

    }
}
