public class DLList {
    public static DLNode head;
    private static int size = 0;
    private static Book[] array;

    /**
     * Empty constructor that creates an empty DLList.
     */
    public DLList(){

        this.head = null;
    }

    /**
     * Adds a new DLNode with given book to the DLList.
     * Updates pointers.
     * @param p
     */
    public void listAdd(Book p){

        DLNode new_node = new DLNode(p);
        if(head == null){

            head = new_node;
        }
        else{

            DLNode i = head; //set position i to the head
            while(i.next != null){

                i = i.next; //update the pointer
            }

            i.next = new_node;
        }
    }

    /**
     * Removes the item at position pos from the DLList.
     * Updates pointers.
     * @param pos
     */
    public static void listRemove(int pos){

        if(head == null){
            return;
        }
        if(pos == 0){
            head = head.getNext();
            return;
        }

        DLNode current = head;
        int index = 0;
        while(current != null && index < pos - 1){
            current = current.getNext();
            index++;
        }

        if(current == null){
            return;
        }

        DLNode preNode = current.getPrev();
        DLNode nextNode = current.getNext();

        if(preNode != null){
            preNode.setNext(nextNode);
        }

        if(nextNode != null){
            nextNode.setNext(preNode);
        }
    }

    /**
     * Returns a string containing all elements in DLList.
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
