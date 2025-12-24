import java.util.ArrayList;
import java.util.Arrays;

public class ForEachExample04 {

    public static void main (String[] args) {

        ArrayList<String>  list = new ArrayList<>();
        
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        for ( String color : list) {
            System.out.println("Color: " + color);
        }
    }
    
}
