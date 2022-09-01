package ru.job4j.algos.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortTest {
    @Test
    void whenBubbleSort() {
        Sort sort = new Sort();
        int[] arr = {1, 3, 2, 5, 4};
        int[] expected = {1, 2, 3, 4, 5};
        sort.bubbleSort(arr);
        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void whenInsertSort() {
        Sort sort = new Sort();
        int[] arr = {1, 3, 2, 5, 4};
        int[] expected = {1, 2, 3, 4, 5};
        sort.insertSort(arr);
        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void whenChoiceSort() {
        Sort sort = new Sort();
        int[] arr = {1, 3, 2, 5, 4};
        int[] expected = {1, 2, 3, 4, 5};
        sort.choiceSort(arr);
        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void whenFreqSort() {
        Sort sort = new Sort();
        int[] arr = {1, 3, 2, 5, 4, 6, 6, 3, 4, 5, 1, 1, 2};
        int[] expected = {1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        sort.freqSort(arr);
        assertThat(arr).isEqualTo(expected);
    }
}