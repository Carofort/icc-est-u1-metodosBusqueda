
public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        int [] arregloLargo = metodosBusqueda.arregloEjemplo();
        
        //BÚSQUEDA BINARIA
        long starttimeBinaria = System.nanoTime();
        int resultadoBinaria = metodosBusqueda.busquedaBinaria(arregloLargo, 50418);
        long endtimeBinaria = System.nanoTime();
        System.out.println("*Tiempo de ejecución de la búsqueda binaria: " + 
                (endtimeBinaria - starttimeBinaria) + " nanosegundos");

        if(resultadoBinaria != -1){
            System.out.println("El valor se encuentra en la posición: " + resultadoBinaria);
        } else {
            System.out.println("Valor no encontrado :(");
        }

        //BÚSQUEDA SECUENCIAL
        long starttimeSecuencial = System.nanoTime();
        int posi = metodosBusqueda.busquedaSecuencial(arregloLargo, 50418);
        long endtimeSecuencial = System.nanoTime();
        System.out.println("*Tiempo de ejecución de la búsqueda Secuencial: " + 
                (endtimeSecuencial - starttimeSecuencial) + " nanosegundos");

        if(posi != -1){
            System.out.println("El valor se encuentra en la posición: " + posi);
        } else {
            System.out.println("Valor no encontrado :(");
        }

    }
}
