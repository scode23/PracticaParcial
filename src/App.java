public class App {
    public static void main(String[] args) {  

     //CREAR LOS NODOS

     Nodo nodo1= new Nodo(23);
     Nodo nodo2= new Nodo(54);
     Nodo nodo3= new Nodo(36);
     Nodo nodo4= new Nodo(31);
     Nodo nodo5= new Nodo(25);


     //ENLAZAR NODOS
     nodo1.next=nodo2; //23->54
     nodo2.next=nodo3; //54->36
     nodo3.next=nodo4; //36->31
     nodo4.next=nodo5; //31->25

     //RECORRER Y MOSTRAR LOS NODOS

     //Creamos un objecto de tipo Nodo e indocamos que cual es el primero
     Nodo actual=nodo1;

     //Mientras que el actual no sea null que siga recorriendo la lista
     while (actual!=null) {
        System.out.print(actual.data + " -> ");
        actual=actual.next;
     }
     System.out.println( "null");


    }

}
