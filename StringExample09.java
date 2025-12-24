public class StringExample09 {
    public static void main(String[] args) {
        // String trim
        String padded = "   Hello World   ";

        String trimmed = padded.trim();

        System.out.println("Original (with quotes): \"" + padded + "\"");
        System.out.println("Trimmed (with quotes): \"" + trimmed + "\"");
        System.out.println("Original length: " + padded.length());
        System.out.println("Trimmed length: " + trimmed.length());
    }
}