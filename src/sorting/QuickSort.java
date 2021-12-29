package sorting;

import java.util.Arrays;

public class QuickSort extends Sort {
    /*
    
    퀵 정렬

    1. 피벗을 하나 선택한다.
    2. 피벗을 기준으로 양쪽에서 피벗보다 큰 값, 혹은 작은 값을 찾는다.
    왼쪽에서부터는 피벗보다 큰 값을 찾고, 오른쪽에서부터는 피벗보다 작은 값을 찾는다.
    3. 양 방향에서 찾은 두 원소를 교환한다.
    4. 왼쪽에서 탐색하는 위치와 오른쪽에서 탐색하는 위치가 엇갈리지 않을 때까지 2번으로 돌아가 위 과정을 반복한다.
    5. 엇갈린 기점에서 두 개의 부분리스트로 나누어 1번으로 돌아가 해당 부분리스트의 길이가 1이 아닐 때까지 1번 과정을 반복한다. ( 분할 )
    6. 인접한 부분리스트끼리 합친다. ( 정복 )

     */
    private static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {

        if (left >= right) return;

        int pivot = partition(arr, left, right);

        quickSort(arr, left, pivot);
        quickSort(arr, pivot + 1, right);


    }

    // 피벗을 기준으로 작은 값은 왼쪽으로 큰 값은 오른쪽으로 정렬
    private static int partition(int[] arr, int low, int high) {

        int left = low - 1;
        int right = high + 1;
        // 피벗을 배열의 중간으로 설정
        int pivot = (left + right) / 2;

        // 모든 원소를 탐색할 때까지 반복
        while(true) {
            // 피벗을 기준으로 크거나 같은 값을 찾을 때까지 left 포인터를 오른쪽으로 옮겨준다
            do{
                 left++;
            } while(arr[pivot] > arr[left]);
            // 피벗을 기준으로 작거나 같은 값을 찾을 때까지 right 포인터를 왼쪽으로 옮겨준다
            do {
                right--;
            } while(arr[pivot] < arr[right] && left <= right);

            // 포인터를 옮긴 후에 두 포인터가 같거나 교차된다면 배열의 모든 원소를 확인했다는 의미이므로 바꿀 필요가 없다
            if (left < right) {
                swap(arr, left, right);
            } else {
                return right;
            }
        }
    }

    // 제대로 정렬되는지 확인해보기 위한 코드
    public static void main(String[] args) {
        // 기본
        int[] arr = {5, 3, 8, 9, 2, 4, 7};
        // 중복값이 있는 경우
        int[] arr2 = {5, 3, 2, 2, 1, 7, 9, 4};

        sort(arr);
        sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
