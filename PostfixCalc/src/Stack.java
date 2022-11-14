//preity singh
//my Stack class!
public class Stack <E>{

    private int size= 0; //size variable
    private Node<E> top =  null; //Node that references the current top at the moment

    public Stack(){
        //empty constructor
    }

    public Node<E> push(E data)   {
        //the push method adds a new element on top of the stack
        top = new Node<E>(data,top); //the old top is now the child of the new top
        return top;
    }
    public  E pop() {
        //the pop method removes and return the top element
        E data = null;

        if(isEmpty()){
            return null;
        } else {
            data = top.getData();
            Node<E> oldData = top; //creates a new node with the top element that is removed
            top  = oldData.getChild(); //the new top is the child of the old one
            oldData.setChild(null); //the old top has no child/link; it's cut off
        }
        return data;
    }

    public boolean isEmpty(){
        //check to see if this stack is empty
        return top == null;
    }

    public int size() {
        //size methods returns the size of the stack, pretty self-explanatory
        int counter = 1;
        if (top != null) { //if there is at least one object in the Stack
            Node<E> current = top;
            while (current.getChild() != null) { //loops until the last Node in the list is found (Node w/o child)
                counter++; //updates number of nodes in list
                current = current.getChild();
            }
        } else {
            return 0; //no objects in the arraylist
        }
        return counter;
    }

    public E peek() {
        //the peek method looks at the top element without removing it though
        if (isEmpty()){
            return null; //if there are no elements in the Stack
        } else {
            return top.getData();
        }
    }
}
