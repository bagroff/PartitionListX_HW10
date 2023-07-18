import java.util.Arrays;
import java.util.List;

public class PartitionListX {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 2, 8, 4, 5, 1, 9, 3, 6, 11);
        int X = 5;

        int size = list.size();
        int left = 0;
        int right = size - 1;

        // Rearrange the elements so that first there are numbers <= X, and then numbers > X
        while (left < right) {
            while (list.get(left) <= X && left < right) {
                left++; // Finding the first number > X from the left
            }

            while (list.get(right) > X && left < right) {
                right--; // Finding the first number <= X on the right
            }

            // If two numbers are found need to be swapped, swap them
            if (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
            }
        }

        System.out.println("Result: ");
        System.out.println(list);
    }
}
