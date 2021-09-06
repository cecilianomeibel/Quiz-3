
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
        return this.head == null;
    }
     
     
    //Metodo para saber el tamaño de la lista
    public int size(){
        return this.size;
    }

    //Metodo para agregar nodos al inicio
    public void insertFirst(Object data){
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++; //tamaño incrementa
    }

    //Metodo para agregar nodos al final
    public void insertSecond(Object data){
        Node newNode = new Node(data);
        newNode.previous = this.tail;
        this.tail= newNode;
        this.size++; //tamaño incrementa
    }

    //Metodo para eliminar nodos al inicio
    public Node deleteFirst(int i){
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
    public Node deleteSecond(){
        if (this.tail != null){
            Node temp = this.tail;
            this.tail = this.tail.previous;
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
        doublyLinkedList.deleteFirst(5);
        doublyLinkedList.insertFirst(8);
        doublyLinkedList.insertFirst(3);

        //Obtener e imprimir el tamaño de la lista
        int size = doublyLinkedList.size();
        System.out.println(size);



    }

    
       
    


}

