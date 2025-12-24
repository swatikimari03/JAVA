public class NestedLoopExample02 {
    public static void main(String[] args) {
        // Printing a multiplication table
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}