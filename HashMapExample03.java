import java.util.HashMap;

public class HashMapExample03 {


    public static void main(String[] args) {



        HashMap<Integer, String> students = new HashMap<>();

        // 1) pu() -- add data 
        students.put(1, "Swati");

        students.put(2, "Rohit");

        students.put(3, "Anjali");


        // 2) get() -- get value using key 
        System.out.println(students.get(2));

        //3) remove() -- remove data using key 
        students.remove(3);

        System.out.println(students);
    }
}