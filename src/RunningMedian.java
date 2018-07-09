import java.util.*;

/**
 * input a1, a2, a3, ..., an , every time we input a number, print the median so far.
 *
 * @author LBW
 */
public class RunningMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> lower = new PriorityQueue<Integer>(Comparator.reverseOrder());
        PriorityQueue<Integer> higher = new PriorityQueue<>();

        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            addElement(i, lower, higher);
            reBalance(lower, higher);
            System.out.print(lower.peek() + " ");
        }

    }
    public static void addElement(int i, PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
        if (lower.size() == 0 || i <= lower.peek())
            lower.add(i);
        else
            higher.add(i);
    }

    public static void reBalance(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
        if (lower.size() < higher.size()) {
            lower.add(higher.remove());
        }
        else if (lower.size() > higher.size() + 1) {
            higher.add(lower.remove());
        }
    }
}
