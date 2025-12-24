public class MethodOverloading02 {

    static int plusmethod(int x , int y) {
        return x + y;
    }

    static double plusmethod(double x , double y) {
        return x + y;
    }

    public static void main ( String[] args) {
        int myNum1 = plusmethod( 8 , 5);
        double myNum2 = plusmethod(4.3 , 6.26);
        
        System.out.println("int:" + myNum1);

        System.out.println("double:" + myNum2);
    }
}