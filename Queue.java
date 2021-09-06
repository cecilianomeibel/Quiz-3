
/*
public class Queue {
    private DoublyLinkedList QueueList;

    //Constructor
    public Queue(){
        QueueList = new DoublyLinkedList();
    }

    //Creacion de metodos 
    public void enqueue(Object newElement){
        this.QueueList.insertLast(newElement);

    }

    public Node dequeue() { 
        return this.QueueList.deleteFirst();
    }
    
    
    public Node peek(){
        return this.QueueList.getHead();
    

    public static void main (String [] args){
        //Crear una lista doblemente enlazada vacia
        Queue queue1 = new Queue();
        queue1.enqueue(5);
        queue1.enqueue(8);
        queue1.enqueue(3);
        queue1.enqueue(12);
        queue1.enqueue(0);
        queue1.enqueue(89);
        queue1.enqueue(77);

        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();

    

        // Saca un elemento de la fila y confirma que es el ultimo insertado
        // queue1.dequeue devuelve un tipo de nodo y se debe convertir a int antes de imprimirlo

        Node last_node = queue1.dequeue();
        int element = (int) last_node.getData();

        System.out.println(element);


    }
} 

*/