public class Main {

    public static void main(String[] args){

        AList alist = new AList();
        SLList sllist = new SLList();
        DLList dllist = new DLList();

        Book book1 = new Book("Wireless Networks", "Anke Berr", 14.99);
        Book book2 = new Book("Creme Waffles for Dummies", "Piro Lane", 24.79);

        //adding books to AList
        alist.listAdd(book1);
        alist.listAdd(book1);
        alist.listAdd(book2);
        alist.listAdd(book1);

        //adding books to SLList
        sllist.listAdd(book1);
        sllist.listAdd(book1);
        sllist.listAdd(book2);
        sllist.listAdd(book1);

        //adding books to DLList
        dllist.listAdd(book1);
        dllist.listAdd(book1);
        dllist.listAdd(book2);
        dllist.listAdd(book1);

        //removing
        alist.listRemove(0);
        sllist.listRemove(0);
        dllist.listRemove(0);


        //printing
        alist.toString();
        sllist.toString();
        dllist.toString();

        System.out.println("");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1);

    }
}
