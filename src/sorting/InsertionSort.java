package sorting;

import java.util.Arrays;

public class InsertionSort {
    /*
    삽입 정렬
    - 현재 타겟이 된느 숫자와 이전 위치에 있는 원소들을 비교한다. ( 첫 번째 타겟은 두 번째 원소부터 시작한다. )
    - 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
    - 그 다음 타겟을 찾아 위와 같은 방법을 반복한다.
     */

    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // 오름차순 정렬
    private static void insertionSort(int[] arr){

        // target은 두 번째 원소부터 마지막 원소까지 n -1 개, 즉 n-1 번 정렬한다는 의미
        for (int i = 1; i < arr.length; i++){
            System.out.println(i + "회차 정렬 ( 타겟 : " + arr[i] + " )");
            int target = arr[i];
            for (int j = i -1; j >=0; j--){
                if (target < arr[j]) {
                    System.out.print(Arrays.toString(arr) + " -> ");
                   swap(arr, j, j + 1);
                    System.out.println(Arrays.toString(arr));
                } else break;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 3, 2, 6, 8, 7, 1, 4, 9};

        insertionSort(arr);


    }
}
