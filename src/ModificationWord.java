import java.util.*;
/**
 * @author LBW
 */
class Pair {
    String str;
    int count;

    Pair(String str, int count) {
        this.str = str;
        this.count = count;
    }
}
public class ModificationWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<String, Pair> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            if (!map.containsKey(temp)) {
                map.put(temp, new Pair(word, 1));
            }
            else {
                map.get(temp).count += 1;
                if (word.compareTo(map.get(temp).str) < 0) {
                    map.get(temp).str = word;
                }
            }
        }

        ArrayList<String> results = new ArrayList<>();
        for (Map.Entry<String, Pair> entrySet: map.entrySet()) {
            if (entrySet.getValue().count > 1) {
                results.add(entrySet.getValue().str);
            }
        }
        Collections.sort(results);

        System.out.println("wo yi yue du guan yu chao xi de shuo ming");
        System.out.println(results.size());
        for (String result: results) {
            System.out.println(result);
        }
    }
}
