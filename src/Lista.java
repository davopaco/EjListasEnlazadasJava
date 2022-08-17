public class Lista {
    public int tamano;
    public Nodo cabeza;
    public Nodo cola;

    public Lista() {
        this.tamano = 0;
        this.cabeza = null;
        this.cola = null;
    }

    public Lista(Object o) {
        this.tamano = 1;
        Nodo nuevoNodo= new Nodo(o);
        this.cabeza = nuevoNodo;
        this.cola = nuevoNodo;
    }

    public boolean estaVacio(){
        return cabeza == null;
    }

    public void agregar(Object o){
        Nodo nuevoNodo = new Nodo(o);
        if(estaVacio()){
            this.cabeza=nuevoNodo;
        }
        else{
            this.cola.siguiente=nuevoNodo;
        }this.cola=nuevoNodo;
        tamano++;
    }

    public void agregar(Object o, int ind){
        Nodo nuevoNodo = new Nodo(o);
        if (ind==0){
            agregarInicio(o);
            return;
        }
        int i=0;
        if(estaVacio() && ind!=0){
            this.cabeza=nuevoNodo;
            this.cola=nuevoNodo;
        }
        else{
            Nodo nodoRef = this.cabeza;
            while (i<(ind-1)){
                nodoRef=nodoRef.siguiente;
                i++;
            }
            nuevoNodo.siguiente=nodoRef.siguiente;
            nodoRef.siguiente=nuevoNodo;
        }
        tamano++;
    }

    public void agregarInicio(Object o){
        Nodo nuevoNodo = new Nodo(o);
        Nodo nodoRef= this.cabeza;
        nuevoNodo.siguiente=nodoRef;
        this.cabeza=nuevoNodo;
        tamano++;
    }

    public void imprimirRecorrido(){
        Nodo nodoRef = this.cabeza;
        System.out.print("[");
        while(nodoRef.siguiente!=null) {
            System.out.print(nodoRef.info + ", ");
            nodoRef = nodoRef.siguiente;
            if (nodoRef.siguiente == null) {
                System.out.print(nodoRef.info + "]");
            }
        }
    }


    public void borrar(Object o){
        Nodo nodoRef = this.cabeza;
        if (cabeza.info==o){
            cabeza=nodoRef.siguiente;
            return;
        }
        while (nodoRef.siguiente.info!=o){
            nodoRef=nodoRef.siguiente;
        }
        if(nodoRef.siguiente.info==o){
            nodoRef.siguiente=nodoRef.siguiente.siguiente;
        }
        tamano--;
    }

    public void buscar(Object o){
        Nodo nodoRef = this.cabeza;
        if (cabeza.info==o){
            System.out.println("\nEl elemento "+o+" esta.");
            return;
        }
        while (nodoRef.siguiente.info!=o){
            nodoRef=nodoRef.siguiente;
            if (nodoRef.siguiente==null){
                System.out.println("\nEl elemento "+o+" no esta.");
                return;
            }
        }
        System.out.println("\nEl elemento "+o+" esta.");
    }
}
