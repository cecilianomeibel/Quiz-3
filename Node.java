
public class Node {
    
    public Object data;
    public Node next;
    public Node previous;

    //Constructor
    public Node (Object data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public void verNodo(){
        System.out.println(" { "+data+ "}");
    }


    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}