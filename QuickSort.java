import java.util.Arrays;

    public class QuickSort {
    /*
    Quick Sort Implementation
    */

        static int n = 20; // Fixed size of array

        public static void main(String[] args) {

            // How many number of pivots will be needed

            int[] arr = new int[n];

            for (int i = 0; i < n; i++){  // Temp val's added to array
                double temp = Math.random() * 10;
                int temp_val = (int) temp;
                arr[i] = temp_val;
            }
            System.out.println("Unsorted array: " + Arrays.toString(arr));
            quickSort(arr, 0, arr.length - 1);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }

        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }

        private static int partition(int[] arr, int low, int high) {  // Try and understand what's going on here, hint: next exam will be on this, SO STUDY!!!
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            return i + 1;
        }

        private static void swap(int[] arr, int i, int j) {  // Can we do this better?
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
