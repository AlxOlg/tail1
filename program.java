package tail1;
import java.util.ArrayList;
import java.util.Arrays;

public class program {
    private static String[] reformArray (String inputArray[]) {
        // Инициализация временного списка.
        ArrayList<String> tempList = new ArrayList<>();
        // Добавление во временный список элементов массива, соответствующих заданному условию.
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() <= 3) {
                tempList.add(inputArray[i]);
            }
        }
        // Массив из списка (для полного соответствия заданию).
        String[] outputArray = tempList.toArray(new String[0]);
        return outputArray;
    }

    public static void main(String[] args) {
        String[] array1 = new String[] {"hello", "2", "world", ":-)"};
        System.out.print(Arrays.toString(array1) + " -> " + Arrays.toString(reformArray(array1)));
        System.out.println();

        String[] array2 = new String[] {"1234", "1567", "-2", "computer science"};
        System.out.print(Arrays.toString(array2) + " -> " + Arrays.toString(reformArray(array2)));
        System.out.println();

        String[] array3 = new String[] {"Russia", "Denmark", "Kazan"};
        System.out.print(Arrays.toString(array3) + " -> " + Arrays.toString(reformArray(array3)));
        System.out.println();
    }
}
