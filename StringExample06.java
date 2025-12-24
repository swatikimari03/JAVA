public class StringExample06 {
    public static void main(String[] args) {
        // String replace
        String sentence = "I like apples";

        String replaced = sentence.replace("apples", "oranges");

        System.out.println("Original: " + sentence);
        System.out.println("Replaced: " + replaced);
    }
}