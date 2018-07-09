import java.util.*;
/**
 * Given a_1, a_2, ..., a_n and a constant k. find the medium m and the 2k numbers nearby. Output the 2k+1 numbers.
 * Input: 2 10
 *        7 2 5 7 2 10 7 7 13 15
 * Output: 5 7 7 7 7
 *
 * @author LBW
 */
public class MedianNearBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(), n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
//        display(arr, 0, n-1);
//        System.out.println();
        int medium = (n - 1) / 2;
        //find the medium
        findKorder(arr, 0, n-1, medium);
        //find the k element before medium
        for (int i = medium - 1; i >= medium - k; i--) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[max])
                    max = j;
            }
            if (max != i) {
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;
            }
        }
        //find the k element after medium
        for (int i = medium + 1; i <= medium + k; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        display(arr, medium - k, medium + k);
    }

    private static void findKorder(int[] arr, int l, int r, int k) {
        int pivot = arr[l];
        int i = l, j = r;
        while (i < j) {
            for (; i < j && arr[j] >= pivot; j--);
            if (arr[j] < pivot)
                arr[i] = arr[j];
            for (; i < j && arr[i] <= pivot; i++);
            if (arr[i] > pivot)
                arr[j] = arr[i];
        }
        arr[i] = pivot;

        if (i == k) return;
        else if (i < k)
            findKorder(arr, i+1, r, k);
        else
            findKorder(arr, l, i-1, k);
    }

    private static void display(int[] arr, int l, int r) {
        for (int i = l; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.print(arr[r]);
    }
}
