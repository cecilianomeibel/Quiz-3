
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
            newNode.next=this.head;
            this.head.previous=newNode; ///
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
            this.last.next=newNode;
            newNode.previous=this.last; ////
            this.last = newNode;
        }
        this.size++;
    }


    //Metodo para eliminar nodos al inicio
    public void deleteFirst(){
        this.head= this.head.next;
        this.head.previous= null;
        this.size--; //Reduce el tamaño de la lista
    }
    

    //Metodo para eliminar nodos al final
    public void deleteLast(){
        if (this.last.previous==null){
            this.head =null;
            this.last=null;
        } else {
            this.last = this.last.previous;
            this.last.next=null;
        }this.size--;  //Reduce el tamaño de la lista
    }

    

    //Metodo para recorrer la lista

    public String Lista(){
        String Dato ="";
        Node axu = this.head;
        while(axu!=null){
            Dato+="{" + axu.data+"}";
            axu=axu.next;
        }
        return (Dato);
    }


   //Metodo para borrar una posicion 
   public void delete_pos(int pos){
       Node previous = this.head;
       Node current = this.head;
       int k=0;
       if (pos > 0){
           while (k!= pos && current.next != null){
               previous=current;
               current=current.next;
               k++;
               System.out.println("  k  "+k);
           }
           previous.next=current.next;

       }
   }


    
    public static void main(String [] args){
        //Crear una lista doblemente enlazada que este vacía
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        //Insertar elementos en la lista 
        doublyLinkedList.insertLast(5);
        doublyLinkedList.insertLast(8);
        doublyLinkedList.insertLast(3);
        doublyLinkedList.insertLast(12);
        doublyLinkedList.insertLast(0);
        doublyLinkedList.insertLast(89);
        doublyLinkedList.insertLast(77);

        System.out.println(doublyLinkedList.Lista()); // Muestra los elementos de la lista 
        System.out.println("Se desencolan 3 elementos"); // Muestra los elementos de la lista 


        //Desencolar 3 elemetos
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteFirst();
        
        System.out.println(doublyLinkedList.Lista()); // Muestra los elementos de la lista 

        //Obtener e imprimir el tamaño de la lista
        int size = doublyLinkedList.size();
        System.out.println("El tamaño de la lista es: " + size);

    }


}





