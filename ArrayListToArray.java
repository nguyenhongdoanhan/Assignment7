import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Integer[] array = numbers.toArray(new Integer[0]);

        System.out.println("Cac phan tu trong mang:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
