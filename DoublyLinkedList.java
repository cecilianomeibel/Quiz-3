
public class DoublyLinkedList{
    private Node head;
    private Node last;   //Se crea el nodo de cola 
    private int size;

    public DoublyLinkedList(){ //Constructor que inicializa a head y tail
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    //Metodo para saber si la lista esta vacía
    public boolean isEmpty(){
        return this.head == null;
    }
     
    //Metodo para saber el tamaño de la lista
    public int size(){
        return this.size;
    }

    //Metodo para agregar nodos al inicio
    public void insertFirst(Object data){
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.head = this.last = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }

    //Metodo para agregar nodos al final
    public void insertLast(Object data){
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.head = this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.size++;
    }

    //Metodo para eliminar nodos al inicio
    public Node deleteFirst(){
        if (this.head != null){
            Node temp = this.head;
            this.head = this.head.next;
            this.size--; //tamaño se reduce
            return temp;     
        } else {
            return null;
        }
    }
    

    //Metodo para eliminar nodos al final
    public Node deleteLast(){
        if (this.last != null){
            Node temp = this.last;
            this.last = this.last.previous;
            this.size--; //tamaño se reduce
            return temp;     
        } else {
            return null;
        }
    }
    

    //Metodo para mostrar la lista de inicio a fin
    
    public static void main(String [] args){
        //Crear una lista doblemente enlazada que este vacía
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        //Insertar elementos en la lista 
        doublyLinkedList.insertFirst(5);
        doublyLinkedList.insertFirst(8);
        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(12);
        doublyLinkedList.insertFirst(0);
        doublyLinkedList.insertFirst(89);
        doublyLinkedList.insertFirst(77);
        
       
        //Desencolar 3 elemetos
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteFirst();
       

        //Obtener e imprimir el tamaño de la lista
        int size = doublyLinkedList.size();
        System.out.println(size);

    }


}

