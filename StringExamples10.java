public class StringExamples10 {
    public static void main(String[] args) {
        System.out.println("String Examples (1..10)\n");

        // 1) length()
        String s1 = "Hello, Java";
        System.out.println("1) length: '" + s1 + "' -> " + s1.length());

        // 2) charAt()
        System.out.println("2) charAt(1): '" + s1 + "' -> " + s1.charAt(1));

        // 3) substring()
        System.out.println("3) substring(7): '" + s1 + "' -> '" + s1.substring(7) + "'");

        // 4) indexOf() and lastIndexOf()
        String s2 = "banana";
        System.out.println("4) indexOf/lastIndexOf on '" + s2 + "' -> indexOf('a')=" + s2.indexOf('a') + ", lastIndexOf('a')=" + s2.lastIndexOf('a'));

        // 5) contains()
        System.out.println("5) contains 'Java' in '" + s1 + "' -> " + s1.contains("Java"));

        // 6) equals vs equalsIgnoreCase
        String a = "Test";
        String b = "test";
        System.out.println("6) equals: " + a.equals(b) + ", equalsIgnoreCase: " + a.equalsIgnoreCase(b));

        // 7) toUpperCase() and toLowerCase()
        System.out.println("7) upper/lower: '" + s1 + "' -> " + s1.toUpperCase() + " / " + s1.toLowerCase());

        // 8) trim()
        String s3 = "   padded   ";
        System.out.println("8) trim: '" + s3 + "' -> '" + s3.trim() + "'");

        // 9) replace()
        System.out.println("9) replace: '" + s1 + "' replace 'Java'->'World' -> '" + s1.replace("Java","World") + "'");

        // 10) split() -> show join-like output
        String csv = "red,green,blue";
        String[] parts = csv.split(",");
        System.out.print("10) split: '" + csv + "' -> [");
        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i]);
            if (i < parts.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
