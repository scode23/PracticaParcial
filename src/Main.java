public class Main {
    
    public static void main(String[] args) {
        
        //CREAMOS LAS LISTA

        Metodos list1 = new Metodos();

        list1.addStart(10);   
        list1.addStart(15); 
        list1.addStart(20); 
        list1.addStart(25); 
        list1.addStart(30); 
        System.out.println("LISTA 1");
        list1.traversal();


        Metodos list2 = new Metodos();
        list2.addQueue(10);   
        list2.addQueue(15); 
        list2.addQueue(20); 
        list2.addQueue(25); 
        list2.addQueue(30); 
        System.out.println("LISTA 2");
        list2.traversal();  


        list1.insep(1000,3);//insertar 1000 en la posicion 3
        System.out.println("Luego de ingresar la lista queda asi:");
        list1.traversal();  

        int  total=list2.contar();
        System.out.println("Total de elementos en la lista: " + total);

        int total1=list1.contares(20);
        System.out.println("El valor 20 se repite " + total1);

        list2.delete(25);
        list2.traversal();
    }

    
     
    

}
