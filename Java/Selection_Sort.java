package Java;

public class Selection_Sort {
    public static double[] selectionSort(double[] arr) {
        int n = arr.length;

        for (int i=0; i<n-1; i++) {
            int minIndex = i;

            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }

            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        double[] arr = {1.1, 2.2, 3.3, 5.5, 4.4, 9.9, 3.34};
        double [] arr_sorted = selectionSort(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr_sorted[i] + " ");
        }

        System.out.print("\n");
    }
}