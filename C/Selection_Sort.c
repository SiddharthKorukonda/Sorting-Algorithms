#include <stdio.h>

void selectionSort(double arr[], int n) {
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
}