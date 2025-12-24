public class StringExample10 {
    public static void main(String[] args) {
        // String charAt
        String word = "Java";

        System.out.println("Word: " + word);
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Character at index " + i + ": " + word.charAt(i));
        }
    }
}