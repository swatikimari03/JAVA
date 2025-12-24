import java.util.logging.Logger;

public class ifelseexample03 {

    private static final Logger LOGGER = Logger.getLogger(ifelseexample03.class.getName());

    public static void main (String[] args ) {

        int day = 4;

        if ( day == 1) {
            System.out.println("Monday");

        } else if ( day == 2) {
            System .out.println("Tuesday");

        } else if ( day == 3) {
            System.out.println("Wednesday"); 
        }  else if (day == 4) {
            System.out.println("Thursday");

        } else if ( day == 5 ) {
            System.out.println ("Friday") ;

        } else if ( day == 6) {
            LOGGER.info ("Saturday") ;
        } else {
            LOGGER.info ("Sunday");
        }
    }
    
}
