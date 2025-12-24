public class SwitchExample05 {

    public static void main (String[] args){
        



        char letter = 'a' ;
        switch (letter) {
            case 'a' , 'e' , 'i' , 'o' , 'u' ,'A' , 'E' , 'I' , 'O' , 'U' :
            System.out.println(letter + " is a Vowel");
            break;

        default :
            if ( Character.isLetter(letter)) {
               System.out.println(letter + " is a vowel");

            } else {
                System.out.println(letter + " is not a letter");
            }
        }
        

        

        }
    }
    

