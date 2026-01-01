public class ConstructorExample03 {

    int modelYear;
    String modelName;


    public ConstructorExample03( int year , String name) {
        modelYear = year;
        modelName = name;
    }


    public static void main(String[] args) {
        ConstructorExample03 myCar = new ConstructorExample03( 1969 , "Mustang");
        
        System.out.println( myCar.modelYear + "  " + myCar.modelName);
    }
    
}
