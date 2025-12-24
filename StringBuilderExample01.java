public class StringBuilderExample01 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append("Programming");
        sb.insert(4, " is");
        sb.delete(0 , 5);
        sb.reverse();

        System.out.println(sb);


        }
}




