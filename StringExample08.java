public class StringExample08 {
    public static void main(String[] args) {
        // String case conversion
        String mixed = "HeLLo WoRLd";

        String upper = mixed.toUpperCase();
        String lower = mixed.toLowerCase();

        System.out.println("Original: " + mixed);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}