public class StringExample01 {
    public static void main(String[] args) {
        // String creation and initialization
        String str1 = "Hello World";
        String str2 = new String("Hello World");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("Are they equal? " + str1.equals(str2));
    }
}