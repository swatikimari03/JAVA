public class SwitchExample03 {
    public static void main (String[] args) {
        String color = "Red";

        switch(color.toLowerCase()) {

            case "red" , "maroon" :
                System.out.println("Warm color");
                break;

            case "blue" , "navy" :
                System.out.println("Cool Color");
                break;


            case "green" :
                System.out.println("Nature color");
                break;


            default:
            System.out.println("Unknow color ");
        }

    }
    
}
