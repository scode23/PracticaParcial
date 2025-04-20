public class Metodos extends List{

    @Override
    void addStart(int theData) {
        Nodo newNode = new Nodo(theData);
        
        if (first==null) {
            first=newNode;
            last=newNode;
        }else{
            newNode.next=first;
            first=newNode;
        }
    }

    

    @Override
    void addQueue(int theData) {
        Nodo newNode = new Nodo(theData);
        if (first==null) {
            first=newNode;
            last=newNode;
        }else{
            last.next=newNode;
            last=newNode;
        }
        
    }



    @Override
    void traversal() {
        if (first==null) {
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("Loa elementos de la lista son:");
            Nodo aux;
            aux=first;
            while (aux!=null) {
                System.out.print(aux.data + " | ");
                aux=aux.next;
            }
            System.out.println("null");
        }
    }



    @Override
    void insep(int theData, int po) {
        Nodo newNodo = new Nodo(theData);

        if(po<0){
          System.out.println("La posicion ingresada no es valida");
          return;
        }

        if (po==0) {
            newNodo.next=first;
            first=newNodo;
            if (first==null) {
                last=newNodo;
            }
            return;
        }

        Nodo aux=first;
        int index=0;

    while (aux!=null && index<po-1) {
           aux=aux.next;
           index++;
        
    }

    if (aux==null) {
        System.out.println("La posicion esta fuera del rango");
        return;
    }

    newNodo.next=aux.next;
    aux.next=newNodo;

    if (newNodo.next==null) {
        last=newNodo;
    }
        
    }



    @Override
    int contar() {
        int cont=0;
        if (first==null) {
            System.out.println("No hay elementos");
            return cont;
        }else{

        Nodo aux=first;
        while (aux!=null) {
            cont=cont+1;
            aux=aux.next;
        }
        return cont;
    }

    }



    @Override
    int contares(int theData) {
        int cont =0;
        Nodo aux=first;
        if(aux==null){
            System.out.println("Lista esta vacia");
            return cont;
        }else{
            while(aux!=null) {
                  if (aux.data==theData) {
                      cont=cont+1;
                  }
                  aux=aux.next;
            }
             return cont;
        }
        
    }



    @Override
    void delete(int theData) {
        
        if (first==null) {
            System.out.println("La lista esta vacia");
            return;
        }else{
            if (first==last && first.data==theData) {
                first=null;
                last=null;
                System.out.println("Elemento eliminado en la primera posicion y era el unico");
                return;
            }else{
                 if(first.data==theData){
                    first=first.next;
                    System.out.println("Elemento eliminado en la primera posicion");
                    return;
                 }else{
                    Nodo aux= first;
                    Nodo tem = first.next;
                    while (tem!=null & tem.data!=theData) {
                           aux=aux.next;
                           tem=tem.next;
                    }
                    if (tem==null) {
                        System.out.println("Elemento no encontrado");
                        return;
                    }else{
                        aux.next=tem.next;
                        if(tem==last){
                           last=aux;
                        }
                        System.out.println("Se elimino la el valor de la lista");
                        return;
                    }
                 }
            }
        }
        
    } 
  
    




    
    
}
