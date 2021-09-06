
public class DoublyLinkedList{
    private Node head;
    private Node tail;   //Se crea el nodo de cola 
    private int size;

    public DoublyLinkedList(){ //Constructor que inicializa a head y tail
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Metodo para saber si la lista esta vacía
    public boolean isEmpty(){
        return this.head ==null;
    }
     
    //Metodo para saber el tamaño de la lista
    public int size(){
        return this.size;
    }

    //Metodo para agregar nodos al final
    public void insertLast(Object data){
        
    }
}

