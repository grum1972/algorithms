package ru.job4j.algos.sort;

public class Sort {
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public void choiceSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public void freqSort(int[] arr) {
        int[] f = {0, 0, 0, 0, 0, 0, 0};
        for (int value : arr) {
            switch (value) {
                case 0, 1, 2, 3, 4, 5, 6:
                    f[value] += 1;
                    break;
                default:
                    break;
            }
        }
        int k = 0;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i]; j++) {
                arr[k] = i;
                k++;
            }
        }
    }
}
