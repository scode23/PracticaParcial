public abstract class List {

    Nodo first= null;
    Nodo last=null;

    abstract void addStart(int theData);
    abstract void addQueue(int theData);
    abstract void insep(int theData, int po);
    abstract int contar();
    abstract int contares(int theData);
    abstract void traversal();
    abstract void delete(int theData);
}
