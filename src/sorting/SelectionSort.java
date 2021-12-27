package sorting;

import java.util.Arrays;

public class SelectionSort {
    /*
    선택 정렬 알고리즘
    주어진 원소 중 가장 작은 값을 찾는다.
    가장 작은 값과 가장 첫번째 원소의 자리를 바꾼다.
    그 다음으로 가장 작은 값을 찾아 두번째 원소와 자리를 바꾼다.
    이 과정을 배열이 끝날 때까지 반복한다.
     */

    // 가장 기초적인 원소의 값을 바꿔주는 메소드
    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // 선택 정렬을 수행하는 메소드
    private static void selectionSort (int[] array){
        int size = array.length;

        // 배열을 돌면서 최소값을 찾는 코드
        for (int i = 0; i < size - 1; i++){

            int minVal = i;
            for (int j = i +1; j < size; j++){
                if (array[j] < array[minVal] ) minVal = j;
            }

            swap(array, i, minVal);
        }
    }

    // 값을 출력해보기 위한 메인 메소드
    public static void main(String[] args){
        int[] array = {3, 4, 1, 5, 6, 7, 8, 2, 9};

        selectionSort(array);

        System.out.println(Arrays.toString(array));

    }
}
