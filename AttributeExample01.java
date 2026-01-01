public class AttributeExample01 {
    /* change the value of x to 25 in myObj2 , and 
    leave x in myObj1 unchanged */

    int x = 5;


    public static void main(String[] args) {
        AttributeExample01 myObj1 = new AttributeExample01();
        AttributeExample01 myObj2 = new AttributeExample01();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
    
}
