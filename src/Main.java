public class Main {
    public static void main(String[] args) {
        Lista lis = new Lista();

        for(int i=0;i<10;i++){
            lis.agregar(i);
        }
        lis.agregar(12);
        lis.agregarInicio(90);
        lis.agregar(45,7);
        lis.buscar(45);
        lis.borrar(9);
        lis.imprimirRecorrido();
    }
}
