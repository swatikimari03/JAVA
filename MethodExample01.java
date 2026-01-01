public class MethodExample01 {

    public void fullThrottle() {
        System.out.println("The car is going as it can!");
    }


    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }


    public static void main(String[] args) {
        MethodExample01 myCar = new MethodExample01();

        myCar.fullThrottle();
        myCar.speed(200);
    }
    
}
