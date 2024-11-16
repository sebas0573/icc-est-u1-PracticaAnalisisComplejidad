import java.util.Random;

public class MetodosOrdenamiento {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        int n = array.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static int[] generateRandomArray(int size) {
    
    Random rand = new Random();
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
        array[i] = rand.nextInt(1000);
    }
    return array;
    }

    public static int BusquedaBinaria(int[] array, int size){
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            
            if (array[medio] == size) {
                return medio;  
            }
            if (array[medio] < size) {
                izquierda = medio + 1;
            }
            else {
                derecha = medio - 1;
            }
        }
        return -1;
    }
    
}
