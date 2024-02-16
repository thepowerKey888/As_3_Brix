public class AList {
    private static Book[] array;
    private static int maxSize = 10;
    private static int size;

/**
 * This is an empty constructor that creates an empty array.
 * The array is initialized to a maxSize and a setting size set to 0.
 */
    public AList(){

        this.array = new Book[maxSize];
        this.size = 0;
    }
    /**
     * This method adds a new node with the given book to the AList
     * and resizes it when appropriate.
     * @param p New book to be added
     */
    public void listAdd(Book p){

        if(size == array.length){
            resize();
        }
        array[size++] = p;
    }
    private void resize(){

        int newSize = array.length*2;
        Book[] newArray = new Book[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    /**
     * Removes the item at position pos from the AList.
     * Moves items if necessary and updates the size.
     * @param pos position in the AList
     */
    public void listRemove(int pos){

        if(pos < 0 || pos > array.length){

            throw new IndexOutOfBoundsException();
        }

        for(int i = pos; i < size-1; i++){
            array[i] = array[i+1]; //shifts elements to left
        }

        array[size-1] = null; //remove the book from the array and decrement the size
        size--;
    }

    /**
     * Returns all the elemnts in the AList.
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
