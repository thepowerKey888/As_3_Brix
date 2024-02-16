public class SLNode {
    public static Book book;
    public static SLNode next;
    public SLNode(Book book){

        this.book = book;
        this.next = null;
    }

    public Book getBook(){
        return book;
    }
    public SLNode getNext(){
        return next;
    }
    public void setNext(SLNode next){
        this.next = next;
    }
}
