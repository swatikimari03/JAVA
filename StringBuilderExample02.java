public class StringBuilderExample02 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");


        //append 
        sb.append(" World ");
        System.out.println(sb); 


        //insert 
        sb.insert(6 , "Beautiful");
        System.out.println(sb);

        //delete ( start inclusive , end exclusive)
        sb.delete( 6 , 16);
        System.out.println(sb);

        //reverse 
        sb.reverse();
        System.out.println(sb);

        //length and toString 
        System.out.println("length: " + sb.length());
        System.out.println("as String: " + sb.toString());
    }
}