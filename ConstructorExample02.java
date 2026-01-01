public class ConstructorExample02 {

    int x ;

    public ConstructorExample02( int y ) {
        x = y;
    }

    public static void main(String[] args) {
        ConstructorExample02 myObj = new ConstructorExample02(5);
        System.out.println(myObj.x);
    }
    
}
