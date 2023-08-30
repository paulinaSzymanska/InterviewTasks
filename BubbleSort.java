import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, -2, 3, -5, 1, 2);
        System.out.println(bubbleSort(integers));
    }

    public static List<Integer> bubbleSort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Integer integer = list.get(i);
                Integer integer2 = list.get(j);
                if (i == list.size() - 1) {
                    break;
                } else if (integer < integer2) {
                    continue;
                } else {
                    list.set(i, integer2);
                    list.set(j, integer);
                }
            }
        }
        return list;
    }
}
