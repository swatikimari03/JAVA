public class StringExample07 {
    public static void main(String[] args) {
        // String split
        String csv = "apple,banana,cherry,grape";

        String[] fruits = csv.split(",");

        System.out.println("Original: " + csv);
        System.out.println("Split result:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}