import java.util.HashMap;


public class HashMapExample01{
    public static void main(String[] args) {

        HashMap<String, String> capital = new HashMap<>();

        capital.put("India" , "Delhi");
        capital.put("France" , "Paris");


        System.out.println(capital.get("India")); 

        }
}