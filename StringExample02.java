public class StringExample02 {
    public static void main(String[] args) {
        // String concatenation
        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);

        System.out.println("Full name (using +): " + fullName);
        System.out.println("Full name (using concat): " + fullName2);
    }
}