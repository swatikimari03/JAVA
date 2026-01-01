public class StaticExample {

    //static void method 
    static void  myStaticMethod() {
        System.out.println("Static methods can be called without creating objects ");

    }

    //main method 
    public static void main(String[] args) {
        myStaticMethod();
        StaticExample.myStaticMethod();
    }
    
}
