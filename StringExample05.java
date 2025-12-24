public class StringExample05 {
    public static void main(String[] args) {
        // String substring
        String text = "Hello World";

        String sub1 = text.substring(6); // From index 6 to end
        String sub2 = text.substring(0, 5); // From index 0 to 5 (exclusive)

        System.out.println("Original: " + text);
        System.out.println("Substring from 6: " + sub1);
        System.out.println("Substring 0 to 5: " + sub2);
    }
}