public class SLList {
    private static SLNode head;
    private static int size = 0;
    private static Book[] array;
    /**
     * Empty constructor for the class SLList.
     */
    public SLList(){

        this.head = null;
    }
    /**
     * Adds a new SLNode with the given book
     * to the end of the SLList and updates
     * the pointers.
     * @param p
     */
    public void listAdd(Book p){

        SLNode new_node = new SLNode(p);
        if(head == null){
            head = new_node;
        }
        else{
            SLNode i = head; //setting the head at position i
            while(i.next != null){
               i = i.next; //update the pointer
            }

            i.next = new_node;
        }
    }
    /**
     * Removes the item at position pos from the SLList.
     * Updates pointers.
     * @param pos
     */
    public void listRemove(int pos){

        if(head == null){
            return;
        }

        if(pos == 0){
            head = head.getNext();
            return;
        }

        SLNode current = head;
        int index = 0;
        while(current != null && index < pos - 1){
            current = current.getNext();
        }

        if(current == null || current.getNext() == null){
            return;
        }
        current.setNext(current.getNext().getNext());
    }

    /**
     * Returns a string containing all
     * the elements in the SLL list.
     * @return
     */
    public String toString(){

        if(size == 0){
            System.out.println("List is empty");
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){

            sb.append(array[i].toString()).append("\n");
        }

        return sb.toString();
    }
}
