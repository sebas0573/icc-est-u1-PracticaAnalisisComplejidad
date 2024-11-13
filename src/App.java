import java.util.Arrays;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {

        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        

        int[] sizes = {10, 20, 100, 1000, 5000, 10000, 30000};

        System.out.println("Método Burbuja con Ajustes");
        for (int size : sizes) {
            int[] array = MetodosOrdenamiento.generateRandomArray(size);
            int[] arrayCopy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            MetodosOrdenamiento.bubbleSort(arrayCopy);
            long endTime = System.nanoTime();
            System.out.printf("Con %d valores el tiempo es de %.6f seg.%n", size, (endTime - startTime) / 1e9);
        }

        System.out.println("\nMétodo Insercion");
        for (int size : sizes) {
            int[] array = MetodosOrdenamiento.generateRandomArray(size);
            int[] arrayCopy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            MetodosOrdenamiento.insertionSort(arrayCopy);
            long endTime = System.nanoTime();
            System.out.printf("Con %d valores el tiempo es de %.6f seg.%n", size, (endTime - startTime) / 1e9);
        }

        System.out.println("\nMétodo Seleccion");
        for (int size : sizes) {
            int[] array = MetodosOrdenamiento.generateRandomArray(size);
            int[] arrayCopy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            MetodosOrdenamiento.selectionSort(arrayCopy);
            long endTime = System.nanoTime();
            System.out.printf("Con %d valores el tiempo es de %.6f seg.%n", size, (endTime - startTime) / 1e9);
        }


    }

    
}
