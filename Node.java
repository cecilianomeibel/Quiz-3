
public class Node{
    public Object data;
    public Node next;
    public Node previous;

    //Constructor
    public Node (Object data){
        this.data= data;
        this.next = null;
        this.previous= null;
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

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node node) {
        this.previous = node;
    }
}