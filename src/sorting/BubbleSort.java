package sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    /*
    버블 정렬
    두 개의 인접한 원소를 비교하여 정렬하는 방식
    배열의 처음부터 끝까지 인접한 요소를 비교하는 과정을 n - 1번 반복
    O(n^2)의 시간 복잡도를 가짐
     */

    // 자리를 바꿔주는 스왑 메소드
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // 오름차순 정렬
    private static void bubbleSort(int[] arr){
        int size = arr.length;

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1; j++){
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
            }
        }

    }

    // 결과값을 출력해보기 위한 코드
    public static void main(String[] args){

        int[] arr = {4, 3, 5, 1, 9, 7, 6, 2, 8};
        // 중복값이 있을 때
        int[] arr2 = {2, 3, 5, 3, 2, 6, 1, 3};

        bubbleSort(arr);
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
