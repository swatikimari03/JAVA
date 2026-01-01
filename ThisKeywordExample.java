public class ThisKeywordExample {

    int x ;


    public ThisKeywordExample( int x ) {
        this.x = x;
    }

    public static void main(String[] args) {
        ThisKeywordExample myObj = new ThisKeywordExample(5);
        System.out.println(myObj.x);
    }
    
}
