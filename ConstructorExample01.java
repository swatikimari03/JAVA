public class ConstructorExample01 {

    int x;

    public ConstructorExample01() {
        x = 5;
    }

    public static void main(String[] args) {
        ConstructorExample01 myObj = new ConstructorExample01();
        System.out.println(myObj.x);
        
    }
    
}
