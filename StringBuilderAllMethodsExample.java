public class StringBuilderAllMethodsExample {
    public static void main(String[] args) {
        // 1. create and append
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(' ');
        sb.append("World");
        sb.append('!');
        System.out.println("After append: " + sb);

        // 2. insert
        sb.insert(6, "Beautiful "); // insert before 'World'
        System.out.println("After insert: " + sb);

        // 3. replace
        sb.replace(6, 15, "Awesome"); // replace "Beautiful" with "Awesome"
        System.out.println("After replace: " + sb);

        // 4. delete and deleteCharAt
        sb.delete(6, 14); // remove "Awesome"
        System.out.println("After delete range: " + sb);
        sb.deleteCharAt(sb.length() - 1); // remove '!'
        System.out.println("After deleteCharAt: " + sb);

        // 5. setCharAt and charAt
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt(0,'h'): " + sb);
        System.out.println("charAt(0): " + sb.charAt(0));

        // 6. append more, length, capacity, ensureCapacity
        sb.append("!!! Welcome to StringBuilder demo.");
        System.out.println("After appending sentence: " + sb);
        System.out.println("length: " + sb.length());
        System.out.println("capacity: " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("capacity after ensureCapacity(100): " + sb.capacity());

        // 7. substring and subSequence
        String sub = sb.substring(1, 6); // end is exclusive
        System.out.println("substring(1,6): " + sub);
        CharSequence seq = sb.subSequence(1, 6);
        System.out.println("subSequence(1,6): " + seq);

        // 8. indexOf and lastIndexOf
        System.out.println("indexOf(\"Welcome\"): " + sb.indexOf("Welcome"));
        System.out.println("lastIndexOf(\"l\"): " + sb.lastIndexOf("l"));

        // 9. getChars (copy into char array)
        char[] buffer = new char[10];
        int start = 0;
        int end = Math.min(sb.length(), 10);
        sb.getChars(start, end, buffer, 0);
        System.out.print("getChars(0,10) -> char[]: ");
        System.out.println(buffer);

        // 10. reverse
        StringBuilder rev = new StringBuilder(sb.toString());
        rev.reverse();
        System.out.println("Reversed string: " + rev);

        // 11. setLength (truncate or extend with null chars) and toString
        sb.setLength(5); // keep first 5 chars only
        System.out.println("After setLength(5): " + sb.toString());

        // 12. append chaining and toString
        String result = new StringBuilder()
                .append("A: ")
                .append(1)
                .append(", B: ")
                .append(2)
                .toString();
        System.out.println("Chained builder result: " + result);

        // Note: StringBuilder is not synchronized; for concurrent access use StringBuffer or Concurrent structures.
    }
}
