public class MethodExample05 {

    public static void printArray (int[] arr) {

        for (int num : arr) {
            System.out.println(num + "");
        }

        System.out.println();
    }

    public static void main (String[] args) {

        int[] numbers = { 1, 2, 3, 4};

        printArray(numbers);
    }
}