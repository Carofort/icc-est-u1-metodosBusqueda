import java.util.Arrays;
public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscado){
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == valorBuscado){
                int comp = i + 1;
                System.out.println("Comparaciones: " + comp);
                return i;
            }
        }
        return -1;
    }

    public int busquedaBinaria(int[] arr, int value){
        int inicio = 0;
        int fin = arr.length - 1;
        int count = 0;

        while(inicio <= fin){
            int medio = inicio + (fin - inicio) /2;
            count++;
            if(arr[medio] == value){
                //Elemento encontrado
                return medio;
            }

            if(arr[medio] < value){
                inicio = medio + 1; //Busca mitad derecha
            } else{
                fin = medio - 1; //Busca mitad izquierda
            }

        }
        System.out.println("Comparaciones: " + count);
        return -1;
    }

    public int[] arregloEjemplo(){
        int [] arreg = new int[100000];
        for(int i = 0; i < arreg.length; i++){
            arreg[i] = i;
        }
        System.out.println(Arrays.toString(arreg));
        return arreg;
    }



    public void printArreglo(int[] arreglo){
        for (int elem : arreglo){
            System.out.print(elem + " ");
        }
    }

}
