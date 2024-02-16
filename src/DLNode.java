public class DLNode {
    public static Book book;
    public static DLNode next;
    public static DLNode previous;
    public DLNode(Book book){

        this.book = book;
        this.next = null;
        this.previous = null;
    }

    public Book getBook(){
        return book;
    }
    public DLNode getNext(){
        return next;
    }
    public void setNext(DLNode next){
        this.next = next;
    }
    public DLNode getPrev(){
        return previous;
    }
}
