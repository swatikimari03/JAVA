public class ForEachExample03 {

    public static void main (String[] args) {

        double[] prices = { 19.99 , 29.99 , 39.99 , 49.99};
        double total = 0 ;
        
        for ( double price : prices) {
            total += price;
        }

        System.out.println("Total : " + total );
    }
    
}
