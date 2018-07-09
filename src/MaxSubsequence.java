import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given an int array a_1, a_2, ..., a_n, get a subSequence a_i ~ a_j, make sum of ai ~ aj maximum.
 * Input: -2 11 -4 13 -5 -2    Output: 20
 *
 * @author LBW
 */
public class MaxSubsequence {
    public static void main(String[] args) {
        // get array
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scanner.hasNext()) {
            arrayList.add(scanner.nextInt());
        }
        int len = arrayList.size();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < len; i++) {
           if (sum + arrayList.get(i) > 0)
               sum += arrayList.get(i);
           else
               sum = 0;
           if (sum > max)
               max = sum;
        }
        System.out.println(max);
    }


}
