public class SwitchExample02 {
    
    /* A switch statement in java is a control
    flow statement that allows you to execute one of several code blocks
    based on the value of an 
    expression. its often used as an akternative to multiplay if-else statements for better
    readability 
    
    Key Points:
    1) Expression can be int , char , String,
    enum , or other types(like byte, short , Integer, etc )
    
    */

    public static void main (String[] args) {

        int day = 3;

        switch (day) {

            case 1 :

                System.out.println("Monday");
                break;

            case 2 :

                System.out.println("Tuesday");
                break;

            case 3 :

                System.out.println("Wednesday");
                break;

            case 4 :

                System.out.println("Thursday");
                break;

            case 5 :

                System.out.println("Friday");
                break;

            case 6 :

                System.out.println("Saturday");
                break;

            case 7 :

                System.out.println("Sunday");
                break ;

                default :
                System.out.println("Invalid day");
        }
        

    }
    
}
